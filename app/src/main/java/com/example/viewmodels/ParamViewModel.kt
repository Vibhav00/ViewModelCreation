package com.example.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.viewmodels.TimeUtil.Companion.convertToIndianTime

// since i am declaring name as " val name " so the class will create its own
// property by this name
class ParamViewModel(private val name:String):ViewModel() {
    private var creationTime= "0";
    /**
     *  since this init block will be just called after initialization
     *  we can find it out when it is initialized .....
     *
     * **/
    init {
        creationTime = convertToIndianTime(System.currentTimeMillis())
        Log.e("viewModelTest ","(ParamViewModel) creation time = $creationTime and value is = $name")
    }
}