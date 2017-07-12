import java.util.Date;

/**
 * Created by jenny on 7/12/2017.
 */

//Console program to search library catalog and reserve books
public class LibraryCatalogueApp {
    //FIXME: public static void main(String[] args) {
    {

        createCatalogue();

        CatalogueTextFile.readFromCatalogue();

    }

    private static void createCatalogue() {
        Date dueDate = new Date();

        Book book = new Book("Harry Potter", "JK Rowling", dueDate, false, Status.ON_SHELF, Genre.FICTION);

    }
}
