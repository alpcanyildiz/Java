package presentationClasses;
//Alpcan Yildiz 220201049 - Ismail Burak Kurhan 220201055 - HW 3
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import domainClasses.Cargo;
import domainClasses.Company;
import domainClasses.ReceiverCustomer;
import domainClasses.SenderCustomer;
import domainClasses.TransportationType;
import domainClasses.Vehicle;

public class Swings {
	

	JFrame frame;
	JFrame frame2;
	 JTextField txtBox1;
	 JTextField txtbox2;
	 JTextField txtsenderNationalID;
	 JTextField txtSenderName;
	 JTextField	txtSenderPhone;
	 JTextField	txtSenderAdress;
	 JTextField	txtRecieverName;
	 JTextField	txtRecieverNationalID;
	 JTextField	txtRecieverPhoneNumber;
	 JTextField	txtRecieverAdress;
	 
	public void initialize(Company company) throws ParseException {
		Cargo cargo = new Cargo();
		SenderCustomer sendercustomer = new SenderCustomer();
		ReceiverCustomer receivercustomer = new ReceiverCustomer();
		frame = new JFrame();
		frame.setBounds(200, 200, 641, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame2 = new JFrame();
		frame2.setBounds(200, 200, 641, 563);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel paneeel1 = new JPanel();
		paneeel1.setPreferredSize(new Dimension(100, 100));
		frame2.getContentPane().add(paneeel1, BorderLayout.CENTER);
		
		JButton continu = new JButton("Dou you want to continue");
		paneeel1.add(continu);
		
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(100, 100));
		frame.getContentPane().add(panel1, BorderLayout.CENTER);
		panel1.setVisible(true);
		
		JPanel panel2 = new JPanel();
		frame.getContentPane().add(panel2, BorderLayout.NORTH);
		panel2.setPreferredSize(new Dimension(75, 100));
		panel2.setVisible(true);
		
		JPanel panel3 = new JPanel();
		frame.getContentPane().add(panel3, BorderLayout.SOUTH);
		panel3.setPreferredSize(new Dimension(75, 100));
		panel3.setVisible(false);
		String[] chooseforpay = {"receiver","sender"};
		JComboBox comboBoxForPrice = new JComboBox(chooseforpay);
		panel3.add(comboBoxForPrice); 
		
		
		
		JPanel panel4 = new JPanel();
		frame.getContentPane().add(panel4, BorderLayout.WEST);
		JLabel senderNationalID = new JLabel("Sender National ID : ");
		panel4.add(senderNationalID);
		txtsenderNationalID = new JTextField();
		panel4.add(txtsenderNationalID);
		txtsenderNationalID.setColumns(8);
		panel4.setVisible(false);
		
		JPanel panel5 = new JPanel();
		frame.getContentPane().add(panel5, BorderLayout.EAST);
		panel5.setVisible(false);
		JLabel senderName = new JLabel("Sender Name: ");
		panel5.add(senderName);
		txtSenderName = new JTextField();
		panel5.add(txtSenderName);
		txtSenderName.setColumns(8);
		JLabel senderPhone = new JLabel("Sender Phone: ");
		panel5.add(senderPhone);
		txtSenderPhone = new JTextField();
		panel5.add(txtSenderPhone);
		txtSenderPhone.setColumns(8);
		
		JLabel senderAdress = new JLabel("Sender Adress: ");
		panel5.add(senderAdress);
		txtSenderAdress = new JTextField();
		panel5.add(txtSenderAdress);
		txtSenderAdress.setColumns(8);
		
		
		
		JLabel recieverNationalID = new JLabel("Reciever NationalID: ");
		panel5.add(recieverNationalID);
		txtRecieverNationalID = new JTextField();
		panel5.add(txtRecieverNationalID);
		txtRecieverNationalID.setColumns(8);
		
		JLabel recieverName = new JLabel("Reciever Name: ");
		panel5.add(recieverName);
		txtRecieverName = new JTextField();
		panel5.add(txtRecieverName);
		txtRecieverName.setColumns(8);
		
		JLabel recieverPhoneNumber = new JLabel("Reciever PhoneNumber : ");
		panel5.add(recieverPhoneNumber);
		txtRecieverPhoneNumber = new JTextField();
		panel5.add(txtRecieverPhoneNumber);
		txtRecieverPhoneNumber.setColumns(8);
		
		JLabel recieverAdress = new JLabel("Reciever Adress : ");
		panel5.add(recieverAdress);
		txtRecieverAdress = new JTextField();
		panel5.add(txtRecieverAdress);
		txtRecieverAdress.setColumns(8);
		JPanel panel6 = new JPanel();
		
		JButton buttonFinish = new JButton("Save -->");
		panel5.add(buttonFinish);
		JButton btnCheck3 = new JButton("Finish Day ! ");	
		panel5.add(btnCheck3);
		
		
		
		
		JLabel lblEnterTheWeight = new JLabel("Enter the weight of the cargo : ");
		panel1.add(lblEnterTheWeight);
		
		
		txtBox1 = new JTextField();
		
		
		
		JLabel lblCargoPrice = new JLabel();
		panel3.add(lblCargoPrice);
		
		JButton btnAddCargo = new JButton("Add Cargo");
		panel2.add(btnAddCargo);
		//??? Cargo cargo = new Cargo();
		
		
		panel1.add(txtBox1);
		txtBox1.setColumns(10);
		
		JLabel lblE = new JLabel("Enter the current date : ");
		panel1.add(lblE);
		txtbox2 = new JTextField();
		
		JComboBox comboBox = new JComboBox();
		
		panel1.add(txtbox2);
		txtbox2.setColumns(10);
		JButton btnCheck = new JButton("CHECK !");
		btnCheck.setForeground(SystemColor.desktop);
		JButton btnCheck2 = new JButton("Add Another Cargo !");	
		panel1.setVisible(false);
		
		JButton yes = new JButton("Yes !");
		JButton no = new JButton(" No !");
		
		panel3.add(yes);
		panel3.add(no);
	
		txtbox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cargo.setOrderDate(txtbox2.getText());
			
			}
		});
		
		btnAddCargo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
	
		
			}
		});

