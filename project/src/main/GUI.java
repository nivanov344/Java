package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import java.awt.Choice;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private static List list = new List();
	public static final String FLIGHTS_DIR = "src//resources//flights";
	public static final String DATES_DIR = "src//resources//dates";
	public static final String OUTPUT_DIR = "src//output";
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtFrom;
	
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

	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		list.setBounds(10, 156, 439, 242);
		panel.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(262, 96, 187, 21);
		panel.add(comboBox);
		comboBox.addItem("First Class");
		comboBox.addItem("Business Class");
		comboBox.addItem("Economy Class");
		
		Label label = new Label("Date:");
		label.setBounds(10, 69, 187, 21);
		panel.add(label);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(10, 44, 187, 19);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(262, 44, 187, 19);
		panel.add(txtLastName);
		txtLastName.setColumns(10);
		
		Label label_1 = new Label("First name:");
		label_1.setBounds(10, 10, 187, 21);
		panel.add(label_1);
		
		Label label_2 = new Label("Last name:");
		label_2.setBounds(262, 10, 187, 21);
		panel.add(label_2);
		
		JButton btnBook = new JButton("Book tickets");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				String date = txtDate.getText();
				String destination = list.getSelectedItem();
				String cls = comboBox.getSelectedItem().toString();
				issueTicket(firstName + " " + lastName + " " + destination + " " + cls + " " + date);
			}
		});
		btnBook.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnBook.setBounds(471, 298, 176, 100);
		panel.add(btnBook);
		
		JButton btnCheck = new JButton("Check flights");
		btnCheck.addActionListener(new ActionListener() {
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
		btnCheck.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnCheck.setBounds(471, 188, 178, 100);
		panel.add(btnCheck);
		
		txtTo = new JTextField();
		txtTo.setColumns(10);
		txtTo.setBounds(471, 97, 175, 19);
		panel.add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setBounds(10, 97, 187, 19);
		panel.add(txtDate);
		txtDate.setColumns(10);
		
		txtFrom = new JTextField();
		txtFrom.setBounds(471, 44, 176, 19);
		panel.add(txtFrom);
		txtFrom.setColumns(10);
		
		Label label_3 = new Label("From:");
		label_3.setBounds(471, 10, 59, 21);
		panel.add(label_3);
		
		Label label_4 = new Label("To:");
		label_4.setBounds(471, 69, 59, 21);
		panel.add(label_4);
		
		
		
		
		
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

	public static boolean checkDate (String from, String to, String date) {
		try (BufferedReader br1 = new BufferedReader (new FileReader(DATES_DIR + "//" + from + "//" + from + to + ".txt"))) {
			String line;
            boolean check = false;
            while ((line = br1.readLine()) != null) {
            
            	if(date.equals(line)) {
            		generateList(from, to);
            		break;
            	}
            }
            return check;
		}catch (IOException ioException) {
			throw new RuntimeException("IO Exception" ,ioException);
		}
	}

	public static void issueTicket (String ticket) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_DIR + "//tickets.txt"))){
			bw.write(ticket);
		}catch (IOException ioException) {
			throw new RuntimeException("IO Exception" ,ioException);
		}
	}
}
