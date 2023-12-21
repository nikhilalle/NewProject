package com.matrix.AlleNikhil.programs;

import org.testng.annotations.Test;

public class RemoveCharcter {
    @Test
    public void removechar(){
        String str="My self  Nikhilesh";
        String st[]=str.split(" ");
        char ch;
        for(int i=0;i<st.length;i++){
            ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                System.out.println("sdfw"+ch);
            }
        }
    }
}
