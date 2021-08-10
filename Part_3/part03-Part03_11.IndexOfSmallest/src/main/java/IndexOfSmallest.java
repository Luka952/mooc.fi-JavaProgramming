
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list=new ArrayList<>();
        int a;
        while(true){
            a=scanner.nextInt();
            if(a==9999){
                break;
            }
            list.add(a);
        }
        
        int min=list.get(0);
        int b=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
                b=i;
            }
        }
        
        System.out.println("Smallest number: "+min);
        System.out.println("Found at index: "+b);
    }
}
