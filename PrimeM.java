public class PrimeM {
  public void primenumber(int a) {
    int count = 0;
    for (int i = 1; i < a / 2; i++) {
      if (a % i == 0) {
        count = count++;
      }
    }
    if (count == 1) {
      System.out.println("prime number");
    } else {
      System.out.println("not a prime number");
    }
  }

  public static void main(String args[]) {
    PrimeM obj = new PrimeM();
    obj.primenumber(5);
  }
}