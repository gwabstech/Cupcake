
package com.example.cupcake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController


/*
Todo
Extend the Cupcake app with your own variations on the cupcake order flow. Examples:

Offer a special flavor that has some special conditions around it, such as not being available for same day pickup.
Ask the user for their name for the cupcake order.
Allow the user to select multiple cupcake flavors for their order if the quantity is more than 1 cupcake.
What areas of your app would you need to update to accommodate this new functionality?
 */
class MainActivity : AppCompatActivity(R.layout.activity_main){
    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() ||  super.onSupportNavigateUp()
    }
}