## Due date Jan 13 2022  Submitted date Jan 13 2022
# 1. WAP to demonstrate the lifecycle methods of applet.
In java File:
```import java.applet.Applet;
    import java.awt.Graphics;
    class LifeCycleApplet extends Applet{
        public void init(){
            System.out.println("Initialization of the applet here (1)");
        }
        public void start(){
            System.out.println("Starting of the applet(2)");
        }
        public void paint(Graphics graphics){
            graphics.drawString("hello there mate!(3)", 100, 300);
        }
        public void stop(){
            System.out.println("program stops here mate! (4)");
        }

        public void destory(){
            System.out.println("program destroyed! (5)");
        }
    }
```
In HTML File:
```
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Applet Life Cycle Demo !!!</title>
    </head>
    <body>
        <applet code ="LifeCycleApplet.class" width="600" height="500"></applet>
        
    </body>
    </html>
```
# 2.WAP to demonstrate how you can pass parameter in applet.
In java File:
```
import java.applet.Applet;  
import java.awt.Graphics;  
  
public class PassingParameter extends Applet{  
    public void paint(Graphics g){  
    String str=getParameter("Message");  
    g.drawString(str,75, 75);  
    }  
}  
```
In HTML File:
```
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passing Parameter in Applet !!!</title>
</head>
<body>  
<applet code="PassingParameter.class" width="300" height="300">  
<param name="Message" value="Applet parameter example here">  
</applet>  
</body>  
</html> 
```
# 3.Create a swing GUI that contains a two buttons (add and subtract) and three text fields. When the buttons are clicked sum or difference of values of first two text fields should be displayed in the third text field respectively.
```
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
class AddSub extends JFrame{
		public JButton addition = new JButton("Add");
		public JButton subtract = new JButton("Subtract");
		public JLabel num1 = new JLabel();
		public JTextField num1Text = new JTextField();
		public JLabel num2 = new JLabel();
		public JTextField num2Text = new JTextField();
		public JLabel result = new JLabel();
		public JTextField resultText = new JTextField();
	public AddSub(){
		num1.setText("Number 1 :");
		num1.setBounds(10,50,80,25);
		num1Text.setBounds(100,50,165,25);
		num2.setText("Number 2:");
		num2.setBounds(10,100,80,25);
		num2Text.setBounds(100,100,165,25);
		result.setText("Result:");
		result.setBounds(10,150,80,25);
		resultText.setBounds(100,150,165,25);
		addition.setBounds(10,250,75,25);
		subtract.setBounds(80,250,165,25);
		add(num1);
		add(num1Text);
		add(num2);
		add(num2Text);
		add(addition);
		add(subtract);
		add(result);
		add(resultText);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		addition.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
				 double number1 = Double.parseDouble(num1Text.getText());
				 double number2 = Double.parseDouble(num2Text.getText());
 
				 	resultText.setText(String.valueOf(number1+number2));
 
			}});
		subtract.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
				 double number1 = Double.parseDouble(num1Text.getText());
				 double number2 = Double.parseDouble(num2Text.getText());
				 resultText.setText(String.valueOf(number1-number2));
 
			}});
	}
	public static void main(String[] args){
		new AddSub();
	}
}
```

# 4.Create an awt GUI that contains a button, and two text fields. When the button is clicked the value of first text field should be checked and display "odd number" or "even number" in the second text field.
```
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Label;
class OddEven extends Frame{
		public Button button = new Button("check");
		public Label label1 = new Label();
		public TextField label1Text = new TextField();
		public Label label2 = new Label();
		public TextField label2Text = new TextField();
	public OddEven(){
		label1.setText("Value here:");
		label1.setBounds(10,50,80,25);
		label1Text.setBounds(100,50,165,25);
		label2.setText("Result:");
		label2.setBounds(10,100,80,25);
		label2Text.setBounds(100,100,165,25);
		button.setBounds(100,150,165,25);
		add(label1);
		add(label1Text);
		add(label2);
		add(label2Text);
		add(button);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		button.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
				 double number1 = Double.parseDouble(label1Text.getText());
				 if (number1%2 == 0){
				 	label2Text.setText("Even");
				 }
				 else{
				 	label2Text.setText("Odd");
				 }
				}
			});
	}
	public static void main(String[] args) {
		new OddEven();
	}
}
```


