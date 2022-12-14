public class SmallS {
  public static void main(String args[]) {

    String str = "a hi hello welcome to strings "; // no. of words
    String words[] = str.split(" ");
    String smallest_word = null;
    int min = words[0].length();
    for (int i = 0; i < words.length; i++) {
      int s = words[i].length();
      if (s<=min) {
        min = s;
        smallest_word = words[i];
      }
    }
    System.out.println("Smallest : " + smallest_word);
  }
}
