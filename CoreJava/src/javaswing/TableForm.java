package javaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class TableForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblName;
	private JTextField nameTxt;
	private JLabel lblAddress;
	private JTextField addressTxt;
	private JLabel lblCollege;
	private JComboBox collegeCmbo;
	private JLabel lblGenfer;
	private JRadioButton maleBtn;
	private JRadioButton femaleBtn;
	private JCheckBox agreeChk;
	private JButton submitBtn;
	private JSeparator separator;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnClearTableData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableForm frame = new TableForm();
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
	public TableForm() {
		setTitle("Table Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblName());
		contentPane.add(getNameTxt());
		contentPane.add(getLblAddress());
		contentPane.add(getAddressTxt());
		contentPane.add(getLblCollege());
		contentPane.add(getCollegeCmbo());
		contentPane.add(getLblGenfer());
		contentPane.add(getMaleBtn());
		contentPane.add(getFemaleBtn());
		contentPane.add(getAgreeChk());
		contentPane.add(getSubmitBtn());
		contentPane.add(getSeparator());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnClearTableData());
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(12, 12, 52, 15);
		}
		return lblName;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(63, 10, 129, 19);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(211, 12, 70, 15);
		}
		return lblAddress;
	}
	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setBounds(299, 10, 114, 19);
			addressTxt.setColumns(10);
		}
		return addressTxt;
	}
	private JLabel getLblCollege() {
		if (lblCollege == null) {
			lblCollege = new JLabel("College");
			lblCollege.setBounds(431, 12, 58, 15);
		}
		return lblCollege;
	}
	private JComboBox getCollegeCmbo() {
		if (collegeCmbo == null) {
			collegeCmbo = new JComboBox();
			collegeCmbo.setModel(new DefaultComboBoxModel(new String[] {"select", "NCC", "KEC", "NCIT"}));
			collegeCmbo.setBounds(507, 7, 129, 24);
		}
		return collegeCmbo;
	}
	private JLabel getLblGenfer() {
		if (lblGenfer == null) {
			lblGenfer = new JLabel("Gender");
			lblGenfer.setBounds(12, 51, 70, 15);
		}
		return lblGenfer;
	}
	private JRadioButton getMaleBtn() {
		if (maleBtn == null) {
			maleBtn = new JRadioButton("Male");
			buttonGroup.add(maleBtn);
			maleBtn.setBounds(76, 47, 70, 23);
		}
		return maleBtn;
	}
	private JRadioButton getFemaleBtn() {
		if (femaleBtn == null) {
			femaleBtn = new JRadioButton("Female");
			buttonGroup.add(femaleBtn);
			femaleBtn.setBounds(150, 47, 78, 23);
		}
		return femaleBtn;
	}
	private JCheckBox getAgreeChk() {
		if (agreeChk == null) {
			agreeChk = new JCheckBox("Agree");
			agreeChk.setBounds(306, 47, 78, 23);
		}
		return agreeChk;
	}
	private JButton getSubmitBtn() {
		if (submitBtn == null) {
			submitBtn = new JButton("Submit");
			submitBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// form validation
					if(nameTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(nameTxt, "Name Required");
						return ;
					}
					
					if(addressTxt.getText().isBlank()) {
						JOptionPane.showMessageDialog(addressTxt, "Address Required");
						return ;
					}
					
					if(((String) collegeCmbo.getSelectedItem()).isBlank()) {
						JOptionPane.showMessageDialog(collegeCmbo, "College name Required");
						return ;
					}
				
					String name = nameTxt.getText();
					String adr = addressTxt.getText();
					String colz = collegeCmbo.getSelectedItem().toString();
					
					String gender;
					if(maleBtn.isSelected()) {
						gender = "male";
					} else {
						gender = "female";
					}
					
					String agree;
					if(agreeChk.isSelected()) {
						agree = "Yes";
					} else {
						agree = "No";					
						}
					
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfodb","root","Aayush_105");
//						
//						// insert into db
						String sql = "insert into info(name,college,address,gender,agree) values('"+name+"','"+adr+"','"+colz+"','"+gender+"','"+agree+"')";
						Statement stm = con.createStatement();
						stm.execute(sql);

						
//						String sql = "INSERT INTO info(name, college, address, gender, agree) VALUES (?, ?, ?, ?, ?)";
//					    PreparedStatement stmt = con.prepareStatement(sql);
//					    stmt.setString(1, name);
//					    stmt.setString(2, colz);
//					    stmt.setString(3, adr);
//					    stmt.setString(4, gender);
//					    stmt.setString(5, agree);
//					    stmt.executeUpdate();
					    
						System.out.println("Insert Success");
						con.close();
					} catch (Exception e1) {
						
						
						e1.printStackTrace();
					} 
					//set data in JTable row
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.addRow(new Object[] {name,adr,colz,gender,agree});
				
					
					// Clear input data
					nameTxt.setText("");
					addressTxt.setText("");
					collegeCmbo.setSelectedIndex(0);
					buttonGroup.clearSelection();
					agreeChk.setSelected(false);
					
					}
			});
			submitBtn.setBounds(517, 46, 117, 25);
		}
		return submitBtn;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 99, 624, 2);
		}
		return separator;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 113, 624, 189);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Address", "College", "Gender", "Agree"
				}
			));
		}
		return table;
	}
	private JButton getBtnClearTableData() {
		if (btnClearTableData == null) {
			btnClearTableData = new JButton("Clear Table Data");
			btnClearTableData.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfodb","root","Aayush_105");
						
						// clear db 
						
						String sql = "truncate studentinfodb.info";
						Statement stm = con.createStatement();
						stm.execute(sql);
						
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
				}
			});
			btnClearTableData.setBounds(460, 314, 176, 25);
		}
		return btnClearTableData;
	}
}
