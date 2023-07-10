package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField usernameTxt;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordTxt;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("LoginForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getUsernameTxt());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getPasswordTxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnBack());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("UserName");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setBounds(114, 102, 111, 39);
		}
		return lblNewLabel;
	}
	private JTextField getUsernameTxt() {
		if (usernameTxt == null) {
			usernameTxt = new JTextField();
			usernameTxt.setBounds(235, 102, 244, 47);
			usernameTxt.setColumns(10);
		}
		return usernameTxt;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel_1.setBounds(114, 184, 99, 37);
		}
		return lblNewLabel_1;
	}
	private JPasswordField getPasswordTxt() {
		if (passwordTxt == null) {
			passwordTxt = new JPasswordField();
			passwordTxt.setBounds(235, 182, 244, 47);
		}
		return passwordTxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					  //JOptionPane.showMessageDialog(null, "Hello");
					
					
					// form validation
					if(usernameTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(usernameTxt, "username required");
						return ;
					}
					if(passwordTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(passwordTxt, "username required");
						return ;
					}
					
					String un = usernameTxt.getText(); // to get the value of username
					String psw = passwordTxt.getText(); // to get the value of password
					
					// check user in database
					
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb430","root","Aayush_105");
						
						// login sql
						
						String sql = "select * from user where name ='"+un+"' and password ='"+psw+"'   ";
						java.sql.Statement stm = con.createStatement();
						ResultSet rs = stm.executeQuery(sql);
						
						if(rs.next()) {
							JOptionPane.showMessageDialog(null, "Login Success");
							new Home1().setVisible(true);
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, "Login Failed");
						}
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
					
					
					
//					if(un.equals("ram") && psw.equals("123")) {
//						
//						JOptionPane.showMessageDialog(null,"login success");
//						new Home1().setVisible(true); // to redirect to the home page
//						dispose();						
//					}else{
//						JOptionPane.showMessageDialog(null,"login failed");
//					}
					
				}
			});
			btnNewButton.setBackground(new Color(127, 255, 212));
			btnNewButton.setBounds(368, 241, 111, 25);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("User Login");
			lblNewLabel_2.setForeground(new Color(0, 255, 0));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
			lblNewLabel_2.setBounds(203, 24, 345, 47);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Reset");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					usernameTxt.setText("");
					passwordTxt.setText("");
				}
			});
			btnNewButton_1.setBounds(294, 278, 122, 25);
		}
		return btnNewButton_1;
	}
	
	/*
	 * ---------- Assignment ---------------
	 * 
	 * index form consist of login and signuo button
	 * click login to go -> (login form) un, psw, login, back to go to index page after success go to home form
	 * click sign up to go  ->(signup form) fn.ln.un,psw,signup,back) after success go to login form
	 * 						click back to go to index
	 * 
	 * home form -> logout to go back to login form
	 * 
	 *Next one
	 *
	 * Calculation form -> P,T,R (fields), Calculate button, SI,Ammout(filed)
	 *
	 */
	
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new IndexForm().setVisible(true);
					dispose();
				}
			});
			btnBack.setBounds(235, 241, 117, 25);
		}
		return btnBack;
	}
}


