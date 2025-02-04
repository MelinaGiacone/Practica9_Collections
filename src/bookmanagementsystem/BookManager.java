package bookmanagementsystem;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book showBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book showBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    public Book updateRating(String title, int newRating) {
        Book bookToUpdate = showBookByTitle(title);

        if (bookToUpdate != null) {
            bookToUpdate.setRating(newRating);
            return bookToUpdate;
        }
        return null;
    }


    public void showBooksbyRating() {
        Collections.sort(books, Book.bookComparatorByRating);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i) + " ");
        }
        System.out.println();
    }

    public void showTopBooks(int n) {
        Collections.sort(books, Book.bookComparatorByRating);
        for (int i = 0; i < n; i++) {
            System.out.println(books.get(i) + " ");
        }
    }

    public void getBooksWithRatingGreaterThan(int minValue){
        for(Book book : books){
            if(book.getRating() > minValue){
                System.out.println(book);
            }
        }
    }

    public boolean deleteBookById(int id){
        for(Book book : books){
            if(book.getId() == id){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
