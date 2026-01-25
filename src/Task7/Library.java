package Task7;

import java.util.List;
import java.util.ArrayList;

public class Library<T extends Library.Section> {
    private List<T> sections = new ArrayList<>();

    void addSection(T section) {
        sections.add(section);
    }

    void displayAllSections() {
        for (T section : sections) {
            System.out.println("Section: " + section.getName());
            section.displayBooks();
        }
    }

    public void filterBooks(BookFilter filter) {
        System.out.println("Filtered books (based on filter condition):");
        for (T section : sections) {
            for (Library.Book book : section.books) {
                if (filter.filter(book)) {
                    System.out.println(book);
                }
            }
        }
    }

    public class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return String.format("Book{title='%s', author='%s', year=%d}", title, author, year);
        }

        public int getYear() {
            return year;
        }
    }

    public static class Section {
        private String name;
        public List<Library.Book> books = new ArrayList<>();

        public Section(String name) {
            this.name = name;
        }

        public void addBook(Library.Book book) {
            books.add(book);
        }

        public void displayBooks() {
            for (Library.Book book : books) {
                System.out.println("  - " + book);
            }
        }

        public String getName() {
            return name;
        }
    }
}

interface BookFilter {
    boolean filter(Library.Book book);
}
