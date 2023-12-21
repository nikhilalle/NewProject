package com.matrix.nikhil.praticesProgram.programsTest;

public class LargestNo {
        public static void main(String[] args) {
            int i, j, s;

            int[] arr = {12, 23, 34,58, 54, 532,93,98,987};
            for (i = 0; i < arr.length - 1; i++) {
                for (j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        s = arr[i];
                        arr[i] = arr[j];
                        arr[j] = s;
                    }
                }
            }
            for (int index:arr){
                System.out.println(index);
            }

            j = arr.length - 3;
            System.out.println("Array : "+arr[j]);
        }

    }




