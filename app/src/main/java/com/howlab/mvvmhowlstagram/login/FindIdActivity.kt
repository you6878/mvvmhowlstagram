package com.howlab.mvvmhowlstagram.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.howlab.mvvmhowlstagram.R
import com.howlab.mvvmhowlstagram.databinding.ActivityFindIdBinding

class FindIdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFindIdBinding
    val findIdViewModel: FindIdViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_find_id)
        binding.activity = this
        binding.viewModel = findIdViewModel
        binding.lifecycleOwner = this
        setObserve()
    }
    fun setObserve(){
        findIdViewModel.toastMessage.observe(this){
            if(!it.isEmpty()){
                Toast.makeText(this,it,Toast.LENGTH_LONG).show()
            }
        }
    }
}