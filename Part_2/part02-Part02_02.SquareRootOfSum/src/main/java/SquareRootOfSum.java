
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int b1=Integer.valueOf(scanner.nextLine());
        int b2=Integer.valueOf(scanner.nextLine());
        
        double sum=b1+b2;
        sum=Math.sqrt(sum);
        System.out.println(sum);
    }
}
