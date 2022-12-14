public class LongS {
  public static void main(String args[]) {

    String str = "hi hello welcome to strings"; // no. of words
    String words[] = str.split(" ");

    int max = 0;
    String longest_word = null;
    for (int i = 0; i < words.length; i++) {
      int l = words[i].length();
      if (max <= l) {
        max = l;
        longest_word = words[i];
      }
    }
    System.out.println("Longest word : " + longest_word);
  }
}