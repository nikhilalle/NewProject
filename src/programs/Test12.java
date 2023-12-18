package programs;

import org.testng.annotations.Test;

public class Test12 {
    @Test
    public void callValue(){
        TestStatic obj=new TestStatic();
        System.out.println(TestStatic.name);
        System.out.println(obj.fullName);
        obj.met();
        obj.get();
        TestStatic.set();
    }
}
