import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room("A Forest extends as far as the eye can see");

        Player player1 = new Player("Default", room1);

        System.out.println("Hello Traveler, what's your name?");
        
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        scanner.close();

        player1.setName(name);

        System.out.println("Hello" + " " + player1.getname());

        while(true){
            player1.exploreRoom();
            System.out.println("What do you want to do?"+"\n"+"a)Inspect"+"\n"+"b)Move");
            
            
            
        }
     }
     
}
