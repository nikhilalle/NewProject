package AlleNikhil.nikhil.program;

import org.testng.annotations.Test;

public class AllReverseString {
    @Test
    public void set() {
        String str = "Nikhilesh Alle";
        String st[] = str.split(" ");
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);  // //Nikhilesh Alle
        }
    }
    @Test
    public void set1() {
        String str = "Nikhilesh Alle";
        String st[] = str.split(" ");
        for (int i = st.length - 1; i >= 0; i--) {
            System.out.println(st[i]);  // Alle Nikhilesh
        }
    }
    @Test
    public void set2() {
        String str = "Nikhilesh Alle";
        String st[] = str.split(" ");
        for (int i = 0; i < st.length; i++) {
            for (int j = st[i].length() - 1; j >= 0; j--) {
                System.out.print(st[i].charAt(j));
            }
            System.out.println();  // hselihkiN  ellA
        }
    }
    @Test
    public void set3() {
        String str = "Nikhilesh Alle";
        char ch;
        String rvs = " ";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rvs = ch + rvs;

        }
        System.out.println(rvs);    // ellA hselihkiN
    }
    @Test
    public void set4() {
        String str = "Nikhilesh";
        char[] chArr = str.toCharArray();
        for (char ab : chArr) {
            System.out.print(" " + ab);
        }
    }
}
