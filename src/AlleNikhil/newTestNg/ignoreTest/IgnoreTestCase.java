package com.matrix.AlleNikhil.newTestNg.ignoreTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestCase {
    @Test(enabled = false)
    public void test1() {
        System.out.println("Test 1  Method :  enabled = false   ");
    }

    @Test(enabled = true)
    public void test2() {
        System.out.println("Test 2  Method :  enabled = true  ");
    }

    @Test
    public void test3() {
        System.out.println("Test 3  Method :  Noting  ");
    }

    @Ignore
    @Test
    public void test4() {
        System.out.println("Test 4  Method :  @Ignore Annotation   ");
    }

    @Test
    public void test5() {
        System.out.println("Test 5  Method : In XML File    Include    ");
    }

    @Test
    public void test6() {
        System.out.println("Test 6  Method :  In XML File    Exclude  ");
    }
}
