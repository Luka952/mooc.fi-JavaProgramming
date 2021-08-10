
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int wt=scanner.nextInt();
        System.out.println("Where from?");
        int wf=scanner.nextInt();
        for(int i=wf;i<=wt;i++){
            System.out.println(i);
        }
    }
}
