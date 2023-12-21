package com.matrix.AlleNikhil.newTestNg.PriorityTest;

import org.testng.annotations.Test;

public class SimilarAlphabetPriority {
    @Test(priority = 3)
    public void aaaab() {
        System.out.println("Test 1  Method :  aaaab   ");
    }
@Test(priority = 3)
    public void aaaba(){
        System.out.println("Test 2  Method :  aaaba  ");
    }

    @Test(priority = 3)
    public void aabac() {
        System.out.println("Test 3  Method : aabac  ");
    }

    @Test(priority = 3)
    public void abbcab() {
        System.out.println("Test 4  Method : abbcab  ");
    }
    @Test(priority = 3)
    public void aaaaa() {
        System.out.println("Test 5  Method :  aaaaa  ");
    }
}
