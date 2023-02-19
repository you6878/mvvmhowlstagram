package com.howlab.mvvmhowlstagram.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

data class FindIdModel(var id : String? = null, var phoneNumber : String? = null)
class InputNumberViewModel : ViewModel() {
    var auth = FirebaseAuth.getInstance()
    var firestore = FirebaseFirestore.getInstance()
    var nextPage = MutableLiveData(false)
    var inputNumber = ""

    fun savePhoneNumber(){
        var findIdModel = FindIdModel(auth.currentUser?.email, inputNumber)
        firestore.collection("findIds").document().set(findIdModel).addOnCompleteListener {
            if(it.isSuccessful){
                nextPage.value = true
                auth.currentUser?.sendEmailVerification()
            }
        }
    }
}