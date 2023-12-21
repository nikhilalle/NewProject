package com.matrix.AlleNikhil.newTestNg.PriorityTest;

import org.testng.annotations.Test;

public class PriorityTestCases {
    @Test(priority = -1)
    public void test1() {
        System.out.println("Test 1  Method :  priority = -1   ");
    }

    @Test(priority = 0)
    public void test2() {
        System.out.println("Test 2  Method :  priority = 0  ");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("Test 3  Method :  priority = 3  ");
    }

    @Test
    public void test4() {
        System.out.println("Test 4  Method :  priority is Noting   ");
    }
    @Test(priority = 'a')
    public void test5() {
        System.out.println("Test 5  Method :  priority = A  ");
    }
    @Test(priority = 'g')
    public void test6() {
        System.out.println("Test 6  Method :  priority = G  ");
    }
    @Test(priority = 'd')
    public void test7() {
        System.out.println("Test 7  Method :  priority = D  ");
    }


}
