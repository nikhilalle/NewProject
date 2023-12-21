package com.matrix.nikhil.praticesProgram.dailyPrograms;

import org.testng.annotations.Test;

import java.util.Locale;

public class Vowels {
    @Test
    public void vowelFind() {

        String name = "my name is nikhilesh";
        int count = 0;
        name.toLowerCase(Locale.ROOT);

        for (int i = 0; i < name.length(); i++) {
            if (name .charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' ||
                    name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                System.out.println(name.charAt(i));
                count++;
            }
        }
        System.out.println("Total Vowels : " + count);
    }
}

