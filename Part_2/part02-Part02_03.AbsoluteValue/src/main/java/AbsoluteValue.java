
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int b=Integer.valueOf(scanner.nextLine());
        
        if(b<0){
            System.out.println(b*-1);
        }else{
            System.out.println(b);
        }
    }
}
