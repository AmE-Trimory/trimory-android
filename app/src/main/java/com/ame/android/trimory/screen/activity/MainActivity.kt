package com.ame.android.trimory.screen.activity

import androidx.activity.viewModels
<<<<<<< Updated upstream:app/src/main/java/com/ame/android/trimory/screen/main/activity/MainActivity.kt
import androidx.navigation.NavController
import com.ame.android.trimory.R
import com.ame.android.trimory.base.BaseActivity
import com.ame.android.trimory.databinding.ActivityMainBinding
import com.ame.android.trimory.screen.main.viewmodel.MainViewModel
=======
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ame.android.trimory.R
import com.ame.android.trimory.base.BaseActivity
import com.ame.android.trimory.databinding.ActivityMainBinding
import com.ame.android.trimory.screen.viewmodel.MainViewModel
>>>>>>> Stashed changes:app/src/main/java/com/ame/android/trimory/screen/activity/MainActivity.kt

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