package Task6;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.author.compareTo(book2.author);
    }
}
