package AlleNikhil.Java;

public class StaticInstanceAndConstructor {
    int roll = 121;
    String name = "Nikhilesh Alle";
    static String companyName = "Novarties";
    static double salary = 120000;
    static String designation = "Auditor";


    {
        System.out.println("Instance Blocks ");
        System.out.println(name);
        System.out.println(roll);
        System.out.println("____________");
    }
    StaticInstanceAndConstructor(){
        System.out.println("Constructor Area ");
        System.out.println(name);
        System.out.println(roll);
        System.out.println(salary);
        System.out.println(designation);
        System.out.println("____________");
    }
    public static void main(String[] args) {
        StaticInstanceAndConstructor st=new StaticInstanceAndConstructor();
        StaticInstanceAndConstructor st1=new StaticInstanceAndConstructor();


    }
    static {
        System.out.println("Static Blocks ");

        System.out.println(salary);
        System.out.println(designation);

        System.out.println("--------------------");
    }
}
