import javax.swing.JFrame;
//import java.awt.BorderLayout;
//import java.awt.Label;
import java.awt.* ;
public class FrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Label emptyLabel = new Label("Salut a tous!");
        frame.getContentPane().add(emptyLabel, BorderLayout.WEST);
        frame.setSize(700,500);
        frame.setVisible(true);
    }
}