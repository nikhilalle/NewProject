package AlleNikhil.Java;

public class StaticBlocks {
    int roll = 121;
    String name = "Nikhilesh Alle";
    static String companyName = "Novarties";
    static double salary = 120000;
    static String designation = "Auditor";


    {
        System.out.println("Instance Blocks ");
        System.out.println(name);
        System.out.println(roll);
    }

    public static void main(String[] args) {
        StaticBlocks instanceBlocks =new StaticBlocks();
        StaticBlocks instanceBlocks1 =new StaticBlocks();
        StaticBlocks instanceBlocks2 =new StaticBlocks();
        StaticBlocks instanceBlocks3 =new StaticBlocks();
        StaticBlocks instanceBlocks4 =new StaticBlocks();
        StaticBlocks instanceBlocks5 =new StaticBlocks();

    }
    static {
        System.out.println("Static Blocks ");

        System.out.println(salary);
        System.out.println(designation);

        System.out.println();
    }
}
