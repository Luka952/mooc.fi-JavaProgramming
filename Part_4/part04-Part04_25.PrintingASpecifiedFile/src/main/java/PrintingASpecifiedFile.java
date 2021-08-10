
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String s=scanner.nextLine();
        
        try(Scanner sc=new Scanner(Paths.get(s))){
            while(sc.hasNextLine()){
                String n=sc.nextLine();
                System.out.println(n);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
