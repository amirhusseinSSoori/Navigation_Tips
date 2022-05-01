package com.example.navigationtips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.plusAssign
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.navigationtips.databinding.ActivityMainBinding
import com.example.navigationtips.util.KeepStateNavigator
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    private val navController: NavController
        get() {
            return Navigation.findNavController(this, R.id.nav_host_fragment)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigation()
    }

    private fun setupNavigation() {
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment)?.let { navHostFragment ->
            // setup custom navigator
            val navigator = KeepStateNavigator(
                this,
                navHostFragment.childFragmentManager,
                R.id.nav_host_fragment
            )
            navController.navigatorProvider += navigator

            // set navigation graph
            navController.setGraph(R.navigation.graph)
            NavigationUI.setupWithNavController(
                findViewById<BottomNavigationView>(R.id.bottomNav),
                navController
            )
        }
    }
}