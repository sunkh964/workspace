package Static;

public class AccTest {
    public static void main(String[] args) {

        // 1만명
        Account a1 = new Account("1111",10000);
        Account a2 = new Account("2222",20000);
        Account a3 = new Account("3333",30000);
        Account a4 = new Account("4444",40000);
        Account a5 = new Account("5555",50000);

        System.out.println(a1);
        Account.iyul = 10.0;
        System.out.println(a1);




    }
}
