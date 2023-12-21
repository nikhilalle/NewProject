package com.matrix.AlleNikhil.newTestNg.testNgAnnotations;

import org.testng.annotations.*;

public class ClassLevel {
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

    @Test
    public void TestExample(){
        System.out.println("  @Test Example Annotation");
        System.out.println("------------------------");
    }
}
