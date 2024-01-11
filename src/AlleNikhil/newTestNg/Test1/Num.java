package AlleNikhil.newTestNg.Test1;

import org.testng.annotations.Test;

public class Num {
    /*
 1
 12
 123
 1234
 12345
     */
    @Test
    public void get() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    // 1 1 2 3 5---------50


    @Test
    public void det() {
        int a = 1;
        int b = 1, n = 50;
        for (int i = 1; i <= n; i++) {
            b = a + b;
//            b=a+i;
            System.out.println(b);
        }

    }
    /*
String s="Java"

o/p-avaJ

     */
    @Test
    public void get1(){
        String  str="Java";
        String st[]=str.split(" ");
        for(int i=st.length-1;i<=0;i--){
            System.out.println(st[i]);
        }
    }

//    @Test
//    public void get12(){
//        StringBuilder str="Java";
//
//    }

}
