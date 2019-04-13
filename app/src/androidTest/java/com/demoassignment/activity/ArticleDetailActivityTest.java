package com.demoassignment.activity;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.demoassignment.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ArticleDetailActivityTest {

 @Rule
   public ActivityTestRule<ArticleDetailActivity> activityTestRule=
         new ActivityTestRule<>(ArticleDetailActivity.class);

 private ArticleDetailActivity articleDetailActivity;

 @Before
 public void setup(){
     articleDetailActivity=activityTestRule.getActivity();
 }

 @Test
 public void initViewTest(){
     assertNotNull(articleDetailActivity);
     articleDetailActivity.initView();
 }
    @Test
    public void settingUpDataTest() {

     assertNotNull(onView(withId(R.id.title_text)));
     onView(withId(R.id.title_text)).check(matches(isDisplayed()));

    }

}