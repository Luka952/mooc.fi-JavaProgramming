
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> list=new ArrayList<>();
        int a;
        while(true){
            a=scanner.nextInt();
            if(a==-1){
                break;
            }
            list.add(a);
        }
        
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        
        double s=sum;
        double aver=s/list.size();
        System.out.println("Average: "+aver);
    }
}
