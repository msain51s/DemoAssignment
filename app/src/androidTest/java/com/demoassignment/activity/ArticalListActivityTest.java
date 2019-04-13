package com.demoassignment.activity;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ProgressBar;

import com.demoassignment.viewmodel.ArticalListViewModel;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class ArticalListActivityTest {

    @Rule
    public ActivityTestRule<ArticalListActivity> activityTestRule=
            new ActivityTestRule<>(ArticalListActivity.class);

    private ArticalListActivity articalListActivity;
    private Context appContext;

    @Before
    public void setup(){

         appContext = InstrumentationRegistry.getTargetContext();
         articalListActivity=activityTestRule.getActivity();

    }

    @Test
    public void initViewModel() {

        ArticalListViewModel viewModel=articalListActivity.initViewModel();

        assertNotNull(viewModel);
    }


    @Test
    public void initProgressBar(){
        ProgressBar progressBar=articalListActivity.initProgressBar();

        assertNotNull(progressBar);
    }

}