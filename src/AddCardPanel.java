import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCardPanel extends SkeletonPanel {


    private JPanel cardPanel;
    private JPanel title;
    private JPanel inputMother;
    private JPanel question;
    private JPanel questionInput;
    private JPanel answer;
    private JPanel answerInput;
    private JLabel titleAddCard;
    private JTextField questionInputTextArea;
    private JTextField answerInputTextArea;
    private JTextArea questionTitle;
    private JTextArea answerTitle;
    private JButton submitCardButton;

    public AddCardPanel(GraphicalUserInterface gui) {
        super(gui);
    }

    protected JPanel getContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(new Color(14283517));

        //panels to organise the placing of elements
        cardPanel = new JPanel(new BorderLayout());
        title = new JPanel();
        inputMother = new JPanel(new GridLayout(4,1));
        question = new JPanel();
        questionInput = new JPanel(new BorderLayout());
        answer = new JPanel();
        answerInput = new JPanel(new BorderLayout());

        cardPanel.setBackground(new Color(14283517));
        title.setBackground(new Color(14283517));
        inputMother.setBackground(new Color(14283517));
        question.setBackground(new Color(14283517));
        questionInput.setBackground(new Color(14283517));
        answer.setBackground(new Color(14283517));
        answerInput.setBackground(new Color(14283517));

        inputMother.add(question);
        inputMother.add(questionInput);
        inputMother.add(answer);
        inputMother.add(answerInput);
        cardPanel.add(title, BorderLayout.NORTH);
        cardPanel.add(inputMother, BorderLayout.CENTER);
        contentPanel.add(cardPanel, BorderLayout.CENTER);

        titleAddCard = new JLabel("Add a New Card");
        questionInputTextArea = new JTextField();
        answerInputTextArea = new JTextField();
        questionTitle = new JTextArea("Question to be answered:");
        answerTitle = new JTextArea("Answer:");

        questionTitle.setBackground(new Color(14283517));
        answerTitle.setBackground(new Color(14283517));

        titleAddCard.setFont(new Font(answerInputTextArea.getFont().getName(), Font.PLAIN, 50));
        answerInputTextArea.setFont(new Font(answerInputTextArea.getFont().getName(), Font.PLAIN, 20));
        questionInputTextArea.setFont(new Font(questionInputTextArea.getFont().getName(), Font.PLAIN, 20));
        answerTitle.setFont(new Font(answerTitle.getFont().getName(), Font.PLAIN, 30));
        questionTitle.setFont(new Font(questionTitle.getFont().getName(), Font.PLAIN, 30));
        answerTitle.setEditable(false);
        questionTitle.setEditable(false);

        title.add(titleAddCard);
        questionInput.add(questionInputTextArea, BorderLayout.CENTER);
        answerInput.add(answerInputTextArea, BorderLayout.CENTER);
        question.add(questionTitle, BorderLayout.CENTER);
        answer.add(answerTitle, BorderLayout.CENTER);

        submitCardButton = new JButton("Submit New Card");
        submitCardButton.setFont(new Font(submitCardButton.getFont().getName(), Font.PLAIN, 30));
        submitCardButton.setBackground(new Color(8703723));
        cardPanel.add(submitCardButton, BorderLayout.SOUTH);

        //button for adding card into array of cards
        submitCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String questionValue = questionInputTextArea.getText();
                String answerValue = answerInputTextArea.getText();
                int level = 1;
                Card newCard = new Card(questionValue, answerValue, level);
                UserData.cardsList.add(newCard);
                questionInputTextArea.setText("");
                answerInputTextArea.setText("");
            }
        });

        return contentPanel;
    }
}
