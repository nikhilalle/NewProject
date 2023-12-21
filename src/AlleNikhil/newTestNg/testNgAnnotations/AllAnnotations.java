package com.matrix.AlleNikhil.newTestNg.testNgAnnotations;

import org.testng.annotations.*;

public class AllAnnotations {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("  Before Suite Annotation");
        System.out.println("------------------------");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("  After Suite Annotation");
        System.out.println("------------------------");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("  Before Test Annotation");
        System.out.println("------------------------");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("  After Test Annotation");
        System.out.println("------------------------");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("  Before Class Annotation");
        System.out.println("------------------------");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("  After Class Annotation");
        System.out.println("------------------------");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("  Before Method Annotation");
        System.out.println("------------------------");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("  After Method Annotation");
        System.out.println("------------------------");
    }
    @Test
    public void TestExample(){
        System.out.println("  @Test Example Annotation");
        System.out.println("------------------------");
    }
}
