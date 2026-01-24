package Task6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "1925");
        Book book2 = new Book("Moby Dick", "Herman Melville", "Fiction", "1851");
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", "1951");
        Book book4 = new Book("1984", "George Orwell", "Dystopian", "1949");

        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);

        System.out.println("Başlığa görə sıralanmış kitablar:");
        library.sortBooks();
        library.displayAllBooks();
        System.out.println();

        System.out.println("Yazara görə sıralanmış kitablar:");
        library.sortBooksByAuthor();
        library.displayAllBooks();
        System.out.println();

        System.out.println("Nəşr ilinə görə sıralanmış kitablar:");
        library.sortByPublicationYear();
        library.displayAllBooks();
        System.out.println();

        System.out.println("Başlığa görə axtarış ('The Great Gatsby'):");
        List<Book> foundBooksByTitle = library.searchByTitle("The Great Gatsby");
        for (Book book : foundBooksByTitle) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("Yazara görə axtarış ('F. Scott Fitzgerald'):");
        List<Book> foundBooksByAuthor = library.searchByAuthor("F. Scott Fitzgerald");
        for (Book book : foundBooksByAuthor) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("Janra görə axtarış ('Fiction'):");
        List<Book> foundBooksByGenre = library.searchByGenre("Fiction");
        for (Book book : foundBooksByGenre) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("Kitabxanadakı ümumi kitab sayı: " + library.countBooks());

        library.removeBooks(book3);

        System.out.println("Kitablar silindikdən sonra:");
        library.displayAllBooks();
        System.out.println("Yeni kitab sayı: " + library.countBooks());
    }
}
