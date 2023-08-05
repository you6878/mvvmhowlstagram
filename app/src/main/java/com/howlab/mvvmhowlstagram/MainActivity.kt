package com.howlab.mvvmhowlstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.firebase.firestore.auth.User
import com.howlab.mvvmhowlstagram.databinding.ActivityMainBinding
import com.howlab.mvvmhowlstagram.fragment.AlarmFragment
import com.howlab.mvvmhowlstagram.fragment.DetailViewFragment
import com.howlab.mvvmhowlstagram.fragment.GridFragment
import com.howlab.mvvmhowlstagram.fragment.UserFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_home ->{
                    var f = DetailViewFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.main_content,f).commit()

                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_search ->{
                    var f = GridFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.main_content,f).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_favorite_alarm ->{
                    var f = AlarmFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.main_content,f).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_account ->{
                    var f = UserFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.main_content,f).commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false

        }
    }
}