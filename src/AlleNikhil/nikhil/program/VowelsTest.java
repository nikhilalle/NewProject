package com.matrix.nikhil.program;

import java.util.Locale;

public class VowelsTest {
    public static void main(String[] args) {
        String anyName="my name is nikhilesh"; // anyName We can Write  like as Dynamically
        int count=0;

        String name=anyName;  // Provide The Value
       name.toLowerCase(Locale.ROOT);
        for(int i=0;i<name.length();i++){
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u'){
                System.out.println(name.charAt(i));
                count++;
            }
        }
        System.out.println("Total Vowels : "+count);
    }

}
