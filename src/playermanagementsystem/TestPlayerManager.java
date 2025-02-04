package playermanagementsystem;

import java.util.Scanner;

public class TestPlayerManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerManager managment = new PlayerManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a player to the list");
            System.out.println("2. Remove a player by name");
            System.out.println("3. Get a player by name");
            System.out.println("4. Update a player's score");
            System.out.println("5. Get top N players by score");
            System.out.println("6. Get players with score greater than a value");
            System.out.println("7. Get the player with the highest score");
            System.out.println("8. Show all players");
            System.out.println("9. Exit");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter player's name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter player's score: ");
                    int score = sc.nextInt();
                    managment.addPlayer(new Player(name, score));
                    break;
                case 2:
                    System.out.print("Enter player's name to remove: ");
                    String nameToDelete = sc.nextLine();
                    boolean playerRemoved = managment.deletePlayerByName(nameToDelete);

                    if (playerRemoved) {
                        System.out.println("Player removed successfully.");
                    } else {
                        System.out.println("Player not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter player's name to search: ");
                    String searchName = sc.nextLine();
                    Player player = managment.showPlayerByName(searchName);
                    if (player != null) {
                        System.out.println(player);
                    } else {
                        System.out.println("Player not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter player's name to update score: ");
                    String playerName = sc.nextLine();
                    System.out.print("Enter new score: ");
                    int newScore = sc.nextInt();
                    managment.updateScore(playerName, newScore);
                    break;
                case 5:
                    System.out.print("Enter number of top players: ");
                    int n = sc.nextInt();
                    managment.showTheBestPlayers(n);
                    break;
                case 6:
                    System.out.print("Enter the minimum score: ");
                    int minScore = sc.nextInt();
                    System.out.println("The players with score greater than " + minScore + " are: ");
                    managment.getPlayersWithScoreGreaterThan(minScore);
                    break;
                case 7:
                    Player highestScore = managment.highestScore();
                    System.out.println("The player with highest score is: " + highestScore.getName() + " with " + highestScore.getScore() + " points.");
                    break;
                case 8:
                    managment.showPlayers();
                    break;
                case 9:
                    System.out.println("Exit...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
