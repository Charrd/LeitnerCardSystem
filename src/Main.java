import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Card> cardsList = new ArrayList<>();

    public static void main(String[] args) {
        cardsList = RecordFunctions.read();

        System.out.println("Opening....");
        GraphicalUserInterface gui = new GraphicalUserInterface();
    }
}
