
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) {
                break;
            }
            String[] p = s.split(" ");
            for(String ps:p){
                if(ps.contains("av")){
                  System.out.println(ps);  
                }              
            }
        }
    }
}
