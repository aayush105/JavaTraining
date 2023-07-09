package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblLastName;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JTextField firstnameTxt;
	private JTextField lastnameTxt;
	private JTextField usernameTxt;
	private JTextField passwordTxt;
	private JButton btnBack;
	private JButton btnSignUp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm frame = new SignUpForm();
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
	public SignUpForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblLastName());
		contentPane.add(getLblUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getFirstnameTxt());
		contentPane.add(getLastnameTxt());
		contentPane.add(getUsernameTxt());
		contentPane.add(getPasswordTxt());
		contentPane.add(getBtnBack());
		contentPane.add(getBtnSignUp());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setBounds(12, 12, 81, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(12, 39, 81, 15);
		}
		return lblLastName;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setBounds(12, 66, 81, 15);
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setBounds(12, 93, 81, 15);
		}
		return lblPassword;
	}
	private JTextField getFirstnameTxt() {
		if (firstnameTxt == null) {
			firstnameTxt = new JTextField();
			firstnameTxt.setBounds(111, 10, 136, 19);
			firstnameTxt.setColumns(10);
		}
		return firstnameTxt;
	}
	private JTextField getLastnameTxt() {
		if (lastnameTxt == null) {
			lastnameTxt = new JTextField();
			lastnameTxt.setColumns(10);
			lastnameTxt.setBounds(111, 37, 136, 19);
		}
		return lastnameTxt;
	}
	private JTextField getUsernameTxt() {
		if (usernameTxt == null) {
			usernameTxt = new JTextField();
			usernameTxt.setColumns(10);
			usernameTxt.setBounds(111, 64, 136, 19);
		}
		return usernameTxt;
	}
	private JTextField getPasswordTxt() {
		if (passwordTxt == null) {
			passwordTxt = new JTextField();
			passwordTxt.setColumns(10);
			passwordTxt.setBounds(111, 91, 136, 19);
		}
		return passwordTxt;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new IndexForm().setVisible(true);
					dispose();
				}
			});
			btnBack.setBounds(66, 140, 81, 25);
		}
		return btnBack;
	}
	private JButton getBtnSignUp() {
		if (btnSignUp == null) {
			btnSignUp = new JButton("Sign Up");
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					// form validation
					if(firstnameTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(firstnameTxt, "First Name required");
						return ;
					}
					if(lastnameTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(lastnameTxt, "Last Name required");
						return ;
					}
					if(usernameTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(usernameTxt, "username required");
						return ;
					}
					if(passwordTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(passwordTxt, "Password required");
						return ;
					}
					
					String fn = firstnameTxt.getText();
					String ln = lastnameTxt.getText();
					String un = usernameTxt.getText();
					String pw = passwordTxt.getText();
					
					
					
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			btnSignUp.setBounds(159, 140, 88, 25);
		}
		return btnSignUp;
	}
}
