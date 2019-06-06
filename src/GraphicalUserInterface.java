import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class GraphicalUserInterface {

    public JFrame mainJFrame = new JFrame("Shoebox 2.0 by Trinity");

    public static Border leftThickBorder = BorderFactory.createMatteBorder(40, 130, 3, 40, new Color(14283517));
    public static Border rightThickBorder = BorderFactory.createMatteBorder(40, 40, 3, 130, new Color(14283517));
    public static Border thickBorder = BorderFactory.createMatteBorder(60, 400, 20, 400, new Color(14283517));


    public void initialiseMain(){
        //makes the window that opens, un-resizable, terminates program on close
        mainJFrame.setSize(new Dimension(940,640));
        mainJFrame.setResizable(false);
        mainJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //panel creation
        Container mainContentPane = mainJFrame.getContentPane();
        mainContentPane.add(new HomePanel(this));

        mainJFrame.setVisible(true);
    }
    public void setPanel(JPanel panel){
        Container mainContentPane = mainJFrame.getContentPane();
        mainContentPane.removeAll();
        mainContentPane.repaint();
        mainContentPane.add(panel);
        mainContentPane.repaint();
        mainJFrame.setVisible(true);
    }
}
