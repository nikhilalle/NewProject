package AlleNikhil.Java;

import org.testng.annotations.Test;

public class callEncapsulationTest {
    @Test
    public void get() {
        EncapsulationTest en = new EncapsulationTest();
        en.getAccountNumber();
        en.getAccountBalance();
        en.setAccountNumber(986765432);
        en.setAccountBalance(1212121212);
//        en.accountBalance=1211; //Cannot assign a value to final variable 'accountBalance'
//        en.accountNumber=122;   // Cannot assign a value to final variable 'accountNumber'
    }

}
