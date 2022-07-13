package com.ame.android.trimory.screen.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ame.android.trimory.R
import com.ame.android.trimory.databinding.ActivityMainBinding
import com.ame.android.trimory.databinding.ActivityNavBinding

class NavActivity : AppCompatActivity() {

    lateinit var binding: ActivityNavBinding
    lateinit var navHostFragment : NavHostFragment
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()
        binding.bottomNavigationView.setupWithNavController(navController)

    }
}