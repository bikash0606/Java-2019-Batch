package awt;
import java.awt.*;
import javax.swing.*;
public class CardLayoutDemo implements ActionListener
{
    CardLayoutDemo cardLayout;
    JButton btn1,btn2,btn3;
    Container cont;
CardLayoutDemo(){
    cardLayout  = new CardLayoutDemo();
    btn1 = new JButton("Button 1");
    btn2 = new JButton("Button 2");

    btn3 = new JButton("Button 3");

    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);

    cont.add("1", btn1);
    cont.add("2", btn2);
    cont.add("3", btn3);

    cont.setSize(400,400);
    cont.setVisible(true);
}
  
 public void actionPerformed(ActionEvent e){
    cardLayout.next(cont);
}
public static void main(String[] args) {
     new CardLayoutDemo();

}  
}
