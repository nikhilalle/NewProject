package com.matrix.AlleNikhil.newTestNg.depenceONMethod;

import org.testng.annotations.Test;

public class TestDependence {
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



    @Test (dependsOnMethods = "test4")
    public void test6() {
        System.out.println("Test 6  Method :  dependsOnMethods =  test4 ");
    }

    @Test (dependsOnMethods = "test3")
    public void test7() {
        System.out.println("Test 7  Method :  dependsOnMethods =  test7 ");
    }

    @Test (dependsOnMethods = "test9")
    public void test8() {
        System.out.println("Test 8  Method :   dependsOnMethods =  test9 ");
    }

    @Test (dependsOnMethods = "test7")
    public void test9() {
        System.out.println("Test 9  Method :   dependsOnMethods =  test7   ");
    }
    @Test(dependsOnMethods = "test5")
    public void test10() {
        System.out.println("Test 10  Method :  dependsOnMethods =  test5   ");
    }


}
