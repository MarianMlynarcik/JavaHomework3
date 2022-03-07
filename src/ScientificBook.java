
public class ScientificBook extends Book {

    public String scientificArea;

    public ScientificBook(String nameOfTheBook, String author, int numOfPages, String scientificArea) {
        super( nameOfTheBook, author, numOfPages);
        this.scientificArea = scientificArea;
    }

    @Override
    public String toString() {
        return this.nameOfTheBook + " " + this.author + " " + this.numOfPages + " " + this.scientificArea;
    }
}
