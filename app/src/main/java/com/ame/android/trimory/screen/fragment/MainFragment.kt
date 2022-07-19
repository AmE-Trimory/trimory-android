package com.ame.android.trimory.screen.fragment

import androidx.fragment.app.activityViewModels
import com.ame.android.trimory.R
import com.ame.android.trimory.base.BaseFragment
import com.ame.android.trimory.databinding.FragmentMainBinding
import com.ame.android.trimory.screen.viewmodel.MainViewModel

/**
 * Created by KimBH on 2022/07/12.
 */
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {
    override val mViewModel by activityViewModels<MainViewModel>()

    override fun getLayoutRes(): Int = R.layout.fragment_main

    override fun subscribeUi() {
        with(mViewModel) {

        }
        with(mDataBinding) {
            vm = mViewModel
        }
    }
}