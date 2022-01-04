package awt;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
 public class SwingByAssociation {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Calculate");    
            JLabel label1 = new JLabel("Number 1");
            JLabel label2 = new JLabel("Number 2");
            JLabel label3 = new JLabel("Result");
            JButton button1 = new JButton("Add");  
            JButton button2 = new JButton("Sub");
            JButton button3 = new JButton("Mul");
            JButton button4 = new JButton("Div"); 
            JTextField text1 = new JTextField();
            JTextField text2 = new JTextField();
            JTextField text3 = new JTextField();
            label1.setBounds(10,50,100,40);
            label2.setBounds(10,100,100,40);
            label3.setBounds(10,150,100,40);
            button1.setBounds(10,200,80,40); 
            button2.setBounds(80,200,80,40); 
            button3.setBounds(150,200,80,40); 
            button4.setBounds(220,200,80,40);    
            text1.setBounds(100,50,100,40);
            text2.setBounds(100,100,100,40);
            text3.setBounds(100,150,100,40);
            frame.add(text1);
            frame.add(text2);
            frame.add(text3);
            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(button1);
            frame.add(button2);
            frame.add(button3);
            frame.add(button4);    
            frame.setSize(300,300);    
            frame.setLayout(null);    
            frame.setVisible(true);     
        }  
 }