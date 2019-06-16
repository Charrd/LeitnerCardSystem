import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReviewPanel extends SkeletonPanel {


    public ReviewPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    public ArrayList<Integer> currentReviewLevels = new ArrayList<>();
    public ArrayList<Card> currentReviewCards = new ArrayList<>();
    public int cardIndex;

    protected JPanel getContent() {
        //GUI setup
        JPanel contentPanel = new JPanel(new GridLayout(4,1));
        contentPanel.setBackground(new Color(14283517));
        JPanel questionTitle = new JPanel();
        JPanel questionContent = new JPanel();
        JPanel answerContent = new JPanel();
        JPanel buttonBar = new JPanel(new GridLayout(1,2));
        contentPanel.add(questionTitle);
        contentPanel.add(questionContent);
        contentPanel.add(answerContent);
        contentPanel.add(buttonBar);

        JButton next = new JButton("NEXT");
        JButton wrong = new JButton("NEEDS WORK");
        JButton right = new JButton("YAY I GOT IT RIGHT");

        next.setFont(new Font(next.getFont().getName(), Font.PLAIN, 30));
        right.setFont(new Font(right.getFont().getName(), Font.PLAIN, 30));
        wrong.setFont(new Font(wrong.getFont().getName(), Font.PLAIN, 30));

        JLabel questionLabel = new JLabel("QUESTION");
        questionLabel.setFont(new Font(questionLabel.getFont().getName(), Font.PLAIN, 50));
        questionTitle.add(questionLabel);

        //algorithms
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("next");
                next.setVisible(false);
                wrong.setVisible(true);
                right.setVisible(true);
                buttonBar.remove(next);
                buttonBar.add(wrong);
                buttonBar.add(right);
                JTextArea answerCardValue = new JTextArea(currentReviewCards.get(cardIndex).answer);
                answerCardValue.setFont(new Font(answerCardValue.getFont().getName(), Font.PLAIN, 30));
                answerCardValue.setEditable(false);
                answerContent.removeAll();
                answerContent.add(answerCardValue);
            }
        });

        wrong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("wrong");
                currentReviewCards.get(cardIndex).level = 1;
                cardIndex++;
                if (cardIndex < currentReviewCards.size()){
                    wrong.setVisible(false);
                    right.setVisible(false);
                    buttonBar.remove(wrong);
                    buttonBar.remove(right);
                    buttonBar.add(next);
                    next.setVisible(true);
                    answerContent.removeAll();
                    questionContent.removeAll();
                }
                else{
                    JTextArea errorNoCards = new JTextArea("No more cards to review :)");
                    errorNoCards.setFont(new Font(errorNoCards.getFont().getName(), Font.PLAIN, 70));
                    errorNoCards.setEditable(false);
                    questionTitle.setVisible(false);
                    answerContent.setVisible(false);
                    buttonBar.setVisible(false);
                    questionContent.removeAll();
                    questionContent.add(errorNoCards);

                }
            }
        });

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("right");
                currentReviewCards.get(cardIndex).level++;
                cardIndex++;
                if (cardIndex < currentReviewCards.size()){
                    wrong.setVisible(false);
                    right.setVisible(false);
                    buttonBar.remove(wrong);
                    buttonBar.remove(right);
                    buttonBar.add(next);
                    next.setVisible(true);
                    answerContent.removeAll();
                    questionContent.removeAll();
                }
                else{
                    JTextArea errorNoCards = new JTextArea("No more cards to review :)");
                    errorNoCards.setFont(new Font(errorNoCards.getFont().getName(), Font.PLAIN, 70));
                    errorNoCards.setEditable(false);
                    questionTitle.setVisible(false);
                    answerContent.setVisible(false);
                    buttonBar.setVisible(false);
                    questionContent.removeAll();
                    questionContent.add(errorNoCards);
                }
            }
        });



        //sets up the review and gets cards to review
        buttonBar.add(next);
        questionTitle.setVisible(false);
        answerContent.setVisible(false);
        buttonBar.setVisible(false);

        JButton startReview = new JButton("START REVIEW");
        startReview.setFont(new Font(startReview.getFont().getName(), Font.PLAIN, 80));

        questionContent.add(startReview);

        startReview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BEGIN");
                currentReviewLevels = SessionSetup.findLevels();
                currentReviewCards = SessionSetup.cardsToReview(currentReviewLevels);
                System.out.println(currentReviewCards);
                if (currentReviewCards.size() != 0) {
                    questionTitle.setVisible(true);
                    answerContent.setVisible(true);
                    buttonBar.setVisible(true);
                    startReview.setVisible(false);
                    questionContent.remove(startReview);
                    JTextArea questionCardValue = new JTextArea(currentReviewCards.get(0).question);
                    questionCardValue.setFont(new Font(questionCardValue.getFont().getName(), Font.PLAIN, 30));
                    questionCardValue.setEditable(false);
                    cardIndex = 0;
                    questionContent.add(questionCardValue);
                }
                else{
                    startReview.setVisible(false);
                    questionContent.remove(startReview);
                    JTextArea errorNoCards = new JTextArea("No cards to review :)");
                    errorNoCards.setFont(new Font(errorNoCards.getFont().getName(), Font.PLAIN, 80));
                    errorNoCards.setEditable(false);
                    questionContent.add(errorNoCards);
                }
            }
        });

        return contentPanel;
    }
}
