package playermanagementsystem;

import java.util.Comparator;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static Comparator<Player> playerCompareByScore = new Comparator<Player>() {
        public int compare(Player player1, Player player2) {
            int playerScore1 = player1.getScore();
            int playerScore2 = player2.getScore();
            return Integer.compare(playerScore2, playerScore1);
        }
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "Player{name='" + this.name + "', score=" + this.score + "}";
    }
}
