import java.util.Date;
import java.util.HashMap;

/**
 * Created by jenny on 7/12/2017.
 */

//Console program to search library catalog and reserve books
public class LibraryCatalogueAppMain {

    private static Validator Validator = new Validator();

    public static void main(String[] args) {

        intro();

        createCatalogue();


    }

    public static void intro() {
        System.out.println("Welcome to the Barely Books Library Terminal:");

        menuLoop();

        System.out.println("\nGoodbye. Thank you for visiting Barely Books!");
    }

    public static void menuLoop() {

        int menuSelection;

        HashMap<Integer, String> menu = new HashMap<>();

        menu.put(1, "See the complete Barely Books Library catalogue");
        menu.put(2, "Search for a book");
        menu.put(3, "Checkout a book");
        menu.put(4, "Add a book"); //FIXME: Only Library Personnel?
        menu.put(5, "Exit");

        do {
            for (HashMap.Entry<Integer, String> option : menu.entrySet()) {
                System.out.printf("%d - %s\n", option.getKey(), option.getValue());
            }

            menuSelection = menuSelection();

            if (menuSelection == 1) {
                CatalogueTextFile.readFromCatalogue(); //Display entire list of books
            } else if (menuSelection == 2) {
                //FIXMEsearchFromCatalogue();                 //Seach for a book
            } else if (menuSelection == 3) {
                //FIXMEcheckoutFromCatalogue();               //Checkout a book
            } else if (menuSelection == 4) {
                CatalogueTextFile.writeToCatalogue();  //Add a book
            } else if (menuSelection == 3) {
                //FIXMECountriesTextFile.deleteFromFile();    //
            }

        } while (menuSelection != 4);

    }

    public static int menuSelection() {
        int menuSelection;

        menuSelection = Validator.getInt("\nEnter menu number: ", "Please enter a valid menu number: ", 1, 4);

        return menuSelection;
    }

    private static void createCatalogue() {
        Date dueDate = new Date();

        Book book = new Book("Harry Potter", "JK Rowling", dueDate, false, Status.ON_SHELF, Genre.FICTION);

    }
}
