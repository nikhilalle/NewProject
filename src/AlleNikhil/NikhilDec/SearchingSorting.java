package AlleNikhil.NikhilDec;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class SearchingSorting {
    @Test
    public void set() {
        int[] s = {12, 23, 43, 45, 2, 7, 1, 0};
        // Arrays.sort(s);
        System.out.println(s);
        int temp;
        for (int i = 0; i <= s.length - 1; i++) {

            for (int j = i + 1; j < s.length; j++)
                if (s[i] > s[j]) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
        }
        for(int q=0;q<= s.length-1;q++){
            System.out.print("  "+s[q]);
        }
    }
}
