package com.ame.android.trimory.screen.login.activity

import android.util.Log
import androidx.activity.viewModels
import com.ame.android.trimory.R
import com.ame.android.trimory.base.BaseActivity
import com.ame.android.trimory.databinding.ActivityLoginBinding
import com.ame.android.trimory.screen.login.viewmodel.LoginViewModel
import com.kakao.sdk.auth.model.OAuthToken
import com.kakao.sdk.common.model.ClientError
import com.kakao.sdk.common.model.ClientErrorCause
import com.kakao.sdk.user.UserApiClient

class KakaoLoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(){
    override val mViewModel: LoginViewModel by viewModels()

    override fun getLayoutRes(): Int = R.layout.activity_login

    override fun subscribeUi() {
        with(mViewModel) {

        }
        with(mDataBinding) {
            vm = mViewModel
            mDataBinding.btnKakaoLogin.setOnClickListener {
                loginKakao()
            }
            mDataBinding.btnKakaoLogout.setOnClickListener {
                logoutKakao()
            }
            mDataBinding.btnKakaoDelete.setOnClickListener {
                deleteKakao()
            }
        }
    }

    private val kakaoCallback: (OAuthToken?, Throwable?) -> Unit = { token, error ->
        if (error != null) {
            Log.e("카카오", "카카오계정으로 로그인 실패", error)
        } else if (token != null) {
            Log.i("카카오", "카카오계정으로 로그인 성공 ${token.accessToken}")
        }
    }

    private fun loginKakao(){
        // 카카오톡이 설치되어 있으면 카카오톡으로 로그인, 아니면 카카오계정으로 로그인
        if (UserApiClient.instance.isKakaoTalkLoginAvailable(this)) {
            UserApiClient.instance.loginWithKakaoTalk(this) { token, error ->
                if (error != null) {
                    Log.e("카카오", "카카오톡으로 로그인 실패", error)

                    // 사용자가 카카오톡 설치 후 디바이스 권한 요청 화면에서 로그인을 취소한 경우,
                    // 의도적인 로그인 취소로 보고 카카오계정으로 로그인 시도 없이 로그인 취소로 처리 (예: 뒤로 가기했을 시)
                    if (error is ClientError && error.reason == ClientErrorCause.Cancelled) {
                        return@loginWithKakaoTalk
                    }

                    // 카카오톡에 연결된 카카오계정이 없는 경우, 카카오계정으로 로그인 시도(인터넷 창 생성)
                    UserApiClient.instance.loginWithKakaoAccount(this, callback = kakaoCallback)
                } else if (token != null) {
                    Log.i("카카오", "카카오톡으로 로그인 성공 ${token.accessToken}")
                }
            }
        } else {
            UserApiClient.instance.loginWithKakaoAccount(this, callback = kakaoCallback)
        }
    }

    private fun logoutKakao(){  // 토큰을 전부 만료시킴
        UserApiClient.instance.logout { error ->
            if (error != null) {
                Log.e("카카오", "로그아웃 실패. SDK에서 토큰 삭제됨", error)
            }
            else {
                Log.i("카카오", "로그아웃 성공. SDK에서 토큰 삭제됨")
            }
        }
    }

    private fun deleteKakao(){  // 토큰을 삭제 시킴 => 연결 끊
        UserApiClient.instance.unlink { error ->
            if (error != null) {
                Log.e("카카오", "연결 끊기 실패", error)
            }
            else {
                Log.i("카카오", "연결 끊기 성공. SDK에서 토큰 삭제 됨")
            }
        }
    }
}