package PackageOne;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.CardLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

import java.awt.BorderLayout;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;

public class PayrollSystem {

	private JFrame frmJpayrollsystemV;
	private JPanel panel;
	private JPanel panel_1;
	private JTextField textField;
	private JMenuItem mntmLogout;
	private JMenuItem mntmLogIn;
	private JInternalFrame internalFrame;
	private JMenu mnRecords;
	private JMenu mnPayroll;
	private JMenu mnAbout;
	private JButton btnUpdate;
	private JButton btnSaveUpdate;
	private JButton btnNext;
	
	DBconnection dbconn = new DBconnection();

	PreparedStatement pst = null;
	ResultSet rs1,rs = null;
	Statement st;
	
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JTextField textField_6;
	private JPanel panel_2;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_23;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JPanel panel_3;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayrollSystem window = new PayrollSystem();
					window.frmJpayrollsystemV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PayrollSystem() {
		initialize();
		DBconnection dbconn = new DBconnection();
		putdata();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJpayrollsystemV = new JFrame();
		frmJpayrollsystemV.setTitle("JPayroll-System v1.0");
		frmJpayrollsystemV.setResizable(false);
		frmJpayrollsystemV.setBounds(100, 100, 757, 514);
		frmJpayrollsystemV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJpayrollsystemV.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		frmJpayrollsystemV.getContentPane().add(panel, "name_6169108087072");
		panel.setLayout(null);
		
		internalFrame = new JInternalFrame("Login Form");
		internalFrame.setMaximizable(true);
		internalFrame.setIconifiable(true);
		internalFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		internalFrame.setClosable(true);
		internalFrame.setBounds(127, 81, 384, 231);
		panel.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(61, 49, 95, 32);
		internalFrame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(129, 55, 145, 20);
		internalFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(61, 92, 95, 32);
		internalFrame.getContentPane().add(lblPassword);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
		
				try{
					String sql = "SELECT * FROM auth_table WHERE username=? and password=?";
					pst = dbconn.con.prepareStatement(sql);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					rs1 = pst.executeQuery();
					
					if(rs1.next()){
						JOptionPane.showMessageDialog(null, "Login successful! Welcome " + textField.getText() + "!");
						internalFrame.setVisible(false);
						textField.setText("");
						passwordField.setText("");
						
						
						mnRecords.setEnabled(true);
						mnPayroll.setEnabled(true);
						mnAbout.setEnabled(true);
						
						
						
						
						
					}else{
						JOptionPane.showMessageDialog(null, "Incorrect username or password!");
					}
					
					
					
				}catch(Exception exp){
					JOptionPane.showMessageDialog(null, exp);
				}
			
			
			
			}
		});
		btnSubmit.setBounds(154, 129, 89, 23);
		internalFrame.getContentPane().add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(129, 98, 145, 20);
		internalFrame.getContentPane().add(passwordField);
		
		panel_1 = new JPanel();
		panel_1.setVisible(false);
		frmJpayrollsystemV.getContentPane().add(panel_1, "name_6175903313107");
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		JLabel lblFirstName = new JLabel("First name :");
		lblFirstName.setBounds(10, 52, 67, 28);
		panel_1.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 56, 120, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(87, 95, 120, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(10, 91, 67, 28);
		panel_1.add(lblLastName);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 124, 67, 28);
		panel_1.add(lblPosition);
		
		textField_3 = new JTextField();
		textField_3.setBounds(87, 128, 120, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10, 158, 81, 28);
		panel_1.add(lblDepartment);
		
		textField_4 = new JTextField();
		textField_4.setBounds(87, 162, 120, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Date hired", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(17, 207, 372, 51);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setBounds(6, 16, 67, 28);
		panel_4.add(lblMonth);
		
		comboBox = new JComboBox();
		comboBox.setBounds(49, 20, 92, 20);
		panel_4.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		
		JLabel lblDay = new JLabel("Date:");
		lblDay.setBounds(151, 23, 46, 14);
		panel_4.add(lblDay);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(187, 20, 46, 20);
		panel_4.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setBounds(243, 23, 46, 14);
		panel_4.add(lblYear);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(299, 20, 67, 20);
		panel_4.add(comboBox_2);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(243, 124, 46, 28);
		panel_1.add(lblStatus);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Probitionary", "Casual", "Contractual", "Regular", "Terminated", "Resigned"}));
		comboBox_3.setBounds(295, 128, 94, 20);
		panel_1.add(comboBox_3);
		
		JLabel lblMonthlySalary = new JLabel("Monthly Salary:");
		lblMonthlySalary.setBounds(243, 162, 94, 21);
		panel_1.add(lblMonthlySalary);
		
		textField_5 = new JTextField();
		textField_5.setBounds(336, 162, 120, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
				try{
					
					int updateconfirm = JOptionPane.showConfirmDialog(null, "Are you sure to update?", "Update Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					
					if(updateconfirm == JOptionPane.YES_OPTION){
					
					st = dbconn.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
					String sql = "SELECT * FROM employee_records";
					rs = st.executeQuery(sql);
					
					
					rs.last();
					rs.moveToInsertRow();
					
					rs.updateString("firstname", textField_1.getText());
					rs.updateString("lastname", textField_2.getText());
					rs.updateString("position", textField_3.getText());
					rs.updateString("department", textField_4.getText());
					
					//combo box
					
					String month = (String) comboBox.getSelectedItem();
					
					String monthNum = "";
					
					switch(month){
					
					case "January":
						monthNum = "01";
						break;
					case "February":
						monthNum = "02";
						break;
					case "March":
						monthNum ="03";
						break;
					case "April":
						monthNum = "04";
						break;
					case "May":
						monthNum = "05";
						break;
					case "June":
						monthNum = "06";
						break;
					case "July":
						monthNum = "07";
						break;
					case "August":
						monthNum = "08";
						break;
					case "September":
						monthNum = "09";
						break;
					case "October":
						monthNum = "10";
						break;
					case "November":
						monthNum = "11";
						break;
					case "December":
						monthNum = "12";
						break;	
					
					}
					
					String datehired = (String) comboBox_1.getSelectedItem();
					String yearhired = (String) comboBox_2.getSelectedItem();
					
					rs.updateString("date_hired", monthNum+ "/"+datehired+ "/" +yearhired);
					
					String status = (String) comboBox_3.getSelectedItem();
					
					rs.updateString("status", status);
					rs.updateInt("monthly_salary", Integer.parseInt(textField_5.getText()));
					
					rs.insertRow();
					//dbconn.con.commit();
					//nagkaron ng problem sa autocommit=true kaya naka comment out yung commit()
					/*rs.close();
					st.close();
					dbconn.con.close();*/
					
					JOptionPane.showMessageDialog(null, "Add new employee successful!");
					
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					rs.first();
					}
				}catch(Exception exp){
					JOptionPane.showMessageDialog(null, exp);
				}
			
			
			}
		});
		btnSave.setBounds(173, 269, 89, 23);
		panel_1.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(272, 269, 89, 23);
		panel_1.add(btnCancel);
		
		JLabel lblEmployeeId_1 = new JLabel("Employee ID:");
		lblEmployeeId_1.setBounds(10, 13, 67, 28);
		panel_1.add(lblEmployeeId_1);
		
		textField_14 = new JTextField();
		textField_14.setBounds(87, 17, 120, 20);
		panel_1.add(textField_14);
		textField_14.setColumns(10);
		
		panel_2 = new JPanel();
		frmJpayrollsystemV.getContentPane().add(panel_2, "name_1561008102140");
		panel_2.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(108, 53, 150, 26);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		
		JLabel lblFirstName_1 = new JLabel("First name:");
		lblFirstName_1.setBounds(26, 49, 91, 35);
		panel_2.add(lblFirstName_1);
		
		JLabel lblLastName_1 = new JLabel("Last name:");
		lblLastName_1.setBounds(26, 90, 91, 35);
		panel_2.add(lblLastName_1);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(108, 94, 150, 26);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPosition_1 = new JLabel("Position:");
		lblPosition_1.setBounds(26, 131, 91, 35);
		panel_2.add(lblPosition_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(108, 136, 150, 26);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblDepartment_1 = new JLabel("Department:");
		lblDepartment_1.setBounds(26, 172, 91, 35);
		panel_2.add(lblDepartment_1);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(108, 176, 150, 26);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblDateHired = new JLabel("Date Hired:");
		lblDateHired.setBounds(26, 213, 91, 35);
		panel_2.add(lblDateHired);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(108, 217, 150, 26);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblmmddyyy = new JLabel("(mm/dd/yyyy)");
		lblmmddyyy.setBounds(268, 217, 101, 26);
		panel_2.add(lblmmddyyy);
		
		JLabel lblStatus_1 = new JLabel("Status:");
		lblStatus_1.setBounds(26, 254, 91, 35);
		panel_2.add(lblStatus_1);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(108, 258, 150, 26);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblMontlySalary = new JLabel("Montly Salary:");
		lblMontlySalary.setBounds(26, 295, 91, 35);
		panel_2.add(lblMontlySalary);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(108, 300, 150, 26);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(26, 11, 91, 35);
		panel_2.add(lblEmployeeId);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(108, 15, 79, 26);
		panel_2.add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				btnUpdate.setEnabled(true);
				btnSaveUpdate.setEnabled(false);
			
				try{
					
					
					
					
					if(rs.previous()){
						repopulate();
					}else{
						rs.first();
						JOptionPane.showMessageDialog(null, "You have reached the first record");
					}
					
					
				}catch(Exception exp){
					JOptionPane.showMessageDialog(null, exp);
				}
			
			
			
			
			}
		});
		btnPrevious.setBounds(71, 356, 89, 23);
		panel_2.add(btnPrevious);
		
		btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				btnUpdate.setEnabled(true);
				btnSaveUpdate.setEnabled(false);
				
				try{
				
					
					if(rs.next()){
						repopulate();
					}else{
						rs.last();
						JOptionPane.showMessageDialog(null, "You have reach the last record");
					}
					
					
				}catch(Exception exp){
					JOptionPane.showMessageDialog(null, exp + "error next");
				}
			
			
			}
		});
		btnNext.setBounds(170, 356, 89, 23);
		panel_2.add(btnNext);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to update this record?", "Update Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
				if(confirm == JOptionPane.YES_OPTION){
					
					
					textField_6.setEditable(true);
					textField_7.setEditable(true);
					textField_8.setEditable(true);
					textField_9.setEditable(true);
					textField_10.setEditable(true);
					textField_11.setEditable(true);
					textField_12.setEditable(true);
					btnUpdate.setEnabled(false);
					btnSaveUpdate.setEnabled(true);
					
					
				}
				
			
			}
		});
		btnUpdate.setBounds(283, 137, 115, 23);
		panel_2.add(btnUpdate);
		
		btnSaveUpdate = new JButton("Save Update");
		btnSaveUpdate.setEnabled(false);
		btnSaveUpdate.setBounds(283, 166, 115, 23);
		panel_2.add(btnSaveUpdate);
		
		panel_3 = new JPanel();
		frmJpayrollsystemV.getContentPane().add(panel_3, "name_1569123679117");
		panel_3.setLayout(null);
		panel_3.setVisible(false);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Employee Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(30, 24, 509, 161);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(6, 16, 58, 30);
		panel_5.add(lblDate);
		
		textField_15 = new JTextField();
		textField_15.setBounds(53, 21, 86, 20);
		panel_5.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblEmployeeId_2 = new JLabel("Employee ID:");
		lblEmployeeId_2.setBounds(6, 52, 100, 30);
		panel_5.add(lblEmployeeId_2);
		
		textField_16 = new JTextField();
		textField_16.setBounds(82, 57, 63, 20);
		panel_5.add(textField_16);
		textField_16.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(149, 56, 84, 23);
		panel_5.add(btnSearch);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(6, 88, 100, 30);
		panel_5.add(lblEmployeeName);
		
		textField_17 = new JTextField();
		textField_17.setBounds(111, 93, 136, 20);
		panel_5.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblEmployeeDepartment = new JLabel("Employee Dept:");
		lblEmployeeDepartment.setBounds(6, 124, 100, 30);
		panel_5.add(lblEmployeeDepartment);
		
		textField_18 = new JTextField();
		textField_18.setBounds(111, 129, 136, 20);
		panel_5.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblPosition_2 = new JLabel("Position:");
		lblPosition_2.setBounds(257, 93, 63, 20);
		panel_5.add(lblPosition_2);
		
		textField_19 = new JTextField();
		textField_19.setBounds(317, 93, 136, 20);
		panel_5.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblStatus_2 = new JLabel("Salary:");
		lblStatus_2.setBounds(257, 124, 58, 30);
		panel_5.add(lblStatus_2);
		
		textField_20 = new JTextField();
		textField_20.setBounds(317, 129, 136, 20);
		panel_5.add(textField_20);
		textField_20.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Deductions", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(251, 195, 427, 259);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblSssContribution = new JLabel("SSS Contribution:");
		lblSssContribution.setBounds(6, 16, 100, 30);
		panel_6.add(lblSssContribution);
		
		textField_23 = new JTextField();
		textField_23.setBounds(116, 21, 86, 20);
		panel_6.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblPagibigContribution = new JLabel("Pag-Ibig Cont:");
		lblPagibigContribution.setBounds(6, 52, 100, 30);
		panel_6.add(lblPagibigContribution);
		
		textField_21 = new JTextField();
		textField_21.setBounds(116, 57, 86, 20);
		panel_6.add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblWholdingTax = new JLabel("W/Holding Tax:");
		lblWholdingTax.setBounds(6, 88, 100, 30);
		panel_6.add(lblWholdingTax);
		
		textField_22 = new JTextField();
		textField_22.setBounds(116, 93, 86, 20);
		panel_6.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblPhilHealth = new JLabel("Phil. Health:");
		lblPhilHealth.setBounds(6, 124, 100, 30);
		panel_6.add(lblPhilHealth);
		
		textField_24 = new JTextField();
		textField_24.setBounds(116, 129, 86, 20);
		panel_6.add(textField_24);
		textField_24.setColumns(10);
		
		JButton btnSssLoan = new JButton("SSS Loan");
		btnSssLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textField_25.setVisible(true);
			
			
			}
		});
		btnSssLoan.setBounds(221, 20, 100, 23);
		panel_6.add(btnSssLoan);
		
		textField_25 = new JTextField();
		textField_25.setBounds(331, 21, 86, 20);
		panel_6.add(textField_25);
		textField_25.setColumns(10);
		textField_25.setVisible(false);
		
		
		JButton btnNewButton = new JButton("HDMF Loan");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
				textField_26.setVisible(true);
			
			
			}
		});
		btnNewButton.setBounds(221, 56, 100, 23);
		panel_6.add(btnNewButton);
		
		textField_26 = new JTextField();
		textField_26.setBounds(331, 57, 86, 20);
		panel_6.add(textField_26);
		textField_26.setColumns(10);
		textField_26.setVisible(false);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(6, 165, 100, 20);
		panel_6.add(comboBox_4);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Other loan", "Salary Loan", "Emergency Loan"}));
		
		textField_27 = new JTextField();
		textField_27.setBounds(116, 165, 86, 20);
		panel_6.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblTotalDeduction = new JLabel("Total Deduction:");
		lblTotalDeduction.setBounds(6, 207, 100, 24);
		panel_6.add(lblTotalDeduction);
		
		textField_28 = new JTextField();
		textField_28.setBounds(116, 209, 86, 20);
		panel_6.add(textField_28);
		textField_28.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.setBounds(212, 208, 89, 23);
		panel_6.add(btnCompute);
		
		JLabel lblNoOfAbsences = new JLabel("No. of Absences");
		lblNoOfAbsences.setBounds(221, 92, 100, 22);
		panel_6.add(lblNoOfAbsences);
		
		textField_34 = new JTextField();
		textField_34.setBounds(331, 93, 86, 20);
		panel_6.add(textField_34);
		textField_34.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Gross", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(24, 193, 197, 144);
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary:");
		lblBasicSalary.setBounds(6, 16, 86, 27);
		panel_7.add(lblBasicSalary);
		
		textField_29 = new JTextField();
		textField_29.setBounds(90, 19, 86, 20);
		panel_7.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel lblCola = new JLabel("C.O.L.A :");
		lblCola.setBounds(6, 54, 61, 14);
		panel_7.add(lblCola);
		
		textField_30 = new JTextField();
		textField_30.setBounds(90, 51, 86, 20);
		panel_7.add(textField_30);
		textField_30.setColumns(10);
		
		JLabel lblBenefits = new JLabel("Benefits:");
		lblBenefits.setBounds(6, 85, 74, 14);
		panel_7.add(lblBenefits);
		
		textField_31 = new JTextField();
		textField_31.setBounds(90, 82, 86, 20);
		panel_7.add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblGrossPay = new JLabel("Gross Pay:");
		lblGrossPay.setBounds(6, 120, 61, 14);
		panel_7.add(lblGrossPay);
		
		textField_32 = new JTextField();
		textField_32.setBounds(90, 117, 86, 20);
		panel_7.add(textField_32);
		textField_32.setColumns(10);
		
		JLabel lblPhp = new JLabel("Php:");
		lblPhp.setBounds(44, 369, 46, 14);
		panel_3.add(lblPhp);
		
		textField_33 = new JTextField();
		textField_33.setBounds(79, 366, 86, 20);
		panel_3.add(textField_33);
		textField_33.setColumns(10);
		
		JButton btnComputeNetpay = new JButton("Compute Netpay");
		btnComputeNetpay.setBounds(56, 394, 131, 27);
		panel_3.add(btnComputeNetpay);
		
		JButton btnClearAll = new JButton("CLEAR ALL");
		btnClearAll.setBounds(572, 99, 89, 23);
		panel_3.add(btnClearAll);
		
		JMenuBar menuBar = new JMenuBar();
		frmJpayrollsystemV.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Authentication");
		menuBar.add(mnFile);
		
		mntmLogIn = new JMenuItem("Log In");
		mntmLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
			mntmLogout.setEnabled(true);
			mntmLogIn.setEnabled(false);
			internalFrame.setVisible(true);			
			
			}
		});
		mnFile.add(mntmLogIn);
		
		mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			panel_1.setVisible(false);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
			panel.setVisible(true);
			mntmLogout.setEnabled(false);
			mntmLogIn.setEnabled(true);
			
			
			}
		});
		mnFile.add(mntmLogout);
		mntmLogout.setEnabled(false);
		
		mnRecords = new JMenu("Records");
		menuBar.add(mnRecords);
		mnRecords.setEnabled(false);
		
		JMenuItem mntmAddRecord = new JMenuItem("Add Record");
		mntmAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				panel.setVisible(false);
				panel_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
			}
		});
		mnRecords.add(mntmAddRecord);
		
		JMenuItem mntmViewRecord = new JMenuItem("View/Edit Record");
		mntmViewRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				
			
			
			}
		});
		mnRecords.add(mntmViewRecord);
		
		mnPayroll = new JMenu("Payroll");
		menuBar.add(mnPayroll);
		mnPayroll.setEnabled(false);
		
		JMenuItem mntmGeneratePayroll = new JMenuItem("Generate Payroll");
		mntmGeneratePayroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
			
			
			
			}
		});
		mnPayroll.add(mntmGeneratePayroll);
		
		JMenuItem mntmViewPayroll = new JMenuItem("View Payroll");
		mnPayroll.add(mntmViewPayroll);
		
		mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		mnAbout.setEnabled(false);
	}

	public void repopulate(){
		
		try{
			
			
			
			
			textField_13.setText(Integer.toString(rs.getInt("emp_id")));
			textField_6.setText(rs.getString("firstname"));
			textField_7.setText(rs.getString("lastname"));
			textField_8.setText(rs.getString("position"));
			textField_9.setText(rs.getString("department"));
			textField_10.setText(rs.getString("date_hired"));
			textField_11.setText(rs.getString("status"));
			textField_12.setText(Integer.toString(rs.getInt("monthly_salary")));
			
			
			
		}catch(Exception exp){
			JOptionPane.showMessageDialog(null, exp);
		}
		
		
		
	}


	public void  putdata(){
		
		
		try{
		st = dbconn.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String sql = "SELECT * FROM employee_records";
		rs = st.executeQuery(sql);
		
		rs.next();
		textField_13.setText(Integer.toString(rs.getInt("emp_id")));
		textField_6.setText(rs.getString("firstname"));
		textField_7.setText(rs.getString("lastname"));
		textField_8.setText(rs.getString("position"));
		textField_9.setText(rs.getString("department"));
		textField_10.setText(rs.getString("date_hired"));
		textField_11.setText(rs.getString("status"));
		textField_12.setText(Integer.toString(rs.getInt("monthly_salary")));
		
		
		}catch(Exception exp){
			JOptionPane.showMessageDialog(null, exp);
		}
	}
}
