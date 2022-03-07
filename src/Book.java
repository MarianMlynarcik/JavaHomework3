
public class Book {
    public String nameOfTheBook;
    public String author;
    public int numOfPages;

    public Book(String nameOfTheBook, String author, int numOfPages) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.numOfPages = numOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Book) {
            Book b = (Book) o;
            return b.nameOfTheBook.equals(this.nameOfTheBook) &&
                    b.author.equals(this.author) &&
                    b.numOfPages == (this.numOfPages);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return numOfPages;
    }

    @Override
    public String toString() {
        return this.nameOfTheBook + " " + this.author + " " + this.numOfPages;
    }
}
