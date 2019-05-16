import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalUserInterface {
    int count = 0;
    public void initialise(){
        //makes the window that opens, un-resizable, terminates program on close
        JFrame mainJFrame = new JFrame("Shoebox 2.0 by Trinity");
        mainJFrame.setSize(new Dimension(940,540));
        mainJFrame.setResizable(false);
        mainJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //panel creation
        Container mainContentPane = mainJFrame.getContentPane();
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        JPanel helpPanel = new JPanel(new BorderLayout());
        JPanel subButtonPanel = new JPanel(new GridLayout(2,1));


        //working with adding and layouts
        mainContentPane.setLayout(new GridLayout(2,1));
        mainContentPane.add(mainPanel);
        mainContentPane.add(subButtonPanel);
        subButtonPanel.add(buttonPanel);
        subButtonPanel.add(helpPanel);

        //Buttons created and added to panels
        JButton addCardButton = new JButton("Add Card");
        buttonPanel.add(addCardButton);
        JButton reviewButton = new JButton("Review");
        buttonPanel.add(reviewButton);
        JButton helpButton = new JButton("Help");
        helpPanel.add(helpButton);


        //Title
        JLabel mainTitle = new JLabel("Shoebox 2.0");
        mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        mainTitle.setFont(new Font(mainTitle.getFont().getName(), Font.PLAIN, 80));
        mainPanel.add(mainTitle, BorderLayout.CENTER);

//        JLabel testingLabel = new JLabel("Yet");
//        secondPanel.add(testingLabel);

        //button actions place holders for now
        addCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("YEEEEEET");
            }
        });

        reviewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("yet");
//                testingLabel.setText(count+" counter");
                count++;
            }
        });


        mainJFrame.setVisible(true);
    }
}
