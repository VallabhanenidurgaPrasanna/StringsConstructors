/*
 * write a program to print how many players and name of the game we can take
 * game as one class and read that data two different game class using super
 * keyword.
 */

class Game {
  int players;
  String name;

  Game() {

  }

  Game(int players, String name) {
    this.players = players;
    this.name = name;
  }

  void display() {
    System.out.println("number of players" + players);
    System.out.println("name of the game" + name);
  }
}

class Coco extends Game {
  Coco(int players, String name) {
    super(players, name);
  }
}

class Cricket extends Game {
  Cricket(int players, String name) {
    super(players, name);
  }
}

public class Example14 {
  public static void main(String args[]) {
    Coco c = new Coco(10, "Coco");
    c.display();
    Cricket cc = new Cricket(11, "Cricket");
    cc.display();
  }
}