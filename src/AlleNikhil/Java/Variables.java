package AlleNikhil.Java;

public class Variables {
    String  companyName="Wipro";
    int id=101;
    String fName="Nikhilesh";

    public void getDetails(int rollNo,String surName){
        System.out.println(id);
        System.out.println(fName);
        System.out.println(companyName);
        System.out.println(rollNo);
        System.out.println(surName);
    }

    public static void main(String[] args) {
        Variables variables=new Variables();
        variables.getDetails(121,"Alle");
        variables.getDetails(112,"Bola");

    }

}
