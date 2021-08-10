
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            String s=scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            
            String[]p=s.split(" ");
            for(int i=p.length-1;i<p.length;i++){
                System.out.println(p[i]);
            }
        }
    }
}
