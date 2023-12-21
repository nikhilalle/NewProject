package com.matrix.nikhil.praticesProgram.programsTest;

import java.util.Arrays;

public class TestStringData {
    public static void main(String[] args) {


        String s1 = "Nikhil       Alle";
        System.out.println(s1);

        System.out.println(s1.replaceAll("\\s+", ""));  // Remove Entire Space on 2 Words
        System.out.println(s1.replaceAll("\\\\s+", ""));  //  Noting Will Happen
        System.out.println(s1.replaceAll("\\\\\\s+", ""));  //  Noting Will Happen
        System.out.println(s1.replaceAll("\\s+", ""));  //  Remove Entire Space on 2 Words

        }
    }

