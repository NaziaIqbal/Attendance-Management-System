package com.android.attendance.activity;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginActivityTest {

    @Test
    public void testUserName(){
        String u="UserId";
        String p="Password";
        LoginActivity m = new LoginActivity();
        boolean flag= m.validateUsername(u,p);
        assertTrue(String.valueOf(flag),true);

    }
    @Test
    public void testUserName2(){
        String u="";
        String p="Password";
        LoginActivity m = new LoginActivity();
        boolean flag= m.validateUsername(u,p);
        // assertEquals(flag,false);
        assertFalse(String.valueOf(flag),false);

    }
    @Test
    public void testUserName3(){
        String u="UserID";
        String p="";
        LoginActivity m = new LoginActivity();
        boolean flag= m.validateUsername(u,p);
        // assertEquals(flag,false);
        assertFalse(String.valueOf(flag),false);

    }
}