import javax.swing.*;
import java.awt.*;

public class AddCardPanel extends SkeletonPanel {


    public AddCardPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    protected JPanel getContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(new Color(14283517));

        JPanel cardPanel = new JPanel(new BorderLayout());
        JPanel title = new JPanel();

        JPanel inputMother = new JPanel(new GridLayout(4,1));
        JPanel question = new JPanel();
        JPanel questionInput = new JPanel();
        JPanel answer = new JPanel();
        JPanel answerInput = new JPanel();

        inputMother.add(question);
        inputMother.add(questionInput);
        inputMother.add(answer);
        inputMother.add(answerInput);

        cardPanel.add(title, BorderLayout.NORTH);
        cardPanel.add(inputMother, BorderLayout.CENTER);

        contentPanel.add(cardPanel, BorderLayout.CENTER);

        JLabel test = new JLabel("FOO");
        JTextArea answerInputTextArea = new JTextArea("a");
        JTextArea questionInputTextArea = new JTextArea("a");
        JTextArea answerTitle = new JTextArea("Question to be answered:");
        JTextArea questionTitle = new JTextArea("Answer:");
        answerInputTextArea.setFont(new Font(answerInputTextArea.getFont().getName(), Font.PLAIN, 30));
        questionInputTextArea.setFont(new Font(questionInputTextArea.getFont().getName(), Font.PLAIN, 30));
        answerTitle.setFont(new Font(answerTitle.getFont().getName(), Font.PLAIN, 40));
        questionTitle.setFont(new Font(questionTitle.getFont().getName(), Font.PLAIN, 40));
        answerTitle.setEditable(false);
        questionTitle.setEditable(false);

        title.add(test);
        questionInput.add(questionInputTextArea, BorderLayout.CENTER);
        answerInput.add(answerInputTextArea, BorderLayout.CENTER);
        question.add(questionTitle, BorderLayout.CENTER);
        answer.add(answerTitle, BorderLayout.CENTER);

        JButton submitCardButton = new JButton();

        cardPanel.add(submitCardButton, BorderLayout.SOUTH);

        return contentPanel;
    }
}
