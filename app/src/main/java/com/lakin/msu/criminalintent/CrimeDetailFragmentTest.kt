package com.lakin.msu.criminalintent

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import com.lakin.msu.criminalintent.CrimeDetailFragment
import com.lakin.msu.criminalintent.R
import org.hamcrest.CoreMatchers.not
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@MediumTest
class CrimeDetailFragmentTest {

    @Test
    fun crimeDetailsDisplayedInUi() {
        val scenario = launchFragmentInContainer<CrimeDetailFragment>()

        // Add text to the crime title EditText
        onView(withId(R.id.crime_title)).perform(typeText("New Crime"))

        // Toggle the crime solved CheckBox
        onView(withId(R.id.crime_solved)).perform(click())

        // Assert that the crime title is updated
        onView(withId(R.id.crime_title)).check(matches(withText("New Crime")))

        // Assert that the CheckBox is checked
        onView(withId(R.id.crime_solved)).check(matches(isChecked()))

        // Checks changes in the Crime object
        scenario.onFragment { fragment ->
            assert(fragment.crime.title == "New Crime")
            assert(fragment.crime.isSolved)
        }
    }
}
