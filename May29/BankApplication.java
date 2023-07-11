import java.util.Scanner;
class BankAccount{
  static long account_num;
  double balance;
  static String accountholder_name;
  void deposit(){
      double deposit_amount=1000;
      balance=balance+deposit_amount;
  }
    void withdraw(){
        double amount=900;
        if(amount<=balance&&amount!=0)
            balance=balance-amount;
        else
            System.out.println("Amount should be less than balance amount");
    }
}
BankAccount ob=new BankAccount();
BankAccount.accountholder_name="Aparna";
BankAccount.account_num=1234567890;
ob.deposit();
ob.withdraw();