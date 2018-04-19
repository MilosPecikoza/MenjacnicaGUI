package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(37, 28, 81, 14);
		contentPane.add(lblKupovniKurs);
		
		textField = new JTextField();
		textField.setBounds(37, 53, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setBounds(170, 28, 46, 14);
		contentPane.add(lblValuta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(170, 53, 28, 20);
		contentPane.add(comboBox);
		
		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(283, 28, 86, 14);
		contentPane.add(lblProdajniKurs);
		
		textField_1 = new JTextField();
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
		
		JLabel lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		lblVrstaTransakcije.setBounds(283, 101, 105, 14);
		contentPane.add(lblVrstaTransakcije);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kupovina");
		rdbtnNewRadioButton.setBounds(319, 125, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnProdaja = new JRadioButton("Prodaja");
		rdbtnProdaja.setBounds(319, 151, 109, 23);
		contentPane.add(rdbtnProdaja);
		
		JSlider slider = new JSlider();
		slider.setBounds(120, 191, 200, 23);
		contentPane.add(slider);
		
		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.setBounds(54, 228, 106, 23);
		contentPane.add(btnIzvrsiZamenu);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.setBounds(261, 228, 108, 23);
		contentPane.add(btnOdustani);
	}
}
