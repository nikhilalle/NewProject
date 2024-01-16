package AlleNikhil.Java;

public class StaticVariable {
    static  int roll;
    static String name;
    static  int roll1=100;
    static String name1="Raj";
    static String companyName="TCS";

    public static void main(String[] args) {

        roll=1221;
        name="Radha Krishna";
        for(int i=1;i<=5;i++) {
            if(roll==1221) {
                System.out.println(roll);
            }
            else if(name!=null) {
                System.out.println(name);
                System.out.println(companyName);
            }
            System.out.println("------");
        }
        if(roll==1221){
        roll=100;
        name="Nikhil Alle";
        for(int i=1;i<=5;i++) {
            System.out.println(roll);
            System.out.println(name);
            System.out.println(companyName);
            System.out.println("------");
            }
        }
        set();
    }

    public static void set(){
        System.out.println(roll);
        System.out.println(companyName);
        System.out.println(name1);
    }
}
