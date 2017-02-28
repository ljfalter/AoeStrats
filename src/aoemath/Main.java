package aoemath;

public class Main {

  public static void main (String[] args) {

    double f = 200; // start food
    int t = 0; // start time
    int v = 4; // start villager

    while (true) {
      f += 0.25 * v; // assumption : an villager earns 0.25 f per second

      if (f >= 500) { // 500 are the dark age costs
        break;
      }

      if (t % 25 == 0) { // 25 seconds training time for an villager, at the start of the game we don't create a
                         // villager, but pay fore one
        if (t > 0) {
          v++; // create a villager
        }
        f -= 50; // pay for one villager
      }

      t++; // one second has been played!
    }

    /*
     * we print the final values in the console
     */
    System.out.println ("f: " + f);
    System.out.println ("t: " + t);
    System.out.println ("v: " + v);
  }

}
