package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.db.DB;
import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentViewForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField fnameTxt;
	private JTextField lnameTxt;
	private JLabel lblDob;
	private JLabel lblCollege;
	private JLabel lblState;
	private JLabel lblCountry;
	private JLabel lblCity;
	private JSeparator separator;
	private JTextField dobTxt;
	private JTextField collegeTxt;
	private JTextField countryTxt;
	private JTextField cityTxt;
	private JComboBox stateCmb;
	private JLabel lblRollno;
	private JLabel lblEmail;
	private JLabel lblRollno_1;
	private JLabel lblRollno_2;
	private JLabel lblRollno_3;
	private JTextField rollnoTxt;
	private JTextField emailTxt;
	private JTextField facultyTxt;
	private JTextField ageTxt;
	private JTextField phoneTxt;
	private JRadioButton maleBtn;
	private JRadioButton femaleBtn;
	private JLabel lblNewLabel_1_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int sid = 0;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentViewForm frame = new StudentViewForm();
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
	public StudentViewForm() {
		setTitle("Student View Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 221, 218));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFnameTxt());
		contentPane.add(getLnameTxt());
		contentPane.add(getLblDob());
		contentPane.add(getLblCollege());
		contentPane.add(getLblState());
		contentPane.add(getLblCountry());
		contentPane.add(getLblCity());
		contentPane.add(getSeparator());
		contentPane.add(getDobTxt());
		contentPane.add(getCollegeTxt());
		contentPane.add(getCountryTxt());
		contentPane.add(getCityTxt());
		contentPane.add(getStateCmb());
		contentPane.add(getLblRollno());
		contentPane.add(getLblEmail());
		contentPane.add(getLblRollno_1());
		contentPane.add(getLblRollno_2());
		contentPane.add(getLblRollno_3());
		contentPane.add(getTextField_4_1());
		contentPane.add(getEmailTxt());
		contentPane.add(getFacultyTxt());
		contentPane.add(getAgeTxt());
		contentPane.add(getPhoneTxt());
		contentPane.add(getMaleBtn());
		contentPane.add(getFemaleBtn());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getBtnNewButton());
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("FirstName");
			lblNewLabel.setBounds(12, 12, 84, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("LastName");
			lblNewLabel_1.setBounds(12, 59, 84, 31);
		}
		return lblNewLabel_1;
	}
	private JTextField getFnameTxt() {
		if (fnameTxt == null) {
			fnameTxt = new JTextField();
			fnameTxt.setEnabled(false);
			fnameTxt.setBounds(106, 10, 146, 27);
			fnameTxt.setColumns(10);
		}
		return fnameTxt;
	}
	private JTextField getLnameTxt() {
		if (lnameTxt == null) {
			lnameTxt = new JTextField();
			lnameTxt.setEnabled(false);
			lnameTxt.setColumns(10);
			lnameTxt.setBounds(106, 61, 146, 27);
		}
		return lnameTxt;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DoB");
			lblDob.setBounds(12, 149, 70, 15);
		}
		return lblDob;
	}
	private JLabel getLblCollege() {
		if (lblCollege == null) {
			lblCollege = new JLabel("College");
			lblCollege.setBounds(12, 199, 70, 15);
		}
		return lblCollege;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setBounds(12, 249, 70, 15);
		}
		return lblState;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(12, 290, 70, 15);
		}
		return lblCountry;
	}
	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setBounds(12, 335, 70, 15);
		}
		return lblCity;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 439, 990, 2);
		}
		return separator;
	}
	
	
	private JTextField getDobTxt() {
		if (dobTxt == null) {
			dobTxt = new JTextField();
			dobTxt.setEnabled(false);
			dobTxt.setColumns(10);
			dobTxt.setBounds(106, 143, 146, 27);
		}
		return dobTxt;
	}
	private JTextField getCollegeTxt() {
		if (collegeTxt == null) {
			collegeTxt = new JTextField();
			collegeTxt.setEnabled(false);
			collegeTxt.setColumns(10);
			collegeTxt.setBounds(106, 193, 146, 27);
		}
		return collegeTxt;
	}
	private JTextField getCountryTxt() {
		if (countryTxt == null) {
			countryTxt = new JTextField();
			countryTxt.setEnabled(false);
			countryTxt.setColumns(10);
			countryTxt.setBounds(106, 284, 146, 27);
		}
		return countryTxt;
	}
	private JTextField getCityTxt() {
		if (cityTxt == null) {
			cityTxt = new JTextField();
			cityTxt.setEnabled(false);
			cityTxt.setColumns(10);
			cityTxt.setBounds(106, 329, 146, 27);
		}
		return cityTxt;
	}
	private JComboBox getStateCmb() {
		if (stateCmb == null) {
			stateCmb = new JComboBox();
			stateCmb.setEnabled(false);
			stateCmb.setModel(new DefaultComboBoxModel(new String[] {"Select", "Koshi", "Madhesh", "Bagmati", "Gandaki", "Lumbini", "Karnali", "Sudurpashchim"}));
			stateCmb.setBounds(106, 244, 146, 24);
		}
		return stateCmb;
	}
	private JLabel getLblRollno() {
		if (lblRollno == null) {
			lblRollno = new JLabel("Rollno");
			lblRollno.setBounds(284, 12, 70, 15);
		}
		return lblRollno;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(284, 67, 70, 15);
		}
		return lblEmail;
	}
	private JLabel getLblRollno_1() {
		if (lblRollno_1 == null) {
			lblRollno_1 = new JLabel("Faculty");
			lblRollno_1.setBounds(284, 119, 70, 15);
		}
		return lblRollno_1;
	}
	private JLabel getLblRollno_2() {
		if (lblRollno_2 == null) {
			lblRollno_2 = new JLabel("Age");
			lblRollno_2.setBounds(284, 167, 70, 15);
		}
		return lblRollno_2;
	}
	private JLabel getLblRollno_3() {
		if (lblRollno_3 == null) {
			lblRollno_3 = new JLabel("Phone");
			lblRollno_3.setBounds(284, 214, 70, 15);
		}
		return lblRollno_3;
	}
	private JTextField getTextField_4_1() {
		if (rollnoTxt == null) {
			rollnoTxt = new JTextField();
			rollnoTxt.setEnabled(false);
			rollnoTxt.setColumns(10);
			rollnoTxt.setBounds(346, 10, 146, 27);
		}
		return rollnoTxt;
	}
	private JTextField getEmailTxt() {
		if (emailTxt == null) {
			emailTxt = new JTextField();
			emailTxt.setEnabled(false);
			emailTxt.setColumns(10);
			emailTxt.setBounds(346, 61, 146, 27);
		}
		return emailTxt;
	}
	private JTextField getFacultyTxt() {
		if (facultyTxt == null) {
			facultyTxt = new JTextField();
			facultyTxt.setEnabled(false);
			facultyTxt.setColumns(10);
			facultyTxt.setBounds(346, 113, 146, 27);
		}
		return facultyTxt;
	}
	private JTextField getAgeTxt() {
		if (ageTxt == null) {
			ageTxt = new JTextField();
			ageTxt.setEnabled(false);
			ageTxt.setColumns(10);
			ageTxt.setBounds(346, 161, 146, 27);
		}
		return ageTxt;
	}
	private JTextField getPhoneTxt() {
		if (phoneTxt == null) {
			phoneTxt = new JTextField();
			phoneTxt.setEnabled(false);
			phoneTxt.setColumns(10);
			phoneTxt.setBounds(346, 208, 146, 27);
		}
		return phoneTxt;
	}
	private JRadioButton getMaleBtn() {
		if (maleBtn == null) {
			maleBtn = new JRadioButton("Male");
			maleBtn.setEnabled(false);
			buttonGroup.add(maleBtn);
			maleBtn.setBackground(new Color(222, 221, 218));
			maleBtn.setBounds(106, 102, 59, 23);
		}
		return maleBtn;
	}
	private JRadioButton getFemaleBtn() {
		if (femaleBtn == null) {
			femaleBtn = new JRadioButton("Female");
			femaleBtn.setEnabled(false);
			buttonGroup.add(femaleBtn);
			femaleBtn.setBackground(new Color(222, 221, 218));
			femaleBtn.setBounds(174, 102, 78, 23);
		}
		return femaleBtn;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Gender");
			lblNewLabel_1_1.setBounds(12, 102, 84, 31);
		}
		return lblNewLabel_1_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new StudentForm().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBounds(346, 375, 146, 25);
		}
		return btnNewButton;
	}
	
	public void setDataViewForm(int id) {
		StudentService ss = new StudentServiceImpl();
		Student s = ss.getStudentById(id);

		fnameTxt.setText(s.getFname());
		lnameTxt.setText(s.getLname());
		dobTxt.setText(s.getDob());
		collegeTxt.setText(s.getCollege());
		cityTxt.setText(s.getCity());
		countryTxt.setText(s.getCountry());
		rollnoTxt.setText(String.valueOf(s.getRollno()));
		emailTxt.setText(s.getEmail());
		facultyTxt.setText(s.getFaculty());
		ageTxt.setText(String.valueOf(s.getAge()));
		phoneTxt.setText(s.getPhone());
		stateCmb.setSelectedItem(s.getState());
		
	    
		if(s.getGender().equalsIgnoreCase("male")) {
			maleBtn.setSelected(true);
		}else {
			femaleBtn.setSelected(true);
		}
	}
	
}
