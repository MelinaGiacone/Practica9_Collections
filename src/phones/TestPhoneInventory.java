package phones;

import java.util.Scanner;

public class TestPhoneInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneInventory managment = new PhoneInventory();
        Phone phone1 = new Phone("Apple", "14", 607061869);
        Phone phone2 = new Phone("Apple", "12", 608034944);
        Phone phone3 = new Phone("Samsung", "Galaxy A55", 698273893);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add phones");
            System.out.println("2. Remove phone");
            System.out.println("3. Search for a mobile number by id");
            System.out.println("4. Search for an id by mobile number");
            System.out.println("5. Exit");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    managment.addPhone("Y907827E", phone1);
                    managment.addPhone("Y971275J", phone2);
                    managment.addPhone("Z928273P", phone3);
                    break;
                }
                case 2: {
                    System.out.println("Enter the student's ID");
                    String id = sc.nextLine().toUpperCase();
                    managment.deletePhone(id);
                }
                case 3: {
                    System.out.println("Enter the student's ID: ");
                    String id = sc.nextLine().toUpperCase();
                    Phone student = managment.searchPhoneById(id);

                    if (student != null) {
                        System.out.println("The phone number is: " + student.getNumber());
                    } else {
                        System.out.println("Student does not have phone number added");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter the phone number: ");
                    int phoneNumber = sc.nextInt();
                    String idFound = managment.searchIdByPhoneNumber(phoneNumber);
                    if (idFound != null) {
                        System.out.println(idFound);
                    } else {
                        System.out.println("Student with that id does not exist");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Exit...");
                    break;
                }
                default: {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}
