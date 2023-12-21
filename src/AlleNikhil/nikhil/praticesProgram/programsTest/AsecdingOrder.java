package com.matrix.nikhil.praticesProgram.programsTest;

public class AsecdingOrder {

        public static void main(String[] args) {
            int i, j, s;
            int[] arr = {12, 23, 34,58, 54, 532,93,98,987};
            for (i = 0; i < arr.length - 1; i++) {
                for (j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        s = arr[i];
                        arr[i] = arr[j];
                        arr[j] = s;
                    }
                }
            }
            System.out.println("Ascending Oder");
            for (int index:arr){
                System.out.println(index);

            }
            j = arr.length - 3;
            System.out.println("Array : "+arr[j]);

            System.out.println("---------------------------");
            System.out.println("distending");
            for ( i= arr.length-1;i>=0;i--) {

                System.out.println(arr[i]);
            }
            j = arr.length - 3;
            System.out.println("Array : "+arr[j]);
        }

    }



