
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String a = scanner.nextLine();
            if (a.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String b = scanner.nextLine();
            if (b.isEmpty()) {
                break;
            }

            System.out.print("Identification number: ");
            String c = scanner.nextLine();
            if (c.isEmpty()) {
                break;
            }

            infoCollection.add(new PersonalInformation(a, b, c));
        }

        System.out.println("");
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
