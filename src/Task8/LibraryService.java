package Task8;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryService {

    public LibraryService(List<Book> books, List<User> users) {
    }

    public static List<Book> sortBooks(List<Book> books) {
        return books.stream()
                .sorted(Comparator.comparing(Book::getRating, Comparator.reverseOrder())
                        .thenComparing(Book::getYear)
                        .thenComparing(Book::getTitle))
                .collect(Collectors.toList());
    }


    public static double getAverageRating(List<Book> books) {
        return books.stream()
                .mapToDouble(Book::getRating)
                .average()
                .orElse(0);
    }

    public static List<Book> getBooksAfter2000AndAvailable(List<Book> books) {
        return books.stream()
                .filter(book -> book.getYear() > 2000 && book.isAvailable())
                .collect(Collectors.toList());
    }

    public static Book getMostBorrowedBook(List<User> users) {
        return users.stream()
                .flatMap(user -> user.getBorrowHistory().stream())
                .collect(Collectors.groupingBy(borrowRecord -> borrowRecord.getBook().getTitle(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(entry -> new Book(entry.getKey(), "", 0, 0, false))
                .orElse(null);
    }

    public static Map<String, List<Book>> getCurrentlyReadingBooks(List<User> users) {
        return users.stream()
                .collect(Collectors.toMap(
                        User::getName,
                        user -> user.getBorrowHistory().stream()
                                .filter(record -> record.getReturnedDate() == null)
                                .map(BorrowRecord::getBook)
                                .collect(Collectors.toList())
                ));
    }

    public static Map<String, List<Book>> getBooksGroupedByAuthorAfter1950(List<Book> books) {
        return books.stream()
                .filter(book -> book.getYear() > 1950)
                .collect(Collectors.groupingBy(Book::getAuthor));
    }

    public Optional<Book> findRecommendedBookForUser(User user) {
        if (user.getBorrowHistory().isEmpty()) {
            return Optional.empty();
        }

        String mostReadAuthor = user.getBorrowHistory().stream()
                .collect(Collectors.groupingBy(borrowRecord -> borrowRecord.getBook().getAuthor(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);

        if (mostReadAuthor == null) {
            return Optional.empty();
        }

        Book recommendedBook = user.getBorrowHistory().stream()
                .map(BorrowRecord::getBook)
                .filter(book -> book.getAuthor().equals(mostReadAuthor))
                .max(Comparator.comparingDouble(Book::getRating))
                .orElse(null);

        if (recommendedBook == null) {
            return Optional.empty();
        }

        return findNewBookByAuthor(mostReadAuthor);
    }

    private Optional<Book> findNewBookByAuthor(String author) {
        return Optional.empty();
    }

    public static Set<String> getUniqueAuthors(List<User> users) {
        return users.stream()
                .flatMap(user -> user.getBorrowHistory().stream())
                .map(record -> record.getBook().getAuthor())
                .collect(Collectors.toSet());
    }

    public static Optional<User> findTopReaderOfMonth(List<User> users, int month, int year) {
        return users.stream()
                .filter(user -> user.getBorrowHistory().stream()
                        .anyMatch(record -> record.getBorrowedDate().getMonthValue() == month
                                && record.getBorrowedDate().getYear() == year))
                .max(Comparator.comparingLong(user -> user.getBorrowHistory().stream()
                        .filter(record -> record.getBorrowedDate().getMonthValue() == month
                                && record.getBorrowedDate().getYear() == year)
                        .count()));
    }

}
