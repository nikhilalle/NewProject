package com.matrix.AlleNikhil.newTestNg.testNgAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteLevel {
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
    @Test
    public void TestExample(){
        System.out.println("  @Test Example Annotation");
        System.out.println("------------------------");
    }
}
