package com.example.bookliberator

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.LargeTest

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4

@RunWith(AndroidJUnit4::class)
@LargeTest
class IntroductionFragmentTest {

    private lateinit var stringToBetyped: String

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)

    @Test
    fun click_startScanning_button() {
        // Click the continue button
        onView(withId(R.id.button_introduction_continue)).perform(click())

        // Ensure the scanner fragment is rendered
        onView(withId(R.id.Scanner)).check(matches(isDisplayed()))

        // Ensure the introduction fragment is hidden
        onView(withId(R.id.Introduction)).check(doesNotExist())
    }
}
