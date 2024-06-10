package class_basic;

public class AccountTest {
    public static void main(String[] args) {
        Account_생성자 acc = new Account_생성자();

        acc.printAccount();
        System.out.println();

        Account_생성자 acc1 = new Account_생성자(100000);
        acc1.printAccount();

        acc1.setAccount("","김자바",52);




    }
}
