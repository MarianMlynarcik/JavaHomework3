
public class ForeignBook extends Book{

    public String language;

    public ForeignBook(String nameOfTheBook, String author, int numOfPages) {
        super( nameOfTheBook, author, numOfPages);
        this.language = "English";
    }

    public ForeignBook(String nameOfTheBook, String author, int numOfPages, String language) {
        super( nameOfTheBook, author, numOfPages);
        this.language = language;
    }

    @Override
    public String toString() {
        return this.nameOfTheBook + " " + this.author + " " + this.numOfPages + " " + this.language;
    }
}
