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

public class SimpleInterest extends JFrame {

	private JPanel contentPane;
	private JLabel lblP;
	private JLabel lblT;
	private JLabel lblR;
	private JTextField pTxt;
	private JTextField tTxt;
	private JTextField rTxt;
	private JButton btnCalculate;
	private JLabel lblSi;
	private JLabel lblAmount;
	private JTextField siTxt;
	private JTextField amountTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleInterest frame = new SimpleInterest();
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
	public SimpleInterest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblP());
		contentPane.add(getLblT());
		contentPane.add(getLblR());
		contentPane.add(getPTxt());
		contentPane.add(getTTxt());
		contentPane.add(getRTxt());
		contentPane.add(getBtnCalculate());
		contentPane.add(getLblSi());
		contentPane.add(getLblAmount());
		contentPane.add(getSiTxt());
		contentPane.add(getAmountTxt());
	}

	private JLabel getLblP() {
		if (lblP == null) {
			lblP = new JLabel("P");
			lblP.setBounds(12, 12, 16, 15);
		}
		return lblP;
	}
	private JLabel getLblT() {
		if (lblT == null) {
			lblT = new JLabel("T");
			lblT.setBounds(12, 50, 16, 15);
		}
		return lblT;
	}
	private JLabel getLblR() {
		if (lblR == null) {
			lblR = new JLabel("R");
			lblR.setBounds(12, 86, 16, 15);
		}
		return lblR;
	}
	private JTextField getPTxt() {
		if (pTxt == null) {
			pTxt = new JTextField();
			pTxt.setBounds(45, 10, 130, 24);
			pTxt.setColumns(10);
		}
		return pTxt;
	}
	private JTextField getTTxt() {
		if (tTxt == null) {
			tTxt = new JTextField();
			tTxt.setColumns(10);
			tTxt.setBounds(46, 46, 130, 24);
		}
		return tTxt;
	}
	private JTextField getRTxt() {
		if (rTxt == null) {
			rTxt = new JTextField();
			rTxt.setColumns(10);
			rTxt.setBounds(46, 82, 130, 24);
		}
		return rTxt;
	}
	private JButton getBtnCalculate() {
		if (btnCalculate == null) {
			btnCalculate = new JButton("Calculate");
			btnCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(pTxt.getText().isBlank()){
							JOptionPane.showMessageDialog(pTxt, "Enter the value of P");
							return ;
						}
					if(tTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(tTxt, "Enter the value of T");
						return ;
					}
					if(rTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(rTxt, "Enter the value of R");
						return ;
					}
			
					// Get the input values as integers
                    int p = Integer.parseInt(pTxt.getText());
                    int t = Integer.parseInt(tTxt.getText());
                    int r = Integer.parseInt(rTxt.getText());

                    // Calculate the simple interest and amount
                    int si = (p * t * r) / 100;
                    int amount = p + si;
                    
                    siTxt.setText(String.valueOf(si));
                    amountTxt.setText(String.valueOf(amount));
				}
			});
			btnCalculate.setBounds(58, 118, 117, 25);
		}
		return btnCalculate;
	}
	private JLabel getLblSi() {
		if (lblSi == null) {
			lblSi = new JLabel("SI");
			lblSi.setBounds(12, 177, 16, 15);
		}
		return lblSi;
	}
	private JLabel getLblAmount() {
		if (lblAmount == null) {
			lblAmount = new JLabel("Amount");
			lblAmount.setBounds(12, 223, 54, 15);
		}
		return lblAmount;
	}
	private JTextField getSiTxt() {
		if (siTxt == null) {
			siTxt = new JTextField();
			siTxt.setBounds(75, 175, 114, 24);
			siTxt.setColumns(10);
		}
		return siTxt;
	}
	private JTextField getAmountTxt() {
		if (amountTxt == null) {
			amountTxt = new JTextField();
			amountTxt.setColumns(10);
			amountTxt.setBounds(75, 221, 114, 24);
		}
		return amountTxt;
	}
}
