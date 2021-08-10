
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String a=scanner.nextLine();
            if(a.isEmpty()){
                break;
            }
            items.add(new Item(a));
        }
        
        for(Item ite:items){
            System.out.println("Name: "+ite.toString());
        }
    }
}
