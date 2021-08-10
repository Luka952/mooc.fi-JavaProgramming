
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file=scan.nextLine();
        System.out.println("Team:");
        String team=scan.nextLine();
        
        int n=0;
        int w=0;
        int l=0;
        try(Scanner sc=new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String [] s=sc.nextLine().split(",");
                if(s[0].equals(team)){
                    if(Integer.valueOf(s[2])>Integer.valueOf(s[3])){
                        w++;
                    }else{
                        l++;
                    }
                    n++;
                }else if(s[1].equals(team)){
                    if(Integer.valueOf(s[3])>Integer.valueOf(s[2])){
                        w++;
                    }else{
                        l++;
                    }
                    n++;
                }
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        System.out.println("Games: "+n);
        System.out.println("Wins: "+w);
        System.out.println("Losses: "+l);
    }

}
