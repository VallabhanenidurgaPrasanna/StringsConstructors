public class Index {
  public void special(String str){
    if(str.contains("7")){
      System.out.println("yes");
    System.out.println(str.indexOf("7"));
  }else{
    System.out.println("no");
  }
  }
  public static void main(String args[]) {
  Index i=new Index();
    i.special("prasanna@0612");
  }
}