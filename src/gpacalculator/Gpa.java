package gpacalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class Gpa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gpa frame = new Gpa();
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
	public Gpa() {
		

		setTitle("GPA Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 612);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSubjects = new JLabel("Subjects");
		lblSubjects.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblSubjects.setForeground(Color.YELLOW);
		lblSubjects.setBounds(24, 76, 92, 33);
		contentPane.add(lblSubjects);
		
		JLabel lblCreditHour = new JLabel("Credit hour");
		lblCreditHour.setForeground(Color.MAGENTA);
		lblCreditHour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblCreditHour.setBounds(250, 81, 115, 22);
		contentPane.add(lblCreditHour);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setForeground(Color.RED);
		lblGrade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblGrade.setBounds(394, 81, 69, 22);
		contentPane.add(lblGrade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox.setBounds(288, 122, 51, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_1.setBounds(288, 167, 51, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(288, 217, 49, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_3.setBounds(290, 266, 49, 22);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_4.setBounds(290, 320, 49, 22);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_5.setBounds(288, 367, 49, 22);
		contentPane.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		comboBox_6.setBounds(288, 420, 49, 22);
		contentPane.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"}));
		comboBox_7.setBounds(394, 122, 43, 22);
		contentPane.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"}));
		comboBox_8.setBounds(394, 167, 43, 22);
		contentPane.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"}));
		comboBox_9.setBounds(394, 217, 43, 22);
		contentPane.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"}));
		comboBox_10.setBounds(394, 266, 43, 22);
		contentPane.add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"}));
		comboBox_11.setBounds(394, 320, 43, 22);
		contentPane.add(comboBox_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"}));
		comboBox_12.setBounds(394, 367, 43, 22);
		contentPane.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"}));
		comboBox_13.setBounds(394, 420, 43, 22);
		contentPane.add(comboBox_13);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(24, 122, 205, 22);
		contentPane.add(textArea);
		
		JLabel lblGpaCalculator = new JLabel("GPA CALCULATOR");
		lblGpaCalculator.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblGpaCalculator.setForeground(Color.RED);
		lblGpaCalculator.setBounds(103, 30, 236, 33);
		contentPane.add(lblGpaCalculator);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(24, 167, 205, 22);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(24, 217, 205, 22);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(24, 266, 205, 22);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(24, 320, 205, 22);
		contentPane.add(textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(24, 367, 205, 22);
		contentPane.add(textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(24, 420, 205, 22);
		contentPane.add(textArea_6);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String s11=(String) comboBox.getSelectedItem();
				String s22=(String) comboBox_1.getSelectedItem();
				String s33=(String) comboBox_2.getSelectedItem();
				String s44=(String) comboBox_3.getSelectedItem();
				String s55=(String) comboBox_4.getSelectedItem();
				String s66=(String) comboBox_5.getSelectedItem();
				String s77=(String) comboBox_6.getSelectedItem();
				
				
				
				double a1=Double.parseDouble(s11);
				double a2=Double.parseDouble(s22);
				double a3=Double.parseDouble(s33);
				double a4=Double.parseDouble(s44);
				double a5=Double.parseDouble(s55);
				double a6=Double.parseDouble(s66);
				double a7=Double.parseDouble(s77);
				
				
				double d1,d2,d3,d4,d5,d6,d7;
				String s1=(String) comboBox_7.getSelectedItem();
				if(s1.equals("A")) {
					d1=4;
				}
				else if(s1.equals("A-")) {
					 d1=3.7;
				}
				else if(s1.equals("B+")) {
					d1=3.3;
				}
				else if(s1.equals("B")) {
					d1=3;
				}
				else if(s1.equals("B-")) {
					d1=2.7;
				}
				else if(s1.equals("C+")) {
					d1=2.3;
				}
				else if(s1.equals("C")) {
					d1=2;
				}
				else if(s1.equals("C-")) {
					d1=1.7;
				}
				else if(s1.equals("D+")) {
					d1=1.3;
				}
				else if(s1.equals("D")) {
					d1=1;
				}
				else
				{
					d1=0;
				}
				
	
				String s2=(String) comboBox_8.getSelectedItem();
				if(s2.equals("A")) {
					 d2=4;
				}
				else if(s2.equals("A-")) {
					d2=3.7;
				}
				else if(s2.equals("B+")) {
					d2=3.3;
				}
				else if(s2.equals("B")) {
					d2=3;
				}
				else if(s2.equals("B-")) {
					d2=2.7;
				}
				else if(s1.equals("C+")) {
					d2=2.3;
				}
				else if(s1.equals("C")) {
					d2=2;
				}
				else if(s1.equals("C-")) {
					d2=1.7;
				}
				else if(s1.equals("D+")) {
					d2=1.3;
				}
				else if(s1.equals("D")) {
					d2=1;
				}
				else
				{
					d2=0;
				}
				
				String s3=(String) comboBox_9.getSelectedItem();
				if(s3.equals("A")) {
					d3=4;
				}
				else if(s3.equals("A-")) {
					d3=3.7;
				}
				else if(s3.equals("B+")) {
					d3=3.3;
				}
				else if(s3.equals("B")) {
					d3=3;
				}
				else if(s3.equals("B-")) {
					d3=2.7;
				}
				else if(s3.equals("C+")) {
					d3=2.3;
				}
				else if(s3.equals("C")) {
					 d3=2;
				}
				else if(s3.equals("C-")) {
					d3=1.7;
				}
				else if(s3.equals("D+")) {
					 d3=1.3;
				}
				else if(s3.equals("D")) {
					 d3=1;
				}
				else
				{
					d3=0;
				}
				
				String s4=(String) comboBox_10.getSelectedItem();
				if(s4.equals("A")) {
					d4=4;
				}
				else if(s4.equals("A-")) {
					d4=3.7;
				}
				else if(s4.equals("B+")) {
					d4=3.3;
				}
				else if(s4.equals("B")) {
					d4=3;
				}
				else if(s4.equals("B-")) {
					d4=2.7;
				}
				else if(s4.equals("C+")) {
					d4=2.3;
				}
				else if(s4.equals("C")) {
					d4=2;
				}
				else if(s4.equals("C-")) {
					d4=1.7;
				}
				else if(s4.equals("D+")) {
					d4=1.3;
				}
				else if(s4.equals("D")) {
					d4=1;
				}
				else
				{
					d4=0;
				}
				
				String s5=(String) comboBox_11.getSelectedItem();
				if(s5.equals("A")) {
					d5=4;
				}
				else if(s5.equals("A-")) {
					d5=3.7;
				}
				else if(s5.equals("B+")) {
					d5=3.3;
				}
				else if(s5.equals("B")) {
					d5=3;
				}
				else if(s5.equals("B-")) {
					d5=2.7;
				}
				else if(s5.equals("C+")) {
					d5=2.3;
				}
				else if(s5.equals("C")) {
					d5=2;
				}
				else if(s5.equals("C-")) {
					d5=1.7;
				}
				else if(s5.equals("D+")) {
					d5=1.3;
				}
				else if(s5.equals("D")) {
					 d5=1;
				}
				else
				{
					 d5=0;
				}
			
				
				String s6=(String) comboBox_12.getSelectedItem();
				if(s6.equals("A")) {
					d6=4;
				}
				else if(s6.equals("A-")) {
					d6=3.7;
				}
				else if(s6.equals("B+")) {
					d6=3.3;
				}
				else if(s6.equals("B")) {
					d6=3;
				}
				else if(s6.equals("B-")) {
					d6=2.7;
				}
				else if(s6.equals("C+")) {
					d6=2.3;
				}
				else if(s6.equals("C")) {
					d6=2;
				}
				else if(s6.equals("C-")) {
					d6=1.7;
				}
				else if(s6.equals("D+")) {
					d6=1.3;
				}
				else if(s6.equals("D")) {
					 d6=1;
				}
				else
				{
					 d6=0;
				}
				
				String s7=(String) comboBox_13.getSelectedItem();
				if(s7.equals("A")) {
					d7=4;
				}
				else if(s7.equals("A-")) {
					d7=3.7;
				}
				else if(s7.equals("B+")) {
					d7=3.3;
				}
				else if(s7.equals("B")) {
					d7=3;
				}
				else if(s7.equals("B-")) {
					d7=2.7;
				}
				else if(s7.equals("C+")) {
					d7=2.3;
				}
				else if(s7.equals("C")) {
					d7=2;
				}
				else if(s7.equals("C-")) {
					d7=1.7;
				}
				else if(s7.equals("D+")) {
					d7=1.3;
				}
				else if(s7.equals("D")) {
					 d7=1;
				}
				else
				{
					 d7=0;
				}
				
				double a=a1+a2+a3+a4+a5+a6+a7;
				double sum=a1*d1+a2*d2+a3*d3+a4*d4+a5*d5+a6*d6+a7*d7;
				
					
					double result=sum/a;
					
					String r=new DecimalFormat("##.##").format(result);
					
					textField.setText(r);
					
					
					
					
				
				
			}
		});
		btnCalculate.setForeground(Color.RED);
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnCalculate.setBounds(54, 455, 153, 38);
		contentPane.add(btnCalculate);
		
		JLabel lblYourGpaIs = new JLabel("Your GPA is");
		lblYourGpaIs.setForeground(Color.RED);
		lblYourGpaIs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblYourGpaIs.setBounds(72, 514, 135, 38);
		contentPane.add(lblYourGpaIs);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.YELLOW);
		textField.setBounds(219, 514, 194, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnCleae = new JButton("Clear");
		btnCleae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				
				textArea.setText("");
				textArea_1.setText("");
				textArea_2.setText("");
				textArea_3.setText("");
				textArea_4.setText("");
				textArea_5.setText("");
				textArea_6.setText("");
			}
		});
		btnCleae.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		btnCleae.setForeground(Color.RED);
		btnCleae.setBounds(306, 452, 107, 38);
		contentPane.add(btnCleae);
		
		
		
		
	}
}
