package com.example.demo;
import java.util.*;
class ATM
{
      float Balance;
      int Pin=5674;

      public void checkPin()
      {
          System.out.print("Enter your pin : ");
          Scanner sc = new Scanner (System.in);
          int enteredPin = sc.nextInt();
          if(enteredPin == Pin)
          {
              menu();
          }
          else
          {
              System.out.println("Enter a valid Pin");
          }
          checkPin();
      }

      public void menu()
      {
          System.out.println(" Enter Your Choice ");
          System.out.println(" 1. Account Balance : ");
          System.out.println(" 2. Withdraw Money  : ");
          System.out.println(" 3. Deposit Money   : ");
          System.out.println(" 4. Exit            : ");

          Scanner sc =  new Scanner(System.in);
          int opt = sc.nextInt();

          if (opt == 1)
          { checkBalance();}
          else if(opt == 2)
          { withdrawMoney();}
          else if(opt == 3)
          {depositMoney();}
          else if (opt==4)
          {return;}
          else {
              System.out.println("Enter A valid Choose");}
      }

      public void checkBalance()
      {
          System.out.println("BALANCE : "+Balance);
          menu();
      }

      public void withdrawMoney()
      {
          System.out.println("Enter withdraw amount :");
          Scanner sc = new Scanner(System.in);
          float amount = sc.nextFloat();
          if(amount > Balance)
          {
              System.out.println("Please Enter a valid Amount");
          }
          else
          {
              Balance=Balance-amount;
              System.out.println(Balance);
          }
          menu();
      }
      public void depositMoney()
      {
          System.out.print("Enter the Deposit Amount :");
          Scanner sc = new Scanner(System.in);
          int deposit=sc.nextInt();
          System.out.println("Amount Deposited is : "+deposit);
          Balance=Balance+deposit;
          System.out.println("Total Balance is : "+Balance);
         menu();
      }
}
public class ATMMachine
{
    public static void main(String[] args)
    {
         ATM obj = new ATM();
         obj.checkPin();
    }
}
