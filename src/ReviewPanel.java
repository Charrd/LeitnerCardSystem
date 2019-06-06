import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReviewPanel extends SkeletonPanel {


    public ReviewPanel(GraphicalUserInterface gui) {
        super(gui);

    }

    protected JPanel getContent() {
        JPanel contentPanel = new JPanel(new BorderLayout());
        JLabel test = new JLabel("YEEEEEEEEEEEEEEEEEEEEEEET");
        test.setFont(new Font(test.getFont().getName(), Font.PLAIN, 100));
        contentPanel.add(test);
        return contentPanel;
    }
}
