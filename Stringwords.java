public class Stringwords {
  public static void main(String args[]) {
    String str = "hi123 hello@3#";
    String words[] = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i] + "");
      int acount = 0, dcount = 0, scount = 0;
      for (int j = 0; j < words[i].length(); j++) {

        if (words[i].CharAt(j) >= (a) && words[i].CharAt(j) <= ("z")
            || words[i].CharAt(j) >= ("A") && words[i].CharAt(j) <= ("Z")) {
          acount++;
        } else if (words[i].CharAt(j) >= ("0") && words[i].CharAt(j) <= ("9")) {
          dcount++;

        } else if (words[i].charAt(j) != ' ') {
          scount++;

        }
      }

      System.out.println("alphabets-" + acount);
      System.out.println("digits-" + dcount);
      System.out.println("characters-" + scount);
    }
  }
}
