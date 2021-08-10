
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            
            String[] p = s.split(" ");
            for (String p1 : p) {
                System.out.println(p1);
            }
        }

    }
}
