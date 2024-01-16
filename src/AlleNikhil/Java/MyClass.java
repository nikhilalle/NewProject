package AlleNikhil.Java;

public abstract class MyClass {
    String name = "Nikhil Alle";
    static String companyName = "TCS";


    public void get() {
        System.out.println("Get Method ");
        System.out.println(name);
        System.out.println(companyName);
    }

    //    public abstract void set(){  //Abstract methods cannot have a body
//        System.out.println(name);
//        System.out.println(companyName);
//    }
    public void let() {
        System.out.println("Let Method ");
        System.out.println(name);
        System.out.println(companyName);
    }

    public abstract void met();

    public abstract void wet();

    public static void main(String[] args) {
        // MyClass myClass=new MyClass() //'MyClass' is abstract; cannot be instantiated
    }
}
