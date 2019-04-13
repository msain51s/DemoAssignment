package com.demoassignment.adapter;

import com.demoassignment.TestUtil;
import com.demoassignment.model.Result;
import com.demoassignment.utility.Utils;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ArticalListAdapterTest {

    List<Result> resultList;
    @Before
    public void setupData(){
        resultList= Utils.getResultList(TestUtil.articleJsonData);
    }

    @Test
    public void getItemCount() {

        assertNotNull(resultList);
        assertTrue(resultList.size()>0);
    }
}