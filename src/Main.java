import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Opening....");
        JFrame jFrame = new JFrame("Leitner");
        jFrame.setSize(new Dimension(940,540));
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JPanel mainPanel = new JPanel();
        jFrame.setCon(mainPanel);
        JButton foo = new JButton("FOOOOOOOO");
        mainPanel.add(foo);
    }
}
