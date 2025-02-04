package boats;

import java.util.Scanner;

public class TestBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerBoat managment = new ManagerBoat();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a boat");
            System.out.println("2. Delete a boat");
            System.out.println("3. Search for a boat by name");
            System.out.println("4. Modify a boat");
            System.out.println("5. Show all boats");
            System.out.println("6. Show boats sorted by parameter");
            System.out.println("7. Exit");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    // Add a boat
                    System.out.print("Enter boat name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter boat price: ");
                    int price = sc.nextInt();
                    System.out.print("Enter boat age: ");
                    int age = sc.nextInt();
                    Boat newBoat = new Boat(name, price, age);
                    managment.addBoat(newBoat);
                    System.out.println("Boat added successfully.");
                    break;

                case 2:
                    System.out.print("Enter boat name to delete: ");
                    String boatNameToDelete = sc.nextLine();
                    Boat boatToDelete = managment.searchBoat(boatNameToDelete);

                    if (boatToDelete != null) {
                        managment.deleteBoat(boatToDelete);
                        System.out.println("Boat deleted successfully.");
                    } else {
                        System.out.println("Boat not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter boat name to search: ");
                    String boatNameToSearch = sc.nextLine();
                    Boat foundBoat = managment.searchBoat(boatNameToSearch);
                    if (foundBoat != null) {
                        System.out.println("Boat found: " + foundBoat);
                    } else {
                        System.out.println("Boat not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter boat name to modify: ");
                    String boatNameToModify = sc.nextLine();
                    System.out.print("Enter new boat name: ");
                    String newBoatName = sc.nextLine();
                    System.out.print("Enter new boat price: ");
                    int newPrice = sc.nextInt();
                    System.out.print("Enter new boat age: ");
                    int newAge = sc.nextInt();
                    managment.modifyBoat(boatNameToModify, newBoatName, newPrice, newAge);
                    System.out.println("Boat modified successfully.");
                    break;
                case 5:
                    managment.showBoats();
                    break;
                case 6:
                    System.out.println("\nSelect sorting parameter:");
                    System.out.println("1. By Name");
                    System.out.println("2. By Price");
                    System.out.println("3. By Age");
                    int sortingChoice = sc.nextInt();
                    switch (sortingChoice) {
                        case 1:
                            managment.showBoatsbyParameter(Boat.boatCompareByName);
                            break;
                        case 2:
                            managment.showBoatsbyParameter(Boat.boatCompareByPrice);
                            break;
                        case 3:
                            managment.showBoatsbyParameter(Boat.boatCompareByAge);
                            break;
                        default:
                            System.out.println("Invalid sorting parameter.");
                            break;
                    }
                    break;
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

