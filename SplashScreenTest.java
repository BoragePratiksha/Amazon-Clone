package com.example.AmazonC;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SplashScreenTest {

    @Rule
    public ActivityScenarioRule<SplashScreen> mActivityScenarioRule =
            new ActivityScenarioRule<>(SplashScreen.class);

    @Test
    public void splashScreenTest() {
        ViewInteraction materialTextView = onView(
                allOf(withId(R.id.signUpTextView), withText("New to Amazon.in? Create an account"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        0),
                                4),
                        isDisplayed()));
        materialTextView.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.regUsername), withText("pl"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        1),
                                3),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.regUsername), withText("pl"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        1),
                                3),
                        isDisplayed()));
        appCompatEditText2.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.regUsername),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        1),
                                3),
                        isDisplayed()));
        appCompatEditText3.perform(click());

        pressBack();

        pressBack();

        ViewInteraction materialTextView2 = onView(
                allOf(withId(R.id.signInTextView), withText("Already a customer? Sign in"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialTextView2.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.loginPassword), withText("1234567"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        1),
                                4),
                        isDisplayed()));
        appCompatEditText4.perform(pressImeActionButton());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.signInButton), withText("Sign-In"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        1),
                                5),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction materialTextView3 = onView(
                allOf(withId(R.id.viewAllProducts), withText("VIEW ALL"),
                        childAtPosition(
                                allOf(withId(R.id.home_layout),
                                        childAtPosition(
                                                withClassName(is("androidx.core.widget.NestedScrollView")),
                                                0)),
                                6),
                        isDisplayed()));
        materialTextView3.perform(click());

        ViewInteraction materialRadioButton = onView(
                allOf(withId(R.id.bottom_addprod), withText("Add Product"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                1),
                        isDisplayed()));
        materialRadioButton.perform(click());

        pressBack();

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.addProductImg),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                0)));
        appCompatImageView.perform(scrollTo(), click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.addProductName),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        appCompatEditText5.perform(scrollTo(), click());

        pressBack();

        ViewInteraction materialTextView4 = onView(
                allOf(withId(R.id.confirmAddProd), withText("Confirm"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                9)));
        materialTextView4.perform(scrollTo(), click());

        ViewInteraction materialRadioButton2 = onView(
                allOf(withId(R.id.bottom_search), withText("Search"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                2),
                        isDisplayed()));
        materialRadioButton2.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.searchBtn), withText("SEARCH"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.viewtoolbar),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.searchList),
                        childAtPosition(
                                withClassName(is("android.widget.FrameLayout")),
                                1)));
        recyclerView.perform(actionOnItemAtPosition(0, click()));

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.order), withText("Add to Cart"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("androidx.core.widget.NestedScrollView")),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction materialRadioButton3 = onView(
                allOf(withId(R.id.bottom_cart), withText("My Cart"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                3),
                        isDisplayed()));
        materialRadioButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.next_button), withText("BUY NOW"),
                        childAtPosition(
                                allOf(withId(R.id.llBottom),
                                        childAtPosition(
                                                withClassName(is("android.widget.RelativeLayout")),
                                                3)),
                                0),
                        isDisplayed()));
        appCompatButton4.perform(click());

        pressBack();

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.confirmOrder), withText("PLACE ORDER"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.RelativeLayout")),
                                        2),
                                2),
                        isDisplayed()));
        appCompatButton5.perform(click());

        pressBack();

        pressBack();

        pressBack();

        ViewInteraction materialRadioButton4 = onView(
                allOf(withId(R.id.bottom_profile), withText("Profile"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                4),
                        isDisplayed()));
        materialRadioButton4.perform(click());

        ViewInteraction materialTextView5 = onView(
                allOf(withId(R.id.profileHistory), withText("Your Orders"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        7),
                                0)));
        materialTextView5.perform(scrollTo(), click());

        pressBack();

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.profileUsername),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                4)));
        appCompatEditText6.perform(scrollTo(), click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.profileUsername),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                4)));
        appCompatEditText7.perform(scrollTo(), click());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.profileUsername),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                4)));
        appCompatEditText8.perform(scrollTo(), click());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.profileUsername),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                4)));
        appCompatEditText9.perform(scrollTo(), click());

        ViewInteraction materialTextView6 = onView(
                allOf(withId(R.id.profileLogout), withText("Logout"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        7),
                                2)));
        materialTextView6.perform(scrollTo(), click());

        ViewInteraction materialTextView7 = onView(
                allOf(withId(R.id.yesButton), withText("YES"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        2),
                                1),
                        isDisplayed()));
        materialTextView7.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
