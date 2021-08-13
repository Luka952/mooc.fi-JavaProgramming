
import java.util.Scanner;


public class UserInterface {
   private TodoList tList;
   private Scanner scanner;
   
   public UserInterface(TodoList tlist, Scanner scanner){
       this.tList=tlist;
       this.scanner=scanner;
   }
   
   public void start(){
       while(true){
           System.out.println("Command: ");
           String cmd=scanner.nextLine();
           
           if(cmd.equals("stop")){
               break;
           }else if(cmd.equals("add")){
               System.out.println("To add:");
               String a=scanner.nextLine();
               
               this.tList.add(a);
           }else if(cmd.equals("list")){
               this.tList.print();
           }else if(cmd.equals("remove")){
               System.out.println("Which one is removed?");
               int n=scanner.nextInt();
               
               this.tList.remove(n);
           }
       }
   }
   
}
