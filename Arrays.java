import java.util.Scanner;

public class Arrays {

  int arr[] = new int[100];
  Scanner s = new Scanner(System.in);
  int n = 0;

  public void insertFirst() {
    System.out.println("Enter value");
    int value = s.nextInt();
    if (n == 0) {
      arr[0] = value;
      n++;
    } else {
      for (int i = n; i > 0; i--) {//1234
        arr[i] = arr[i - 1];
      }
      arr[0] = value;
      n++;
    }
  }

  public void insertLast() {
    System.out.println("Enter value");
    int value = s.nextInt();
    if (n == 0) {
      arr[0] = value;
      n++;
    } else {
      arr[n] = value;
      n++;
    }
  }

  public void insertSpecific() { // 23 12 90 44 22 55
    System.out.println("Enter index and value");
    int index = s.nextInt(); // 3
    int value = s.nextInt(); // 40
    if (index <= n) {
      if (index == 0) {
        arr[0] = value;
        n++;
      } else {
        for (int i = n; i > index; i--) {
          arr[i] = arr[i - 1];

        }
        arr[index] = value;
        n++;
      }
    } else {
      System.out.println("invalid index");
    }

  }

  public void deletelast() {
    n--;
  }

  public void deletefirst() {

    for (int i = 0; i < n; i++) {
      arr[i] = arr[i + 1];
    }
    n--;

  }

  public void display() {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public void viewOptions() {
    int option = 0;
    do {
      System.out.println("\n1. insert first");
      System.out.println("2. insert last");
      System.out.println("3. insert specific");
      System.out.println("4.delete first");
      System.out.println("5.delete last");
      System.out.println("0. EXIT");
      System.out.println("Choose your option");
      option = s.nextInt();
      if (option == 1) {
        insertFirst();
        display();
      } else if (option == 2) {
        insertLast();
        display();
      }

      else if (option == 3) {
        insertSpecific();
        display();
      } else if (option == 4) {
        deletefirst();
        display();
      } else if (option == 5) {
        deletelast();
        display();
      }

    } while (option != 0);

  }

  public static void main(String[] args) {

    Arrays obj = new Arrays();
    obj.viewOptions();

  }

}