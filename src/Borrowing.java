
import java.time.LocalDate;

public class Borrowing {

    public Book book;
    public Subscriber subscriber;
    public LocalDate now;

    public Borrowing(Book book, Subscriber subscriber, LocalDate now) {

    }

    public void setReturnDate(LocalDate now) {
        System.out.println(now);
    }
}
