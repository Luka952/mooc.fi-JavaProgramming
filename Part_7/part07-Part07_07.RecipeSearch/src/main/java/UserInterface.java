import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {


    private Scanner scanner;
    private ArrayList<Recipe> recipeList = new ArrayList<>(); 

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }


    public void start() {
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        readFile(fileName); 

        System.out.println("");

        System.out.println("Commands: \nlist - lists the recipes \nstop - stops the program"
                + "\nfind name - searches recipes by name \nfind cooking time - searches recipes by cooking time"
                + " \nfind ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.println("Enter a command");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                for (Recipe r : recipeList) {
                    System.out.println(r);
                }
            }

            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String query = scanner.nextLine();
                for (Recipe r : recipeList) {
                    if (r.getName().contains(query)) {
                        System.out.println(r);
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxTime = Integer.valueOf(scanner.nextLine());
                for (Recipe r : recipeList) {
                    if (r.getTime() <= maxTime) {
                        System.out.println(r);
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingQuery = scanner.nextLine();
                for (Recipe r : recipeList) {
                    if (r.hasIngredient(ingQuery)) {
                        System.out.println(r);
                    }
                }
            }
        }
    }

    public void readFile(String fileName) {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.equals("")) {
                    continue;
                }
                String name = line;
                int time = Integer.valueOf(fileReader.nextLine());
                ArrayList<String> ings = new ArrayList();
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ings.add(ingredient);
                }
                recipeList.add(new Recipe(name, time, ings));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}