
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String a = scanner.nextLine();
            if (a.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int b = Integer.valueOf(scanner.nextLine());
            if (b < 0) {
                break;
            }

            programs.add(new TelevisionProgram(a, b));
        }

        System.out.println("");

        System.out.print("Program's maximum duration? ");
        int max = scanner.nextInt();

        for (TelevisionProgram t : programs) {
            if (t.getDuration() <= max) {
                System.out.println(t.toString());
            }
        }
    }
}
