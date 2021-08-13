
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager joke, Scanner scanner) {
        this.jokes = joke;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String cmd = scanner.nextLine();

            if (cmd.equals("1")) {
                System.out.println("Write the joke to be added:");
                String j = scanner.nextLine();
                this.jokes.addJoke(j);
            } else if (cmd.equals("2")) {
                System.out.println(this.jokes.drawJoke());
            } else if (cmd.equals("3")) {
                this.jokes.printJokes();
            } else if (cmd.equals("X")) {
                break;
            }
        }
    }
}
