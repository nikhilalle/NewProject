package AlleNikhil.NikhilDec;

import org.checkerframework.checker.units.qual.N;
import org.testng.annotations.Test;

import java.util.*;

public class InnerSet {
    @Test
    public void set1() {
        Set<Integer> set1Value = new HashSet<>();
        set1Value.add(12);
        set1Value.add(1222);
        set1Value.add(1452);
        set1Value.add(123343);
        set1Value.add(1342);
        set1Value.add(1232);
        System.out.println(set1Value);
        List<Object> objectList = new ArrayList<>();
        objectList.add(set1Value);
        System.out.println(objectList);
    }
    @Test
    public void set12() {
        Set<Set<Integer>> set1Value = new HashSet<>();
        set1Value.add(Collections.singleton(12));
        set1Value.add(Collections.singleton(1342));
        set1Value.add(Collections.singleton(1322));
        set1Value.add(Collections.singleton(12112));
        set1Value.add(Collections.singleton(1122));
        set1Value.add(Collections.singleton(122144));
        System.out.println(set1Value);
        List<Object> objectList = new ArrayList<>();
        objectList.add(set1Value);
        System.out.println(objectList);

    }

    @Test
    public void set122() {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(12);
        integerSet.add(1222);
        integerSet.add(1452);
        integerSet.add(123343);

        List<java.lang.String> stringList = new ArrayList<>();
        stringList.add("Rahul");
        stringList.add("Nikhil");
        stringList.add("Shrikant");
        stringList.add("Nithin");

        Map<Set<Integer>, List<java.lang.String>> set1Value = new HashMap<>();
        set1Value.put(integerSet, stringList);
        for (Map.Entry<Set<Integer>, List<java.lang.String>> entry : set1Value.entrySet()) {
            System.out.println(set1Value);
        }
    }

    @Test
    public void setM() {
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(100);
        integerList1.add(200);
        integerList1.add(300);
        integerList1.add(400);
        integerList1.add(500);
        List<Integer> integerList2 = new ArrayList<>();
        integerList1.add(1100);
        integerList1.add(1200);
        integerList1.add(1300);
        integerList1.add(1400);
        integerList1.add(1500);

        Map<List<Integer>, List<Integer>> allL = new HashMap<>();
        allL.put(integerList2, integerList1);
//        allL.put(integerList1,integerList2);
//        allL.put(integerList2,integerList2);
//        allL.put(integerList1,integerList1);
        for (Map.Entry<List<Integer>, List<Integer>> obj : allL.entrySet()) {
            System.out.println(obj);
        }
    }
}
