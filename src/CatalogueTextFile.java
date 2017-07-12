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
            FileReader reader = new FileReader("countries.txt");
            BufferedReader buffReader = new BufferedReader(new FileReader("countries.txt"));

            String line = null;

            System.out.println();
            while ((line = buffReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    System.out.println(line);
                }
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
            writer.write("\n" + Validator.getString("Enter country: "));
            System.out.println("This country has been saved!\n");

            writer.close();
            //buffWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}