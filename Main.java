import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Default");

        System.out.println("Hello Traveler, what's your name?");
        
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        scanner.close();

        player1.setName(name);

        System.out.println("Hello" + " " + player1.getname());
     }
}
