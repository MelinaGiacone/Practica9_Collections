package footballteamnumbers;

import arraylist.boats.Boat;
import com.sun.source.tree.Tree;

import java.util.*;

public class FootballTeam {
    private HashMap<Integer, Player> footballTeam;

    public FootballTeam() {
        footballTeam = new HashMap<>();
    }

    public void addPlayer(Integer playerNumber, Player player) {
        if (footballTeam.containsKey(playerNumber)) {
            System.out.println("That number is already taken by another player");
        } else {
            footballTeam.put(playerNumber, player);
            System.out.println("Player added successfully.");
        }
    }

    public Player searchPlayerByNumberPlayer(int enterKey) {
        return footballTeam.getOrDefault(enterKey, null);
    }

    public Player searchPlayerByName(String name){
        for(Map.Entry<Integer,Player> entry : footballTeam.entrySet()){
            if(entry.getValue().getName().equals(name)){
                return entry.getValue();
            }
        }
        return null;
    }

    public void sortByNumberPlayer() {
        TreeMap<Integer, Player> listSortedMap = new TreeMap<>(footballTeam);
        for (Map.Entry<Integer, Player> entry : listSortedMap.entrySet()) {
            System.out.println(entry.getKey() + "::" + entry.getValue().getName());
        }
    }

    public void showPlayerByParameter(Comparator<Player> comparator){
        // TreeMap<Integer, Player> listSorted = new TreeMap<>(footballTeam);
        ArrayList<Player> playersList = new ArrayList<>(footballTeam.values());

        playersList.sort(comparator);

        for (Player player : playersList) {
            System.out.println(player);
        }
    }
}
