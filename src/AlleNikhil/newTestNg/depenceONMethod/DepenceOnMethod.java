package com.matrix.AlleNikhil.newTestNg.depenceONMethod;

import org.testng.annotations.Test;

public class DepenceOnMethod {
    @Test (dependsOnMethods = "test2")
    public void test1() {
        System.out.println("Test 1  Method :  dependsOnMethods =  test2 ");
    }

    @Test (dependsOnMethods = "test4")
    public void test2() {
        System.out.println("Test 2  Method :  dependsOnMethods =  test4 ");
    }

    @Test (dependsOnMethods = "test1")
    public void test3() {
        System.out.println("Test 3  Method :   dependsOnMethods =  test1 ");
    }

    @Test (dependsOnMethods = "test5")
    public void test4() {
        System.out.println("Test 4  Method :   dependsOnMethods =  test5   ");
    }
    @Test
    public void test5() {
        System.out.println("Test 5  Method :    Independent    ");
    }



}
