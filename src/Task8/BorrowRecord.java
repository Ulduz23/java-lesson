package Task8;

import java.time.LocalDate;

public class BorrowRecord {
    private Book book;
    private LocalDate borrowedDate;;
    private LocalDate returnedDate;;

    public BorrowRecord(Book book, LocalDate borrowedDate, LocalDate returnedDate) {
        this.book = book;
        this.borrowedDate = borrowedDate;
        this.returnedDate = returnedDate;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }
    
    @Override
    public String toString() {
        return "BorrowRecord{" +
                "book=" + book +
                ", borrowedDate=" + borrowedDate +
                ", returnedDate=" + returnedDate +
                '}';
    }


}
