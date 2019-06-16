import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RecordFunctions {

    public static void write() {
        Properties properties = new Properties();

        String sizeOfLists = "" + UserData.cardsList.size();
        String numberOfReviews = "" + UserData.counterOfReviews;

        // put cards into properties
        for (int i=0; i<UserData.cardsList.size(); i++) {
            Card card = UserData.cardsList.get(i);
            properties.setProperty(i+"question", card.question);
            properties.setProperty(i+"answer", card.answer);
            properties.setProperty(i+"level", ""+card.level);
        }


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
        String StringNumberOfRecords = properties.getProperty("numberOfRecords");
        String StringNumberOfReviews = properties.getProperty("numberOfReviews");
        int numberOfRecords = Integer.parseInt(StringNumberOfRecords);

        //get cards note that the level is a String
        for (int i=0; i<numberOfRecords; i++) {
            String question = properties.getProperty(i+"question");
            String answer = properties.getProperty(i+"answer");
            int level = Integer.parseInt(properties.getProperty(i+"level"));
            Card card = new Card(question, answer, level);
            loadedCardsList.add(card);
        }

        UserData.cardsList = loadedCardsList;
        UserData.counterOfReviews = Integer.parseInt(StringNumberOfReviews);

    }

}
