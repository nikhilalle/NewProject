package AlleNikhil.Java;

public class MyClassTestAbstract extends MyClass {


    @Override
    public void met() {
        System.out.println("Implement in MyClass Test Abstract Class");
    }

    @Override
    public void wet() {
        System.out.println("Implement in MyClass Test Abstract Class");
    }

    public static void main(String[] args) {

        MyClass myClass1 = new MyClassTestAbstract(); // MyClass is Abstract Class So we can't Create its Object to it
        myClass1.get();
        myClass1.met();
        myClass1.wet();

    }
}
