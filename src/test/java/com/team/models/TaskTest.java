package com.team.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.text.SimpleDateFormat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TaskTest {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAnInstanceOfTask() throws Exception {
        Task t = new Task();
        assertThat(t, instanceOf(Task.class));
        assertTrue(t.getCreatedAt().getTime() > 0);
        //assertTrue(t.getUpdatedAt().getTime() > 0);
    }

    @Test
    public void shouldGetAndSetIdOnTask() throws Exception {
        Task t = new Task();
        t.setId(3);
        assertEquals(3, t.getId());
    }

    @Test
    public void shouldGetAndSetNameOnTask() throws Exception {
        Task t = new Task();
        t.setName("Get Milk");
        assertEquals("Get Milk", t.getName());
    }

    @Test
    public void shouldGetAndSetCategoryOnTask() throws Exception {
        Task t = new Task();
        t.setCategory("Home");
        assertEquals("Home", t.getCategory());
    }

    @Test
    @Ignore
    public void shouldGetAndSetDueDateOnTask() throws Exception {
        Task t = new Task();
        t.setDue(format.parse("2016-08-20"));
        assertEquals("Sat 2016-08-20 ", t.getDue().toString());
    }

    @Test
    public void shouldGetAndSetIsCompletedOnTask() throws Exception {
        Task t = new Task();
        t.setComplete(true);
        assertTrue(t.isComplete());
    }


// TODO: create test for createdAT and updatedAT
//
//    @Test
//    public void shouldCreateAnInstanceOfTask() throws Exception {
//        Task t = new Task();
//        assertThat(t, instanceOf(Task.class));
//        assertTrue(t.getCreatedAt().getTime() > 0);
//        assertTrue(t.getUpdatedAt().getTime() > 0);
//    }

    @Test
    public void shouldUpdateTheTimeOnTask() throws Exception {
        Task t = new Task();
        t.setUpdatedAt(null);
        t.updateTime();
        assertTrue(t.getUpdatedAt().getTime() > 0);
    }

}