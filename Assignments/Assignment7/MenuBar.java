package awt;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MenuBar implements ActionListener
{
    JMenu file,edit,view,open,submenuF;
    JMenuItem m1,m2,m3,m4,m5,m6;
    JFrame frame;
    JMenuBar menubar = new JMenuBar();
    JPopupMenu popup = new JPopupMenu();
    public MenuBar(){
    frame = new JFrame("Menu Bar");
    submenuF = new JMenu("File");
    file = new JMenu("File");
    edit = new JMenu("Edit");
    view = new JMenu("View");
    open = new JMenu("Open");
    m1 = new JMenuItem("Save");
    m2 = new JMenuItem("Close");
    m3 = new JMenuItem("Text");
    m4 = new JMenuItem("Folder");
    m5 = new JMenuItem("Window");
    m6 = new JMenuItem("Panel");
    file.add(submenuF);
    file.add(m1);
    file.add(m2);
    view.add(m5);
    view.add(m6);
    submenuF.add(m3);
    submenuF.add(m4);
    menubar.add(file);
    menubar.add(edit);
    menubar.add(view);
    menubar.add(open);
    popup.add(m1);
    popup.add(m2);
    popup.add(m3);
    popup.add(m4);
    popup.add(m5);
    popup.add(m6);
    frame.add(popup);
    frame.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e){
            popup.show(frame, e.getX(), e.getY());
        }
        
    });
    frame.setJMenuBar(menubar);
    frame.setSize(800,700);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    open.addActionListener(this);
    

    }
    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource() == open)
     {
         JDialog dialog = new JDialog(frame, "Dialog Box!");
         JLabel label = new JLabel("Are you sure to open?");
         dialog.add(label);
         dialog.setBounds(100,120,150,150);
         dialog.setVisible(true);
     }
    }
 public static void main(String[] args) 
 {
  new MenuBar();
}
}
