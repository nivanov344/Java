package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.List;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class GUI extends JFrame {

	private JPanel contentPane;
	private static List list = new List();
	private static List list_1 = new List();
	public static final String FLIGHTS_DIR = "src//resources//flights";
	public static final String DATES_DIR = "src//resources//dates";
	public static final String OUTPUT_DIR = "src//output";
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtFrom;
	private JTextField txtDate;
	private JTextField txtTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Book tickets", null, panel, null);
		panel.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(10, 29, 151, 19);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		
		list.setBounds(10, 125, 684, 234);
		panel.add(list);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(230, 29, 151, 19);
		panel.add(txtLastName);
		
		txtFrom = new JTextField();
		txtFrom.setColumns(10);
		txtFrom.setBounds(459, 29, 151, 19);
		panel.add(txtFrom);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(10, 89, 151, 19);
		panel.add(txtDate);
		
		txtTo = new JTextField();
		txtTo.setColumns(10);
		txtTo.setBounds(459, 89, 151, 19);
		panel.add(txtTo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setToolTipText("");
		comboBox.setBounds(230, 88, 151, 21);
		panel.add(comboBox);
		comboBox.addItem("First Class");
		comboBox.addItem("Business Class");
		comboBox.addItem("Economy Class");
		
		JLabel lblNewLabel = new JLabel("First name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 6, 125, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(230, 6, 98, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("From:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(459, 6, 98, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Date:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 66, 98, 13);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("To:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(459, 68, 98, 13);
		panel.add(lblNewLabel_1_3);
		
		JButton btnBookTickets = new JButton("Book tickets");
		btnBookTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				String date = txtDate.getText();
				String destination = list.getSelectedItem();
				String cls = comboBox.getSelectedItem().toString();
				issueTicket(firstName + " " + lastName + " " + destination + " " + cls + " " + date);
			}
		});
		btnBookTickets.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBookTickets.setBounds(543, 380, 151, 21);
		panel.add(btnBookTickets);
		
		JButton btnCheckDate = new JButton("Check date");
		btnCheckDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.removeAll();
				
				String from = txtFrom.getText();
				String to = txtTo.getText();
				String date = txtDate.getText();
				
				if(checkDate(from, to, date)) {
					generateList(from, to);
				}else {
					list.add("No flights to this destination on " + date);
					
				}
			}
		});
		btnCheckDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCheckDate.setBounds(378, 380, 151, 21);
		panel.add(btnCheckDate);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("View bought tickets", null, panel2, null);
		panel2.setLayout(null);
		
		JButton btnShowTickets = new JButton("Show tickets");
		btnShowTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showTickets();
			}
		});
		btnShowTickets.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnShowTickets.setBounds(511, 380, 183, 21);
		panel2.add(btnShowTickets);
		
		
		list_1.setBounds(10, 10, 684, 355);
		panel2.add(list_1);
		
		
	}
	
	public static void generateList (String departureLocation, String arrivalLocation) {
		File flightList = new File (FLIGHTS_DIR + "//" + departureLocation + "//" + departureLocation + arrivalLocation + ".txt");
		try (BufferedReader br = new BufferedReader(new FileReader(flightList))) {
			String line;
            
            while ((line = br.readLine()) != null) {
                  
                String temp1 = line.replaceAll("code", "");
                String temp2 = temp1.replaceAll("arr", "");
                String finalTemp = temp2.replaceAll("dep", "");
                list.add(departureLocation + " - " + arrivalLocation + " " + finalTemp);
            
            } 
		} catch (IOException ioException) {
			throw new RuntimeException("IO Exception" ,ioException);
		}
	}

	public boolean checkDate (String from, String to, String date) {
		boolean check = false;
		try (BufferedReader br1 = new BufferedReader (new FileReader(DATES_DIR + "//" + from + "//" + from + to + ".txt"))) {
			String line;
            
            while ((line = br1.readLine()) != null) {
            
            	if(date.equals(line)) {
            		check = true;
            		break;
            	}
            }
            return check;
		}catch (IOException ioException) {
			JOptionPane.showMessageDialog(this, "No flights on this route. Please check the spelling of the names.");
		}
		return check;
	}

	public static void issueTicket (String ticket) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_DIR + "//tickets.txt"))){
			bw.write(ticket);
		}catch (IOException ioException) {
			throw new RuntimeException("IO Exception" ,ioException);
			
		}
	}
	
	public static void showTickets () {
		try (BufferedReader br3 = new BufferedReader (new FileReader(OUTPUT_DIR + "//tickets.txt"))) {
			String line;
            
            while ((line = br3.readLine()) != null) {
            	list_1.add(line);
            	
            }
		}catch (IOException ioException) {
			throw new RuntimeException("IO Exception" ,ioException);		
		}
	}
}
