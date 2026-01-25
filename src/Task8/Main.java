package Task8;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // --- Books ---
        Book b1 = new Book("1984", "George Orwell", 1949, 4.9, true);
        Book b2 = new Book("Animal Farm", "George Orwell", 1945, 4.8, false);
        Book b3 = new Book("Clean Code", "Robert Martin", 2008, 4.7, true);
        Book b4 = new Book("Effective Java", "Joshua Bloch", 2018, 4.9, true);
        Book b5 = new Book("The Pragmatic Programmer", "Andy Hunt", 1999, 4.6, true);
        Book b6 = new Book("Java Concurrency in Practice", "Brian Goetz", 2006, 4.5, false);

        List<Book> books = Arrays.asList(b1, b2, b3, b4, b5, b6);

        // --- Users ---
        User u1 = new User("Aydin", 25, Arrays.asList(
                new BorrowRecord(b1, LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 10)),
                new BorrowRecord(b3, LocalDate.of(2025, 10, 5), null)
        ));
        User u2 = new User("Leyla", 22, Arrays.asList(
                new BorrowRecord(b4, LocalDate.of(2025, 10, 2), LocalDate.of(2025, 10, 20)),
                new BorrowRecord(b6, LocalDate.of(2025, 10, 12), null)
        ));
        User u3 = new User("Murad", 28, Arrays.asList(
                new BorrowRecord(b5, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 25))
        ));

        List<User> users = Arrays.asList(u1, u2, u3);

        // --- Library Service ---
        LibraryService service = new LibraryService(books, users);

        // --- Sorted Books ---
        System.out.println("📚 Sorted Books:");
        service.sortBooks(books).forEach(book -> System.out.println(book.getTitle() + " (" + book.getAuthor() + ", " + book.getYear() + ") ⭐" + book.getRating()));

        // --- Library Analysis ---
        System.out.println("\n📊 Library Analysis:");
        // Average Rating
        double averageRating = service.getAverageRating(books);
        System.out.println("Average Rating: " + averageRating);

        // Available books after 2000
        List<Book> availableAfter2000 = service.getBooksAfter2000AndAvailable(books);
        System.out.println("Available after 2000: " + availableAfter2000);

        // Most borrowed book
        Book mostBorrowedBook = service.getMostBorrowedBook(users);
        System.out.println("Most borrowed book: " + (mostBorrowedBook != null ? mostBorrowedBook.getTitle() : "None"));

        // Currently reading
        System.out.println("Currently reading:");
        service.getCurrentlyReadingBooks(users).forEach((userName, booksList) -> {
            System.out.println(userName + " -> " + booksList);
        });

        // Books grouped by author (after 1950)
        System.out.println("Books grouped by author (after 1950):");
        service.getBooksGroupedByAuthorAfter1950(books).forEach((author, bookList) -> {
            System.out.println(author + " -> " + bookList);
        });

        // --- Unique Authors Read ---
        System.out.println("\n📚 Authors read by users:");
        Set<String> uniqueAuthors = service.getUniqueAuthors(users);
        System.out.println(uniqueAuthors);

        // --- Recommendation for Aydin ---
        System.out.println("\n📖 Recommendation for Aydin:");
        service.findRecommendedBookForUser(u1)
                .ifPresentOrElse(
                        b -> System.out.println("Recommended: " + b),
                        () -> System.out.println("No recommendation available.")
                );

        // --- Top Reader of October 2025 ---
        System.out.println("\n👑 Top Reader of October 2025:");
        service.findTopReaderOfMonth(users, 10, 2025)
                .ifPresentOrElse(
                        u -> System.out.println("Top Reader: " + u.getName()),
                        () -> System.out.println("No reader found.")
                );

        // --- Reading Durations ---
        System.out.println("\n⏱ Reading Durations:");
        users.stream()
                .flatMap(u -> u.getBorrowHistory().stream())
                .filter(r -> r.getReturnedDate() != null) // Only consider returned books
                .forEach(r -> {
                    long days = java.time.Duration.between(r.getBorrowedDate().atStartOfDay(), r.getReturnedDate().atStartOfDay()).toDays();
                    System.out.println(r.getBook().getTitle() + " read in " + days + " days");
                });
    }
}
