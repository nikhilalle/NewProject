package AlleNikhil.nikhil.praticesProgram.corejava.polymorphism.overriding;

public class TestChild extends com.matrix.nikhil.praticesProgram.corejava.polymorphism.overriding.TestParent {

    public void m1() {
        System.out.println("Child m1 method");
    }

    public static void main(String[] args) {
        TestChild obj = new TestChild();
        obj.m1();
    }

}
