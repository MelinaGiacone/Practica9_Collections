package footballteamnumbers;

import arraylist.boats.Boat;

import java.util.Comparator;

public class Player {
    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static Comparator<Player> playerCompareByAge = new Comparator<Player>() {
        public int compare(Player player1 , Player player2){
            int playerAge1 = player1.getAge();
            int playerAge2 = player2.getAge();
            if (playerAge1 >= playerAge2) return -1;
            else return 1;
        }
    };

    public static Comparator<Player> playerCompareByPosition = new Comparator<Player>() {
       public int compare(Player player1 , Player player2){
            String playerPosition1 = player1.getPosition();
            String playerPosition2 = player2.getPosition();
            return playerPosition1.compareTo(playerPosition2);
        }
    };

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
