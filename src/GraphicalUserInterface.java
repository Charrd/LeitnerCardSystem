import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class GraphicalUserInterface {

    public JFrame mainJFrame = new JFrame("Shoebox 2.0 by Trinity");

    public void initialiseMain(){
        //makes the window that opens, un-resizable, terminates program on close
        mainJFrame.setSize(new Dimension(940,640));
        mainJFrame.setResizable(false);
        mainJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //panel creation
        Container mainContentPane = mainJFrame.getContentPane();
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel actionButtonPanel = new JPanel(new GridLayout(1,2));
        JPanel helpButtonSuperPanel = new JPanel(new BorderLayout());
        JPanel subButtonPanel = new JPanel(new GridLayout(2,1));


        //working with adding and layouts
        mainContentPane.setLayout(new GridLayout(2,1));
        mainContentPane.add(mainPanel);
        mainContentPane.add(subButtonPanel);
        subButtonPanel.add(actionButtonPanel);
        subButtonPanel.add(helpButtonSuperPanel, BorderLayout.CENTER);

        //Buttons created and added to panels with borders

        Border leftThickBorder = BorderFactory.createMatteBorder(40, 130, 3, 40, new Color(14283517));
        Border rightThickBorder = BorderFactory.createMatteBorder(40, 40, 3, 130, new Color(14283517));
        Border thickBorder = BorderFactory.createMatteBorder(60, 400, 20, 400, new Color(14283517));
        mainPanel.setBackground(new Color(14283517));

        JButton addCardButton = new JButton("Add Card");
        JButton reviewButton = new JButton("Review");
        JButton helpButton = new JButton("Help");

        addCardButton.setBorder(leftThickBorder);
        reviewButton.setBorder(rightThickBorder);
        helpButton.setBorder(thickBorder);

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


        //button actions place holders for now
        addCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("YEEEEEET");
                System.out.println("HELPPPPP PLEASE");
                mainContentPane.removeAll();
                mainContentPane.repaint();

                JPanel content = new JPanel(new BorderLayout());
                JPanel backPanel = new JPanel(new BorderLayout());
                mainContentPane.add(content);
                mainContentPane.add(backPanel);

                JLabel testtitle = new JLabel("Shoebox 2.0");
                testtitle.setHorizontalAlignment(SwingConstants.CENTER);
                testtitle.setFont(new Font(testtitle.getFont().getName(), Font.PLAIN, 250));

                JButton backButton = new JButton("Back");
                backButton.setBorder(thickBorder);
                content.add(testtitle, BorderLayout.CENTER);
                backPanel.add(backButton, BorderLayout.CENTER);

                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("NOOO GO BACK");
                        mainContentPane.removeAll();
                        mainContentPane.repaint();
                        initialiseMain();
                    }
                });
                mainContentPane.repaint();
                mainJFrame.setVisible(true);

            }
        });

        reviewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("yet");
                System.out.println("HELPPPPP PLEASE");
                mainContentPane.removeAll();
                mainContentPane.repaint();

                JPanel content = new JPanel(new BorderLayout());
                JPanel backPanel = new JPanel(new BorderLayout());
                mainContentPane.add(content);
                mainContentPane.add(backPanel);

                JButton backButton = new JButton("Back");
                backButton.setBorder(thickBorder);
                backPanel.add(backButton, BorderLayout.CENTER);

                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("NOOO GO BACK");
                        mainContentPane.removeAll();
                        mainContentPane.repaint();
                        initialiseMain();
                    }
                });
                mainContentPane.repaint();
                mainJFrame.setVisible(true);

            }
        });

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HELPPPPP PLEASE");
                mainContentPane.removeAll();
                mainContentPane.repaint();

                JPanel content = new JPanel(new BorderLayout());
                JPanel backPanel = new JPanel(new BorderLayout());
                mainContentPane.add(content);
                mainContentPane.add(backPanel);

                JButton backButton = new JButton("Back");
                backButton.setBorder(thickBorder);
                backPanel.add(backButton, BorderLayout.CENTER);

                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("NOOO GO BACK");
                        mainContentPane.removeAll();
                        mainContentPane.repaint();
                        initialiseMain();
                    }
                });
                mainContentPane.repaint();
                mainJFrame.setVisible(true);

            }
        });

        mainJFrame.setVisible(true);
    }
}
