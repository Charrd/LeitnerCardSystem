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
        JLabel title = new JLabel("DABDABDAB");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        JTextArea contentParagraph = new JTextArea("This is how you use it. You fhdsfda                                  gjhshkjdl                                       then fdsafjdasfldas              ");
        contentParagraph.setFont(new Font(contentParagraph.getFont().getName(), Font.PLAIN, 20));
        contentParagraph.setLineWrap(true);
        helpInfoPanel.add(title, BorderLayout.NORTH);
        helpInfoPanel.add(contentParagraph, BorderLayout.CENTER);
        contentPanel.setBackground(new Color(14283517));
        helpInfoPanel.setBackground(new Color(14283517));
        contentParagraph.setBackground(new Color(14283517));
        return contentPanel;
    }
}






