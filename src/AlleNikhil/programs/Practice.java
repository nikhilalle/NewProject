package AlleNikhil.programs;


import org.testng.annotations.Test;

import java.util.*;


public class Practice {
    @Test
    public void get() {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        list.remove(2);
        for (String st : list) {
            System.out.println(st);
        }
    }

    @Test
    public void get1() {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        Collections.swap(list,0,2);
        System.out.println(list);
    }

    @Test
    public void get3() {

        HashMap<String, Integer> list = new HashMap<String, Integer>();
        list.put("A", 1);
        list.put("B", 2);
        ArrayList<Object> l1 = new ArrayList<>((Collection) list);
        System.out.println(l1);

    }

    public void me() {
        //Addition 2 Number :
        int x = 10;
        int y = 20;
        int sum = x + y;

        String str = "My name is Nikhilesh i from Pune  My name is Nikhilesh i from Pune My name is Nikhilesh i from Pune";

        String s1 = "Krishna";
        String s2 = "Nikhil";
        char c1 = 'A';
        char c2 = 'B';
    }
    // Java program to count frequencies of elements
// using HashMap.

@Test
        public static void countFrequencies()

        {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Geeks");
            list.add("for");
            list.add("Geeks");

            // hashmap to store the frequency of element
            Map<String, Integer> hm = new HashMap<String, Integer>();

            for (String i : list) {
                Integer j = hm.get(i);
                hm.put(i, (j == null) ? 1 : j + 1);
            }

            // displaying the occurrence of elements in the arraylist
            for (Map.Entry<String, Integer> val : hm.entrySet()) {
                System.out.println("Element " + val.getKey() + " "
                        + "occurs"
                        + ": " + val.getValue() + " times");
            }
        }


        }





