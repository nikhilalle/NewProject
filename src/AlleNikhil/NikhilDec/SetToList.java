package AlleNikhil.NikhilDec;

import org.testng.annotations.Test;

import java.util.*;

public class SetToList {
    @Test
    public void setConvertToList() {
        Set<Integer> listInt = new HashSet<>();
        listInt.add(12);
        listInt.add(23);
        listInt.add(43);
        listInt.add(454);
        listInt.add(2);
        listInt.add(1);
        System.out.println(listInt);
        List<Integer> ObjData = new ArrayList<>(listInt);
        System.out.println("Set of Data :  " + ObjData);
        Collections.sort(ObjData);
        System.out.println("After Sorting Set of Data :  " + ObjData);
        Collections.reverse(ObjData);
        System.out.println(" Data :  " + ObjData);
    }
    @Test
    public void listConvertToSet() {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(12);
        listInt.add(23);
        listInt.add(43);
        listInt.add(454);
        listInt.add(2);
        listInt.add(1);
        System.out.println(listInt);
        Set<Integer> objData = new HashSet<>(listInt);
        System.out.println(objData);
    }

    @Test
    public void setConvertToList1() {
        Set<Integer> listInt = new HashSet<>();
        listInt.add(12);
        listInt.add(23);
        listInt.add(43);
        listInt.add(454);
        listInt.add(2);
        listInt.add(1);
        System.out.println(listInt);
        List<Integer> objData = new ArrayList<>(listInt);
        System.out.println("Set of Data :  " + objData);
        Collections.sort(objData);
        System.out.println(" Index of 2 "+objData.get(3));
        for (int n:objData){
            System.out.println(n);

        }
    }
}