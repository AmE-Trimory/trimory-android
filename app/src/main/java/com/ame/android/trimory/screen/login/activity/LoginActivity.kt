package com.ame.android.trimory.screen.login.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ame.android.trimory.R
import com.ame.android.trimory.base.BaseActivity
import com.ame.android.trimory.databinding.ActivityLoginBinding
import com.ame.android.trimory.screen.login.viewmodel.LoginViewModel
import com.kakao.sdk.common.KakaoSdk

class LoginActivity : BaseActivity<ActivityLoginBinding, LoginViewModel>(){
    override val mViewModel: LoginViewModel by viewModels()

    override fun getLayoutRes(): Int = R.layout.activity_login

    override fun subscribeUi() {
        KakaoSdk.init(this, R.string.kakao_native_key.toString())

        with(mViewModel) {

        }
        with(mDataBinding) {
            vm = mViewModel
        }
    }
}