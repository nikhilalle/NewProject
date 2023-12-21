package AlleNikhil.programs;

import org.testng.annotations.Test;

public class StaticV {
    static String companyName = "TCS";

    public void details1(int id, String name, String desigination) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(desigination);
        System.out.println(companyName);
        System.out.println("==================");
    }

    @Test
    public void get() {
        details1(101, "Chaitanya", "Dev");
        details1(102, "Nikhilesh", "Dev");
        details1(103, "Arati", "QA");
        details1(104, "Ankku", "BA");
        details1(105, "Sanju", "SQl DeV");

        details1(101, "Chaitanya", "Dev");
        details1(102, "Nikhilesh", "Dev");
        details1(103, "Arati", "QA");
        details1(104, "Ankku", "BA");
        details1(105, "Sanju", "SQl DeV");
    }
}