no.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(frame, "Sorry");
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		
	}
});
		
		
		txtBox1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cargo.setWeight(Double.parseDouble(txtBox1.getText()));
				
					
			}
		});
		
		
		
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TransportationType chosenType = null;
				
				if(comboBox.getSelectedIndex()==0)
					chosenType=TransportationType.AIR;
				else if (comboBox.getSelectedIndex()==1)
					chosenType=TransportationType.ROAD;
				else if (comboBox.getSelectedIndex()==2)
					chosenType=TransportationType.RAIL;
				
				
				boolean flagForWeight =true;
				for (Vehicle v : company.getVehicleList()){
					
					try {
						if (company.checkAvailability(cargo.getOrderDate(),v.getDepartureDate()) && v.getType().equals(chosenType)){
							/*company.addCargoList(cargo);*/
							if (v.checkUpperLimit(cargo.getWeight())){
								
								JOptionPane.showMessageDialog(frame, "Available vehicle exist  !!");					
								v.addListOfCargoes(cargo);
								
								panel2.setVisible(false);
								panel3.setVisible(true);
								lblCargoPrice.setText("Cargo Price : "+ company.priceCalculate(cargo, chosenType)+ "Do you agree the price ? ");
								cargo.setPrice(Double.parseDouble(company.priceCalculate(cargo, chosenType)));
							
							flagForWeight = false;	
							break;
							}
								
								
							
						
						}
					
					} catch (HeadlessException | ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				if ( flagForWeight == true)
					JOptionPane.showMessageDialog(frame, "No available vehicle exist with choosen type. Please select valid transportation type");
			
				}
			
			}
		);
		panel1.add(btnCheck);
		
yes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Thank you for choosing our company ! ");
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				if(comboBoxForPrice.getSelectedItem()=="receiver"){
					cargo.setCustomer(receivercustomer);
				
				}
				else if(comboBoxForPrice.getSelectedItem()=="sender"){
					cargo.setCustomer(sendercustomer);
				}
				
			}
		});		
		
		
