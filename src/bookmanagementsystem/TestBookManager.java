package bookmanagementsystem;


import java.util.Scanner;

public class TestBookManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager managment = new BookManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a book");
            System.out.println("2. Show all current books");
            System.out.println("3. Return a book based on the book title");
            System.out.println("4. Return books based on author");
            System.out.println("5. Update the rating of a book");
            System.out.println("6. Show a descending list of books according to their ratings");
            System.out.println("7. Display the top (N) books by rating: ");
            System.out.println("8. Return a list of books with a rating higher than a minimum value");
            System.out.println("9. Remove a book from the list");
            System.out.println("10. Exit");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee", 1);
                    Book book2 = new Book(2, "Titanic: The Long Night", "Diane Hoh", 5);
                    Book book3 = new Book(3, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 3);
                    Book book4 = new Book(4, "The Hunger Games", "Suzanne Collins", 5);
                    Book book5 = new Book(5, "Bridgerton", "Julia Quinn", 4);
                    managment.addBook(book1);
                    managment.addBook(book2);
                    managment.addBook(book3);
                    managment.addBook(book4);
                    managment.addBook(book5);
                    System.out.println("Books were added successfully");
                    break;
                }
                case 2: {
                    System.out.println("Books are: ");
                    managment.showBooks();
                    break;
                }
                case 3: {
                    System.out.println("Insert title of the book: ");
                    String title = sc.nextLine();
                    Book book = managment.showBookByTitle(title);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("No book found with the title: " + title);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Insert author of the book: ");
                    String author = sc.nextLine();
                    Book book = managment.showBookByAuthor(author);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("No book by the author has been found");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Insert title of book you want to update the rating ");
                    String title = sc.nextLine();
                    System.out.print("Enter the new rating: ");
                    int newRating = sc.nextInt();

                    Book updatedBook = managment.updateRating(title, newRating);

                    if(updatedBook != null){
                        System.out.println("The rating has been updated successfully: " + updatedBook);
                    }
                    else{
                        System.out.println("Book not found");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Books by rating are: ");
                    managment.showBooksbyRating();
                    break;
                }
                case 7:{
                    System.out.print("Enter number of top books: ");
                    int n = sc.nextInt();
                    managment.showTopBooks(n);
                    break;
                }
                case 8:{
                    System.out.println("Enter the minimum rating value");
                    int minValue = sc.nextInt();
                    managment.getBooksWithRatingGreaterThan(minValue);
                    break;
                }
                case 9:{
                    System.out.println("Enter the id of the book you want to delete");
                    int id = sc.nextInt();
                    if(managment.deleteBookById(id)){
                        System.out.println("Book was removed successfully");
                    } else{
                        System.out.println("Id not found");
                    }
                    break;
                }
                case 10:
                    System.out.println("Exit...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
