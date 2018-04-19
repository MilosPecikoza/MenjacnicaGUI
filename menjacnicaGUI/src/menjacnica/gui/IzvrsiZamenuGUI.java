package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.event.ChangeEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private MenjacnicaGUI m;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI a) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
		m = a;
		setTitle("Izvrsi zamenu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(37, 28, 81, 14);
		contentPane.add(lblKupovniKurs);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(37, 53, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setBounds(170, 28, 46, 14);
		contentPane.add(lblValuta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(170, 53, 74, 20);
		contentPane.add(comboBox);
		comboBox.addItem("EUR");
		comboBox.addItem("USD");
		comboBox.addItem("CHF");
		
		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(283, 28, 86, 14);
		contentPane.add(lblProdajniKurs);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(283, 53, 123, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIznos = new JLabel("Iznos");
		lblIznos.setBounds(37, 101, 46, 14);
		contentPane.add(lblIznos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(37, 126, 161, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText("50");
		
		JLabel lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		lblVrstaTransakcije.setBounds(283, 101, 105, 14);
		contentPane.add(lblVrstaTransakcije);
		
		JRadioButton RadioButtonKupovina = new JRadioButton("Kupovina");
		RadioButtonKupovina.setSelected(true);
		RadioButtonKupovina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(RadioButtonKupovina.equals(true)) {
					
				}
			}
		});
		RadioButtonKupovina.setBounds(319, 125, 109, 23);
		contentPane.add(RadioButtonKupovina);
		
		JRadioButton RadioButtonProdaja = new JRadioButton("Prodaja");
		RadioButtonProdaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!RadioButtonProdaja.equals(true)) {
					RadioButtonKupovina.setSelected(false);
				}
			}
		});
		RadioButtonProdaja.setBounds(319, 151, 109, 23);
		contentPane.add(RadioButtonProdaja);
		
		RadioButtonKupovina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!RadioButtonKupovina.equals(true)) {
					RadioButtonProdaja.setSelected(false);
				}
			}
		});
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int vr = slider.getValue();
				textField_2.setText("" + vr);
			}
		});
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		slider.setBounds(54, 169, 315, 45);
		contentPane.add(slider);
		
		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val = "";
				if(comboBox.getSelectedIndex() == 0) val = "EUR";
				else if(comboBox.getSelectedIndex() == 1) val = "USD";
				else val = "CHF";
				
				String kup;
				if(RadioButtonKupovina.isSelected()) kup = "kupovina";
				else if(RadioButtonProdaja.isSelected()) kup = "prodaja";
				else kup = "";
				
				String dodaj = "Zamena{ ";
				dodaj += "Valuta: " + val + " , iznos: " + textField_2.getText() + ", " + kup + "}";
				
				m.textArea.append(dodaj + '\n');
			}
		});
		btnIzvrsiZamenu.setBounds(54, 228, 129, 23);
		contentPane.add(btnIzvrsiZamenu);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
			}
			
		});
		btnOdustani.setBounds(261, 228, 127, 23);
		contentPane.add(btnOdustani);
	}
}
