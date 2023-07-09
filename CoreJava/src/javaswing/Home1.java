package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblWelcome;
	private JSeparator separator;
	private JButton btnLogout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home1 frame = new Home1();
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
	public Home1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblWelcome());
		contentPane.add(getSeparator_1());
		contentPane.add(getBtnLogout());
	}

	private JLabel getLblWelcome() {
		if (lblWelcome == null) {
			lblWelcome = new JLabel("Welcome");
			lblWelcome.setFont(new Font("Ubuntu Mono", Font.BOLD, 25));
			lblWelcome.setBounds(39, 12, 125, 26);
		}
		return lblWelcome;
	}
	private JSeparator getSeparator_1() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 65, 416, 2);
		}
		return separator;
	}
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("Logout");
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				new LoginForm().setVisible(true);
				dispose();
				
				}
			});
			btnLogout.setBounds(315, 17, 94, 22);
		}
		return btnLogout;
	}
}
