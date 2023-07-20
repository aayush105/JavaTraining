package com.view;

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
						JOptionPane.showMessageDialog(passwordTxt, "password required");
						return ;
					}
					
					String un = usernameTxt.getText(); // to get the value of username
					String psw = passwordTxt.getText(); // to get the value of password
					
			
					
					if(un.equals("admin") && psw.equals("admin")) {
						
						JOptionPane.showMessageDialog(null,"login success");
						new StudentForm().setVisible(true); // to redirect to the home page
						dispose();						
					}else{
						JOptionPane.showMessageDialog(null,"login failed");
					}
					
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
			btnNewButton_1.setBounds(234, 241, 111, 25);
		}
		return btnNewButton_1;
	}
}


