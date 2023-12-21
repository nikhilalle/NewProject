package com.matrix.AlleNikhil.newTestNg.testNgAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLevel {
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
    @Test
    public void TestExample(){
        System.out.println("  @Test Example Annotation");
        System.out.println("------------------------");
    }
}
