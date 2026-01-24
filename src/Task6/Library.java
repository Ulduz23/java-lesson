package Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBooks(Book book) {
        books.add(book);
    }

    public void removeBooks(Book book) {
        books.remove(book);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }

        }
        return result;
    }

    public List<Book> searchByGenre(String isbn) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(isbn)) {
                result.add(book);
            }
        }
        return result;
    }

    public void  displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public int countBooks() {
        return books.size();
    }

    public void sortBooks() {
        Collections.sort(books);
    }

    public void sortBooksByAuthor() {
        books.sort(new SortByAuthor());
    }

    public void sortByPublicationYear() {
        books.sort(new SortByPublicationYear());
    }


}
