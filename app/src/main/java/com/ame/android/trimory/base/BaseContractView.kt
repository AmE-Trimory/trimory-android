package com.ame.android.trimory.base

import com.ame.android.trimory.base.response.ResponseResult

/**
 * Created by KimBH on 2022/07/12.
 */
interface BaseContractView {
    fun subscribeUi()
    fun getLayoutRes(): Int
    fun loadResultCode(resResult: ResponseResult?)
    fun loadErrorMessage(e: Throwable)
}