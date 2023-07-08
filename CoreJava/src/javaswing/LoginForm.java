package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=145,-13
	 */
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextField textField;
	private JPasswordField passwordField_1;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUsername.setBounds(43, 86, 105, 15);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(166, 79, 136, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 18));
		lblPassword.setBounds(43, 130, 105, 15);
		contentPane.add(lblPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(166, 123, 136, 31);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(53, 132, 228));
		btnNewButton.setBounds(185, 185, 83, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setForeground(new Color(38, 162, 105));
		lblUserLogin.setFont(new Font("Dialog", Font.BOLD, 20));
		lblUserLogin.setBounds(113, 12, 144, 48);
		contentPane.add(lblUserLogin);
	}
}
