package com.matrix.nikhil.program;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementInArray {
    public void duplicateRemove() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Akash");
        list1.add("Nikhilesh");
        list1.add("Pankaj");
        list1.add("Rajesh");
        list1.add("Akash");
        list1.add("Pankaj");
        System.out.println("Before Sorting Elements " + list1);
        Collections.sort(list1);
        System.out.println("After SortingElements " + list1);
        ArrayList<String> list2 = new ArrayList<>();
        for (String i : list1) {
            if (list2.contains(i) == false) {
                list2.add(i);
            }
        }
        System.out.println("Removed Duplicates " + list2);
    }
    @Test
    public void removeDuplicateValues() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(14);
        list1.add(55);
        list1.add(14);
        list1.add(55);
        list1.add(8);
        list1.add(1);
        System.out.println("Before Sorting Elements " + list1);
        Collections.sort(list1);
        System.out.println("After SortingElements " + list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer i : list1) {
            if (!list2.contains(i)) {
                list2.add(i);
            }
        }
        System.out.println("Array " + list2);
    }
@Test
    public void duplicateRemove1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Akash");
        list1.add("Nikhilesh");
        list1.add("Pankaj");
        list1.add("Rajesh");
        list1.add("Akash");
        list1.add("Pankaj");
        System.out.println("Before Sorting Elements " + list1);
        Collections.sort(list1);
        System.out.println("After SortingElements " + list1);
        Set<String> str=new HashSet<>(list1);

        for(String s:str){
            System.out.println(s);
        }
        
    }
}
// The contains() method of List interface in Java is used for
// checking if the specified element exists in the given list or not.
// Parameters:
// This method accepts a single parameter obj whose presence in this list is to be tested.

