package com.lakin.msu.criminalintent

import android.text.format.DateFormat
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

val currentDate = Date()

class CrimeListViewModel: ViewModel() {

    val crimes = mutableListOf<Crime>()
    init {
        for (i in 0 until 100) {
            val crime = Crime(
                id = UUID.randomUUID(),
                title = "Crime #$i",
                date = dateFormat.format(Date()),
                isSolved = i % 2 == 0
            )
            crimes += crime
        }
    }


    companion object {
        private val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.US)
        fun formatDate(date: Date): String {
            return dateFormat.format(date)
        }
    }
}