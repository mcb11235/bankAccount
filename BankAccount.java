public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int totalAccounts;
    private static double totalMoney;

    public BankAccount(double checkingDeposit, double savingsDeposit) {
        this.checkingBalance = checkingDeposit;
        this.savingsBalance = savingsDeposit;
        totalAccounts++;
        totalMoney = totalMoney + checkingDeposit + savingsDeposit;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public static double getTotalMoney(){
        return totalMoney;
    }
    public void depositMoney(String accountType, double amount){
        if(accountType.equals("savings")){
            savingsBalance += amount;
            totalMoney += amount;
        } else if(accountType.equals("checking")){
            checkingBalance += amount;
            totalMoney += amount;
        } else {
            System.out.println("Invalid Account Type");
        }
    }
    public void withdrawMoney(String accountType, double amount){
        if(accountType.equals("savings")){
            if(amount <= savingsBalance){
                savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient Funds....");
            }    
        } else if(accountType.equals("checking")){
            if(amount <= checkingBalance){
                checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient Funds....");
            }
        } else {
            System.out.println("Invalid Account Type");
        }
    }

}

