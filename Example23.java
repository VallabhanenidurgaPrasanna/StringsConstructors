/*
 * Football player
 * 
 * 
 * 
 * name football
 * 
 * 
 * 
 * Football type size weight
 */

class Football {
  String type;
  int size;
  int weight;

  Football() {

  }

  Football(String type, int size, int weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }
}

class Football_player extends Football {
  String name;

  Football_player(String type, int size, int weight, String name) {
    super(type, size, weight);
    this.name = name;

  }
}

public class Example23 {
  public static void main(String args[]) {
    Football f = new Football("cosco", 20, 10);
    System.out.println(f.type + " " + f.size + " " + f.weight);
    Football_player fp = new Football_player("cosco", 10, 20, "Ronaldo");
    System.out.println(fp.type + " " + fp.size + " " + fp.weight + " " + fp.name);
  }
}