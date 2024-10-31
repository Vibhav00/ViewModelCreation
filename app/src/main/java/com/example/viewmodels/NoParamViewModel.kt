package com.example.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.viewmodels.TimeUtil.Companion.convertToIndianTime
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

class NoParamViewModel:ViewModel() {
    private var creationTime= "0";
     /**
      *  since this init block will be just called after initialization
      *  we can find it out when it is initialized .....
      *
      * **/
    init {
        creationTime = convertToIndianTime(System.currentTimeMillis())
        Log.e("viewModelTest ","(NoParamViewModel) creation time = $creationTime")
    }

}