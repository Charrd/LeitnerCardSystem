import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCardPanel extends SkeletonPanel {


    public AddCardPanel(GraphicalUserInterface gui) {
        super(gui);

    }


    protected JPanel getContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(new Color(14283517));

        //panels to organise the placing of elements
        JPanel cardPanel = new JPanel(new BorderLayout());
        JPanel title = new JPanel();
        JPanel inputMother = new JPanel(new GridLayout(4,1));
        JPanel question = new JPanel();
        JPanel questionInput = new JPanel(new BorderLayout());
        JPanel answer = new JPanel();
        JPanel answerInput = new JPanel(new BorderLayout());

        inputMother.add(question);
        inputMother.add(questionInput);
        inputMother.add(answer);
        inputMother.add(answerInput);
        cardPanel.add(title, BorderLayout.NORTH);
        cardPanel.add(inputMother, BorderLayout.CENTER);
        contentPanel.add(cardPanel, BorderLayout.CENTER);

        JLabel titleAddCard = new JLabel("Add a New Card");
        JTextField questionInputTextArea = new JTextField();
        JTextField answerInputTextArea = new JTextField();
        JTextArea questionTitle = new JTextArea("Question to be answered:");
        JTextArea answerTitle = new JTextArea("Answer:");

        titleAddCard.setFont(new Font(answerInputTextArea.getFont().getName(), Font.PLAIN, 50));
        answerInputTextArea.setFont(new Font(answerInputTextArea.getFont().getName(), Font.PLAIN, 30));
        questionInputTextArea.setFont(new Font(questionInputTextArea.getFont().getName(), Font.PLAIN, 30));
        answerTitle.setFont(new Font(answerTitle.getFont().getName(), Font.PLAIN, 40));
        questionTitle.setFont(new Font(questionTitle.getFont().getName(), Font.PLAIN, 40));
        answerTitle.setEditable(false);
        questionTitle.setEditable(false);

        title.add(titleAddCard);
        questionInput.add(questionInputTextArea, BorderLayout.CENTER);
        answerInput.add(answerInputTextArea, BorderLayout.CENTER);
        question.add(questionTitle, BorderLayout.CENTER);
        answer.add(answerTitle, BorderLayout.CENTER);

        JButton submitCardButton = new JButton("Submit New Card");

        submitCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String questionValue = questionInputTextArea.getText();
                String answerValue = answerInputTextArea.getText();
                int level = 1;
                Card newCard = new Card(questionValue, answerValue, level);
                Main.cardsList.add(newCard);
                System.out.println("Submit Card: Question: " + questionValue + " Answer: " + answerValue);

            }
        });

        cardPanel.add(submitCardButton, BorderLayout.SOUTH);

        return contentPanel;
    }
}
