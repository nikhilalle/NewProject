package AlleNikhil.programs;

public class TestStatic {
    static int rollNo;
    static  String name="Harika";
    String fullName="Rahul Alle";
    public void get(){
        rollNo=101;
        name="Kota";
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(fullName);
    }
    public void met(){
        rollNo=102;
        name="Anku";
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(fullName);
    }
    public static  void set(){
        rollNo=103;
        name="Nikhil";
        System.out.println(rollNo);
        System.out.println(name);

    }

    public static void main(String[] args) {
        TestStatic ts=new TestStatic();
        ts.get();
        ts.met();
        ts.set();

    }

}
