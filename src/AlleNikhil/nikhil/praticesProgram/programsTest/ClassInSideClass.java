package com.matrix.nikhil.praticesProgram.programsTest;

public class ClassInSideClass {

    /////////// * Inside The Class Start  *////////////////
    //  but Inside Class Should be Static
    public static class InsideClass{
        public static void main(String[] args) {
            System.out.println("I  am  In Inside Class Method");
        }



        }
    /////////// * Inside The Class Close  *////////////////

    public static void main(String[] args) {

        System.out.println("I  am  In  Outside Class Method");

    }
    }

