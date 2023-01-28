package com.howlab.mvvmhowlstagram.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {


    var id :MutableLiveData<String> = MutableLiveData("")
    var password :MutableLiveData<String> = MutableLiveData("")

    var showInputNumberActivity : MutableLiveData<Boolean> = MutableLiveData(false)
    var showFindPasswordActivity : MutableLiveData<Boolean> = MutableLiveData(false)

}