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
import com.toedter.calendar.JDateChooser;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblClickHereTo;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblRetypePass;
	private JLabel lblBirthDate;
	private JLabel lblAddress;
	private JTextField fnameTxt;
	private JTextField lnameTxt;
	private JTextField usernameTxt;
	private JTextField passwordTxt;
	private JTextField repasswordTxt;
	private JTextField addressTxt;
	private JButton cancelBtn;
	private JButton registerBtn;
	private JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setTitle("Register Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(61, 56, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblClickHereTo());
		contentPane.add(getLblFirstName());
		contentPane.add(getLblLastName());
		contentPane.add(getLblUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getLblRetypePass());
		contentPane.add(getLblBirthDate());
		contentPane.add(getLblAddress());
		contentPane.add(getFnameTxt());
		contentPane.add(getLnameTxt());
		contentPane.add(getUsernameTxt());
		contentPane.add(getPasswordTxt());
		contentPane.add(getRepasswordTxt());
		contentPane.add(getAddressTxt());
		contentPane.add(getCancelBtn());
		contentPane.add(getRegisterBtn());
		contentPane.add(getDateChooser());
	}
	private JLabel getLblClickHereTo() {
		if (lblClickHereTo == null) {
			lblClickHereTo = new JLabel("Click here to login");
			lblClickHereTo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			lblClickHereTo.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblClickHereTo.setForeground(new Color(255, 255, 255));
			lblClickHereTo.setBounds(182, 509, 133, 15);
		}
		return lblClickHereTo;
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name:");
			lblFirstName.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblFirstName.setForeground(new Color(255, 255, 255));
			lblFirstName.setBounds(38, 40, 89, 15);
		}
		return lblFirstName;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name:");
			lblLastName.setForeground(Color.WHITE);
			lblLastName.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblLastName.setBounds(38, 92, 89, 15);
		}
		return lblLastName;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username:");
			lblUsername.setForeground(Color.WHITE);
			lblUsername.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblUsername.setBounds(38, 143, 89, 15);
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblPassword.setBounds(38, 196, 89, 15);
		}
		return lblPassword;
	}
	private JLabel getLblRetypePass() {
		if (lblRetypePass == null) {
			lblRetypePass = new JLabel("Retype Pass:");
			lblRetypePass.setForeground(Color.WHITE);
			lblRetypePass.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblRetypePass.setBounds(38, 246, 89, 15);
		}
		return lblRetypePass;
	}
	private JLabel getLblBirthDate() {
		if (lblBirthDate == null) {
			lblBirthDate = new JLabel("Birth Date:");
			lblBirthDate.setForeground(Color.WHITE);
			lblBirthDate.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblBirthDate.setBounds(38, 297, 89, 15);
		}
		return lblBirthDate;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address:");
			lblAddress.setForeground(Color.WHITE);
			lblAddress.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblAddress.setBounds(38, 347, 89, 15);
		}
		return lblAddress;
	}
	private JTextField getFnameTxt() {
		if (fnameTxt == null) {
			fnameTxt = new JTextField();
			fnameTxt.setBackground(new Color(94, 92, 100));
			fnameTxt.setBounds(155, 33, 232, 27);
			fnameTxt.setColumns(10);
		}
		return fnameTxt;
	}
	private JTextField getLnameTxt() {
		if (lnameTxt == null) {
			lnameTxt = new JTextField();
			lnameTxt.setBackground(new Color(94, 92, 100));
			lnameTxt.setColumns(10);
			lnameTxt.setBounds(155, 85, 232, 27);
		}
		return lnameTxt;
	}
	private JTextField getUsernameTxt() {
		if (usernameTxt == null) {
			usernameTxt = new JTextField();
			usernameTxt.setBackground(new Color(94, 92, 100));
			usernameTxt.setColumns(10);
			usernameTxt.setBounds(155, 136, 232, 27);
		}
		return usernameTxt;
	}
	private JTextField getPasswordTxt() {
		if (passwordTxt == null) {
			passwordTxt = new JTextField();
			passwordTxt.setBackground(new Color(94, 92, 100));
			passwordTxt.setColumns(10);
			passwordTxt.setBounds(155, 189, 232, 27);
		}
		return passwordTxt;
	}
	private JTextField getRepasswordTxt() {
		if (repasswordTxt == null) {
			repasswordTxt = new JTextField();
			repasswordTxt.setBackground(new Color(94, 92, 100));
			repasswordTxt.setColumns(10);
			repasswordTxt.setBounds(155, 243, 232, 27);
		}
		return repasswordTxt;
	}
	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setBackground(new Color(94, 92, 100));
			addressTxt.setColumns(10);
			addressTxt.setBounds(155, 340, 232, 75);
		}
		return addressTxt;
	}
	private JButton getCancelBtn() {
		if (cancelBtn == null) {
			cancelBtn = new JButton("Cancel");
			cancelBtn.setFont(new Font("FreeSans", Font.BOLD, 14));
			cancelBtn.setBackground(new Color(192, 28, 40));
			cancelBtn.setForeground(new Color(255, 255, 255));
			cancelBtn.setBounds(119, 445, 98, 33);
		}
		return cancelBtn;
	}
	private JButton getRegisterBtn() {
		if (registerBtn == null) {
			registerBtn = new JButton("Register");
			registerBtn.setFont(new Font("FreeSans", Font.BOLD, 14));
			registerBtn.setForeground(new Color(255, 255, 255));
			registerBtn.setBackground(new Color(53, 132, 228));
			registerBtn.setBounds(289, 445, 98, 33);
		}
		return registerBtn;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(155, 293, 232, 27);
		}
		return dateChooser;
	}
}
