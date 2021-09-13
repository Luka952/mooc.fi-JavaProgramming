
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");

            String cmd = scan.nextLine();

            if (cmd.equals("quit")) {
                break;
            }
            
            String[] s = cmd.split(" ");
            int x = Integer.valueOf(s[1]);
            if (s[0].equals("add")) {
                first.add(x);
            } else if (s[0].equals("move")) {
                if(x>first.contains()){
                    second.add(first.contains());
                    first.remove(x);
                }else{
                    first.remove(x);
                    second.add(x);
                }
            } else if (s[0].equals("remove")) {
                second.remove(x);
            }
        }
    }

}
