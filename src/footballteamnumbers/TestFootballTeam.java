package footballteamnumbers;

import java.util.Scanner;

public class TestFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FootballTeam managment = new FootballTeam();
        Player player1 = new Player("Nicolas Otamendi", 26, "Defender");
        Player player2 = new Player("Lionel Messi", 32, "Forward");
        Player player3 = new Player("Rodrigo De Paul", 28, "Midfielder");


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add players");
            System.out.println("2. Search for a player by team number");
            System.out.println("3. Search for a player by name");
            System.out.println("4. Listing players sorted by team number");
            System.out.println("5. Listing players sorted by age");
            System.out.println("6. Listing players sorted by position");
            System.out.println("7. Exit");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    managment.addPlayer(19, player1);
                    managment.addPlayer(10, player2);
                    managment.addPlayer(7, player3);
                    break;
                }
                case 2: {
                    System.out.println("Enter team number: ");
                    int n = sc.nextInt();
                    Player player = managment.searchPlayerByNumberPlayer(n);
                    if (player != null){
                        System.out.println("The player with team number " + n + " is: " + player.getName());
                    } else {
                        System.out.println("Player with " + n + "number does not exist");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter player name: ");
                    String name = sc.nextLine();
                    Player player = managment.searchPlayerByName(name);
                    if( player != null ){
                        System.out.println("The player is: " + player);
                    } else {
                        System.out.println("Player with " + name + " does not exist");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Players sorted by team number : ");
                    managment.sortByNumberPlayer();
                    break;
                }
                case 5: {
                    System.out.println("Players sorted by age: ");
                    managment.showPlayerByParameter(Player.playerCompareByAge);
                    break;
                }
                case 6:{
                    System.out.println("Players sorted by position: ");
                    managment.showPlayerByParameter(Player.playerCompareByPosition);
                    break;
                }
                case 7:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
