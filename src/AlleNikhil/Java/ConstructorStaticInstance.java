package AlleNikhil.Java;

import org.checkerframework.checker.units.qual.C;

public class ConstructorStaticInstance {
    {
        System.out.print("Instance Blocks ------>");
    }
    ConstructorStaticInstance() {
        System.out.print("Constructor Area  ------>");

    }

    public static void main(String[] args) {
        ConstructorStaticInstance ct = new ConstructorStaticInstance();
        new ConstructorStaticInstance(12);
    }
    static {
        System.out.print("Static Blocks  ------> ");
    }
    {
        System.out.print("Instance Blocks ------>");
    }
    ConstructorStaticInstance(int n) {
        System.out.print("Constructor Area  ------>"+n);
    }
    static {
        System.out.print("Static Blocks  ------> ");
    }
}
