package com.proyectofinalargprog.viewmodel
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proyectofinalargprog.model.Compare

class VistaModelo:ViewModel() {
    val compare: LiveData<Compare> get() = _compare
    private var _compare = MutableLiveData<Compare>(Compare("", "", ""))


    fun comparar(text1: String, text2: String) {


        if (text1 == text2) {
            _compare.value?.resul = "Las cadenas son iguales"

        } else {
            _compare.value?.resul = "Las cadenas no son iguales"


        }
    updateCompare(text1,text2, _compare.value?.resul.toString())
    }



    /* fun comparar() {

        val text1:String  = _compare.value?.text1.toString()
        val text2:String = _compare.value?.text2.toString()
        var nose=_compare.value?.resul

        Log.i("tad","esto es text1 $text1")
        Log.i("tad2", "esto es text2 $text2")

        var result : Boolean = (text1==text2)

        Log.i("nuevo adto", "$r")
        updateCompare(text1,text2,result)
    }
*/

    private fun updateCompare(text1:String?,text2:String?, result:String) {
        _compare.value = Compare(text1, text2,result)


    }

}