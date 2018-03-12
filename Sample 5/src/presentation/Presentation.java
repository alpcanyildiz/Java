package presentation;

// Alpcan Yildiz 220201049 - Ýsmail Burak Kurhan 220201055 

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;                                                                                                       

import domain.Agent;
import domain.House;

public class Presentation implements ActionListener {

	private JFrame frame;
	private JTable table;
	private JTextField textFieldID;
	private JTextField textFieldPrice;
	private JTextField textFieldSize;
	private JTextField textFieldRooms;
	private JTextField textFieldBathrooms;
	private JTextField textFieldAirConditioner;
	private JTextField textFieldIDforRemove;
	private JTextField textFieldMinimum;
	private JTextField textFieldMaximum;
	private JTextField textFieldNumberOfRooms;
	Icon icon;
	DefaultTableModel model;
	JButton checkButtonPRS;
	JButton buttonRemove;
	JButton btnSave;
	JButton btnAddHouse;
	JButton btnRemoveHouse;
	JPanel panel;
	JButton buttonRefresh;
	JPanel panel_1;
	JPanel panel_2;
	JLabel lblMinimum;
	JLabel lblMaximum_1;
	JLabel lblNumberOfRooms;
	JComboBox comboBoxPRS;
	JComboBox comboBoxAD;
	JButton checkButton;
	JButton buttonSave;
	TableRowSorter<TableModel> sorter;
	List<RowSorter.SortKey> sortKeys;
	List<RowSorter.SortKey> sortKeys2;
	Agent agent;
	ImageIcon img;
	
	
	
	
	public Presentation(Agent agent) {
		initialize();
		this.agent = agent;
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();

		panel_1 = new JPanel();

		panel_2 = new JPanel();
		panel_1.setVisible(false);
		panel_2.setVisible(false);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 620,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 182, Short.MAX_VALUE))
						.addContainerGap()));

		JLabel lblId = new JLabel("ID");

		textFieldIDforRemove = new JTextField();
		textFieldIDforRemove.setColumns(10);
	Image frameImg = Toolkit.getDefaultToolkit().getImage("homeicon.png");	
	
		frame.setIconImage(frameImg);
		
		buttonRemove = new JButton("Remove");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING).addComponent(buttonRemove)
						.addGroup(gl_panel_2.createSequentialGroup().addComponent(lblId).addGap(26).addComponent(
								textFieldIDforRemove, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(97, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE).addComponent(lblId).addComponent(
								textFieldIDforRemove, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(buttonRemove).addContainerGap(32, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);

		JLabel lblNewLabel = new JLabel("ID");

		textFieldID = new JTextField();
		textFieldID.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Price");

		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);

		JLabel lblSize = new JLabel("Size");

		textFieldSize = new JTextField();
		textFieldSize.setColumns(10);

		JLabel lblRooms = new JLabel("Rooms");

		textFieldRooms = new JTextField();
		textFieldRooms.setColumns(10);

		JLabel lblBathRooms = new JLabel("Bathrooms");

		textFieldBathrooms = new JTextField();
		textFieldBathrooms.setColumns(10);

		JLabel lblAir = new JLabel("Air Conditioner");

		textFieldAirConditioner = new JTextField();
		textFieldAirConditioner.setColumns(10);

		btnSave = new JButton("Save");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addGroup(gl_panel_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
										.addComponent(lblNewLabel_1).addComponent(lblSize))
								.addGap(23).addGroup(
										gl_panel_1
												.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel_1
														.createParallelGroup(Alignment.LEADING)
														.addComponent(textFieldPrice, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldID, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addComponent(textFieldSize, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup().addComponent(lblRooms)
								.addGap(18).addComponent(textFieldRooms, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGap(18)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_1.createSequentialGroup()
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblAir, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblBathRooms, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(29)
												.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
														.addComponent(textFieldBathrooms, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(textFieldAirConditioner,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))
								.addComponent(btnSave))
						.addContainerGap(99, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup()
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
						.addComponent(textFieldID).addComponent(lblBathRooms).addComponent(textFieldBathrooms,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
						.addComponent(textFieldPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAir).addComponent(textFieldAirConditioner, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblSize)
						.addComponent(textFieldSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSave))
				.addGap(18)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblRooms).addComponent(
						textFieldRooms, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(48)));
		panel_1.setLayout(gl_panel_1);

		comboBoxPRS = new JComboBox();
		comboBoxPRS.setModel(new DefaultComboBoxModel(new String[] { "By Price", "By Number of Rooms", "By Size" }));

		btnAddHouse = new JButton("Add House");

		comboBoxAD = new JComboBox();
		comboBoxAD.setModel(new DefaultComboBoxModel(new String[] { "Ascending Price", "Descending Price" }));

		btnRemoveHouse = new JButton("Remove House\r\n");

		lblMinimum = new JLabel("Minimum\r\n");

		textFieldMinimum = new JTextField();
		textFieldMinimum.setColumns(10);

		lblMaximum_1 = new JLabel("Maximum");

		textFieldMaximum = new JTextField();
		textFieldMaximum.setColumns(10);

		lblNumberOfRooms = new JLabel("Number of Rooms");
		lblNumberOfRooms.setVisible(false);
		textFieldNumberOfRooms = new JTextField();
		textFieldNumberOfRooms.setColumns(10);
		textFieldNumberOfRooms.setVisible(false);
		buttonRefresh = new JButton("REFRESH");

		JScrollPane scrollPane = new JScrollPane();

		checkButton = new JButton("Check");

		checkButtonPRS = new JButton("Check");

		buttonSave = new JButton("Save to File");

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel
								.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addGroup(gl_panel
										.createParallelGroup(
												Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel
												.createParallelGroup(Alignment.LEADING, false)
												.addComponent(comboBoxAD, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(comboBoxPRS, 0, 0, Short.MAX_VALUE)
												.addComponent(btnAddHouse, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnRemoveHouse, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(38)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(checkButtonPRS).addComponent(checkButton)
														.addComponent(buttonRefresh)))
										.addGroup(gl_panel.createSequentialGroup().addComponent(lblMinimum)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textFieldMinimum, GroupLayout.PREFERRED_SIZE, 53,
														GroupLayout.PREFERRED_SIZE)
												.addGap(10).addComponent(lblMaximum_1).addGap(4)
												.addComponent(textFieldMaximum, GroupLayout.PREFERRED_SIZE, 56,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup().addComponent(lblNumberOfRooms)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(textFieldNumberOfRooms, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup().addGap(84).addComponent(buttonSave)))
				.addGap(213)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel.createSequentialGroup()
						.addGap(21)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnAddHouse)
								.addComponent(buttonRefresh))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnRemoveHouse).addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxAD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(checkButton))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxPRS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(checkButtonPRS))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblMinimum)
								.addComponent(textFieldMinimum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMaximum_1).addComponent(textFieldMaximum, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNumberOfRooms)
								.addComponent(textFieldNumberOfRooms, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(41)).addGroup(
								gl_panel.createSequentialGroup().addContainerGap()
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 312,
														Short.MAX_VALUE)
												.addComponent(buttonSave))))
				.addContainerGap()));

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setToolTipText("");
		table.setFillsViewportHeight(true);
		model = new DefaultTableModel();
		String[] columns = { "ID", "price", "size", "room", "bathrooms", "air" };
		model.setColumnIdentifiers(columns);
		table.setModel(model);

		table.getColumnModel().getColumn(1).setResizable(false);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);

		checkButton.addActionListener(this);
		btnAddHouse.addActionListener(this);
		btnRemoveHouse.addActionListener(this);
		btnSave.addActionListener(this);
		buttonRemove.addActionListener(this);
		buttonRefresh.addActionListener(this);
		checkButtonPRS.addActionListener(this);
		buttonSave.addActionListener(this);
		sorter = new TableRowSorter<TableModel>(table.getModel());
		table.setRowSorter(sorter);
		comboBoxPRS.addActionListener(this);
		
		sortKeys = new ArrayList<>();
		sortKeys2 = new ArrayList<>();

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAddHouse) {
			int sizeForID = Integer.parseInt(agent.getHouseList().get(agent.getHouseList().size()-1).getId())+1;
			String ID = Integer.toString(sizeForID);
			textFieldID.setText(ID);
			textFieldID.setEnabled(false);
			panel_1.setVisible(true);

		} else if (e.getSource() == btnSave) {
			saveHouse();
			clearAddHouse();
			panel_1.setVisible(false);

		} else if (e.getSource() == btnRemoveHouse) {
			panel_2.setVisible(true);

		}

		else if (e.getSource() == buttonRemove) {
			deleteHouse();
			clearRemove();
			panel_2.setVisible(false);

		} else if (e.getSource() == buttonRefresh) {
			model.setRowCount(0);
			readFromList();
		}

		else if (e.getSource() == comboBoxPRS && comboBoxPRS.getSelectedItem() == "By Price") {
			textFieldNumberOfRooms.setVisible(false);
			lblNumberOfRooms.setVisible(false);
			textFieldMinimum.setVisible(true);
			textFieldMaximum.setVisible(true);
			lblMinimum.setVisible(true);
			lblMaximum_1.setVisible(true);
			
		}
		
		else if (e.getSource() == checkButtonPRS && comboBoxPRS.getSelectedItem() == "By Price" ) {
			
			if (!textFieldMinimum.getText().equals("") && !textFieldMaximum.getText().equals("")) {
				model.setRowCount(0);
				int minimum = Integer.parseInt(textFieldMinimum.getText());
				int maximum = Integer.parseInt(textFieldMaximum.getText());
				for (House house : agent.getHouseList()) {
					if (minimum <= house.getPrice() && house.getPrice() <= maximum)
						addingRows(house);
				}
				textFieldMinimum.setText("");
				textFieldMaximum.setText("");
			}

			else
				JOptionPane.showMessageDialog(null, "Please enter the textfields");
		}
		

		else if (e.getSource() == comboBoxPRS && comboBoxPRS.getSelectedItem() == "By Size") {
			textFieldNumberOfRooms.setVisible(false);
			lblNumberOfRooms.setVisible(false);
			textFieldMinimum.setVisible(true);
			textFieldMaximum.setVisible(true);
			lblMinimum.setVisible(true);
			lblMaximum_1.setVisible(true);

			
		}

		else if (e.getSource() == checkButtonPRS && comboBoxPRS.getSelectedItem() == "By Size") {

			if (!textFieldMinimum.getText().equals("") && !textFieldMaximum.getText().equals("") && comboBoxPRS.getSelectedItem() == "By Size" ) {
				double sizeMinimum = Double.parseDouble(textFieldMinimum.getText());
				double sizeMaximum = Double.parseDouble(textFieldMaximum.getText());
				model.setRowCount(0);
				for (House house : agent.getHouseList()) {
					if (sizeMinimum <= house.getSize() && house.getSize() <= sizeMaximum)
						addingRows(house);
				}
				textFieldMinimum.setText("");
				textFieldMaximum.setText("");
				
			}

			else
				JOptionPane.showMessageDialog(null, "Please enter the textfield");

		}
		
		else if (e.getSource() == comboBoxPRS && comboBoxPRS.getSelectedItem() == "By Number of Rooms") {
			textFieldNumberOfRooms.setVisible(true);
			lblNumberOfRooms.setVisible(true);
			textFieldMinimum.setVisible(false);
			textFieldMaximum.setVisible(false);
			lblMinimum.setVisible(false);
			lblMaximum_1.setVisible(false);
		

		}
		
		else if (e.getSource() == checkButtonPRS && comboBoxPRS.getSelectedItem() == "By Number of Rooms") {
		
			if (comboBoxPRS.getSelectedItem() == "By Number of Rooms" && !textFieldNumberOfRooms.getText().equals("")) {
				model.setRowCount(0);
				int room = Integer.parseInt(textFieldNumberOfRooms.getText());
				for (House house : agent.getHouseList()) {
					if (house.getRooms() == room)
						addingRows(house);
				}
				textFieldNumberOfRooms.setText("");
				
			} else
				JOptionPane.showMessageDialog(null, "Please enter the textfield");

		}

		else if (e.getSource() == checkButton) {

			if (comboBoxAD.getSelectedItem() == "Ascending Price") {
				sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
				sorter.setSortKeys(sortKeys);
			}

			else if (comboBoxAD.getSelectedItem() == "Descending Price") {
				sortKeys2.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));
				sorter.setSortKeys(sortKeys2);

			}
		}
		
		else if (e.getSource() == buttonSave) {
			agent.saveToFile();
			JOptionPane.showMessageDialog(null, "File Saved ! ");
		}
		

	}

	public void saveHouse() {

		if (textFieldPrice.getText().equals("") || textFieldSize.getText().equals("")
				|| textFieldRooms.getText().equals("") || textFieldBathrooms.getText().equals("")
				|| textFieldAirConditioner.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Please enter the textfields ");
		} else {

			double price = Double.parseDouble(textFieldPrice.getText());
			double size = Double.parseDouble(textFieldSize.getText());
			int rooms = Integer.parseInt(textFieldRooms.getText());
			int bathrooms = Integer.parseInt(textFieldBathrooms.getText());
			String airConditioner = textFieldAirConditioner.getText();
			
			int sizeForID = Integer.parseInt(agent.getHouseList().get(agent.getHouseList().size()-1).getId())+1;
			String ID = Integer.toString(sizeForID);

			House house = new House(ID, price, size, rooms, bathrooms, airConditioner);
			agent.saveHouse(house);
			addingRows(house);
			JOptionPane.showMessageDialog(null, "House Saved");

		}
	}

	public void addingRows(House house) {
		Object[] row = new Object[6];
		row[0] = house.getId();
		row[1] = house.getPrice();
		row[2] = house.getSize();
		row[3] = house.getRooms();
		row[4] = house.getBathrooms();
		row[5] = house.getAirconditioner();
		model.addRow(row);

	}

	public void deleteHouse() {
		model.setRowCount(0);
		readFromList();
		String ID = textFieldIDforRemove.getText();

		if (agent.check(ID)) {

			for (int i = 0; i < agent.getHouseList().size(); i++) {
				if (agent.getHouseList().get(i).getId().equals(ID)) {
					model.removeRow(i);
					agent.remove(agent.getHouseList().get(i));
				}
			}

			JOptionPane.showMessageDialog(null, "Deleted.");
		} else
			JOptionPane.showMessageDialog(null, "House cannot be found.");

	}

	public void clearAddHouse() {
		textFieldID.setText("");
		textFieldPrice.setText("");
		textFieldSize.setText("");
		textFieldRooms.setText("");
		textFieldBathrooms.setText("");
		textFieldAirConditioner.setText("");

	}

	public void clearRemove() {
		textFieldIDforRemove.setText("");
	}

	public void readFromList() {
		for (House house : agent.getHouseList()) {
			addingRows(house);
		}

	}

}
