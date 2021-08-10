
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        //Statistics statistics1 = new Statistics();
        Statistics statistics = new Statistics();
        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
       /* statistics1.addNumber(3);
        statistics1.addNumber(5);
        statistics1.addNumber(1);
        statistics1.addNumber(2);
        System.out.println("Count: " + statistics1.getCount());
        System.out.println("Sum: " + statistics1.sum());
        System.out.println("Average: " + statistics1.average());*/
        
        System.out.println("Enter numbers:");
        while(true){
            int a=scanner.nextInt();
            if(a==-1){
                break;
            }
            statistics.addNumber(a);
            if(a%2==0){
                statistics1.addNumber(a);
            }else{
                statistics2.addNumber(a);
            }
            
        }
        System.out.println("Sum: "+statistics.sum());
        System.out.println("Sum of even numbers: "+statistics1.sum());
        System.out.println("Sum of odd numbers: "+statistics2.sum());
    }
}
