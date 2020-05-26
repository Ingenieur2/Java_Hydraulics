import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.nio.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import javax.swing.JScrollPane;


public class Window_01 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
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
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	public JTextField textField_34;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_01 window = new Window_01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the application.
	 */
	public Window_01() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame();
		frame.setForeground(Color.GRAY);
		frame.setTitle("Calculation of centrifugal wheel");	
		frame.setBounds(200, 250, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmMenuItem = new JMenuItem("Main dimensions and parameters");
		mntmMenuItem.setFont(new Font("Nyala", Font.PLAIN, 20));
		if (mntmMenuItem.isSelected()) {
			
	//		frame.setVisible(true);
		} else {
	//		frame.setVisible(false);
		}
		menuBar.add(mntmMenuItem);
		
		JMenuItem mntmMenuItem_1 = new JMenuItem("Meridional cross section");
		mntmMenuItem_1.setFont(new Font("Nyala", Font.PLAIN, 20));
		menuBar.add(mntmMenuItem_1);
		
		frame.getContentPane().setLayout(null);
		
		
		mntmMenuItem.setSelected(true);
		if (mntmMenuItem.isSelected()) {
			mntmMenuItem_1.setSelected(false);
		} else {
			mntmMenuItem_1.setSelected(true);
		};
		
		
		////////////NAMES OF LABELS/////////////
		
		JLabel lblNewLabel = new JLabel("Pump flow rate, m3/hr");
		lblNewLabel.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel.setBounds(5, 5, 160, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pump head, m");
		lblNewLabel_1.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(5, 30, 160, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rotation speed, rpm");
		lblNewLabel_2.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(5, 55, 195, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Net positive suction head, m");
		lblNewLabel_3.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(5, 80, 195, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fluid density, kg/m3");
		lblNewLabel_4.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(5, 105, 195, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Approximate pump efficiency");
		lblNewLabel_5.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(5, 130, 200, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Specific speed");
		lblNewLabel_6.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(5, 155, 200, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Suction-specific speed");
		lblNewLabel_7.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(5, 180, 200, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Safety factor");
		lblNewLabel_8.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(265, 80, 85, 20);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Impeller diameter, mm");
		lblNewLabel_9.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(5, 205, 200, 20);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Outlet width, mm");
		lblNewLabel_10.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(5, 230, 200, 20);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Blade thickness, mm");
		lblNewLabel_11.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(5, 255, 200, 20);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Number of blades");
		lblNewLabel_12.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(5, 280, 200, 20);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Outlet blade angle, deg");
		lblNewLabel_13.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(5, 305, 200, 20);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Hub diameter, mm");
		lblNewLabel_14.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(5, 330, 200, 20);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Suction diameter, mm");
		lblNewLabel_15.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_15.setBounds(5, 355, 200, 20);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Hydraulic efficiency");
		lblNewLabel_16.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_16.setBounds(5, 380, 200, 20);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Theoretical head, m");
		lblNewLabel_17.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_17.setBounds(5, 405, 200, 20);
		frame.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Pump head, m");
		lblNewLabel_18.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_18.setBounds(5, 430, 200, 20);
		frame.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Wheel's flow rate, m3/hr");
		lblNewLabel_19.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_19.setBounds(405, 5, 215, 20);
		frame.getContentPane().add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Value of gap seal, mm");
		lblNewLabel_20.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_20.setBounds(405, 30, 215, 20);
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Length of gap seal, mm");
		lblNewLabel_21.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_21.setBounds(405, 55, 215, 20);
		frame.getContentPane().add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Coefficient of Swirling flow");
		lblNewLabel_22.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_22.setBounds(405, 80, 195, 20);
		frame.getContentPane().add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Viscosity, mm2/s");
		lblNewLabel_23.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_23.setBounds(405, 105, 215, 20);
		frame.getContentPane().add(lblNewLabel_23);
				
		JLabel lblNewLabel_24 = new JLabel("Approximate wheel efficiency");
		lblNewLabel_24.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_24.setBounds(405, 130, 215, 20);
		frame.getContentPane().add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Coefficient of friction resistance");
		lblNewLabel_25.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_25.setBounds(405, 155, 215, 20);
		frame.getContentPane().add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Flow coefficient MYU");
		lblNewLabel_26.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_26.setBounds(405, 180, 215, 20);
		frame.getContentPane().add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Reynolds number Re");
		lblNewLabel_27.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_27.setBounds(405, 205, 215, 20);
		frame.getContentPane().add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("Leakage flow, m3/hr");
		lblNewLabel_28.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_28.setBounds(405, 230, 215, 20);
		frame.getContentPane().add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Q_summ, mm");
		lblNewLabel_29.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_29.setBounds(405, 255, 215, 20);
		frame.getContentPane().add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Volume Efficiency");
		lblNewLabel_30.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_30.setBounds(405, 280, 215, 20);
		frame.getContentPane().add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("H_stat, m");
		lblNewLabel_31.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_31.setBounds(405, 305, 215, 20);
		frame.getContentPane().add(lblNewLabel_31);
		

		JLabel lblNewLabel_32 = new JLabel("Hub diameter after wheel, mm");
		lblNewLabel_32.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_32.setBounds(405, 330, 215, 20);
		frame.getContentPane().add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Seal's diameter, mm");
		lblNewLabel_33.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_33.setBounds(405, 355, 215, 20);
		frame.getContentPane().add(lblNewLabel_33);
		
		JLabel lblNewLabel_49 = new JLabel("K_0 =");							
		lblNewLabel_49.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_49.setBounds(265, 355, 45, 20);
		frame.getContentPane().add(lblNewLabel_49);
		
		JLabel lblNewLabel_50 = new JLabel("Output flow velosity (Abs), m/s");									
		lblNewLabel_50.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_50.setBounds(405, 380, 215, 20);
		frame.getContentPane().add(lblNewLabel_50);
		
		JLabel lblNewLabel_52 = new JLabel("Output angle of flow, deg");									
		lblNewLabel_52.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_52.setBounds(405, 405, 215, 20);
		frame.getContentPane().add(lblNewLabel_52);

		JLabel lblNewLabel_57 = new JLabel("Static inlet pressure, MPa");							
		lblNewLabel_57.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_57.setBounds(5, 455, 165, 20);
		frame.getContentPane().add(lblNewLabel_57);
		
		JLabel lblNewLabel_59 = new JLabel("Summary Axial Force, N");							
		lblNewLabel_59.setFont(new Font("Nyala", Font.PLAIN, 18));
		lblNewLabel_59.setBounds(5, 480, 165, 20);
		frame.getContentPane().add(lblNewLabel_59);
		


		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblNewLabel_34 = new JLabel("-----");							//for flow coefficient 1
		lblNewLabel_34.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_34.setBounds(620, 180, 165, 20);
		frame.getContentPane().add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("-----");							//for reynolds number 1
		lblNewLabel_35.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_35.setBounds(620, 205, 165, 20);
		frame.getContentPane().add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("-----");							//for Leakage flow 1
		lblNewLabel_36.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_36.setBounds(620, 230, 165, 20);
		frame.getContentPane().add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("-----");							//for Summary flow rate 
		lblNewLabel_37.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_37.setBounds(620, 255, 165, 20);
		frame.getContentPane().add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("-----"); 							//for Volume efficiency
		lblNewLabel_38.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_38.setBounds(620, 280, 165, 20);
		frame.getContentPane().add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel("-----");							//for Static wheel's head 
		lblNewLabel_39.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_39.setBounds(620, 305, 165, 20);
		frame.getContentPane().add(lblNewLabel_39);	
		
		JLabel lblNewLabel_40 = new JLabel("-----");							//for Specific speed
		lblNewLabel_40.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_40.setBounds(205, 155, 170, 20);
		frame.getContentPane().add(lblNewLabel_40);
		
		JLabel lblNewLabel_41 = new JLabel("-----");							//for Suction-specific speed  
		lblNewLabel_41.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_41.setBounds(205, 180, 80, 20);
		frame.getContentPane().add(lblNewLabel_41);
		
		JLabel lblNewLabel_42 = new JLabel("-----");							//for Theoretical head
		lblNewLabel_42.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_42.setBounds(205, 405, 200, 20);
		frame.getContentPane().add(lblNewLabel_42);

		JLabel lblNewLabel_43 = new JLabel("-----");							//for flow coefficient 2
		lblNewLabel_43.setEnabled(false);	lblNewLabel_43.setVisible(false);
		lblNewLabel_43.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_43.setBounds(795, 180, 165, 20);
		frame.getContentPane().add(lblNewLabel_43);
		
		JLabel lblNewLabel_44 = new JLabel("-----");							//for reynolds number 2
		lblNewLabel_44.setEnabled(false);	lblNewLabel_44.setVisible(false);
		lblNewLabel_44.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_44.setBounds(795, 205, 165, 20);
		frame.getContentPane().add(lblNewLabel_44);
		
		JLabel lblNewLabel_45 = new JLabel("-----");							//for Leakage flow 2
		lblNewLabel_45.setEnabled(false);	lblNewLabel_45.setVisible(false);
		lblNewLabel_45.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_45.setBounds(795, 230, 165, 20);
		frame.getContentPane().add(lblNewLabel_45);
	
		JLabel lblNewLabel_46 = new JLabel("-----");							//for help : D_2
		lblNewLabel_46.setEnabled(false);	lblNewLabel_46.setVisible(false);
		lblNewLabel_46.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_46.setBounds(285, 205, 185, 20);
		frame.getContentPane().add(lblNewLabel_46);
		
		JLabel lblNewLabel_47 = new JLabel("-----");							//for help : b_2
		lblNewLabel_47.setEnabled(false);	lblNewLabel_47.setVisible(false);
		lblNewLabel_47.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_47.setBounds(285, 230, 185, 20);
		frame.getContentPane().add(lblNewLabel_47);
		
		JLabel lblNewLabel_48 = new JLabel("");									//for K_0
		lblNewLabel_48.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_48.setBounds(310, 355, 85, 20);
		frame.getContentPane().add(lblNewLabel_48);
		
		JLabel lblNewLabel_51 = new JLabel("-----");									//for V_abs2
		lblNewLabel_51.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_51.setBounds(620, 380, 200, 20);
		frame.getContentPane().add(lblNewLabel_51);
		
		JLabel lblNewLabel_53 = new JLabel("-----");									//for betta_2
		lblNewLabel_53.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_53.setBounds(620, 405, 200, 20);
		frame.getContentPane().add(lblNewLabel_53);
		
		JLabel lblNewLabel_54 = new JLabel("-----");							//for flow coefficient 3
		lblNewLabel_54.setEnabled(false);	lblNewLabel_54.setVisible(false);
		lblNewLabel_54.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_54.setBounds(970, 180, 165, 20);
		frame.getContentPane().add(lblNewLabel_54);
		
		JLabel lblNewLabel_55 = new JLabel("-----");							//for reynolds number 3
		lblNewLabel_55.setEnabled(false);	lblNewLabel_55.setVisible(false);
		lblNewLabel_55.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_55.setBounds(970, 205, 165, 20);
		frame.getContentPane().add(lblNewLabel_55);
		
		JLabel lblNewLabel_56 = new JLabel("-----");							//for Leakage flow 3
		lblNewLabel_56.setEnabled(false);	lblNewLabel_56.setVisible(false);
		lblNewLabel_56.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_56.setBounds(970, 230, 165, 20);
		frame.getContentPane().add(lblNewLabel_56);  
		

		
		
		JLabel lblNewLabel_60 = new JLabel("-----");							//for Summary Axial Force
		lblNewLabel_60.setFont(new Font("Courier New", Font.PLAIN, 15));
		lblNewLabel_60.setBounds(205, 480, 165, 20);
		frame.getContentPane().add(lblNewLabel_60);
			
		JCheckBox chckbxNewCheckBox = new JCheckBox("Presence of the second seal");
		chckbxNewCheckBox.setFont(new Font("Nyala", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(685, 5, 220, 20);
		chckbxNewCheckBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxNewCheckBox.isSelected()) {
					textField_25.setEnabled(true); textField_25.setVisible(true);
					textField_26.setEnabled(true); textField_26.setVisible(true);
					textField_27.setEnabled(true); textField_27.setVisible(true);
					textField_28.setEnabled(true); textField_28.setVisible(true);
					textField_29.setEnabled(true); textField_29.setVisible(true);
					lblNewLabel_43.setEnabled(true);	lblNewLabel_43.setVisible(true);
					lblNewLabel_44.setEnabled(true);	lblNewLabel_44.setVisible(true);
					lblNewLabel_45.setEnabled(true);	lblNewLabel_45.setVisible(true);
				} else {
					textField_25.setEnabled(false); textField_25.setVisible(false);
					textField_26.setEnabled(false); textField_26.setVisible(false);
					textField_27.setEnabled(false); textField_27.setVisible(false);
					textField_28.setEnabled(false); textField_28.setVisible(false);
					textField_29.setEnabled(false); textField_29.setVisible(false);
					lblNewLabel_43.setEnabled(false);	lblNewLabel_43.setVisible(false);
					lblNewLabel_44.setEnabled(false);	lblNewLabel_44.setVisible(false);
					lblNewLabel_45.setEnabled(false);	lblNewLabel_45.setVisible(false);
					
				}
			}
		});
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Presence of the next stage");
		chckbxNewCheckBox_1.setEnabled(false);
		chckbxNewCheckBox_1.setFont(new Font("Nyala", Font.PLAIN, 18));
		chckbxNewCheckBox_1.setBounds(920, 5, 220, 20);
		chckbxNewCheckBox_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String d_seal_2 = textField_23.getText();			//Seal's diameter 1, mm   				
				textField_34.setText(d_seal_2);
				if (chckbxNewCheckBox_1.isSelected()) {
					textField_30.setEnabled(true); textField_30.setVisible(true);
					textField_31.setEnabled(true); textField_31.setVisible(true);
					textField_32.setEnabled(true); textField_32.setVisible(true);
					textField_33.setEnabled(true); textField_33.setVisible(true);
					textField_34.setEnabled(true); textField_34.setVisible(true);
					lblNewLabel_54.setEnabled(true);	lblNewLabel_54.setVisible(true);
					lblNewLabel_55.setEnabled(true);	lblNewLabel_55.setVisible(true);
					lblNewLabel_56.setEnabled(true);	lblNewLabel_56.setVisible(true);
				} else {
					textField_30.setEnabled(false); textField_30.setVisible(false);
					textField_31.setEnabled(false); textField_31.setVisible(false);
					textField_32.setEnabled(false); textField_32.setVisible(false);
					textField_33.setEnabled(false); textField_33.setVisible(false);
					textField_34.setEnabled(false); textField_34.setVisible(false);
					lblNewLabel_54.setEnabled(false);	lblNewLabel_54.setVisible(false);
					lblNewLabel_55.setEnabled(false);	lblNewLabel_55.setVisible(false);
					lblNewLabel_56.setEnabled(false);	lblNewLabel_56.setVisible(false);
					
				}
			}
		});
		frame.getContentPane().add(chckbxNewCheckBox_1);
	
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Automatic");
		chckbxNewCheckBox_3.setFont(new Font("Nyala", Font.PLAIN, 18));
		chckbxNewCheckBox_3.setBounds(855, 155, 100, 20);
		chckbxNewCheckBox_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxNewCheckBox_3.isSelected()) {
					
				} else {

																															//{"1","2","3","4","5","6","7","8","9","0","."}
				}
			}
		});
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Help");
		
		chckbxNewCheckBox_2.setFont(new Font("Nyala", Font.PLAIN, 18));
		chckbxNewCheckBox_2.setBounds(285, 180, 60, 20);
		chckbxNewCheckBox_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxNewCheckBox_2.isSelected()) {
					chckbxNewCheckBox_2.setToolTipText("Switch twice to refresh");
					lblNewLabel_46.setEnabled(true);	lblNewLabel_46.setVisible(true);
					lblNewLabel_47.setEnabled(true);	lblNewLabel_47.setVisible(true);
				Double Q				= Double.parseDouble(textField.getText())/3600.0;				//Pump flow rate, m3/hr-->
				Double H				= Double.parseDouble(textField_1.getText());				//Pump head, m	
				Double n				= Double.parseDouble(textField_2.getText());				//Rotation speed, rpm
				Double n_s				= 3.65*n*Math.sqrt(Q)/ Math.pow(H, 0.75) ;			//Specific speed
				
				Double 	D_head 			= Math.sqrt(2.0*9.81*H)/n; 						//	D_napor:= sqrt(2*9.81*H)/n; 
				Double D_2_head			= 18.75*D_head*Math.pow((n_s/100.0), (1.0/6.0));    	//	 D_2_napor:=18.75*D_napor*Exp((1/6)*Ln(n_s/100)); 
				Double b_2_head			= 1.3*D_head*Math.pow((n_s/100.0), (1.0/6.0));		//	 b_2_napor:=1.3*D_napor*Exp((1/6)*Ln(n_s/100));
				
				Double D_flow			= Math.pow((Q/n), (1.0/3.0));
				Double D_2_flow			= 9.35*D_flow/(Math.sqrt(n_s/100.0));
				Double b_2_flow			= 6.8*0.01*D_2_flow*Math.pow((n_s/100.0), (4.0/3.0));
				
				Double D_frequency		= Math.sqrt( Q/ ( Math.sqrt(2.0*9.81*H) ) );
				Double D_2_frequency	= 6.536*D_frequency/Math.pow((n_s/100.0), (5.0/6.0)); 
				Double b_2_frequency	= 0.443*D_frequency*Math.sqrt(n_s/100.0);
				
				Double D_2_average		= 1000.0*(D_2_head+D_2_flow+D_2_frequency)/3.0;				// m -->>mm
				Double b_2_average		= 1000.0*(b_2_head+b_2_flow+b_2_frequency)/3.0;				// m -->>mm
				
				Double D_2_average_1	= new BigDecimal(D_2_average).setScale(3, RoundingMode.UP).doubleValue();  //rounding of  D_2_average
				Double b_2_average_1	= new BigDecimal(b_2_average).setScale(3, RoundingMode.UP).doubleValue();  //rounding of  D_2_average
				
				lblNewLabel_46.setText(D_2_average_1.toString());
				lblNewLabel_47.setText(b_2_average_1.toString());
									
				} else {
					chckbxNewCheckBox_2.setToolTipText("Switch to calculate");
					lblNewLabel_46.setEnabled(false);	lblNewLabel_46.setVisible(false);
					lblNewLabel_47.setEnabled(false);	lblNewLabel_47.setVisible(false);
										
				}
			}
		});		
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		//group = new ButtonGroup();

		
		JButton btnNewButton = new JButton("Calculation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final Double g = 9.81;
	
			Double	Q		= Double.parseDouble(textField.getText())/3600;				//Pump flow rate, m3/hr-->m3/SEC
			Double	Q_summ_1= 0.05*Q;		
											//	123456789012345678
			while (Math.abs((Q_summ_1-Q))	> 0.000000000000000001) { 
						Q		= Q_summ_1;
				Double H		= Double.parseDouble(textField_1.getText());				//Pump head, m
				Double n		= Double.parseDouble(textField_2.getText());				//Rotation speed, rpm
				Double NPSH		= Double.parseDouble(textField_3.getText());				//Net positive suction head, m
				Double Density	= Double.parseDouble(textField_4.getText());				//Density, kg/m3
				Double S_F		= Double.parseDouble(textField_6.getText());				//Safety factor
				Double n_s		= (3.65*n*Math.sqrt(Q))/ Math.pow(H, 0.75) ;			//Specific speed
				Double SSS		= (n*Math.sqrt(Q))/ Math.pow((0.1*NPSH/S_F), 0.75) ;	//Suction-specific speed
				Double D_2		= Double.parseDouble(textField_7.getText())/1000.0;			//Impeller diameter, mm --> m
				Double b_2		= Double.parseDouble(textField_8.getText())/1000.0;			//Outlet width, mm  --> m
				Double sigma_2	= Double.parseDouble(textField_9.getText())/1000.0;			//Blade thickness, mm --> m
				Double z		= Double.parseDouble(textField_10.getText());				//Number of blades
				Double betta_2	= Math.toRadians(Double.parseDouble(textField_11.getText()));	//Outlet blade angle, deg --> radians
				Double d_hub	= Double.parseDouble(textField_12.getText())/1000.0;			//Hub diameter, mm --> m
				Double d_suc	= Double.parseDouble(textField_13.getText())/1000.0;			//Suction diameter, mm --> m
				Double Eff_Hyd	= Double.parseDouble(textField_14.getText());				//Hydraulic efficiency
				Double fi_1		= Double.parseDouble(textField_19.getText());				//Coefficient of swirling flow 1
				Double fi_2		= Double.parseDouble(textField_27.getText());				//Coefficient of swirling flow 1
				Double P_st_in	= Double.parseDouble(textField_34.getText())*1000000.0;		//Pressure static INLET, MPa --> Pa
				Double y	   = 1.0-(   Math.sin(betta_2)/(  z*Math.sqrt(3.0)/(2.0*Math.PI) + Math.sin(betta_2)  ));	
				Double ksi_2	= 1.0-z*sigma_2/(Math.PI*D_2*Math.sin(betta_2));
				Double U_2		= Math.PI*n*D_2/60.0;
				Double V_2m		= Q/ (Math.PI*D_2*b_2*ksi_2);
				Double V_2u		= y*U_2- V_2m*Math.cos(betta_2) / Math.sin(betta_2);
				Double H_t		= U_2* V_2u/g;	  										//Theoretical head, m
				Double H_res	= H_t*Eff_Hyd;	  										//Pump head, m
				Double V_abs2	= Math.sqrt(Math.pow(V_2m, 2.0)+Math.pow(V_2u, 2.0));		//Output flow velosity (Abs), m/s
				Double bett_out	= Math.toDegrees(Math.atan(V_2m/V_2u));									//Output angle of flow, rad--> deg
				Double n_s_1	= new BigDecimal(n_s).setScale(4, RoundingMode.UP).doubleValue();  //rounding of Specific speed
				Double SSS_1	= new BigDecimal(SSS).setScale(3, RoundingMode.UP).doubleValue();  //rounding of Suction-specific speed							
				lblNewLabel_40.setText(n_s_1.toString());
				lblNewLabel_41.setText(SSS_1.toString());
				lblNewLabel_42.setText(H_t.toString());
				textField_15.setText(H_res.toString());
				
				Double Q_nom	= Double.parseDouble(textField_16.getText())/3600.0;			//Seal's diameter, m3/hr --> m3/s    	//				Double d_seal_3	= Double.parseDouble(textField_34.getText())/1000.0;			//Seal's diameter 3, mm --> m    
				Double d_seal_1	= Double.parseDouble(textField_24.getText())/1000.0;			//Seal's diameter 1, mm --> m    		//				Double delta_3	= Double.parseDouble(textField_30.getText())/1000.0;			//Value of gap seal 3, mm --> m			
				Double d_seal_2	= Double.parseDouble(textField_28.getText())/1000.0;			//Seal's diameter 2, mm --> m    		//				Double lyambda3	= Double.parseDouble(textField_33.getText())		;		//Coefficient of friction resistance 3
				Double delta_1	= Double.parseDouble(textField_17.getText())/1000.0;			//Value of gap seal 1, mm --> m 		//				Double l_gap3	= Double.parseDouble(textField_31.getText())/1000.0;			//Length of gap seal 3, mm --> m
				Double delta_2	= Double.parseDouble(textField_25.getText())/1000.0;			//Value of gap seal 2, mm --> m			//				Double myu31		= 0.01;
				Double nyu		= Double.parseDouble(textField_20.getText())/1000000.0;		//Viscosity, mm2/s --> m2/s    				//				Double u_y3		= 0.12;
				Double lyambda1	= Double.parseDouble(textField_22.getText())		;		//Coefficient of friction resistance 1		//				Double v_03		= 0.15;
				Double lyambda2	= Double.parseDouble(textField_29.getText())		;		//Coefficient of friction resistance 2		//				Double	Q_leak3	= myu31*Math.PI* (d_seal_3+delta_3)* delta_3*Math.sqrt(2*g*H_leak3);
				Double l_gap1	= Double.parseDouble(textField_18.getText())/1000.0;			//Length of gap seal 1, mm --> m		//		        u_y3	= 0.5*omega*(d_seal_3+delta_3);
				Double l_gap2	= Double.parseDouble(textField_26.getText())/1000.0;			//Length of gap seal 2, mm --> m		//				v_03	= Q_leak3/ (Math.PI*(d_seal_3+delta_3)* delta_3);
				Double Eff_wh	= Double.parseDouble(textField_21.getText());				//Approximate wheel efficiency				//				lyambda3	= 0.28316210710108*Math.pow(Rey_2, -0.239175686607085);	textField_33.setText(lyambda1.toString());					
				Double H_leak1	= H_t-(V_2u*V_2u)/(2.0*g)-  Math.pow(U_2,2.0)*(1-Math.pow(((d_seal_1+delta_1)/D_2),2.0))/ (8.0*g);		//				Double lyambda_gap3	= lyambda3*Math.sqrt(1+	0.25/Math.pow(1.0+1.3*Math.sqrt(lyambda3), 2.0)	*	Math.pow(u_y3/v_03, 2.0));							
				Double H_leak2	= H_t-(V_2u*V_2u)/(2.0*g)-  Math.pow(U_2,2.0)*(1-Math.pow(((d_seal_2+delta_2)/D_2),2.0))/ (8.0*g);		//				lyambda*Math.sqrt(1+1/(4*Math.pow((1+1.3*Math.sqrt(lyambda)), 2)*Math.pow(u_y/v_0, 2)));
				Double myu11	= 0.01,	myu12	= 1.2,	myu21	= 0.01,	myu22	= 1.2;
				Double u_y1		= 0.1,	u_y2	= 0.11;
				Double v_01		= 0.13,	v_02	= 0.14;
				Double Rey_1	= 1.0,	Rey_2	= 2.0;
				Double omega	=  Math.PI*n/30.0;
					if (chckbxNewCheckBox.isSelected()) {//0.000000000000001
						while (Math.abs(myu22-myu21)>=0.000000001) {
							Double	Q_leak1	= myu11*Math.PI* (d_seal_1+delta_1)* delta_1*Math.sqrt(2.0*g*H_leak1);
							Double	Q_leak2	= myu21*Math.PI* (d_seal_2+delta_2)* delta_2*Math.sqrt(2.0*g*H_leak2);
							          u_y1	= 0.5*omega*(d_seal_1+delta_1);
							          u_y2	= 0.5*omega*(d_seal_2+delta_2);
							          v_01	= Q_leak1/ (Math.PI*(d_seal_1+delta_1)* delta_1);
							          v_02	= Q_leak2/ (Math.PI*(d_seal_2+delta_2)* delta_2);
							          Rey_1	= 2.0*delta_1 * Math.sqrt(Math.pow(v_01, 2.0)	+	Math.pow(0.5*u_y1, 2.0))/nyu;
							          Rey_2	= 2.0*delta_2 * Math.sqrt(Math.pow(v_02, 2.0)	+	Math.pow(0.5*u_y2, 2.0))/nyu;
							          if (chckbxNewCheckBox_3.isSelected()) {
							        
							        	  
							        	  
							        	  lyambda1	= Math.rint(0.28316210710108*Math.pow(Rey_1, -0.239175686607085)*100000000000.0)/(100000000000.0);	textField_22.setText(lyambda1.toString());    //12345678901
							        	  
							        	  
							        	  lyambda2	= Math.rint(0.28316210710108*Math.pow(Rey_2, -0.239175686607085)*100000000000.0)/(100000000000.0);	textField_29.setText(lyambda1.toString());	
							         
							        	//12345678901
							           // 10000000000.0
							          
							          } 	
							Double lyambda_gap1	= lyambda1*Math.sqrt(1.0+	0.25/Math.pow(1.0+1.3*Math.sqrt(lyambda1), 2.0)	*	Math.pow(u_y1/v_01, 2.0));
							Double lyambda_gap2	= lyambda2*Math.sqrt(1.0+	0.25/Math.pow(1.0+1.3*Math.sqrt(lyambda2), 2.0)	*	Math.pow(u_y2/v_02, 2.0));
						             myu11	= myu12;
						             myu21	= myu22;
						             myu12	= 1.0/Math.sqrt(1.35+lyambda_gap1*l_gap1/(2.0*delta_1));
						             myu22	= 1.0/Math.sqrt(1.35+lyambda_gap2*l_gap2/(2.0*delta_2));
						}  					
					} else {  //0.00000000000001
						while (Math.abs(myu12-myu11)>0.000000001) {
							Double	Q_leak	= myu11*Math.PI* (d_seal_1+delta_1)* delta_1*Math.sqrt(2.0*g*H_leak1);
							          u_y1	= 0.5*omega*(d_seal_1+delta_1);
							          v_01	= Q_leak/ (Math.PI*(d_seal_1+delta_1)* delta_1);
							
							          Rey_1	= 2.0*delta_1 * Math.sqrt(Math.pow(v_01, 2.0)	+	Math.pow(0.5*u_y1, 2.0))/nyu;
							         
							          if (chckbxNewCheckBox_3.isSelected()) {
							        	  lyambda1	= Math.rint(0.28316210710108*Math.pow(Rey_1, -0.239175686607085)*100000000000.0)/(100000000000.0);	textField_22.setText(lyambda1.toString());										
							          }
							Double lyambda_gap1	= lyambda1*Math.sqrt(1.0+	0.25/Math.pow(1.0+1.3*Math.sqrt(lyambda1), 2.0)	*	Math.pow(u_y1/v_01, 2.0));
							
									//lyambda*Math.sqrt(1+1/(4*Math.pow((1+1.3*Math.sqrt(lyambda)), 2)*Math.pow(u_y/v_0, 2)));
						             myu11	= myu12;
						             myu12	= 1.0/Math.sqrt(1.35+lyambda_gap1*l_gap1/(2.0*delta_1));
						}
						myu22=0.0;					
					}
				
				Double  myu1	= myu12;
				Double  myu2	= myu22;
				Double	Q_leak1	= myu1*Math.PI*d_seal_1* delta_1*Math.sqrt(2.0*g*H_leak1);
				Double	Q_leak2	= myu2*Math.PI*d_seal_2* delta_2*Math.sqrt(2.0*g*H_leak2);
				Double  Eff_vol	= Q_nom/ (Q_nom+Q_leak1+Q_leak2);
				Double	Q_leak_1= Q_leak1*3600.0;
				Double	Q_leak_2= Q_leak2*3600.0;						
						Q_summ_1= (Q_nom+Q_leak1+Q_leak2);
				Double  Q_summ	= (Q_nom+Q_leak1+Q_leak2)*3600.0;
					
				Double H_stat	= H_t*Eff_wh - 0.5*Math.pow(V_abs2, 2.0)/g; 						
				   lblNewLabel_34.setText(myu1.toString()); 		lblNewLabel_43.setText(myu2.toString());
				   lblNewLabel_35.setText(Rey_1.toString()); 		lblNewLabel_44.setText(Rey_2.toString());
				   lblNewLabel_36.setText(Q_leak_1.toString());		lblNewLabel_45.setText(Q_leak_2.toString());
				   lblNewLabel_37.setText(Q_summ.toString());
				   lblNewLabel_38.setText(Eff_vol.toString());
				   lblNewLabel_39.setText(H_stat.toString());
				   lblNewLabel_51.setText(V_abs2.toString());
				   lblNewLabel_53.setText(bett_out.toString());
				   textField.setText(Q_summ.toString());
			
				Double v_suc	= 4.0*Q_summ_1/(Math.PI*(Math.pow(d_suc, 2.0) - Math.pow(d_hub, 2.0)));
				Double p_abs	= P_st_in + Math.pow(v_suc, 2.0)*0.5*Density;
				Double P_st_out	= P_st_in+H_stat*Density*g;
				Double F_1, F_2, F_3, F_sum;
				if (chckbxNewCheckBox.isSelected()) {
					F_1	=	0.0;
					F_2	=	Math.PI*0.25*(D_2*D_2 - d_seal_1*d_seal_1)*(P_st_out-Math.pow((0.25*fi_1*omega), 2.0)*Density*(D_2*D_2 - d_seal_1*d_seal_1));
					F_3 =	Math.PI*0.25*(D_2*D_2 - d_seal_2*d_seal_2)*(P_st_out-Math.pow((0.25*fi_2*omega), 2.0)*Density*(D_2*D_2 - d_seal_2*d_seal_2));
				} else {
					
					F_1	=	p_abs*Math.PI*0.25*(d_seal_1*d_seal_1 - d_hub*d_hub);
					F_2	=	Math.PI*0.25*(D_2*D_2 - d_seal_1*d_seal_1)*(P_st_out-Math.pow((0.25*fi_1*omega), 2.0)*Density*(D_2*D_2 - d_seal_1*d_seal_1));
					F_3 =	Math.PI*0.25*(D_2*D_2 - d_hub   *d_hub)   *(P_st_out-Math.pow((0.25*fi_2*omega), 2.0)*Density*(D_2*D_2 - d_hub   *d_hub));
				}
				F_sum	= (F_1+F_2)-F_3;
				lblNewLabel_60.setText(F_sum.toString());
									
			}		
			}	   
			
		});
		btnNewButton.setBounds(450, 430, 100, 20);
	    frame.getContentPane().add(btnNewButton);

	

		
		
		textField = new JTextField();		
		textField.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT
		  	public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);  
			};  
		});			
		textField.setText("72.799");	textField.setFont(new Font("Courier New", Font.BOLD, 14));		textField.setBounds(205, 5, 150, 20);		frame.getContentPane().add(textField);		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			

			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};   
		});				
		textField_1.setText("78");		textField_1.setFont(new Font("Courier New", Font.BOLD, 14));	textField_1.setBounds(205, 30, 55, 20);		frame.getContentPane().add(textField_1);	textField_1.setColumns(10);

		
		textField_2 = new JTextField();	
		textField_2.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_2.setText("4100");	textField_2.setFont(new Font("Courier New", Font.BOLD, 14));	textField_2.setBounds(205, 55, 55, 20);		frame.getContentPane().add(textField_2);	textField_2.setColumns(10);

		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_3.setText("5.5");		textField_3.setFont(new Font("Courier New", Font.BOLD, 14));	textField_3.setBounds(205, 80, 55, 20);		frame.getContentPane().add(textField_3);	textField_3.setColumns(10);

		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			  
			};
		});		
		textField_4.setText("998.2");	textField_4.setFont(new Font("Courier New", Font.BOLD, 14));	textField_4.setBounds(205, 105, 55, 20);	frame.getContentPane().add(textField_4);	textField_4.setColumns(10);

		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT		
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			 
			};
		});
		textField_5.setText("0.785");	textField_5.setFont(new Font("Courier New", Font.BOLD, 14));	textField_5.setBounds(205, 130, 55, 20);	frame.getContentPane().add(textField_5);	textField_5.setColumns(10);
	
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_6.setText("1.2");		textField_6.setFont(new Font("Courier New", Font.BOLD, 14));	textField_6.setBounds(350, 80, 50, 20);		frame.getContentPane().add(textField_6);	textField_6.setColumns(15);

		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_7.setText("189");		textField_7.setFont(new Font("Courier New", Font.BOLD, 14));	textField_7.setBounds(205, 205, 55, 20);  	frame.getContentPane().add(textField_7);	textField_7.setColumns(15);

		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_8.setText("9.5");		textField_8.setFont(new Font("Courier New", Font.BOLD, 14));	textField_8.setBounds(205, 230, 55, 20);  	frame.getContentPane().add(textField_8);	textField_8.setColumns(15);
	

		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_9.setText("3");		textField_9.setFont(new Font("Courier New", Font.BOLD, 14));	textField_9.setBounds(205, 255, 55, 20);  	frame.getContentPane().add(textField_9);	textField_9.setColumns(15);
		
		textField_10 = new JTextField(); 
		textField_10.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_10.setText("6");		textField_10.setFont(new Font("Courier New", Font.BOLD, 14));	textField_10.setBounds(205, 280, 55, 20);  	frame.getContentPane().add(textField_10);	textField_10.setColumns(15);

		
		textField_11 = new JTextField(); 
		textField_11.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_11.setText("25");		textField_11.setFont(new Font("Courier New", Font.BOLD, 14));	textField_11.setBounds(205, 305, 55, 20);  	frame.getContentPane().add(textField_11);	textField_11.setColumns(15);

		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_12.setText("5");		textField_12.setFont(new Font("Courier New", Font.BOLD, 14));	textField_12.setBounds(205, 330, 55, 20);  	frame.getContentPane().add(textField_12);	textField_12.setColumns(15);

		
		textField_13 = new JTextField();   	
		textField_13.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
				};
		});		
		textField_13.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {
				
			}
			public void inputMethodTextChanged(InputMethodEvent arg0) {	
			}
		});


		textField_13.setToolTipText("Press Enter to get K_0");
		textField_13.setText("90");		
		textField_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
		
				
				Double Q_nom	= Double.parseDouble(textField_16.getText())/3600.0;			//Seal's diameter, m3/hr --> m3/s
				Double 	n		= Double.parseDouble(textField_2.getText());				//Rotation speed, rpm
				Double D_flow	= Math.pow((Q_nom/n), (1.0/3.0));
				Double d_hub	= Double.parseDouble(textField_12.getText())/1000.0;
				Double d_suc	= Double.parseDouble(textField_13.getText())/1000.0;			//Suction diameter, mm --> m
					if (d_suc>d_hub) {
						Double K_0		= Math.sqrt(d_suc*d_suc-d_hub*d_hub)/D_flow;
						Double K_01		= new BigDecimal(K_0).setScale(5, RoundingMode.UP).doubleValue();  //rounding of K_01

						lblNewLabel_48.setText(K_01.toString());
					} else {
						lblNewLabel_48.setText("0.0");
					}
				
				}
				}); 
		
		textField_13.setFont(new Font("Courier New", Font.BOLD, 14));	textField_13.setBounds(205, 355, 55, 20);  	frame.getContentPane().add(textField_13);	textField_13.setColumns(15);
		
		
		
		textField_14 = new JTextField(); 
		textField_14.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_14.setText("0.785");	textField_14.setFont(new Font("Courier New", Font.BOLD, 14));	textField_14.setBounds(205, 380, 55, 20);  	frame.getContentPane().add(textField_14);	textField_14.setColumns(15);

		
		textField_15 = new JTextField();
		textField_15.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_15.setText("");		textField_15.setFont(new Font("Courier New", Font.BOLD, 14));	textField_15.setBounds(205, 430, 160, 20);  frame.getContentPane().add(textField_15);	textField_15.setColumns(15);

		
		textField_16 = new JTextField(); 
		textField_16.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_16.setText("67");		textField_16.setFont(new Font("Courier New", Font.BOLD, 14));	textField_16.setBounds(620, 5, 55, 20);  	frame.getContentPane().add(textField_16);	textField_16.setColumns(15);

		
		textField_17 = new JTextField(); 
		textField_17.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_17.setText("0.25");	textField_17.setFont(new Font("Courier New", Font.BOLD, 14));	textField_17.setBounds(620, 30, 60, 20);  	frame.getContentPane().add(textField_17);	textField_17.setColumns(15);

		
		textField_18 = new JTextField();
		textField_18.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_18.setText("20");		textField_18.setFont(new Font("Courier New", Font.BOLD, 14));	textField_18.setBounds(620, 55, 60, 20);  	frame.getContentPane().add(textField_18);	textField_18.setColumns(15);

		
		textField_19 = new JTextField(); 
		textField_19.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_19.setText("0.5");	textField_19.setFont(new Font("Courier New", Font.BOLD, 14));	textField_19.setBounds(620, 80, 60, 20);  	frame.getContentPane().add(textField_19);	textField_19.setColumns(15);

		
		textField_20 = new JTextField(); 
		textField_20.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});				
		textField_20.setText("1");		textField_20.setFont(new Font("Courier New", Font.BOLD, 14));	textField_20.setBounds(620, 105, 60, 20);  	frame.getContentPane().add(textField_20);	textField_20.setColumns(15);

		
		textField_21 = new JTextField(); 		
		textField_21.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_21.setText("0.9");	textField_21.setFont(new Font("Courier New", Font.BOLD, 14));	textField_21.setBounds(620, 130, 60, 20);  	frame.getContentPane().add(textField_21);	textField_21.setColumns(15);

		
		textField_22 = new JTextField(); 
		textField_22.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_22.setText("0.031");	textField_22.setFont(new Font("Courier New", Font.BOLD, 14));	textField_22.setBounds(620, 155, 115, 20);  	frame.getContentPane().add(textField_22);	textField_22.setColumns(15);

		
		textField_23 = new JTextField();
		textField_23.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_23.setText("75");		textField_23.setFont(new Font("Courier New", Font.BOLD, 14));	textField_23.setBounds(620, 330, 60, 20);  	frame.getContentPane().add(textField_23);	textField_23.setColumns(15);

		
		textField_24 = new JTextField(); 
		textField_24.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_24.setText("102");	textField_24.setFont(new Font("Courier New", Font.BOLD, 14));	textField_24.setBounds(620, 355, 60, 20);  	frame.getContentPane().add(textField_24);	textField_24.setColumns(15);

		
		textField_25 = new JTextField();
		textField_25.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_25.setEnabled(false);	textField_25.setVisible(false); textField_25.setText("0.25");	textField_25.setFont(new Font("Courier New", Font.BOLD, 14));	textField_25.setBounds(740, 30, 60, 20);  	frame.getContentPane().add(textField_25);	textField_25.setColumns(15);

		
		textField_26 = new JTextField();
		textField_26.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_26.setEnabled(false);	textField_26.setVisible(false);	textField_26.setText("20");		textField_26.setFont(new Font("Courier New", Font.BOLD, 14));	textField_26.setBounds(740, 55, 60, 20);  	frame.getContentPane().add(textField_26);	textField_26.setColumns(15);

		
		textField_27 = new JTextField();
		textField_27.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});				
		textField_27.setEnabled(false);	textField_27.setVisible(false);	textField_27.setText("0.5");	textField_27.setFont(new Font("Courier New", Font.BOLD, 14));	textField_27.setBounds(740, 80, 60, 20);  	frame.getContentPane().add(textField_27);	textField_27.setColumns(15);

		
		textField_28 = new JTextField();
		textField_28.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_28.setEnabled(false);	textField_28.setVisible(false);	textField_28.setText("102");	textField_28.setFont(new Font("Courier New", Font.BOLD, 14));	textField_28.setBounds(740, 355, 60, 20);  	frame.getContentPane().add(textField_28);	textField_28.setColumns(15);

		
		textField_29 = new JTextField();
		textField_29.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});
		textField_29.setEnabled(false);	textField_29.setVisible(false);	textField_29.setText("0.031");	textField_29.setFont(new Font("Courier New", Font.BOLD, 14));	textField_29.setBounds(740, 155, 115, 20);  	frame.getContentPane().add(textField_29);	textField_29.setColumns(15);
		
		
		textField_30 = new JTextField();
		textField_30.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_30.setEnabled(false);	textField_30.setVisible(false); textField_30.setText("0.25");	textField_30.setFont(new Font("Courier New", Font.BOLD, 14));	textField_30.setBounds(970, 30, 60, 20);  	frame.getContentPane().add(textField_30);	textField_30.setColumns(15);
		
		
		textField_31 = new JTextField();
		textField_31.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_31.setEnabled(false);	textField_31.setVisible(false); textField_31.setText("20");	textField_31.setFont(new Font("Courier New", Font.BOLD, 14));	textField_31.setBounds(970, 55, 60, 20);  	frame.getContentPane().add(textField_31);	textField_31.setColumns(15);

		
		textField_32 = new JTextField();
		textField_32.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_32.setEnabled(false);	textField_32.setVisible(false); textField_32.setText("0.5");	textField_32.setFont(new Font("Courier New", Font.BOLD, 14));	textField_32.setBounds(970, 80, 60, 20);  	frame.getContentPane().add(textField_32);	textField_32.setColumns(15);

		textField_33 = new JTextField();
		textField_33.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_33.setEnabled(false);	textField_33.setVisible(false); textField_33.setText("0.031");	textField_33.setFont(new Font("Courier New", Font.BOLD, 14));	textField_33.setBounds(970, 155, 60, 20);  	frame.getContentPane().add(textField_33);	textField_33.setColumns(15);

		textField_34 = new JTextField();
		textField_34.addKeyListener(new KeyAdapter() {  //Checking Whether the INPUT IS CORRECT			
			public void keyTyped(KeyEvent e){
			  Java_01.Java_01(e);
			};
		});		
		textField_34.setText("0.1");	textField_34.setFont(new Font("Courier New", Font.BOLD, 14));	textField_34.setBounds(205, 455, 60, 20);  	frame.getContentPane().add(textField_34);	textField_34.setColumns(15);
	}
}