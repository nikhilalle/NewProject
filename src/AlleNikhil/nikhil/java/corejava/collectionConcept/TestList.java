//package AlleNikhil.nikhil.java.corejava.collectionConcept;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class TestList {
//
//    public static void main(String[] args) {
//        List<String> student1 =new ArrayList<>();
//        student1.add("madhura");
//        student1.add("Dubas");
//
//        List<String> student2=new ArrayList<>();
//        student2.add("Shrinidhi");
//        student2.add("Nandaigari");
//        //in this we are stroring using list (firstName LastName)
//
//        Map<Integer,List<String>> map=new HashMap<>();//passing in map rollNumbere and List
//        map.put(100,student1);
//        map.put(200,student2);
//        System.out.println(map);
//        //{100=[madhura, Dubas], 200=[Shrinidhi, Nandaigari]}
//
//        //creating Employee data
//        EmployeeData emp1=new EmployeeData(101,"Srivya");
//        EmployeeData emp2= new EmployeeData(102,"shloka");
//
//
//        Map<String,EmployeeData> map1=new HashMap<>();
//        map1.put("Hyderabad",emp1);
//        map1.put("Banglore",emp2);
//        EmployeeData ee=map1.get("Banglore");//passing key for search in map
//        //System.out.println(ee.empName+"...."+ee.empId);
//        //shloka....102
//
//        for (Map.Entry<String,EmployeeData> entry1 : map1.entrySet()) {
//            String key=entry1.getKey();
//            EmployeeData ed=entry1.getValue();
//            System.out.println(".....");
//            System.out.println(key);
//           // System.out.println(ed.empName+ "----" +ed.empId);
//            System.out.println("......");
//
//        }
//        //.....
//        //Banglore
//        //shloka----102
//        //......
//        //.....
//        //Hyderabad
//        //Srivya----101
//        //......
//
//
//    }
//
//}
