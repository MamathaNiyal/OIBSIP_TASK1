import java.util.Scanner;
import java.lang.*;
class user{
    int balance=0;
    String thistory="";
    user()
    {
        balance=2000;
    }
    void transactionHistory()
    {
        System.out.println("-----------Transaction History----------");
        System.out.println(thistory);
    }
    void withdraw(int amount){
        if(balance<amount)
        {
            System.out.println("NO sufficient balance available");
        }
        else{
            balance=balance-amount;
            thistory=thistory+"amount"+"    "+"-"+amount+"\n";
        }
    }
    void Deposit(int amount){
            balance=balance+amount;
            thistory=thistory+"amount"+"    "+"+"+amount+"\n";
    }

}
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        user u=new user();
        String uname,password;
        int valid=-1,amount;
        System.out.println("enter-1:Transaction History\nenter-2:Withdraw\nenter-3:Deposit\nenter-5:Quit\nenter-6:Login");
        int choice=sc.nextInt();
        while(true)
        {
        switch(choice)
        {
            case 1:
                //Transaction History
                if(valid==1)
                {
                    //valid user
                    u.transactionHistory();
                }
                else{
                    System.out.println("please login and get transaction history");
                }
                break;
            case 2:
                //Withdraw
                if(valid==1)
                {
                    //valid user
                    System.out.println("enter the amount to withdraw");
                    amount=sc.nextInt();
                    u.withdraw(amount);
                }
                else{
                    System.out.println("please login and withdraw");
                }
                break;
            case 3:
                //Deposit
                if(valid==1)
                {
                    //valid user
                    System.out.println("enter the amount to Deposit");
                    amount=sc.nextInt();
                    u.Deposit(amount);
                }
                else{
                    System.out.println("please login and Deposit");
                }
                break;

            case 5:
                //Quit
                System.out.println("Thank you for Visiting");
                System.exit(0);
            case 6:
                //Login
                System.out.println("enter username :");
                uname=sc.next();
                System.out.println("enter password:");
                password=sc.next();
                if(uname.equals("JAVA") && password.equals("1991"));
                {
                    valid=1;
                    
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("enter-1:Transaction History\nenter-2:Withdraw\nenter-3:Deposit\nenter-5:Quit\nenter-6:Login");
         choice=sc.nextInt();
    }
    }
    
}
