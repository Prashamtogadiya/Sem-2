import java.util.Scanner;

public class BankDetails {

    class Bank {
        int AccountNo;
        String UserName;
        String Email;
        char AccountType;
        double AccountBalance;
        Scanner sc = new Scanner(System.in);

        void GetAccDetails() {
            System.out.println("Enter Account Number:");
            this.AccountNo = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter UserName:");
            this.UserName = sc.nextLine();
            System.out.println("Enter Email:");
            this.Email = sc.nextLine();
            System.out.println("Enter Account Type (S/D):");
            this.AccountType = sc.next().charAt(0);
            System.out.println("Enter Account Balance:");
            this.AccountBalance = sc.nextDouble();
        }

        void PrintAcc() {
            System.out.println("Account Number: " + AccountNo);
            System.out.println("UserName: " + UserName);
            System.out.println("Email: " + Email);
            System.out.println("Account Type: " + AccountType);
            System.out.println("Account Balance: " + AccountBalance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many customers do you want to input? ");
        int No_of_loops = sc.nextInt();

        BankDetails.Bank[] accounts = new BankDetails.Bank[No_of_loops];
        for (int i = 0; i < No_of_loops; i++) {
            accounts[i] = new BankDetails().new Bank();
            accounts[i].GetAccDetails();
        }
        sc.close();
        for (int i = 0; i < No_of_loops; i++) {
            accounts[i].PrintAcc();
        }
    }
}