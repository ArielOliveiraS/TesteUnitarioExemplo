package com.example.mediaescolar;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testeActivityCalculo() {

        onView(withId(R.id.nota1)).perform(typeText("10"));
        onView(withId(R.id.nota2)).perform(typeText("8.5 "));
        onView(withId(R.id.nota3)).perform(typeText("7.5"));
        onView(withId(R.id.nota4)).perform(typeText("10"));

        onView(withId(R.id.btnCalcular)).perform(click());

        closeSoftKeyboard();

        onView(withText("Nota Final: 9.0")).check(matches(isDisplayed()));

    }
}
