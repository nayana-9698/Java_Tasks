package JavaAdvance_IndividualTask;

public class Task2_BankAcc {

    private int accNum;
    private int accBalance;
    private String accHolder;

    public int getAccNum(){
        return accNum;
    }

    public int setAccNum(int accNum){
        this.accNum= accNum;
        return accNum;
    }

    public int getAccBalance(){
        return accBalance;
    }

    public int setAccBalance(int accBalance){
        this.accBalance=accBalance;
        return accBalance;
    }

    public String getAccHolder(){
        return accHolder;
    }

    public String setAccHolder(String accHolder){
        this.accHolder= accHolder;
        return accHolder;
    }

    public static void main(String[] args) {
        Task2_BankAcc bank = new Task2_BankAcc();

        bank.setAccNum(1234567891);
        bank.setAccBalance(50000);
        bank.setAccHolder("Nayana");

        System.out.println("The account holder is: " + bank.accHolder );
        System.out.println("The account number of " + bank.accHolder + " is " + bank.accNum );
        System.out.println("The balance for " + bank.accHolder + "'s account is : " + bank.accBalance);
    }
}
