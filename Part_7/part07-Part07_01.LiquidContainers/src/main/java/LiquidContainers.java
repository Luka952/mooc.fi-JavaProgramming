
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0, second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String cmd = scan.nextLine();

            if (cmd.equals("quit")) {
                break;
            }
            String[] s = cmd.split(" ");
            int x = Integer.valueOf(s[1]);
            if (s[0].equals("add")) {
                if (x > 0) {
                    first += x;
                    if (first > 100) {
                        first = 100;
                    }
                }
            } else if (s[0].equals("move")) {
                if (x > 0) {
                    if (first >= x) {
                        second += x;
                    } else if (first < x) {
                        second += first;
                    }
                    if (second > 100) {
                        second = 100;
                    }
                    first -= x;
                    if (first < 0) {
                        first = 0;
                    }   
                }
            } else if (s[0].equals("remove")) {
                if (x > 0) {
                    second -= x;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }
        }
    }

}
