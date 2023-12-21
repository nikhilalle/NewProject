package com.matrix.AlleNikhil.newTestNg.testNgAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodLevel {
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
