package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JTextField usernameTxt;
	private JTextField passwordTxt;
	private JButton cancelBtn;
	private JButton loginBtn;
	private JLabel lblClickHereTo;

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
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(61, 56, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getUsernameTxt());
		contentPane.add(getPasswordTxt());
		contentPane.add(getCancelBtn());
		contentPane.add(getLoginBtn());
		contentPane.add(getLblClickHereTo());
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username:");
			lblUsername.setFont(new Font("FreeSans", Font.BOLD, 16));
			lblUsername.setForeground(new Color(255, 255, 255));
			lblUsername.setBounds(29, 57, 90, 15);
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("FreeSans", Font.BOLD, 16));
			lblPassword.setForeground(new Color(255, 255, 255));
			lblPassword.setBackground(new Color(255, 255, 255));
			lblPassword.setBounds(29, 128, 90, 15);
		}
		return lblPassword;
	}
	private JTextField getUsernameTxt() {
		if (usernameTxt == null) {
			usernameTxt = new JTextField();
			usernameTxt.setForeground(new Color(255, 255, 255));
			usernameTxt.setBackground(new Color(119, 118, 123));
			usernameTxt.setBounds(137, 49, 174, 30);
			usernameTxt.setColumns(10);
		}
		return usernameTxt;
	}
	private JTextField getPasswordTxt() {
		if (passwordTxt == null) {
			passwordTxt = new JTextField();
			passwordTxt.setForeground(new Color(255, 255, 255));
			passwordTxt.setBackground(new Color(119, 118, 123));
			passwordTxt.setColumns(10);
			passwordTxt.setBounds(137, 120, 174, 30);
		}
		return passwordTxt;
	}
	private JButton getCancelBtn() {
		if (cancelBtn == null) {
			cancelBtn = new JButton("Cancel");
			cancelBtn.setFont(new Font("FreeSans", Font.BOLD, 14));
			cancelBtn.setForeground(new Color(255, 255, 255));
			cancelBtn.setBackground(new Color(192, 28, 40));
			cancelBtn.setBounds(112, 179, 90, 30);
		}
		return cancelBtn;
	}
	private JButton getLoginBtn() {
		if (loginBtn == null) {
			loginBtn = new JButton("Login");
			loginBtn.setBackground(new Color(53, 132, 228));
			loginBtn.setForeground(new Color(255, 255, 255));
			loginBtn.setFont(new Font("FreeSans", Font.BOLD, 14));
			loginBtn.setBounds(245, 179, 90, 30);
		}
		return loginBtn;
	}
	private JLabel getLblClickHereTo() {
		if (lblClickHereTo == null) {
			lblClickHereTo = new JLabel("Click here to create a new account");
			lblClickHereTo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new RegisterForm().setVisible(true);
					dispose();
				}
			});
			lblClickHereTo.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblClickHereTo.setForeground(new Color(255, 255, 255));
			lblClickHereTo.setBounds(106, 249, 241, 15);
		}
		return lblClickHereTo;
	}
}
