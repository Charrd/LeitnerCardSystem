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

        String sizeOfLists = "" + UserData.cardsList.size();
        String numberOfReviews = "" + UserData.counterOfReviews;

        properties.setProperty("numberOfRecords", sizeOfLists);
        properties.setProperty("numberOfReviews", numberOfReviews);

        try {
            properties.store(new FileWriter("cardStorage.txt"), "Cards");
        } catch (IOException e) {

        }


    }

    public static void read() {
        List<Card> loadedCardsList = new ArrayList<>();
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("cardStorage.txt"));
        } catch (IOException e) {
        }
        String StringnumberOfRecords = properties.getProperty("numberOfRecords");
        String StringnumberOfReviews = properties.getProperty("numberOfReviews");
        int numberOfRecords = Integer.parseInt(StringnumberOfRecords);



        //get cards

        UserData.cardsList = loadedCardsList;
        UserData.counterOfReviews = Integer.parseInt(StringnumberOfReviews);

    }

}
