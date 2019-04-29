import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println("Opening....");
        JFrame jFrame = new JFrame("Leitner");
        jFrame.setSize(new Dimension(940,540));
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JPanel mainPanel = new JPanel();
        jFrame.getContentPane().add(mainPanel);
        JButton foo = new JButton("FOOOOOOOO");
        mainPanel.add(foo);
        JLabel outputLabel = new JLabel("Yet");
        mainPanel.add(outputLabel);
        foo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("YEEEEEET");
                outputLabel.setText(count+" counter");
                count++;
            }
        });
    }
}
