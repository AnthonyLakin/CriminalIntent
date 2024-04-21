package com.lakin.msu.criminalintent

import android.text.format.DateFormat
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

private const val TAG = "CrimeListViewModel"

class CrimeListViewModel: ViewModel() {

    val crimes = mutableListOf<Crime>()
    init {
        Log.d(TAG, "init starting")
        viewModelScope.launch {
            Log.d(TAG, "is launched")
            crimes += loadCrimes()
            Log.d(TAG, "Loading crimes finished")
        }
    }

    suspend fun loadCrimes(): List<Crime> {
        val result = mutableListOf<Crime>()
        delay(5000)
        for (i in 0 until 100) {
            val crime = Crime(
                id = UUID.randomUUID(),
                title = "Crime #$i",
                date = dateFormat.format(Date()),
                isSolved = i % 2 == 0,
                requiresPolice = false
            )
            result += crime
        }
        return result
    }


    companion object {
        private val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.US)
        fun formatDate(date: Date): String {
            return dateFormat.format(date)
        }
    }
}