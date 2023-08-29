package com.proyectofinalargprog.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proyectofinalargprog.model.Compare

class VistaModelo:ViewModel() {
    val compare: LiveData<Compare> get() = _compare
    private var _compare = MutableLiveData<Compare>(Compare("", "", true))

    fun comparar() {

        val text1 = (_compare.value?.text1)
        val text2 = (_compare.value?.text2)
        val result = (text1 == text2)
    }


    private fun updateCompare(result: Boolean) {
        _compare.value = result

    }

}