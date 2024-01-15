import java.util.Scanner;

class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    Scanner sc = new Scanner(System.in);

    public void checkBalance() {
        System.out.println("Your Current Balance is Rs." + balance);

    }

    public void Withdraw(int WithdrawAmount) {

        if (balance - WithdrawAmount < 0) {
            System.out.println("Insufficient Balance!!!");
            System.out.println("Please Check Your Balance...");
        } else {
            balance = balance - WithdrawAmount;
            System.out.println("Collect your amount Rs." + WithdrawAmount);
            System.out.println("Available Balance is Rs." + balance);

        }

    }

    public void depositcash(int depositcash) {

        balance = balance + depositcash;

        System.out.println("Rs." + depositcash + " is Deposited to Your Account !!!");
        System.out.println("Available Balance is Rs." + balance);

    }
}

class ATMMachine {
    public BankAccount ob;

    ATMMachine(BankAccount ob) {
        this.ob = ob;
    }

    public void menu(){
                System.out.println();
                System.out.println("----Welcome XYZ ATM----");
                System.out.println("1.Check Balance");
                System.out.println("2.Withdraw cash");
                System.out.println("3.Deposite cash");
                System.out.println("4.Exit");
                System.out.println("Select the operation by Entering Valid Number:");
    }        

    public void operation(int choice){
        Scanner sc=new Scanner(System.in);
         try{
                switch (choice) {
                    case 1:
                        ob.checkBalance();
                        break;

                    case 2:
                    System.out.print("Enter the Amount: ");
                     int WithdrawAmount = sc.nextInt();

                        ob.Withdraw(WithdrawAmount);
                        break;

                    case 3:
                    System.out.print("Enter the Amount: ");
                     int depositcash = sc.nextInt();
                        ob.depositcash(depositcash);
                        break;
                    case 4:
                    System.out.println("Thank you !!!");
                        System.exit(0);

                    default :
                    System.out.println("Enter valid Input!!!");

                }
                
            }
            catch(Exception e)
            {
                System.out.println("Some Error occur " + e);
            }
        

    }
}

public class AtmInterface {
    public static void main(String[] args) throws Exception {
        BankAccount ob = new BankAccount(1000);

       
        ATMMachine atm = new ATMMachine(ob);

        while (true) {
            // Display menu and process user input
            atm.menu();
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
             atm.operation(choice);


        }

    }
}
