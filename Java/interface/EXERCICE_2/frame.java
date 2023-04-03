import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple 2") ;
        frame.setLocation(300, 300) ;
        frame.setSize(700,450) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        
        JLabel jbl1 = new JLabel() ;
        jbl1.setLayout(null) ;

        JButton b1 = new JButton("1") ;
        JButton b2 = new JButton("2") ;
        JButton b3 = new JButton("3") ;

        jbl1.add(b1) ;
        jbl1.add(b2) ;
        jbl1.add(b3) ;

        b1.setBounds(0,0,50,50) ;
        b2.setBounds(50,0,50,50) ;
        b3.setBounds(100,0,50,50) ;

        frame.getContentPane().add(jbl1) ;

        frame.setVisible(true);
    }
}
