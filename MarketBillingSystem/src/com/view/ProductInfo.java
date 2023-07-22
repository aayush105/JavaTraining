package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProductInfo extends JFrame {

	private JPanel contentPane;
	private JLabel lblAddCashierDetails;
	private JLabel lblCashierId;
	private JTextField pidTxt;
	private JScrollPane scrollPane;
	private JTable table;
	private int sid = 0;

	private JButton findBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInfo frame = new ProductInfo();
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
	public ProductInfo() {
		setTitle("Update Stock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 621);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(94, 92, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblAddCashierDetails());
		contentPane.add(getLblCashierId());
		contentPane.add(getPidTxt());
		contentPane.add(getScrollPane_1());

		contentPane.add(getFindBtn());
		displayProduct();
	}
	private JLabel getLblAddCashierDetails() {
		if (lblAddCashierDetails == null) {
			lblAddCashierDetails = new JLabel("Product Information");
			lblAddCashierDetails.setForeground(new Color(255, 255, 255));
			lblAddCashierDetails.setFont(new Font("FreeSans", Font.BOLD, 20));
			lblAddCashierDetails.setBounds(198, 24, 196, 26);
		}
		return lblAddCashierDetails;
	}
	private JLabel getLblCashierId() {
		if (lblCashierId == null) {
			lblCashierId = new JLabel("Product Id");
			lblCashierId.setFont(new Font("FreeSans", Font.BOLD, 14));
			lblCashierId.setForeground(new Color(255, 255, 255));
			lblCashierId.setBounds(89, 86, 91, 15);
		}
		return lblCashierId;
	}
	private JTextField getPidTxt() {
		if (pidTxt == null) {
			pidTxt = new JTextField();
			pidTxt.setBounds(185, 74, 196, 37);
			pidTxt.setColumns(10);
		}
		return pidTxt;
	}
	
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
				}
			});
			scrollPane.setBounds(76, 167, 475, 394);
			scrollPane.setViewportView(getTable_1());
		}
		return scrollPane;
	}
	private JTable getTable_1() {
		if (table == null) {
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Select any row");
						return;
					}
					
					int srow = table.getSelectedRow();
					sid = (int) table.getModel().getValueAt(srow, 0);
				
					ProductService ps = new ProductServiceImpl();
					Product p = ps.getProductById(sid);
				
					// set the cashier data to from
					
					pidTxt.setText(String.valueOf(p.getPid()));
				}
			});
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Product Id","Product Name","Available","MRP" 
				}
			));
		}
		return table;
	}
	
	private void displayProduct() {
		
		ProductService ps = new ProductServiceImpl();

		List<Product> plist = ps.getsAllProducts();
		
		DefaultTableModel tmodel =(DefaultTableModel) table.getModel();
		tmodel.setRowCount(0); // reset table
		
		for (Product pl : plist) {
			tmodel.addRow(new Object[] {pl.getPid(),pl.getPname(),pl.getAvailable()+pl.getAdded(),pl.getMrp()});
		}
	}
	
	private JButton getFindBtn() {
		if (findBtn == null) {
			findBtn = new JButton("Search");
			findBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sdata = pidTxt.getText().trim();
					
					ProductService ps = new ProductServiceImpl();
					List<Product> plist = ps.searchProduct(sdata);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Product p : plist) {
						tmodel.addRow(new Object[] {p.getPid(),p.getPname(),p.getAvailable(),p.getMrp() } );
					}
				}
			});
			findBtn.setBounds(417, 74, 134, 36);
			findBtn.setBackground(new Color(192, 191, 188));
			Image img = new ImageIcon(getClass().getResource("/search11.png")).getImage();
			findBtn.setIcon(new ImageIcon(img));
		}
		return findBtn;
	}
}
