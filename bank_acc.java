import java.util.*;
class bank
 {
    private int accountno;
    String name;
    int balance;
    int deposite,withdraw;
    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account number: ");
        accountno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter your account current balance:");
        balance=sc.nextInt();
        System.out.println("1.deposit");
        System.out.println("2.withdraw");
    }
    public void showdata()
    {
        System.out.println("Enter your choice:");
        Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the amount to deposite:");
                deposite=sc.nextInt();
                balance=deposite+balance;
                System.out.println("total balance:"+balance);
                break;
            case 2:
                System.out.println("Enter the amount to withdrwa:");
                withdraw=sc.nextInt();
                if(balance<withdraw)
                {
                    System.out.println("insufficient balance");
                }
                else
                {
                    balance=balance-withdraw;
                    System.out.println("total balance:"+balance);
                }
                break;
            default :
            System.out.println("wrong choice"); 
            break; 
        }  

    } 

 } 
public class bank_acc{
    public static void main(String[] args) {
        bank obj;
        obj=new bank();
        obj.getData();
        obj.showdata();

    }
    
}
