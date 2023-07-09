package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IndexForm extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnSignUp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexForm frame = new IndexForm();
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
	public IndexForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnSignUp());
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBounds(145, 39, 117, 25);
		}
		return btnNewButton;
	}
	private JButton getBtnSignUp() {
		if (btnSignUp == null) {
			btnSignUp = new JButton("Sign Up");
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new SignUpForm().setVisible(true);
					dispose();
				}
			});
			btnSignUp.setBounds(145, 117, 117, 25);
		}
		return btnSignUp;
	}
}
