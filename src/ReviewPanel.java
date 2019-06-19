import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReviewPanel extends SkeletonPanel {


    private ArrayList<Integer> currentReviewLevels = new ArrayList<>();
    private ArrayList<Card> currentReviewCards = new ArrayList<>();
    private int cardIndex;
    private JButton next;
    private JButton wrong;
    private JButton right;
    private JLabel questionLabel;
    private JPanel questionTitle;
    private JPanel contentPanel;
    private JPanel questionContent;
    private JPanel answerContent;
    private JPanel buttonBar;
    private JButton startReview;


    public ReviewPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    protected JPanel getContent() {
        //GUI setup
        contentPanel = new JPanel(new GridLayout(4,1));
        questionTitle = new JPanel();
        questionContent = new JPanel();
        answerContent = new JPanel();
        buttonBar = new JPanel(new GridLayout(1,2));
        contentPanel.add(questionTitle);
        contentPanel.add(questionContent);
        contentPanel.add(answerContent);
        contentPanel.add(buttonBar);

        contentPanel.setBackground(new Color(14283517));
        questionContent.setBackground(new Color(14283517));
        questionTitle.setBackground(new Color(14283517));
        answerContent.setBackground(new Color(14283517));

        next = new JButton("Next");
        wrong = new JButton("Needs work");
        right = new JButton("Yay I got it right!");

        next.setBackground(new Color(8703723));
        wrong.setBackground(new Color(8703723));
        right.setBackground(new Color(8703723));

        next.setFont(new Font(next.getFont().getName(), Font.PLAIN, 30));
        right.setFont(new Font(right.getFont().getName(), Font.PLAIN, 30));
        wrong.setFont(new Font(wrong.getFont().getName(), Font.PLAIN, 30));

        questionLabel = new JLabel("Question");
        questionLabel.setFont(new Font(questionLabel.getFont().getName(), Font.PLAIN, 50));
        questionTitle.add(questionLabel);


        buttonBar.add(next);
        questionTitle.setVisible(false);
        answerContent.setVisible(false);
        buttonBar.setVisible(false);

        startReview = new JButton("Start Review");
        startReview.setFont(new Font(startReview.getFont().getName(), Font.PLAIN, 80));

        questionContent.add(startReview);

        //button reveals answer and removes itself to create the wrong and right buttons
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                next.setVisible(false);
                wrong.setVisible(true);
                right.setVisible(true);
                buttonBar.remove(next);
                buttonBar.add(wrong);
                buttonBar.add(right);
                JTextArea answerCardValue = new JTextArea(currentReviewCards.get(cardIndex).answer);
                answerCardValue.setFont(new Font(answerCardValue.getFont().getName(), Font.PLAIN, 30));
                answerCardValue.setBackground(new Color(14283517));
                answerCardValue.setEditable(false);
                answerContent.add(answerCardValue);
            }
        });

        //changes level of card to 1, shows next card's question
        wrong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentReviewCards.get(cardIndex).level = 1;
                displayNextCard();
            }
        });

        //moves card's level up and shows next card's question
        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentReviewCards.get(cardIndex).level++;
                displayNextCard();
            }
        });



        //sets up the review and gets cards to review
        startReview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardIndex = 0;
                currentReviewLevels = ReviewSessionSetup.findLevels();
                currentReviewCards = ReviewSessionSetup.cardsToReview(currentReviewLevels);
                if (currentReviewCards.size() != 0) {
                    questionTitle.setVisible(true);
                    answerContent.setVisible(true);
                    buttonBar.setVisible(true);
                    startReview.setVisible(false);
                    questionContent.remove(startReview);
                    JTextArea questionCardValue = new JTextArea(currentReviewCards.get(0).question);
                    questionCardValue.setFont(new Font(questionCardValue.getFont().getName(), Font.PLAIN, 30));
                    questionCardValue.setEditable(false);
                    questionCardValue.setBackground(new Color(14283517));
                    cardIndex = 0;
                    questionContent.add(questionCardValue);
                }
                else{
                    startReview.setVisible(false);
                    questionContent.remove(startReview);
                    JTextArea errorNoCards = new JTextArea("No cards to review!");
                    errorNoCards.setFont(new Font(errorNoCards.getFont().getName(), Font.PLAIN, 80));
                    errorNoCards.setEditable(false);
                    errorNoCards.setBackground(new Color(14283517));
                    questionContent.add(errorNoCards);
                }
            }
        });

        return contentPanel;
    }


    //checks que if there are more cards, displays it's question
    protected void displayNextCard() {
        cardIndex++;
        if (cardIndex < currentReviewCards.size()) {
            wrong.setVisible(false);
            right.setVisible(false);
            buttonBar.remove(wrong);
            buttonBar.remove(right);
            buttonBar.add(next);
            next.setVisible(true);
            answerContent.removeAll();
            questionContent.removeAll();
            answerContent.repaint();
            questionContent.repaint();
            JTextArea questionCardValue = new JTextArea(currentReviewCards.get(cardIndex).question);
            questionCardValue.setFont(new Font(questionCardValue.getFont().getName(), Font.PLAIN, 30));
            questionCardValue.setEditable(false);
            questionCardValue.setBackground(new Color(14283517));
            questionContent.add(questionCardValue);
        } else {
            JTextArea errorNoCards = new JTextArea("No more cards to review!");
            errorNoCards.setFont(new Font(errorNoCards.getFont().getName(), Font.PLAIN, 80));
            errorNoCards.setEditable(false);
            questionTitle.setVisible(false);
            answerContent.setVisible(false);
            buttonBar.setVisible(false);
            questionContent.removeAll();
            answerContent.removeAll();
            errorNoCards.setBackground(new Color(14283517));
            questionContent.add(errorNoCards);
        }
    }
}
