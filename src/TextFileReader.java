import java.io.*;
import java.util.ArrayList;

/**
 * Created by jenny on 7/12/2017.
 */
public class TextFileReader {

    public void updateCatalogue() {

        readFromCatalogue();

    }

    public ArrayList<Book> readFromCatalogue() {
        //public ArrayList<Book> readFromCatalogue() {
        ArrayList<Book> catalogue = new ArrayList<>();
        ArrayList<Book> categorized = new ArrayList<>();

        try {
            FileReader reader = new FileReader("catalogue.txt");
            BufferedReader buffReader = new BufferedReader(new FileReader("catalogue.txt"));

            String line = null;

            while ((line = buffReader.readLine()) != null) {

                String[] bookAttributes = line.split("   "); //FIXME: regex of choice

                catalogue.add(convertToBook(bookAttributes));

            }

            reader.close();
            buffReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return catalogue;
    }

    //Convert to 1 book at a time:
    private Book convertToBook(String[] bookAttributes) {

        Book book = new Book();
        book.setTitle(bookAttributes[0]);
        book.setAuthor(bookAttributes[1]);
        book.setDueDate(bookAttributes[2]);
        book.setBraille(bookAttributes[3]);
        book.setStatus(bookAttributes[4]);
        book.setGenre(bookAttributes[5]);

        return book;
    }


    public void writeToCatalogue(String userInput) {
        try {
            //If the test.txt file does not exist, FileWriter will create it
            FileWriter writer = new FileWriter("catalogue.txt", true);
            //BufferedWriter buffWriter = new BufferedWriter(writer);

            writer.write(userInput + " ");
            writer.write("\n");
            System.out.println();

            //To add a book:
            //writer.write("\n" + Validator.getString("Enter book title: "));
            //System.out.println("This book has been saved!\n");

            writer.close();
            //buffWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}