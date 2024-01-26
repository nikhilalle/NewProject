package AlleNikhil.NikhilDec;

import org.testng.annotations.Test;


public class Letters {
    @Test
    public void set() {
        java.lang.String[] s = {"Nikhilesh", "Rahul", "Chaitanya", "Arati"};
        java.lang.String temp;
        for (int i = 0; i <= s.length - 1; i++) {
            for (int k = i + 1; k <= s.length - 1; k++) {
                if (s[i].compareTo(s[k]) > 0) {
                    temp = (s[i]);
                    s[i] = (s[k]);
                    s[k] = temp;
                }
            }
        }
        for (int p = 0; p <= s.length - 1; p++) {
            System.out.println(s[p]);
        }
    }

    @Test
    public void ret(){
        java.lang.String [] str={"AAA","Cjik","Anil","Rahul","Kolli","Zobil","High"};
        java.lang.String temp;
        int p;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                if(str[i].compareTo(str[j])>0){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }

        }
        for ( p = 0; p <= str.length - 1; p++) {
            System.out.println(str[p]);
        }
    }
}
