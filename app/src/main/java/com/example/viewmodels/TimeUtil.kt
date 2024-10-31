package com.example.viewmodels

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

class TimeUtil {

    companion object{
        fun convertToIndianTime(timeInMillis: Long): String {
            // Set the date format to include "th", "st", "nd", or "rd" for day suffix
            val sdf = SimpleDateFormat("d MMM yyyy 'at' hh:mm:ss a", Locale.getDefault())
            sdf.timeZone = TimeZone.getTimeZone("Asia/Kolkata")
            val formattedDate = sdf.format(Date(timeInMillis))

            // Add ordinal suffix (e.g., "1st", "2nd", "3rd", "4th") to the day
            val day = SimpleDateFormat("d", Locale.getDefault()).format(Date(timeInMillis)).toInt()
            val dayWithSuffix = when {
                day % 100 in 11..13 -> "${day}th"
                day % 10 == 1 -> "${day}st"
                day % 10 == 2 -> "${day}nd"
                day % 10 == 3 -> "${day}rd"
                else -> "${day}th"
            }

            val lenght = timeInMillis.toString().length
            return "${formattedDate.replaceFirst(Regex("\\d+"), dayWithSuffix)}  (${timeInMillis.toString().substring(lenght-3,lenght)})"
        }
    }
}