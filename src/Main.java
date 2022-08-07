import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("WHICH CAVE WILL YOU GO INTO? (1 or 2)");
        Scanner getInput = new Scanner(System.in);
        String input = getInput.nextLine();
        try {
            if (input.equals("1")) {
                System.out.println("You approach the cave..");
                System.out.println("It is dark and scary...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Gobbles you down in one bite!1");
            } else {
                System.out.println("You approach the cave..");
                System.out.println("A large dragon jumps out in front of you! He says Howdy and...");
                System.out.println("gives you his treasure!");
            }
        }catch (Exception e){
            System.out.println("Input is wrong");
        }
    }
}