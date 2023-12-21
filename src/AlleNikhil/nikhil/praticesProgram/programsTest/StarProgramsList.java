package com.matrix.nikhil.praticesProgram.programsTest;

import org.testng.annotations.Test;

public class StarProgramsList {

    @Test
    public void star1(){
                                                          // Out-Put
        int n=7;                                           //*
        for(int i=1;i<=n;i++){                             //**
            for(int j=1;j<=i;j++){                        // ***
                System.out.print("*");                    // ****
            }                                             // *****
            System.out.println();                         // *******
        }                                                 // ********
        System.out.println("--------------------------------");
    }

    @Test
    public void star2(){                                    // Out-Put
        int n=7;                                             //1
        for(int i=1;i<=n;i++){                               //22
            for(int j=1;j<=i;j++){                           //333
                System.out.print(i);                         //44444
            }                                                //555555
            System.out.println();                            //6666666
        }                                                    //77777777
        System.out.println("--------------------------------");
    }
    @Test
    public void star3(){                                     // Out-Put
        int n=7;                                              //1
        for(int i=1;i<=n;i++){                                //12
            for(int j=1;j<=i;j++){                            //123
                System.out.print(j);                          //1234
            }                                                 //12345
            System.out.println();                             //123456
        }                                                     //1234567
        System.out.println("--------------------------------");
    }
    @Test                                                      // Out-Put
    public void star4(){                                       //*******
        for(int i=7;i>=1;i--){                                //******
            for(int j=1;j<=i;j++){                            //*****
                System.out.print("*");                        //****
            }                                                 //***
            System.out.println();                             //**
        }                                                     //*
        System.out.println("--------------------------------");
    }
    @Test
    public void star5(){                                     // Out-Put
        for(int i=7;i>=1;i--){                                //7777777
            for(int j=1;j<=i;j++){                            //666666
                System.out.print(i);                          //55555
                                                              //4444
         }                                                    //333
            System.out.println();                             //22
        }                                                     //1
        System.out.println("--------------------------------");
    }
    @Test
    public void star6(){                                      // Out-Put
        for(int i=7;i>=1;i--){                                //1234567
            for(int j=1;j<=i;j++){                            //123456
                System.out.print(j);                          //12345
                                                              //1234
            }                                                 //123
            System.out.println();                             //12
        }                                                     //1
    }
}
