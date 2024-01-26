package AlleNikhil.NikhilDec;

import org.testng.annotations.Test;

public class ThisKeyWordUse {
    int a=10;
    int b=20;

    public void get(int a,int b){
      //this.a=a;
        System.out.println(a);
    //  this.b=b;
        System.out.println(b);
    }
    @Test
    public void ser(){
        ThisKeyWordUse io=new ThisKeyWordUse();
        io.get(50,60);
    }
}
