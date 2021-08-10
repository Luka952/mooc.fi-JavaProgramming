
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean provjera = false;
        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                if (s.equals(searchedFor)) {
                    provjera = true;
                    System.out.println("Found!");
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Reading the file "+file+" failed.");
        }
        
        if(provjera==false){
            System.out.println("Not found.");
        }
    }
}
