package com.demoassignment.viewmodel;

import android.content.Context;

import com.demoassignment.TestUtil;
import com.demoassignment.model.Result;
import com.demoassignment.utility.Utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ArticalListViewModelTest {

    protected List<Result> resultList;
    @Before
    public void setUp() throws Exception {
        resultList= Utils.getResultList(TestUtil.articleJsonData);

    }

    @Test
    public void getArticleList() {
        assertNotNull(resultList);
        assertEquals(true,resultList.size()>0);
    }
}