package boats;

import java.util.ArrayList;
import java.util.Comparator;

public class ManagerBoat {
    private ArrayList<Boat> boats;

    public ManagerBoat() {
        boats = new ArrayList<Boat>();
    }

    public void addBoat(Boat boat) {
        boats.add(boat);
    }

    public Boat searchBoat(String name) {
        Boat correctBoat = null;
        for (Boat boat : boats) {
            if (boat.getName().equals(name)) {
                correctBoat = boat;
                break;
            }
        }
        return correctBoat;
    }


    public void modifyBoat(String name, String newName, double newPrice, int newAge) {
        for (Boat boat : boats) {
            if (boat.getName().equals(name)) {
                boat.setName(newName);
                boat.setPrice(newPrice);
                boat.setAge(newAge);
            }
        }
    }

    public void deleteBoat(Boat boat) {
        boats.remove(boat);
    }

    public void showBoats() {
        System.out.println("Boats are:");
        for (Boat boat : boats) {
            System.out.println(boat + " ");
        }
        System.out.println();
    }

    public void showBoatsbyParameter(Comparator<Boat> comparator) {
        boats.sort(comparator);
        for (int i = 0; i < boats.size(); i++) {
            System.out.println(boats.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }

    @Override
    public String toString() {
        return "ManagerBoat{" +
                "boats=" + boats +
                '}';
    }

}
