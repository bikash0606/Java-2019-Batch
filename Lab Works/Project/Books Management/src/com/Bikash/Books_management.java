package com.Bikash;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Books_management {

	private JFrame frame;
	private JTextField txtBname;
	private JTextField txtEdition;
	private JTextField txtPrice;
	private JTable table;
	private JTextField txtIDBook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Books_management window = new Books_management();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Create the application.
	 */
	public Books_management() {
		initialize();
		Connect();
	}
	
	PreparedStatement pst;
	Connection con;
	ResultSet rs;
	
	public void Connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/BooksManagement", "root","Bikash@12345");
        }
        catch (ClassNotFoundException ex)
        {
          ex.printStackTrace();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
 
    }
	  public void table_load()
	    {
	    	try 
	    	{
		    pst = con.prepareStatement("select * from Books");
		    rs = pst.executeQuery();
		    table.setModel(DbUtils.resultSetToTableModel(rs));
		} 
	    	catch (SQLException e) 
	    	 {
	    		e.printStackTrace();
		  } 
	    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 811, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblManageBook = new JLabel("Manage Book");
		lblManageBook.setFont(new Font("Noto Sans CJK JP DemiLight", Font.BOLD, 32));
		lblManageBook.setBounds(233, 0, 275, 57);
		frame.getContentPane().add(lblManageBook);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Registation", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel.setBounds(27, 56, 336, 203);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name Of Book");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 24, 142, 33);
		panel.add(lblNewLabel);
		
		JLabel lblEditionOfBook = new JLabel("Edition Of Book");
		lblEditionOfBook.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEditionOfBook.setBounds(0, 85, 142, 33);
		panel.add(lblEditionOfBook);
		
		JLabel lblPriceInRs = new JLabel("Price in Rs.");
		lblPriceInRs.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPriceInRs.setBounds(12, 145, 142, 33);
		panel.add(lblPriceInRs);
		
		txtBname = new JTextField();
		txtBname.setBounds(142, 24, 163, 33);
		panel.add(txtBname);
		txtBname.setColumns(10);
		
		txtEdition = new JTextField();
		txtEdition.setColumns(10);
		txtEdition.setBounds(142, 85, 163, 33);
		panel.add(txtEdition);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(142, 145, 163, 33);
		panel.add(txtPrice);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Bname, Edition, Price;
				Bname = txtBname.getText();
				Edition = txtEdition.getText();
				Price = txtPrice.getText();
				
				try {
					pst = con.prepareStatement("insert into Books(name,edition,price)values(?,?,?)");
					pst.setString(1, Bname);
					pst.setString(2, Edition);
					pst.setString(3, Price);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added Successfully!");
					table_load();
					          
					txtBname.setText("");
					txtEdition.setText("");
					txtPrice.setText("");
					txtBname.requestFocus();
					   }
					 
					catch (SQLException e1)
					        {
					e1.printStackTrace();
					}
			}
		});
		btnSave.setBounds(27, 271, 102, 51);
		frame.getContentPane().add(btnSave);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(141, 271, 102, 51);
		frame.getContentPane().add(btnExit);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtBname.setText("");
				txtEdition.setText("");
				txtPrice.setText("");
				txtBname.requestFocus();
				
				
			}
		});
		btnClear.setBounds(261, 271, 102, 51);
		frame.getContentPane().add(btnClear);
		
		table = new JTable();
		table.setBounds(375, 56, 424, 273);
		frame.getContentPane().add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(27, 334, 336, 78);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblIdOfBook = new JLabel("ID of Book");
		lblIdOfBook.setBounds(12, 30, 120, 17);
		lblIdOfBook.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_1.add(lblIdOfBook);
		
		txtIDBook = new JTextField();
		txtIDBook.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
					
					 try {
				          
				            String id = txtIDBook.getText();

				                pst = con.prepareStatement("select name,edition,price from Books where id = ?");
				                pst.setString(1, id);
				                ResultSet rs = pst.executeQuery();

				            if(rs.next()==true)
				            {
				              
				                String name = rs.getString(1);
				                String edition = rs.getString(2);
				                String price = rs.getString(3);
				                
				                txtBname.setText(name);
				                txtEdition.setText(edition);
				                txtPrice.setText(price);
				                
				                
				            }   
				            else
				            {
				            	txtBname.setText("");
				            	txtEdition.setText("");
				                txtPrice.setText("");
				                 
				            }
				            


				        } 
					
					 catch (SQLException ex) {
				           
				        }
					
					
					
					
				}
		});
		txtIDBook.setBounds(150, 26, 186, 25);
		txtIDBook.setColumns(10);
		panel_1.add(txtIDBook);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String bname,edition,price,bid;
					
					
					bname = txtBname.getText();
					edition = txtEdition.getText();
					price = txtPrice.getText();
					bid  = txtIDBook.getText();
					
					 try {
							pst = con.prepareStatement("update Books set name= ?,edition=?,price=? where id =?");
							pst.setString(1, bname);
				            pst.setString(2, edition);
				            pst.setString(3, price);
				            pst.setString(4, bid);
				            pst.executeUpdate();
				            JOptionPane.showMessageDialog(null, "Record Updated Successfully!");
				            table_load();
				           
				            txtBname.setText("");
				            txtEdition.setText("");
				            txtPrice.setText("");
				            txtBname.requestFocus();
						}

			            catch (SQLException e1) {
							
							e1.printStackTrace();
						}
		
				}
				
		});
		btnUpdate.setBounds(457, 341, 102, 51);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String bid;
				bid  = txtIDBook.getText();
				
				 try {
						pst = con.prepareStatement("delete from book where id =?");
				
			            pst.setString(1, bid);
			            pst.executeUpdate();
			            JOptionPane.showMessageDialog(null, "Record Delete!!!!!");
			            table_load();
			           
			            txtBname.setText("");
			            txtEdition.setText("");
			            txtPrice.setText("");
			            txtBname.requestFocus();
					}

		            catch (SQLException e1) {
						
						e1.printStackTrace();
					}
				
			}
		});
		btnDelete.setBounds(608, 341, 102, 51);
		frame.getContentPane().add(btnDelete);
	}
}
