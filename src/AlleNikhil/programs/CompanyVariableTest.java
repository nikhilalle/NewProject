package AlleNikhil.programs;

import org.testng.annotations.Test;

public class CompanyVariableTest {

  static String companyName="Wipro";
String cityName="Pune";

//    public void details(){
//        id=101;
//        name ="Nikhil";
//        companyName="Tcs";
//        desigination="QA";
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(companyName);
//        System.out.println(desigination);
//    }
    public static void details1(int id ,String name, String desigination) {
        CompanyVariableTest obj=new CompanyVariableTest();

        System.out.println(id);
        System.out.println(name);
        System.out.println(desigination);
        System.out.println(obj.cityName);
        System.out.println(companyName);
//        System.out.println(CompanyVariableTest.companyName);
//        System.out.println(obj.companyName);

        System.out.println("==================");
    }
    @Test
    public void met2() {
        details1(101, "Chaitanya", "Dev");
        details1(102, "Nikhilesh", "Dev");
        details1(103, "Arati", "QA");
        details1(104, "Ankku", "BA");
        details1(105, "Sanju", "SQl DeV");
    }
    @Test
    public void met(){
        details1(101,"Chaitanya","Dev");
        details1(102,"Nikhilesh","Dev");
        details1(103,"Arati","QA");
        details1(104,"Ankku","BA");
        details1(105,"Sanju","SQl DeV");

        details1(101,"Chaitanya","Dev");
        details1(102,"Nikhilesh","Dev");
        details1(103,"Arati","QA");
        details1(104,"Ankku","BA");
        details1(105,"Sanju","SQl DeV");

    }

}
