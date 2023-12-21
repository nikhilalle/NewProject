package com.matrix.AlleNikhil.newTestNg.testNGPrameter.prameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionTest {
    @Parameters({"Maths","Physics","Chemistry","Biology"})
    @Test
    public void studentMarks(@Optional("101")int maths , @Optional("103")int physics , @Optional("105")int chem ,@Optional("110") int bio ){
        System.out.println("Maths Marks      : "+maths);
        System.out.println("Physics Marks    : "+physics);
        System.out.println("Chemistry Marks  : "+chem);
        System.out.println("Biology Marks    : "+bio);

    }
}
