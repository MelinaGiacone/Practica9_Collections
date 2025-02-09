package enrollecoursesystem;

import footballteamnumbers.Player;
import notesdam.ManagmentNotesDam;

import java.util.Scanner;

public class TestCourseManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseManager managment = new CourseManager();
        Student student1 = new Student("Irina Tomas", 22);
        Student student2 = new Student("Melina Giacone",28);
        Student student3 = new Student("Steven Uriarte",24);
        Student student4 = new Student("Theo Kandi",27);



        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enroll student");
            System.out.println("2. Unenroll student");
            System.out.println("3. Search student by id");
            System.out.println("4. Listing all students");
            System.out.println("5. Exit");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    managment.enrollStudent("AAC350",student1);
                    managment.enrollStudent("AAB200",student2);
                    managment.enrollStudent("AAB125",student3);
                    managment.enrollStudent("AAB119",student4);
                    break;
                }
                case 2: {
                    System.out.println("Enter student id: ");
                    String id = sc.nextLine();
                    managment.unenrollStudent((id));
                    break;
                }
                case 3: {
                    System.out.println("Enter student id: ");
                    String id = sc.nextLine();
                    Student student = managment.searchStudentById(id);
                    if( student != null ){
                        System.out.println("The student is: " + student.getName());
                    } else {
                        System.out.println("Student with " + id + " does not exist");
                    }
                    break;
                }
                case 4: {
                    managment.listAllStudents();
                    break;
                }
                case 5:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
