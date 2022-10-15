import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Drumstyle92
 * class that contains the whole program.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method which contains a list, a scanner, a while loop,
     * a switch and show, you can interact with the selected list.
     */
    public static void main(String[] args) {
        // list creation
        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please enter a String:");
            String used = scanner.nextLine();
            switch(used){
                case "size":
                    System.out.println("List size: " + list.size());
                    break;
                case "clear":
                    list.clear();
                    System.out.println("Empty the list");
                    break;
                case "print":
                    System.out.println("Show the list: " + list);
                    break;
                default:
                    list.add(used);
                    System.out.println("added to the list");
            }
            System.out.println("-|-|-|-|-|-|-");
        }
    }
}

