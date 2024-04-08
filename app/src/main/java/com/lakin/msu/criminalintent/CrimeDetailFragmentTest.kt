package com.lakin.msu.criminalintent

/*import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed*/
import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Pattern.matches

@RunWith(AndroidJUnit4::class)
class CrimeDetailFragmentTest {

    private lateinit var scenario: FragmentScenario<CrimeDetailFragment>

    @Before
    fun setUp() {
        // Launch the CrimeDetailFragment
        scenario = launchFragmentInContainer<CrimeDetailFragment>()
    }

    /*@Test
    fun testCrimeTitleInputAndCheckbox() {
        // Check if the crimeTitle EditText is displayed and interact with it
        onView(withId(R.id.crime_title)).check(matches(isDisplayed()))
        onView(withId(R.id.crime_title)).perform(typeText("New Crime Title"))

        // Check if the crimeSolved CheckBox is displayed and click it
        onView(withId(R.id.crime_solved)).check(matches(isDisplayed()))
        onView(withId(R.id.crime_solved)).perform(click())

        // Assert that the fragment's crime object has been updated correctly
        scenario.onFragment { fragment ->
            assert(fragment.crime.title == "New Crime Title")
            assert(fragment.crime.isSolved)
        }
    }*/
}
