package com.ame.android.trimory.screen.main.activity

import androidx.activity.viewModels
import com.ame.android.trimory.R
import com.ame.android.trimory.base.BaseActivity
import com.ame.android.trimory.databinding.ActivityMainBinding
import com.ame.android.trimory.screen.main.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override val mViewModel: MainViewModel by viewModels()

    override fun getLayoutRes(): Int = R.layout.activity_main

    override fun subscribeUi() {
        with(mViewModel) {

        }
        with(mDataBinding) {
            vm = mViewModel
        }
    }
}