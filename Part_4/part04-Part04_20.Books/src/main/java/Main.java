import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<MyBook> books =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.print("Title: ");
            String t=sc.nextLine();
            if(t.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int p=Integer.valueOf(sc.nextLine());
            
            System.out.print("Publication year: ");
            int y=Integer.valueOf(sc.nextLine());
            
            books.add(new MyBook(t,p,y));
        }

        System.out.println("");
        System.out.print("What information will be printed? ");
        String info=sc.nextLine();
        
        if(info.equals("everything")){
            for(MyBook n:books){
                System.out.println(n.everything());
            }
        }else if(info.equals("name")){
            for(MyBook n:books){
                System.out.println(n.name());
            }
        }
    }
}
