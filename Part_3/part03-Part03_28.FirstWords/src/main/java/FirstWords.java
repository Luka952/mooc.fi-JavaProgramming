
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            String s=scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            String[] p=s.split(" ");
            for(int i=0;i<1;i++){
                System.out.println(p[i]);                
            }
        }
    }
}
