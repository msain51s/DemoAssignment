package com.demoassignment.utility;

import com.demoassignment.TestUtil;
import com.demoassignment.model.Result;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UtilsTest {

    protected static final String byline="By JONATHAN MAHLER and JIM RUTENBERG";

   protected List<Result> resultList;

    @Before
    public void setUp() throws Exception {
        resultList= Utils.getResultList(TestUtil.articleJsonData);

    }

    @Test
    public void getResultList() {

        assertNotNull(resultList);
        assertEquals(true,resultList.size()>0);
        assertEquals(byline,resultList.get(0).getByline());
    }
}