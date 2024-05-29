import java.util.*;
interface atm
{
   void withdraw(double balance);
   void deposit(double balance);
   void viewBalance(double balance);
   void transfer(double balance);
   void transactionhistory();
}
class bankaccount implements atm
{
  double withdrawal,deposited,transferred,amount;
  int t;
   Scanner sc=new Scanner(System.in);
   void login()
 {
    System.out.println("Welcome to the ATM interface");
    System.out.println("enter your user id");
    String id=sc.nextLine();
    System.out.println("enter your user pin");
    int pin=sc.nextInt();
    if(id.equals("Aahana")&& pin==56789){
        System.out.println("login succesful");
    }
    else{
        System.out.println("Login failed,try again");
        login();
    }
    }
 public void deposit(double balance)
 {
   System.out.println("enter the amount to be deposited ");
   deposited=sc.nextDouble();
   System.out.println("Deposited successful");
   t=1;
 }
 public void withdraw(double balance)
 {
   System.out.println("enter the amount to be withdrawen ");
  withdrawal=sc.nextDouble();
   if(withdrawal<=balance)
   {
   System.out.println("Withdrawal successful");
   t=-1;
 }
 else
 System.out.println("Insufficient balance");
}
public void viewBalance(double balance)
{
  double bal=balance + deposited - transferred - withdrawal;
   System.out.println("Balance="+bal);
}
public void transfer(double balance)
{
    System.out.println("enter the amount to be transferred ");
    amount=sc.nextDouble();
    if(amount<balance)
    {
        System.out.println("transfer successful");
         transferred=amount;
    }
    else 
    System.out.println("insufficient money to transfer");
}
public void transactionhistory()
{
  if(t==1)
  System.out.println("deposited amount="+deposited);
  else if(t==-1)
  System.out.println("withdrawen amount="+withdrawal);
  else
  System.out.println("not done any transaction yet");
}
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   double balance=200000.00,amount;
   int ch;
   bankaccount obj=new bankaccount();
   obj.login();
   do{
   System.out.println("enter 1 for depositing,2 for withdrawal and 3 for transferring,4 for viewing balance,5 for viewing transaction history and 6 for exiting");
   System.out.println("enter the choice");
   ch=sc.nextInt();
   switch(ch)
   {
    case 1:obj.deposit(balance);
            break;
    case 2: obj.withdraw(balance);
            break; 
    case 3:obj.transfer(balance);
            break; 
    case 4:  obj.viewBalance(balance);
            break;   
    case 5: obj.transactionhistory();
            break;
    case 6:System.exit(0);
           break;                   
    default: System.out.println("Invalid choice");                     
}
   }while(ch<=6);
}
}