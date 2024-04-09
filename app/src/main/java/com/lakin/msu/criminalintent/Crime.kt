package com.lakin.msu.criminalintent
import java.util.Date
import java.util.UUID


data class Crime(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val date: String = CrimeListViewModel.formatDate(Date()),
    val isSolved: Boolean,
)

