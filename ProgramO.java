/*
 * Create a class to print an integer and a character with two methods having
 * the same name but different sequence of the integer and the character
 * parameters. For example, if the parameters of the first method are of the
 * form (int n, char c), then that of the second method will be of the form
 * (char c, int n).
 */
public class ProgramO {
  void form(int n, char ch) {
    System.out.println(n+" " +ch+" ");
  }

  void form(char ch, int n) {
    System.out.println(ch+" "+ n+" ");
  }

  public static void main(String args[]) {
    ProgramO po = new ProgramO();
    po.form(12, 'A');
    po.form('A', 12);
  }
}