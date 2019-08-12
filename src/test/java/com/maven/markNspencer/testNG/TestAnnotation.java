package com.maven.markNspencer.testNG;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.*;

public class TestAnnotation {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeTest
    public void setUp(){
        System.out.println("Setting up the browser");
    }
    @Test
    public void login(){
        System.out.println("User login");
    }

    @Test
    public void f1(){
        System.out.println("Inside F1");
    }

    @Test
    public void f2(){
        System.out.println("Inside F2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before all test method");
    }


    @AfterTest
    public void tearDown(){
        System.out.println("Tear down the browser");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

}
