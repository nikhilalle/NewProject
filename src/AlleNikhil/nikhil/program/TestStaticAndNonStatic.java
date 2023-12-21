package AlleNikhil.nikhil.program;

public class TestStaticAndNonStatic {
    int rollNo=101;
    static  String name="Nikhil";

    public void get(){
        System.out.println(rollNo);  // Non Static Variable
        System.out.println(name);    // Static Variable

    }
    public static  void set(){
        TestStaticAndNonStatic ts=new TestStaticAndNonStatic();
        System.out.println(ts.rollNo);    // Non Static Variable
        System.out.println(name);         // Static Variable
    }



    public void met(){
        pet();

    }
    public static  void pet(){
        TestStaticAndNonStatic obj=new TestStaticAndNonStatic();
        obj.met();
    }
}
