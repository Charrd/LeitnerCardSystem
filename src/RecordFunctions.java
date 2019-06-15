import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RecordFunctions {

    public static void write() {
        Properties properties = new Properties();
        // put cards into properties

        String sizeOfLists = "" + Main.cardsList.size();

        properties.setProperty("numberOfRecords", sizeOfLists);
        try {
            properties.store(new FileWriter("cardStorage.txt"), "Cards");
        } catch (IOException e) {

        }


    }

    public static List<Card> read() {
        List<Card> loadedCardsList = new ArrayList<>();
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("cardStorage.txt"));
        } catch (IOException e) {
        }
        String StringnumberOfRecords = properties.getProperty("numberOfRecords");
        int numberOfRecords = Integer.parseInt(StringnumberOfRecords);
        System.out.println(numberOfRecords);
        //get cards
        return loadedCardsList;
    }

}
