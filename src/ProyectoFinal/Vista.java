package ProyectoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Vista {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField1_mirror;

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
		frame.setBounds(100, 100, 386, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setTitle("Proyecto Espejo");

		// Original

		JLabel label1 = new JLabel("Original");
		label1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label1.setBounds(149, 13, 76, 14);
		frame.getContentPane().add(label1);

		JRadioButton radioButton1 = new JRadioButton("Opcion 1");
		radioButton1.setBounds(20, 34, 109, 23);
		frame.getContentPane().add(radioButton1);

		JRadioButton radioButton2 = new JRadioButton("Opcion 2");
		radioButton2.setBounds(20, 60, 109, 23);
		frame.getContentPane().add(radioButton2);

		JRadioButton radioButton3 = new JRadioButton("Opcion 3");
		radioButton3.setBounds(20, 86, 109, 23);
		frame.getContentPane().add(radioButton3);

		JCheckBox checkBox1 = new JCheckBox("Opcion 4");
		checkBox1.setBounds(139, 34, 97, 23);
		frame.getContentPane().add(checkBox1);

		JCheckBox checkBox2 = new JCheckBox("Opcion 5");
		checkBox2.setBounds(139, 60, 97, 23);
		frame.getContentPane().add(checkBox2);

		JCheckBox checkBox3 = new JCheckBox("Opcion 6");
		checkBox3.setBounds(139, 86, 97, 23);
		frame.getContentPane().add(checkBox3);

		textField1 = new JTextField();
		textField1.setBounds(265, 35, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);

		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(265, 87, 86, 20);
		frame.getContentPane().add(spinner1);

		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] { "item 1", "item 2", "item 3" }));
		comboBox1.setBounds(265, 60, 86, 22);
		frame.getContentPane().add(comboBox1);

		// Espejo
		JLabel label1_mirror = new JLabel("Espejo");
		label1_mirror.setFont(new Font("Tahoma", Font.BOLD, 15));
		label1_mirror.setBounds(149, 132, 146, 14);
		frame.getContentPane().add(label1_mirror);

		JRadioButton radioButton1_mirror = new JRadioButton("Opcion 1");
		radioButton1_mirror.setBounds(20, 153, 109, 23);
		radioButton1_mirror.setEnabled(false);
		frame.getContentPane().add(radioButton1_mirror);
		radioButton1.addActionListener(e -> radioButton1_mirror.setSelected(radioButton1.isSelected()));
		radioButton1_mirror.addActionListener(e -> radioButton1.setSelected(radioButton1_mirror.isSelected()));

		JRadioButton radioButton2_mirror = new JRadioButton("Opcion 2");
		radioButton2_mirror.setBounds(20, 179, 109, 23);
		radioButton2_mirror.setEnabled(false);
		frame.getContentPane().add(radioButton2_mirror);
		radioButton2.addActionListener(e -> radioButton2_mirror.setSelected(radioButton2.isSelected()));
		radioButton2_mirror.addActionListener(e -> radioButton2.setSelected(radioButton2_mirror.isSelected()));

		JRadioButton radioButton3_mirror = new JRadioButton("Opcion 3");
		radioButton3_mirror.setBounds(20, 205, 109, 23);
		radioButton3_mirror.setEnabled(false);
		frame.getContentPane().add(radioButton3_mirror);
		radioButton3.addActionListener(e -> radioButton3_mirror.setSelected(radioButton3.isSelected()));
		radioButton3_mirror.addActionListener(e -> radioButton3.setSelected(radioButton3_mirror.isSelected()));

		JCheckBox checkBox1_mirror = new JCheckBox("Opcion 4");
		checkBox1_mirror.setBounds(139, 153, 97, 23);
		checkBox1_mirror.setEnabled(false);
		frame.getContentPane().add(checkBox1_mirror);
		checkBox1.addActionListener(e -> checkBox1_mirror.setSelected(checkBox1.isSelected()));
		checkBox1_mirror.addActionListener(e -> checkBox1.setSelected(checkBox1_mirror.isSelected()));

		JCheckBox checkBox2_mirror = new JCheckBox("Opcion 5");
		checkBox2_mirror.setBounds(139, 179, 97, 23);
		checkBox2_mirror.setEnabled(false);
		frame.getContentPane().add(checkBox2_mirror);
		checkBox2.addActionListener(e -> checkBox2_mirror.setSelected(checkBox2.isSelected()));
		checkBox2_mirror.addActionListener(e -> checkBox2.setSelected(checkBox2_mirror.isSelected()));

		JCheckBox checkBox3_mirror = new JCheckBox("Opcion 6");
		checkBox3_mirror.setBounds(139, 205, 97, 23);
		checkBox3_mirror.setEnabled(false);
		frame.getContentPane().add(checkBox3_mirror);
		checkBox3.addActionListener(e -> checkBox3_mirror.setSelected(checkBox3.isSelected()));
		checkBox3_mirror.addActionListener(e -> checkBox3.setSelected(checkBox3_mirror.isSelected()));

		textField1_mirror = new JTextField();
		textField1_mirror.setColumns(10);
		textField1_mirror.setBounds(265, 154, 86, 20);
		textField1_mirror.setEnabled(false);
		frame.getContentPane().add(textField1_mirror);
		textField1.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				textField1_mirror.setText(textField1.getText());
			}

			public void keyReleased(KeyEvent e) {
				textField1_mirror.setText(textField1.getText());
			}

			public void keyPressed(KeyEvent e) {
				textField1_mirror.setText(textField1.getText());
			}
		});

		textField1_mirror.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				textField1.setText(textField1_mirror.getText());
			}

			public void keyReleased(KeyEvent e) {
				textField1.setText(textField1_mirror.getText());
			}

			public void keyPressed(KeyEvent e) {
				textField1.setText(textField1_mirror.getText());
			}
		});

		JComboBox comboBox1_mirror = new JComboBox();
		comboBox1_mirror.setModel(new DefaultComboBoxModel(new String[] { "item 1", "item 2", "item 3" }));
		comboBox1_mirror.setBounds(265, 179, 86, 22);
		comboBox1_mirror.setEnabled(false);
		frame.getContentPane().add(comboBox1_mirror);
		comboBox1.addActionListener(e -> comboBox1_mirror.setSelectedItem(comboBox1.getSelectedItem()));
		comboBox1_mirror.addActionListener(e -> comboBox1.setSelectedItem(comboBox1_mirror.getSelectedItem()));

		JSpinner spinner1_mirror = new JSpinner();
		spinner1_mirror.setBounds(265, 206, 86, 20);
		spinner1_mirror.setEnabled(false);
		frame.getContentPane().add(spinner1_mirror);
		spinner1.addChangeListener(e -> spinner1_mirror.setValue(spinner1.getValue()));
		spinner1_mirror.addChangeListener(e -> spinner1.setValue(spinner1_mirror.getValue()));

		JButton button1 = new JButton("Cambiar Espejo");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				toggleEnabled(radioButton1, radioButton1_mirror);
				toggleEnabled(radioButton2, radioButton2_mirror);
				toggleEnabled(radioButton3, radioButton3_mirror);
				toggleEnabled(checkBox1, checkBox1_mirror);
				toggleEnabled(checkBox2, checkBox2_mirror);
				toggleEnabled(checkBox3, checkBox3_mirror);
				toggleEnabled(textField1, textField1_mirror);
				toggleEnabled(comboBox1, comboBox1_mirror);
				toggleEnabled(spinner1, spinner1_mirror);

				String temp = label1.getText();
				label1.setText(label1_mirror.getText());
				label1_mirror.setText(temp);
			}
		});
		button1.setBounds(39, 268, 160, 23);
		frame.getContentPane().add(button1);

		JButton button2 = new JButton("Borrar");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButton1.setSelected(false);
				radioButton2.setSelected(false);
				radioButton3.setSelected(false);
				checkBox1.setSelected(false);
				checkBox2.setSelected(false);
				checkBox3.setSelected(false);
				textField1.setText("");
				spinner1.setValue(0);
				comboBox1.setSelectedIndex(0);

				radioButton1_mirror.setSelected(false);
				radioButton2_mirror.setSelected(false);
				radioButton3_mirror.setSelected(false);
				checkBox1_mirror.setSelected(false);
				checkBox2_mirror.setSelected(false);
				checkBox3_mirror.setSelected(false);
				textField1_mirror.setText("");
				spinner1_mirror.setValue(0);
				comboBox1_mirror.setSelectedIndex(0);

			}
		});
		button2.setBounds(226, 268, 89, 23);
		frame.getContentPane().add(button2);

		frame.getContentPane().setBackground(new java.awt.Color(240, 240, 240)); // Inicializa el color de fondo

		JButton btnNewButton = new JButton("Modo Oscuro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.awt.Color lightGray = new java.awt.Color(240, 240, 240);
				if (frame.getContentPane().getBackground().getRGB() == lightGray.getRGB()) {
					frame.getContentPane().setBackground(java.awt.Color.DARK_GRAY);
					label1.setForeground(java.awt.Color.WHITE);
					label1_mirror.setForeground(java.awt.Color.WHITE);
					btnNewButton.setText("Modo Claro");
				} else {
					frame.getContentPane().setBackground(lightGray);
					label1.setForeground(java.awt.Color.BLACK);
					label1_mirror.setForeground(java.awt.Color.BLACK);
					btnNewButton.setText("Modo Oscuro");
				}
			}
		});
		btnNewButton.setBounds(39, 302, 160, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Random");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean randomRadioButton1 = Math.random() < 0.5;
				boolean randomRadioButton2 = Math.random() < 0.5;
				boolean randomRadioButton3 = Math.random() < 0.5;
				boolean randomCheckBox1 = Math.random() < 0.5;
				boolean randomCheckBox2 = Math.random() < 0.5;
				boolean randomCheckBox3 = Math.random() < 0.5;

				int randomTextField = (int) (Math.random() * 10);
				StringBuilder randomString = new StringBuilder(randomTextField);
				String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
				for (int i = 0; i < randomTextField; i++) {
					int index = (int) (Math.random() * alphabet.length());
					randomString.append(alphabet.charAt(index));
				}

				int randomSpinner = (int) (Math.random() * 100);
				int randomComboBox = (int) (Math.random() * 3);

				radioButton1.setSelected(randomRadioButton1);
				radioButton2.setSelected(randomRadioButton2);
				radioButton3.setSelected(randomRadioButton3);
				checkBox1.setSelected(randomCheckBox1);
				checkBox2.setSelected(randomCheckBox2);
				checkBox3.setSelected(randomCheckBox3);
				textField1.setText(String.valueOf(randomString));
				spinner1.setValue(randomSpinner);
				comboBox1.setSelectedIndex(randomComboBox);

				radioButton1_mirror.setSelected(randomRadioButton1);
				radioButton2_mirror.setSelected(randomRadioButton2);
				radioButton3_mirror.setSelected(randomRadioButton3);
				checkBox1_mirror.setSelected(randomCheckBox1);
				checkBox2_mirror.setSelected(randomCheckBox2);
				checkBox3_mirror.setSelected(randomCheckBox3);
				textField1_mirror.setText(String.valueOf(randomString));
				spinner1_mirror.setValue(randomSpinner);
				comboBox1_mirror.setSelectedIndex(randomComboBox);
			}
		});
		btnNewButton_1.setBounds(226, 302, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

	}

	public void toggleEnabled(JComponent component1, JComponent component2) {
		component1.setEnabled(!component1.isEnabled());
		component2.setEnabled(!component2.isEnabled());
	}
}