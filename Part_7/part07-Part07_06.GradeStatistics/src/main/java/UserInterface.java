
import java.util.Scanner;


public class UserInterface {
    private Scanner sc;
    private GradeBook gb;
    
    public UserInterface(Scanner scanner, GradeBook gbook){
        this.sc=scanner;
        this.gb=gbook;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int points=Integer.valueOf(sc.nextLine());
            if(points==-1){
                gb.print();
                break;
            }
            
            if(points>=0&&points<=100){
                gb.add(points);
            }
        }
    }
}
