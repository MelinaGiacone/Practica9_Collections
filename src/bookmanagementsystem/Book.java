package bookmanagementsystem;

import java.util.Comparator;

public class Book {
    private int id;
    private String title;
    private String author;
    private int rating;

    public Book(int id, String title, String author, int rating) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 0 and 5.");
        }
        this.rating = rating;
    }

    public static Comparator<Book> bookComparatorByRating = new Comparator<Book>() {
        public int compare(Book book1, Book book2){
            int ratingBook1 = book1.getRating();
            int ratingBook2 = book2.getRating();

            if(ratingBook1 >= ratingBook2) return  -1;
            else return 1;
        }
    };

    @Override
    public String toString() {
        return "Book ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Rating: " + rating + "/5\n";
    }
}
