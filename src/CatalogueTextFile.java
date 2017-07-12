import java.io.*;

/**
 * Created by jenny on 7/12/2017.
 */
public class CatalogueTextFile {

    public static void updateCatalogue() {

        readFromCatalogue();

        writeToCatalogue();
    }


    public static void readFromCatalogue() {
        try {
            FileReader reader = new FileReader("catalogue.txt");
            BufferedReader buffReader = new BufferedReader(new FileReader("catalogue.txt"));

            String line = null;
            int numOfBooks = 12; //FIXME: Update with number of books
            int numOfAttributes = 10; //FIXME: Update with number of books
            String[][] bookArray = new String[numOfBooks][numOfAttributes];
            int catalogueNum = 0;

            System.out.println();
            while ((line = buffReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] bookAttributes = line.split("   "); //FIXME: regex of choice

                    for (int i = 0; i < bookAttributes.length; i++) {
                        bookArray[catalogueNum][i] = bookAttributes[i];
                        System.out.print(bookArray[catalogueNum][i] + " ");
                    }

                }
                catalogueNum++;
                System.out.println();
            }
            System.out.println();

            reader.close();
            buffReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToCatalogue() {
        try {
            //If the test.txt file does not exist, FileWriter will create it
            FileWriter writer = new FileWriter("catalogue.txt", true);
            //BufferedWriter buffWriter = new BufferedWriter(writer);

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