package playermanagementsystem;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PlayerManager {
    private ArrayList<Player> players;


    public PlayerManager() {
        players = new ArrayList<Player>();
    }


    public void addPlayer(Player player) {
        players.add(player);
    }


    public boolean deletePlayerByName(String name) {
        Iterator<Player> it = players.iterator();
        while (it.hasNext()) {
            Player player = it.next();
            if (player.getName().equals(name)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Player showPlayerByName(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }


    public void updateScore(String name, int score) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                player.setScore(score);
            }
        }
    }


    public void showTheBestPlayers(int n) {
        Collections.sort(players, Player.boatCompareByScore);
        System.out.println("The " + n + "best players are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(players.get(i) + " ");
        }
    }

    public void getPlayersWithScoreGreaterThan(int minScore) {
        for (Player player : players) {
            if (player.getScore() > minScore) {
                System.out.println(player);
            }
        }
    }

    public Player highestScore() {
        Collections.sort(players, Player.boatCompareByScore);
        return players.get(0);
    }


    public void showPlayers() {
        System.out.println("The players are: ");
        for (Player player : players) {
            System.out.println(player);
        }
        System.out.println();
    }


    @Override
    public String toString() {
        return "PlayerManager{" +
                "players=" + players +
                '}';
    }
}
