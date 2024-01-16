package AlleNikhil.Java;

public class EncapsulationTest {
  private   int accountNumber=1234567890;
    private int accountBalance=1010101010;
public int getAccountNumber(){
    System.out.println("Account  Number  is     "+accountNumber);
    return accountNumber;

}
    public int getAccountBalance(){
        System.out.println("Account  Balance   is   "+accountBalance);
        return accountBalance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setAccountBalance(int accountBalance){
        this.accountBalance=accountBalance;
    }
}
