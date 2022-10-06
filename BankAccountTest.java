public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(500, 500);
        System.out.println(acct1.getCheckingBalance());
        System.out.println(acct1.getSavingsBalance());
        System.out.println(BankAccount.getTotalMoney());
        acct1.depositMoney("savings", 250);
        acct1.depositMoney("checking", 500);
        System.out.println(acct1.getCheckingBalance());
        System.out.println(acct1.getSavingsBalance());
        System.out.println(BankAccount.getTotalMoney());
        acct1.depositMoney("savings", 40);
        acct1.depositMoney("checking", 70);
        System.out.println(acct1.getCheckingBalance());
        System.out.println(acct1.getSavingsBalance());
        System.out.println(BankAccount.getTotalMoney());
        
    }
}
