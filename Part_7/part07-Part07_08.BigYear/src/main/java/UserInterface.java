import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private BirdDatabase birdList;
    
    public UserInterface(Scanner scan){
        this.scan = scan;
        this.birdList = new BirdDatabase();
    }
    
    public void start(){
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")){
                break;
            }
            
            if (command.equals("Add")){
                System.out.print("Name: ");
                String birdName = scan.nextLine();
                System.out.print ("Name in Latin: ");
                String latinName = scan.nextLine();
                this.birdList.add(new Bird(birdName, latinName));
            }
            
            if (command.equals("Observation")){
                System.out.print("Bird? ");
                String query = scan.nextLine();
                if(this.birdList.birdExists(query)){
                    Bird b = this.birdList.getBird(query);
                    b.addObservation();
                }
                else {
                    System.out.println("Not a bird!");
                }
            }
            
            if (command.equals("All")){
                this.birdList.printAllBirds();
            }
            
            if (command.equals("One")){
                System.out.print("Bird? ");
                String query = scan.nextLine();
                if(this.birdList.birdExists(query)){
                    Bird b = this.birdList.getBird(query);
                    System.out.println(b);
                }else{
                    System.out.println("Not a bird!");
                }
            }
        }
    }

}
