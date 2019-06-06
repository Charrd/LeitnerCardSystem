import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel {
    public HomePanel(GraphicalUserInterface gui) {
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel actionButtonPanel = new JPanel(new GridLayout(1,2));
        JPanel helpButtonSuperPanel = new JPanel(new BorderLayout());
        JPanel subButtonPanel = new JPanel(new GridLayout(2,1));

        //working with adding and layouts
        setLayout(new GridLayout(2,1));
        add(mainPanel);
        add(subButtonPanel);

        subButtonPanel.add(actionButtonPanel);
        subButtonPanel.add(helpButtonSuperPanel, BorderLayout.CENTER);

        //Buttons created and added to panels with borders
        mainPanel.setBackground(new Color(14283517));
        JButton addCardButton = new JButton("Add Card");
        JButton reviewButton = new JButton("Review");
        JButton helpButton = new JButton("Help");

        addCardButton.setBorder(gui.leftThickBorder);
        reviewButton.setBorder(gui.rightThickBorder);
        helpButton.setBorder(gui.thickBorder);

        addCardButton.setFont(new Font(addCardButton.getFont().getName(), Font.PLAIN, 40));
        reviewButton.setFont(new Font(reviewButton.getFont().getName(), Font.PLAIN, 40));
        helpButton.setFont(new Font(helpButton.getFont().getName(), Font.PLAIN, 30));

        addCardButton.setBackground(new Color(8703723));
        reviewButton.setBackground(new Color(8703723));
        helpButton.setBackground(new Color(8703723));

        actionButtonPanel.add(addCardButton, BorderLayout.CENTER);
        actionButtonPanel.add(reviewButton, BorderLayout.CENTER);
        helpButtonSuperPanel.add(helpButton, BorderLayout.CENTER);


        //Title
        JLabel mainTitle = new JLabel("Shoebox 2.0");
        mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        mainTitle.setFont(new Font(mainTitle.getFont().getName(), Font.PLAIN, 80));
        mainPanel.add(mainTitle, BorderLayout.CENTER);


        //button actions
        addCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("YEEEEEET");
                gui.setPanel(new AddCardPanel(gui));
            }
        });

        reviewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("yet");
                gui.setPanel(new ReviewPanel(gui));
            }
        });

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HELPPPPP PLEASE");
                gui.setPanel(new HelpPanel(gui));
            }
        });

    }
}
