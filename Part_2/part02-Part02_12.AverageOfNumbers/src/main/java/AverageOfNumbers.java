
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0, nn=0;
        while(true){
            System.out.println("Give a number:");
            int num=Integer.valueOf(scanner.nextLine());
            if(num==0){
                break;
            }
            sum+=num;
            nn++;
        }
        double s=sum;
        double n=nn;
        double aver=s/n;
        System.out.println("Average of the numbers: "+aver);
    }
}
