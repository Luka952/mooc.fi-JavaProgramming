
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = 0;
        String ime = null;
        int a = 0;
        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }

            String[] p = s.split(",");
            a++;
            for (int i = 0; i < p.length; i++) {
                if ((i % 2 == 0 || i == 0)) {
                    if (p[i].length() > n) {
                        n = p[i].length();
                        ime = p[i];
                    }
                } else {
                    sum += Integer.valueOf(p[i]);
                }
            }
        }
        System.out.println("Longest name: " + ime);
        double s = sum;
        double aver = s / a;
        System.out.println("Average of the birth years: " + aver);

    }
}
