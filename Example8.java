//create bank class print same methods in two classes method name is rateofinterest print those two bank classes.

class Bank {
  void rateofinterest() {
    System.out.println("rateofinterest is 80ps");
  }
}

class SBI extends Bank {
  void rateofinterest() {
    System.out.println("rateofinterest is 70ps");
  }
}

class HDFC extends Bank {
  void rateofinterest() {
    System.out.println("rateofinterest is 60ps");
  }
}

public class Example8 {
  public static void main(String args[]) {
    Bank b = new Bank();
    b.rateofinterest();
    SBI sbi = new SBI();
    sbi.rateofinterest();
    HDFC hdfc = new HDFC();
    hdfc.rateofinterest();
  }
}