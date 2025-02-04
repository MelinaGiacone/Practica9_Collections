package boats;

import java.util.Comparator;

public class Boat {
    private String name;
    private double price;
    private int age;

    public Boat(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Comparator<Boat> boatCompareByAge = new Comparator<Boat>() {
        public int compare(Boat boat1, Boat boat2) {
            int boatAge1 = boat1.getAge();
            int boatAge2 = boat2.getAge();
            if (boatAge1 >= boatAge2) return -1;
            else return 1;

        }
    };

    public static Comparator<Boat> boatCompareByName = new Comparator<Boat>() {
        public int compare(Boat boat1, Boat boat2) {
            String boatName1 = boat1.getName().toLowerCase();
            String boatName2 = boat2.getName().toLowerCase();
            return boatName1.compareTo(boatName2);
        }
    };

    public static Comparator<Boat> boatCompareByPrice = new Comparator<Boat>() {
        public int compare(Boat boat1, Boat boat2) {
            double boatPrice1 = boat1.getPrice();
            double boatPrice2 = boat2.getPrice();

            if (boatPrice1 >= boatPrice2) return -1;
            else return 1;
        }
    };

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

}

