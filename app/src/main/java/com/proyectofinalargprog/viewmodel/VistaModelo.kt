package com.proyectofinalargprog.viewmodel
import android.util.Log

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proyectofinalargprog.model.Compare

class VistaModelo:ViewModel() {
    val compare: LiveData<Compare> get() = _compare
    private var _compare = MutableLiveData<Compare>(Compare("", "", false))

    fun comparar() {

        val text1:String  = (_compare.value?.text1.toString())
        val text2:String = (_compare.value?.text2.toString())
        Log.i("tad","esto es text1 $text1")
        Log.i("tad2", "esto es text2 $text2")
        var result = (text1 == text2)
        updateCompare(text1,text2,result)
    }


    private fun updateCompare(text1:String?,text2:String?, result:Boolean) {
        _compare.value = Compare(text1, text2,result)

    }

}