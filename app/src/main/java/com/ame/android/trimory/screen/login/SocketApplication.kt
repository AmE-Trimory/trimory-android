package com.ame.android.trimory.screen.login

import android.app.Application
import com.ame.android.trimory.R
import com.kakao.sdk.common.KakaoSdk

class SocketApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        KakaoSdk.init(this, getString(R.string.kakao_app_key))
    }
}