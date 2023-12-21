package AlleNikhil.nikhil.program;

import org.testng.annotations.Test;

public class RootStatic  {
    @Test
    public void met(){
        StaticVariable obi=new StaticVariable();
        System.out.println(obi.city);
        System.out.println(StaticVariable.companyName);
        System.out.println(StaticVariable.per);


    }
}
