
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        while(true){
            String s=scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            
            String[]p=s.split(",");
            
            for(int i=p.length-1;i<p.length;i++){
                if(Integer.valueOf(p[i])>max){
                    max=Integer.valueOf(p[i]);
                }
            }
        }
        System.out.println("Age of the oldest: "+max);
    }
}
