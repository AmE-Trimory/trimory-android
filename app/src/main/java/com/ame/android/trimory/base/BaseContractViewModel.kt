package com.ame.android.trimory.base

import com.ame.android.trimory.base.response.ResponseResult

/**
 * Created by KimBH on 2022/07/12.
 */
interface BaseContractViewModel {
    fun observeResultCode(resResult: ResponseResult?)
    fun observeErrorMessage(e: Throwable)
}