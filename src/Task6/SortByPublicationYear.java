package Task6;

import java.util.Comparator;

public class SortByPublicationYear implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.publicationYear.compareTo(book2.publicationYear);
    }
}
