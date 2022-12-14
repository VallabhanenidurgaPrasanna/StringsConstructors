public class Numbers {

  public static void main(String[] args) {

    int a = 10, b = 99;
    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= 5; j++) {
        if (i % 2 != 0) {
          System.out.print(a + " ");
          a++;
        } else {
          System.out.print(b + " ");
          b--;
        }
      }
      System.out.println();
    }

  }

}