public class BS {
  public static void main(String args[]) {

    String str = "hi hello welcome to strings"; // no. of words

    String words[] = str.split(" ");

    for (int j = 0; j < words.length; j++) {
      System.out.println(words[j] + "");
      int acount = 0, dcount = 0, scount = 0;
      for (int i = 0; i < words[j].length(); i++) {
        if (words[j].charAt(i) >= '0' && words[j].charAt(i) <= '9') {
          dcount++;
        } else if (words[j].charAt(i) >= 'a' && words[j].charAt(i) <= 'z'
            || words[j].charAt(i) >= 'A' && words[j].charAt(i) <= 'Z') {
          acount++;
        } else if (words[j].charAt(i) != ' ') {
          scount++;
        }
      }

      System.out.println("alphabets-" + acount);
      System.out.println("digits-" + dcount);
      System.out.println("characters-" + scount);

    }

  }
}