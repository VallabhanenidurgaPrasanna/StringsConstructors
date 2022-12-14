public class VowelM {
  boolean b = false;

  public boolean vowel(char ch) {
    if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
      b = true;
    }
    return b;
  }

  public static void main(String args[]) {
    VowelM obj = new VowelM();
    boolean b = obj.vowel('b');
    if (b) {
      System.out.println("vowel");
    } else {
      System.out.println("consonant");

    }
  }
}