package com.matrix.AlleNikhil.newTestNg.PriorityTest;

import org.testng.annotations.Test;

public class SimilarPriority {
    @Test(priority = 3)
    public void nikhil() {
        System.out.println("Test 1  Method :  AlleNikhil.nikhil   ");
    }

    @Test(priority = 3)
    public void nakhil() {
        System.out.println("Test 2  Method :  nakhil  ");
    }

    @Test(priority = 3)
    public void nikhal() {
        System.out.println("Test 3  Method : nikhal  ");
    }

    @Test(priority = 3)
    public void nikhii() {
        System.out.println("Test 4  Method : nikhii  ");
    }
    @Test(priority = 3)
    public void nighil() {
        System.out.println("Test 5  Method :  nighil  ");
    }
}
