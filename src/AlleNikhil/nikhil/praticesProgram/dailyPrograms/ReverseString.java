package AlleNikhil.nikhil.praticesProgram.dailyPrograms;

import org.testng.annotations.Test;

public class ReverseString {
    @Test
    public void stringReverse(){
        String name="Nikhilesh";
        String [] str=name.split(" ");
        System.out.println(name);
        for(int i=str.length-1;i>=0;i--){
            System.out.print("  "+str[i]);
        }
    }
    @Test
    public void stringReverse1(){
        String name=("My Name is Nikhilesh");
        String [] str=name.split(" ");
        System.out.println(name);
        for(int i=str.length-1;i>=0;i--){
            System.out.print("  "+str[i]);
        }
    }

    @Test
    public void stringReverse12(){
        String name=("Nikhilesh");
        String [] str=name.split(" ");
      //  System.out.println(name);
        for(int i=str.length-1;i>=0;i--){
            System.out.print("  "+str[i]);
        }
    }

    @Test
    public void stringReverse132(){
        String name=("Nikhilesh");
        System.out.println(name);
        char ch;
        String st2=" ";
        for(int i=0;i<=name.length()-1;i++){
           ch=name.charAt(i);
           st2=ch+st2;
        }
        System.out.println(st2);
    }

}
