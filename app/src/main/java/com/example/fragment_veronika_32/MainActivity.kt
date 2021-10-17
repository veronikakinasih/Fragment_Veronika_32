package com.example.fragment_veronika_32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment_veronika_32.fragment.HomeFragment
import com.example.fragment_veronika_32.fragment.NotificationFragment
import com.example.fragment_veronika_32.fragment.SettingsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val notificationFragment = NotificationFragment()
        val settingsFragment = SettingsFragment()

        makeCurrentFragment (homeFragment)

        val botton_navigation = findViewById<BottonNavigationView>(R.id.botton_navigation)

        botton_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> makeCurrentFragment(homeFragment)
                R.id.menu_notification -> makeCurrentFragment(notificationFragment)
                R.id.menu_setting -> makeCurrentFragment(settingsFragment)
            }

            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }

    }
}