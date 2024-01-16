package AlleNikhil.nikhil.praticesProgram.corejava.encapsulation;

public class TestAccountClass {

    public static void main(String[] args) {
 TestAccount obj = new TestAccount();

        obj.setAccountNumber1(456987);
        obj.setAccountNumber1(68888);
        obj.getAccountNumber1();
        System.out.println("From getter method: " +obj.getAccountNumber1());
    }
}
