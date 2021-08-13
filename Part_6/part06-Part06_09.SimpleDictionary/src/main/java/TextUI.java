
import java.util.HashMap;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary sd;

    public TextUI(Scanner scanner, SimpleDictionary sd) {
        this.scanner = scanner;
        this.sd = sd;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String cmd = scanner.nextLine();

            if (cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (cmd.equals("add")) {
                System.out.println("Word:");
                String w = scanner.nextLine();

                System.out.println("Translation:");
                String t = scanner.nextLine();

                this.sd.add(w, t);
            } else if (cmd.equals("search")) {
                System.out.println("To be translated:");
                String s = scanner.nextLine();

                if (this.sd.translate(s) == null) {
                    System.out.println("Word " + s + " was not found");
                } else {
                    System.out.println("Translation: " + this.sd.translate(s));
                }           
            }
            System.out.println("Unknown command");
        }
    }
}
