package com.ame.android.trimory.screen.viewmodel

import com.ame.android.data.repository.TrimoryRepository
import com.ame.android.trimory.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by KimBH on 2022/07/12.
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: TrimoryRepository
) : BaseViewModel() {
    fun testStr() = repository.test()
}