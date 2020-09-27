package com.android.attendance.activity.Model;

import com.android.attendance.activity.AddStudentActivity;

import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddStudentActivityTest {

    @Test
    public void onCreateOptionsMenuTest() {
        AddStudentActivity a = new AddStudentActivity();
        String u="Nazia";
        String i="18101006";
        assertTrue(String.valueOf(a.studentCreate(u,i)),true);

    }

    @Test
    public void onCreateOptionsMenuTest2() {
        AddStudentActivity a = new AddStudentActivity();
        String u="Nazia";
        String i="";
        assertFalse(a.studentCreate(u,i));

    }

    @Test
    public void onCreateOptionsMenuTest3() {
        AddStudentActivity a = new AddStudentActivity();
        String u="";
        String i="18101006";
        assertFalse(a.studentCreate(u,i));

    }

}