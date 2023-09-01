package com.proyectofinalargprog.viewmodel
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proyectofinalargprog.model.Compare

class VistaModelo:ViewModel() {
    val compare: LiveData<Compare> get() = _compare
    private var _compare = MutableLiveData<Compare>(Compare("", "", "sin resultados"))


    fun comparar(text1: String, text2: String) {


        if (text1 == text2) {
            _compare.value?.resul = "Las cadenas son iguales"

        } else {
            _compare.value?.resul = "Las cadenas no son iguales"

        }
    updateCompare(text1,text2, _compare.value?.resul.toString())
    }

    private fun updateCompare(text1:String?,text2:String?, result:String) {
        _compare.value = Compare(text1, text2,result)

    }

}