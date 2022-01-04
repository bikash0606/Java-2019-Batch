package awt;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
 public class AwtAssociation {
        public static void main(String[] args) {
            Frame frame = new Frame("Calculate");    
            Label label1 = new Label("Number 1");
            Label label2 = new Label("Number 2");
            Label label3 = new Label("Result");
            Button button1 = new Button("Add");  
            Button button2 = new Button("Sub");
            Button button3 = new Button("Mul");
            Button button4 = new Button("Div"); 
            TextField text1 = new TextField();
            TextField text2 = new TextField();
            TextField text3 = new TextField();
             label1.setBounds(10,50,100,40);
             label2.setBounds(10,100,100,40);
             label3.setBounds(10,150,100,40);
            button1.setBounds(10,200,60,40); 
            button2.setBounds(80,200,60,40); 
            button3.setBounds(150,200,60,40); 
            button4.setBounds(220,200,60,40);    
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