txtsenderNationalID.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				boolean flag=true;
				
				for (SenderCustomer sc : company.getSenderList()){
					
					if(sc.getNationalID().equals(txtsenderNationalID.getText())){
						JOptionPane.showMessageDialog(frame, "This sender customer is already exist !");
						cargo.setSenderCustomer(sc);
						sc.addSenderCargoList(cargo);
						company.addSenderList(sc);
						
						
						frame.getContentPane().add(panel6,BorderLayout.NORTH );
						panel6.setPreferredSize(new Dimension(75, 100));
						panel6.setVisible(false);
						
						panel6.add(recieverNationalID);
						panel6.add(txtRecieverNationalID);
						txtRecieverNationalID.setColumns(8);
						panel6.add(recieverName);
						panel6.add(txtRecieverName);
						txtRecieverName.setColumns(8);
						panel6.add(recieverPhoneNumber);
						panel6.add(txtRecieverPhoneNumber);
						txtRecieverPhoneNumber.setColumns(8);
						panel6.add(recieverAdress);
						panel6.add(txtRecieverAdress);
						txtRecieverAdress.setColumns(8);
						panel6.add(buttonFinish);
						panel6.add(btnCheck2);
						panel6.add(btnCheck3);
						
						panel6.setVisible(true);
						flag=false;
						break;
					}
					
					
					
				}
				
				if(flag==true){
					sendercustomer.setNationalID(txtsenderNationalID.getText());
					panel5.setVisible(true);
					
					
				}
					
			}
		});
txtSenderName.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		sendercustomer.setName(txtSenderName.getText());
		
			
	}
});

txtSenderPhone.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		sendercustomer.setPhoneNumber(txtSenderPhone.getText());
			
	}
});

txtSenderAdress.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		sendercustomer.setAddress(txtSenderAdress.getText());
		
		
			
	}
});

txtRecieverNationalID.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		receivercustomer.setNationalID(txtRecieverNationalID.getText());
		
	
	}
});


txtRecieverName.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		receivercustomer.setName(txtRecieverName.getText());
		
	
	}
});

txtRecieverPhoneNumber.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		receivercustomer.setPhoneNumber(txtRecieverPhoneNumber.getText());

			
	}
});

txtRecieverAdress.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		receivercustomer.setAddress(txtRecieverAdress.getText());
		
	
	}
});
buttonFinish.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		company.addSenderList(sendercustomer);
		cargo.setSenderCustomer(sendercustomer);
		cargo.setReceiverCustomer(receivercustomer);
		company.addSenderList(sendercustomer);
		company.addCargoList(cargo);
		
		JOptionPane.showMessageDialog(frame, "Saved ! ");
		
				
		
	}
});
btnCheck3.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
		int uniqueCargoID=1000;
		 Calendar cal = Calendar.getInstance();
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        String strDate = sdf.format(cal.getTime());
	    
		double sum = 0;
		try {
		    FileWriter filewriter = new FileWriter(
					"C:\\Users\\Ulpcan\\Desktop\\"+ "cargoesInfo"+".dat" );
			BufferedWriter fileoutput = new BufferedWriter(filewriter);
			for (Cargo c : company.getCargoList()) {
			fileoutput.write(uniqueCargoID+","+c.getUniqueID()+","+c.getWeight()+","+c.getPrice()+","+c.getOrderDate()+","+c.getSenderCustomer().getNationalID()+","+c.getReceiverCustomer().getNationalID()+","+c.getCustomer().getNationalID()+"\n");		
						sum+=c.getPrice();
						uniqueCargoID++;
			}
			
			fileoutput.write("total price : "+sum+"\n");
			fileoutput.close();
			filewriter.close();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		

	}
});


		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(TransportationType.values()));
		panel1.add(comboBox);
		panel5.add(btnCheck2);
		btnCheck2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				panel5.setVisible(false);
				panel4.setVisible(false);
				panel6.setVisible(false);
				panel2.setVisible(true);

				

				

			}
		});
		
				

}
}

