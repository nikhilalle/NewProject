package com.matrix.nikhil.praticesProgram.programsTest;

import org.testng.annotations.Test;

public class StringReverseTest {
    @Test
    public void StringRv1(){
        String str=("My name is Nikhilesh");
        System.out.println(str);
        System.out.println(str.length());
        String [] st = str.split(" ");
        for(int i=st.length-1;i>=0;i--){
            System.out.println(st[i]);
        }
    }
    @Test
    public void StringRv2(){
        String str=("My name is Nikhilesh");
        System.out.println(str);
        System.out.println("Total Characters  of String  "+str.length());

        String [] st = str.split(" ");

        System.out.println("Length Of Words  "+st.length);

        for(int i = st.length-1; i >= 0; i--){
            System.out.println(st[i]);

        }

    }
    @Test
    public void StringNo(){
        String str[]={"My", "name","is","Nikhilesh"};
        System.out.println(str.length);
        }

    @Test
    public void StringNum(){
        String str=("My name is Nikhilesh");
        System.out.println(str.length());
        int  c=1;
        for (int i=0;i<=str.length()-1;i++){
            if (str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                c++;
            }
        }
        System.out.println(c);
    }


}
