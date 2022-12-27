public class ReverseS {
  public void reverseString() {
    String str = "Hi hello welcome to java";
    String words[] = str.split(" ");
    String reverseword = "";
    for (int i = 0; i < words.length; i++) {
      reverseword = "";
      for (int j = words[i].length() - 1; j >= 0; j--) {
        reverseword += words[i].charAt(j);

      }
      System.out.println(reverseword);
    }
  }

  public static void main(String args[]) {
    ReverseS r = new ReverseS();
    r.reverseString();
  }
}