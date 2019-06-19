import java.lang.reflect.Array;
import java.util.ArrayList;

public class SessionSetup {

    public static int reviewSpacingLTwo = 2;
    public static int reviewSpacingLThree = 4;
    public static int reviewSpacingLFour = 8;
    public static int reviewSpacingLFive = 16;
    public static int reviewSpacingLSix = 32;
    public static int reviewSpacingLSeven = 64;

    public static ArrayList<Integer> findLevels() {
        int counter = UserData.counterOfReviews;
        ArrayList<Integer> currentReviewLevels = new ArrayList<>();
        currentReviewLevels.add(1);
        if ((counter+1)%reviewSpacingLTwo == 0) {
            currentReviewLevels.add(2);
        }
        if ((counter+2)%reviewSpacingLThree == 0) {
            currentReviewLevels.add(3);
        }
        if ((counter+3)%reviewSpacingLFour == 0) {
            currentReviewLevels.add(4);
        }
        if ((counter+4)%reviewSpacingLFive == 0) {
            currentReviewLevels.add(5);
        }
        if ((counter+7)%reviewSpacingLSix == 0) {
            currentReviewLevels.add(6);
        }
        if ((counter+8)%reviewSpacingLSeven == 0) {
            currentReviewLevels.add(7);
        }
        System.out.println(counter + "" + currentReviewLevels);
        UserData.counterOfReviews++;
        return currentReviewLevels;
    }

    public static ArrayList<Card> cardsToReview(ArrayList<Integer> currentReviewLevels) {

        ArrayList<Card> cardsToReview = new ArrayList<>();

        for (int i=0; i<currentReviewLevels.size(); i++){
            int targetLevel = currentReviewLevels.get(i);
            for (int j=0; j<UserData.cardsList.size(); j++){
                if (UserData.cardsList.get(j).level == targetLevel) {
                    cardsToReview.add(UserData.cardsList.get(j));
                }
            }
        }

        return cardsToReview;
    }

}
