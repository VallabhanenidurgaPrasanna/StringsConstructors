public class Res {
  public void reverseS() {
    String str = "Hi hello welcome to bitlabs";
    String words[] = str.split(" ");
    String rev = "";
    for (int i = 0; i < words.length; i++) {
      rev = "";
      for (int j = words[i].length() - 1; j >= 0; j--) {
        rev += words[i].charAt(j);
      }
      System.out.println(rev);
    }
  }

  public static void main(String args[]) {
    Res r = new Res();
    r.reverseS();
  }
}