import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalUserInterface {
    int count = 0;
    public void initialise(){
        JFrame mainJFrame = new JFrame("Leitner");
        mainJFrame.setSize(new Dimension(940,540));
        mainJFrame.setResizable(false);
        mainJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel secondPanel = new JPanel();
        Container contentPane = mainJFrame.getContentPane();
        contentPane.setLayout(new GridLayout(2,1));
        contentPane.add(mainPanel);
        contentPane.add(secondPanel);

        JButton foo = new JButton("FOOOOOOOO");
        secondPanel.add(foo);
        JButton bar = new JButton("Help");
        secondPanel.add(bar);


        JLabel mainTitle = new JLabel("Shoebox 2.0");
        mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(mainTitle, BorderLayout.CENTER);

        JLabel testingLabel = new JLabel("Yet");
        secondPanel.add(testingLabel);

        foo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("YEEEEEET");
                testingLabel.setText(count+" counter");
                count++;
            }
        });

        bar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("yet");
                testingLabel.setText(count+" counter");
                count++;
            }
        });
        mainJFrame.setVisible(true);
    }
}
