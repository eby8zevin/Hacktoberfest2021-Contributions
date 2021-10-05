import java.io.*;
import java.util.Scanner;

abstract class Bank {
  double bal, interest;
  long accountno;
  abstract void roi();

  void getaccountno() {
    Scanner i = new Scanner(System.in);
    System.out.println("\nEnter the account number");
    accountno = i.nextLong();
    System.out.println("\nEnter the account balance");
    bal = i.nextDouble();
  }

  void printaccdetails() {
    roi();
    System.out.println("Account no:" + accountno);
    System.out.println("Interest Rate:" + interest);
    System.out.println("Balance after interest:" + bal);
  }
}

class Bank2 extends Bank {
  void roi() {
    interest = 0.07;
    bal = (bal + (bal * interest));
  }
}

class Bank3 extends Bank {
  void roi() {
    interest = 0.06;
    bal = (bal + (bal * interest));
  }
}

class Abstract_example {
  public static void main(String args[]) {
    Bank2 acc1 = new Bank2();
    Bank3 acc2 = new Bank3();

    acc1.getaccountno();
    acc1.printaccdetails();

    acc2.getaccountno();
    acc2.printaccdetails();
  }
}
