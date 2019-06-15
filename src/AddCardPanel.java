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

        JLabel test = new JLabel("FOO");
        JTextField contentParagraph = new JTextField();
        contentParagraph.setBorder(BorderFactory.createMatteBorder(10,10,10,10, Color.BLACK));


        title.add(test, BorderLayout.WEST);
        answer.add(contentParagraph, BorderLayout.CENTER);

        return contentPanel;
    }
}
