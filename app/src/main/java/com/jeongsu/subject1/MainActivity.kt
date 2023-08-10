package com.jeongsu.subject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(){

    private val checkFragment by lazy{CheckFragment()}
    private val registrationFragment by lazy{RegistrationFragment()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNavigationBar()

    }

    private fun initNavigationBar()
    {
        val bnv_main=findViewById<BottomNavigationView>(R.id.bnv_main)
        bnv_main.run{
            setOnNavigationItemSelectedListener{
                when(it.itemId)
                {
                    R.id.registration->{
                        changeFragment(registrationFragment)
                    }
                    R.id.check->{
                        changeFragment(checkFragment)
                    }

                }
                true
            }
            selectedItemId=R.id.registration
        }
    }

    private fun changeFragment(fragment:Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commit()
    }
}