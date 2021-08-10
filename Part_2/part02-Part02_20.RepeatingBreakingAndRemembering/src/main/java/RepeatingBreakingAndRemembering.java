
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum=0, nn=0,even=0,odd=0;
        while(true){
            int num=scanner.nextInt();
            if(num==-1){
                break;
            }
            sum+=num;
            nn++;
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+nn);
        double s=sum;
        double n=nn;
        double aver=s/n;
        System.out.println("Average: "+aver);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
