import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple 2") ;
        frame.setLocation(300, 300) ;
        frame.setSize(600,300) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        
        JLabel jbl1 = new JLabel() ;
        jbl1.setLayout(null) ;

        JButton b1 = new JButton("1") ;

        jbl1.add(b1) ;

        b1.setBounds(200,15,200,25) ;

        frame.getContentPane().add(jbl1) ;

        b1.addActionListener();

        frame.setVisible(true);
    }
}

public void actionPerformed(ActionEvent ae) {
    JOptionPane.showMessageDialog(this, "Impression impossible");
}
