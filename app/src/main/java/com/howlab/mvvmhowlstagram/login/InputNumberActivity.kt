package com.howlab.mvvmhowlstagram.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.howlab.mvvmhowlstagram.R
import com.howlab.mvvmhowlstagram.databinding.ActivityInputNumberBinding

class InputNumberActivity : AppCompatActivity() {
    lateinit var binding : ActivityInputNumberBinding
    val inputNumberViewModel : InputNumberViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_input_number)
        binding.viewModel = inputNumberViewModel
        binding.lifecycleOwner = this
        setObserve()
    }
    fun setObserve(){
        inputNumberViewModel.nextPage.observe(this){
            if(it){
                finish()
                startActivity(Intent(this,LoginActivity::class.java))
            }
        }
    }
}