/*
 * .A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B
 * and Bank C respectively. We have to print the money deposited by him in a
 * particular bank. Create a class 'Bank' with a method 'getBalance' which
 * returns 0. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with
 * a method with the same name 'getBalance' which returns the amount deposited
 * in that particular bank. Call the method 'getBalance' by the object of each
 * of the three banks.
 */

class Bank {
  int getbalance() {
    return 0;
  }
}

class BankA extends Bank {
  int getbalance(int bal) {
    return bal;
  }
}

class BankB extends Bank {
  int getbalance(int bal) {
    return bal;
  }
}

class BankC extends Bank {
  int getbalance(int bal) {
    return bal;
  }
}

public class Example7 {
  public static void main(String args[]) {
    BankA b1 = new BankA();
    BankB b2 = new BankB();
    BankC b3 = new BankC();
    System.out.println("$" + b1.getbalance(1000));
    System.out.println("$" + b2.getbalance(1500));
    System.out.println("$" + b3.getbalance(2000));
  }
}