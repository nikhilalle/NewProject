package AlleNikhil.NikhilDec;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class SortIngElememts {
    @Test
    public void get() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(3);
        list.add(13);
        list.add(233);
        list.add(2333);
        list.add(2343);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After Sorting " + list);
        System.out.println("Last Index :  " + list.get(list.size() - 1));
        System.out.println("3 rd Last Index :  " + list.get(list.size() - 3));
        System.out.println(" 0 Th Index :  " + list.get(0));
        System.out.println("first Index  :  " + list.get(0));
        //Collections.reverse(list);
        System.out.println(list);
//        for(int value:list){
//            System.out.println(value);
//        }
    }

    @Test
    public void searching() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Nikhil");
        list.add("Kota");
        list.add("Akash");
        list.add("Komal");
        list.add("Shrikant");
        list.add("rahul");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("RAHUL");

        System.out.println("before  Sorting " + list);

        Collections.sort(list);
        System.out.println("After Sorting " + list);

        boolean value = list.contains("Nikhil");
        if (value) {
            System.out.println("Nikhil  Is available");
        } else {
            System.out.println("Nikhil  Is not available");
        }
        boolean value1 = list.contains("nikhil");
        if (value1) {
            System.out.println("Nikhil  Is available");
        } else {
            System.out.println("Nikhil  Is not available");
        }
        boolean value2 = list.contains(list1.get(0).toLowerCase());
        if (value2) {
            System.out.println("Rahul  Is available");
        } else {
            System.out.println("Rahul  Is not available");
        }
    }


}
