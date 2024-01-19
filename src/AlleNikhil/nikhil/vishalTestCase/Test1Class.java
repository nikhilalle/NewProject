package AlleNikhil.nikhil.vishalTestCase;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Test1Class {
    /*
     *************
      ***********
       *********
        *******
        *****
        ***
         *
     */
    @Test
    public void get() {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; ) {
                System.out.print("*");

            }
            System.out.println();
        }
    }


       @Test
               public void get1()
        {
            int[] num = new int[]{10, 20, 30, 4, 0, 12, 14};
            Arrays.sort(num);
//            int temp = 0, i, j;
//            for (i = 0; i < num.length; i++) {
//                for (j = i + 1; j < num.length; j++) {
//                    if (num[i] > num[j]) {
//                        temp = num[i];
//                        num[i] = num[j];
//                        num[j] = temp;
//
//                    }
//                }
//                System.out.println(num[j]);
//            }

            for( int o:num)
            System.out.println(" "+o);
            int e=num.length-2;
            System.out.println(num[e]);
        }


    }

