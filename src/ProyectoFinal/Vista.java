package ProyectoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Vista {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
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
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 386, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setTitle("Proyecto Espejo");
		
		
		JLabel lblNewLabel = new JLabel("Original");
		lblNewLabel.setBounds(10, 11, 103, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Opcion 1");
		rdbtnNewRadioButton.setBounds(20, 34, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Opcion 2");
		rdbtnNewRadioButton_1.setBounds(20, 60, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Opcion 3");
		rdbtnNewRadioButton_2.setBounds(20, 86, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Opcion 4");
		chckbxNewCheckBox.setBounds(139, 34, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Opcion 5");
		chckbxNewCheckBox_1.setBounds(139, 60, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Opcion 6");
		chckbxNewCheckBox_2.setBounds(139, 86, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		textField = new JTextField();
		textField.setBounds(265, 35, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(265, 87, 86, 20);
		frame.getContentPane().add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"item 1", "item 2", "item 3"}));
		comboBox.setBounds(265, 60, 86, 22);
		frame.getContentPane().add(comboBox);
		
		
		//Espejo
		JLabel lblNewLabel_1 = new JLabel("Espejo");
		lblNewLabel_1.setBounds(10, 116, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
	
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Opcion 1");
		rdbtnNewRadioButton_3.setBounds(20, 137, 109, 23);
		rdbtnNewRadioButton_3.setEnabled(false);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton.addActionListener(e -> rdbtnNewRadioButton_3.setSelected(rdbtnNewRadioButton.isSelected()));
		rdbtnNewRadioButton_3.addActionListener(e -> rdbtnNewRadioButton.setSelected(rdbtnNewRadioButton_3.isSelected()));
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Opcion 2");
		rdbtnNewRadioButton_4.setBounds(20, 163, 109, 23);
		rdbtnNewRadioButton_4.setEnabled(false);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_1.addActionListener(e -> rdbtnNewRadioButton_4.setSelected(rdbtnNewRadioButton_1.isSelected()));
		rdbtnNewRadioButton_4.addActionListener(e -> rdbtnNewRadioButton_1.setSelected(rdbtnNewRadioButton_4.isSelected()));
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Opcion 3");
		rdbtnNewRadioButton_5.setBounds(20, 189, 109, 23);
		rdbtnNewRadioButton_5.setEnabled(false);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_2.addActionListener(e -> rdbtnNewRadioButton_5.setSelected(rdbtnNewRadioButton_2.isSelected()));
		rdbtnNewRadioButton_5.addActionListener(e -> rdbtnNewRadioButton_2.setSelected(rdbtnNewRadioButton_5.isSelected()));
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Opcion 4");
		chckbxNewCheckBox_3.setBounds(139, 137, 97, 23);
		chckbxNewCheckBox_3.setEnabled(false);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		chckbxNewCheckBox.addActionListener(e -> chckbxNewCheckBox_3.setSelected(chckbxNewCheckBox.isSelected()));
		chckbxNewCheckBox_3.addActionListener(e -> chckbxNewCheckBox.setSelected(chckbxNewCheckBox_3.isSelected()));
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Opcion 5");
		chckbxNewCheckBox_4.setBounds(139, 163, 97, 23);
		chckbxNewCheckBox_4.setEnabled(false);
		frame.getContentPane().add(chckbxNewCheckBox_4);
		chckbxNewCheckBox_1.addActionListener(e -> chckbxNewCheckBox_4.setSelected(chckbxNewCheckBox_1.isSelected()));
		chckbxNewCheckBox_4.addActionListener(e -> chckbxNewCheckBox_1.setSelected(chckbxNewCheckBox_4.isSelected()));
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Opcion 6");
		chckbxNewCheckBox_5.setBounds(139, 189, 97, 23);
		chckbxNewCheckBox_5.setEnabled(false);
		frame.getContentPane().add(chckbxNewCheckBox_5);
		chckbxNewCheckBox_2.addActionListener(e -> chckbxNewCheckBox_5.setSelected(chckbxNewCheckBox_2.isSelected()));
		chckbxNewCheckBox_5.addActionListener(e -> chckbxNewCheckBox_2.setSelected(chckbxNewCheckBox_5.isSelected()));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(265, 138, 86, 20);
		textField_1.setEnabled(false);
		frame.getContentPane().add(textField_1);
		textField.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) { textField_1.setText(textField.getText()); }
			public void keyReleased(KeyEvent e) { textField_1.setText(textField.getText()); }
			public void keyPressed(KeyEvent e) { textField_1.setText(textField.getText()); }
		});
		
		textField_1.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) { textField.setText(textField_1.getText()); }
			public void keyReleased(KeyEvent e) { textField.setText(textField_1.getText()); }
			public void keyPressed(KeyEvent e) { textField.setText(textField_1.getText()); }
		});
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"item 1", "item 2", "item 3"}));
		comboBox_1.setBounds(265, 163, 86, 22);
		comboBox_1.setEnabled(false);
		frame.getContentPane().add(comboBox_1);
		comboBox.addActionListener(e -> comboBox_1.setSelectedItem(comboBox.getSelectedItem()));
		comboBox_1.addActionListener(e -> comboBox.setSelectedItem(comboBox_1.getSelectedItem()));
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(265, 190, 86, 20);
		spinner_1.setEnabled(false);
		frame.getContentPane().add(spinner_1);
		spinner.addChangeListener(e -> spinner_1.setValue(spinner.getValue()));
		spinner_1.addChangeListener(e -> spinner.setValue(spinner_1.getValue()));
		
		JButton btnNewButton = new JButton("Cambiar Espejo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setEnabled(!rdbtnNewRadioButton.isEnabled());
				rdbtnNewRadioButton_3.setEnabled(!rdbtnNewRadioButton_3.isEnabled());

				rdbtnNewRadioButton_1.setEnabled(!rdbtnNewRadioButton_1.isEnabled());
				rdbtnNewRadioButton_4.setEnabled(!rdbtnNewRadioButton_4.isEnabled());

				rdbtnNewRadioButton_2.setEnabled(!rdbtnNewRadioButton_2.isEnabled());
				rdbtnNewRadioButton_5.setEnabled(!rdbtnNewRadioButton_5.isEnabled());

				chckbxNewCheckBox.setEnabled(!chckbxNewCheckBox.isEnabled());
				chckbxNewCheckBox_3.setEnabled(!chckbxNewCheckBox_3.isEnabled());

				chckbxNewCheckBox_1.setEnabled(!chckbxNewCheckBox_1.isEnabled());
				chckbxNewCheckBox_4.setEnabled(!chckbxNewCheckBox_4.isEnabled());

				chckbxNewCheckBox_2.setEnabled(!chckbxNewCheckBox_2.isEnabled());
				chckbxNewCheckBox_5.setEnabled(!chckbxNewCheckBox_5.isEnabled());

				textField.setEnabled(!textField.isEnabled());
				textField_1.setEnabled(!textField_1.isEnabled());

				comboBox.setEnabled(!comboBox.isEnabled());
				comboBox_1.setEnabled(!comboBox_1.isEnabled());

				spinner.setEnabled(!spinner.isEnabled());
				spinner_1.setEnabled(!spinner_1.isEnabled());
			}
		});
		btnNewButton.setBounds(101, 253, 160, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
