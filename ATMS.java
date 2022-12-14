interface Atm {
  public void getbalance();

  public void deposit();

  public void withdraw();

  public void displaymenu();

}

class SBI implements Atm {
  int balance;

  public void getbalance() {
    balance = 10000;
    System.out.println("balance is " + balance);
  }

  public void deposit() {
    int deposits = 2000;
    balance = balance + deposits;
    System.out.println("deposit balance is" + balance);
  }

  public void withdraw() {
    int withdraws = 3000;
    balance = balance - withdraws;
    System.out.println("withdraw amount is" + balance);
  }

  public void displaymenu() {
    System.out.println("Welcome to SBI bank");
  }
}

public class ATMS {
  public static void main(String args[]) {
    Atm a = new SBI();
    a.getbalance();
    a.deposit();
    a.withdraw();
    a.displaymenu();

  }
}