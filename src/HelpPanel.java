import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpPanel extends SkeletonPanel {


    public HelpPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    protected JPanel getContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        JPanel helpInfoPanel = new JPanel(new BorderLayout());
        contentPanel.add(helpInfoPanel);
        JLabel title = new JLabel("Help for Shoebox 2.0");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        JTextArea contentParagraph = new JTextArea("Shoebox 2.0 is a memory program designed to help you remember flash      cards better. Add cards by clicking the 'Add Card' button and typing in your   question and answer. These will be stored and you can review them in        sessions by clicking the 'Review' button.                                                                                                                                                                                   In review sessions you are shown the questions from cards that need the   most work. Once you have read the question and think you know the            answer, click next and you will be shown the answer. If you got it right click  the button saying 'Yay I got it right!' otherwise click the button that says         'needs work'. Each session cycles through a couple of cards and then         presents a message that you have finished.                                                                                                                                                                             To return from any page to home click the back button, but make sure you   don't lose anything unfinished or it will be discarded.");
        contentParagraph.setEditable(false);
        contentParagraph.setFont(new Font(contentParagraph.getFont().getName(), Font.PLAIN, 25));
        contentParagraph.setLineWrap(true);
        contentParagraph.setBorder(BorderFactory.createMatteBorder(10, 40, 10, 40, new Color(14283517)));
        title.setBorder(BorderFactory.createMatteBorder(5, 40, 0, 40, new Color(14283517)));
        helpInfoPanel.add(title, BorderLayout.NORTH);
        helpInfoPanel.add(contentParagraph, BorderLayout.CENTER);
        contentPanel.setBackground(new Color(14283517));
        helpInfoPanel.setBackground(new Color(14283517));
        contentParagraph.setBackground(new Color(14283517));
        return contentPanel;
    }
}






