import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ReviewPanel extends SkeletonPanel {


    public ReviewPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    protected JPanel getContent() {
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
            }
        });

        wrong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("wrong");
                wrong.setVisible(false);
                right.setVisible(false);
                buttonBar.remove(right);
                buttonBar.remove(wrong);
                buttonBar.add(next);
                next.setVisible(true);

            }
        });

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("right");
                wrong.setVisible(false);
                right.setVisible(false);
                buttonBar.remove(wrong);
                buttonBar.remove(right);
                buttonBar.add(next);
                next.setVisible(true);
            }
        });

        questionTitle.add(questionLabel);
        buttonBar.add(next);

        questionTitle.setVisible(false);
        answerContent.setVisible(false);
        buttonBar.setVisible(false);


        JButton startReview = new JButton("START REVIEW");
        startReview.setFont(new Font(wrong.getFont().getName(), Font.PLAIN, 90));

        questionContent.add(startReview);

        startReview.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BEGIN");
                ArrayList<Integer> currentReviewLevels = SessionSetup.findLevels();
                ArrayList<Card> currentReviewCards = SessionSetup.cardsToReview(currentReviewLevels);
                System.out.println(currentReviewCards);
                questionTitle.setVisible(true);
                answerContent.setVisible(true);
                buttonBar.setVisible(true);
                startReview.setVisible(false);
                questionContent.remove(startReview);
            }
        });


        return contentPanel;
    }
}
