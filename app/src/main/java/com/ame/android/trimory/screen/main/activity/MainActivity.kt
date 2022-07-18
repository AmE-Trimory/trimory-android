package com.ame.android.trimory.screen.main.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ActivityCompat
import androidx.navigation.NavController
import com.ame.android.trimory.R
import com.ame.android.trimory.base.BaseActivity
import com.ame.android.trimory.databinding.ActivityMainBinding
import com.ame.android.trimory.screen.main.viewmodel.MainViewModel
import java.lang.reflect.Modifier

class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>() {
    override val mViewModel: MainViewModel by viewModels()

    override fun getLayoutRes(): Int = R.layout.activity_main

    override fun subscribeUi() {
        with(mViewModel) {

        }
        with(mDataBinding) {
            vm = mViewModel
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainScreen()
        }
    }
}

    @Composable
    fun MainScreen(){
        MaterialTheme(
        ) {
            Surface(modifier = androidx.compose.ui.Modifier.background(Color.White)) {
                Column() {
                    Text("Test")
                }
            }
        }    
    }

    @Preview
    @Composable
    fun PreviewScreen(){
        MainScreen()
    }