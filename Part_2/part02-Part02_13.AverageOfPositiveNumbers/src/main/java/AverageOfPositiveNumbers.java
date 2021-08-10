
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0,nn=0;
        while(true){
            int num=Integer.valueOf(scanner.nextLine());
            if(num==0){
                break;
            }else if(num>0){
                sum+=num;
                nn++;
            }
        }
        if(nn==0){
            System.out.println("Cannot calculate the average");
        }else{
            double s=sum;
            double n=nn;
            double aver=s/n;
            System.out.println(aver);
        }
    }
}
