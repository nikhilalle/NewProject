package AlleNikhil.NikhilDec;

import org.testng.annotations.Test;

public class String {
    @Test
    public void reversString() {
        java.lang.String str = "Nikhilesh";
        char ch;
        java.lang.String rvs = " ";
        for (int i = 0; i <= str.length() - 1; i++) {
            ch = str.charAt(i);
            rvs = ch + rvs;
        }
        System.out.println(rvs);
    }

    @Test
    public void get() {
        java.lang.String name = "Nikhilesh Anil Alle";
        char ch;
        java.lang.String rvs = " ";
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            rvs = ch + rvs;
        }
        System.out.println(rvs);
    }

    @Test
    public void get1() {
        java.lang.String name = "Nikhilesh Anil Alle";
        char ch;
        java.lang.String rvs = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            ch = name.charAt(i);
            rvs = ch + rvs;
        }
        System.out.println(rvs);
    }

    @Test
    public void get12() {
        java.lang.String name = "Nikhilesh Anil Alle";
        java.lang.String[] rvs = name.split(" ");
        for (int i = rvs.length - 1; i >= 0; i--) {
            System.out.println(rvs[i]);
        }
    }

    @Test
    public void get2() {
        java.lang.String str = "Test the product";
        java.lang.String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    @Test
    public void reversWithOutChangePosition(){
        java.lang.String name="My name is Nikhilesh i am From Pune";
        java.lang.String[] str=name.split(" ");
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--)
            {
                System.out.print(str[i].charAt(j));
            }
            System.out.println();
        }
    }
    @Test
    public void reversWithChangePosition(){
        java.lang.String name="My name is Nikhilesh i am From Pune";
        java.lang.String str;
        StringBuilder builder=new StringBuilder(name);
        builder.reverse();
        System.out.println(builder);
    }

    @Test
    public void reverse(){
        java.lang.String str="Nikhilesh ALle";
        java.lang.String [] li=str.split(" ");

        for(int i=0;i<li.length;i++){
            System.out.println(li[i]);
        }
    }

    @Test
    public void reverse1() {
        java.lang.String str = "Nikhilesh ALle";
        java.lang.String[] li = str.split(" ");
        for(int i=0;i<li.length;i++){
            for(int j= li[i].length()-1;j>=0;j--){
                System.out.print(li[i].charAt(j));}
        }
    }
    @Test
    public void reverse3() {
        java.lang.String str = "Nikhilesh ALle";
        java.lang.String[] li = str.split(" ");
        for(int i=li.length-1;i>=0;i--){

                System.out.print(li[i]);
        }
        }



}
