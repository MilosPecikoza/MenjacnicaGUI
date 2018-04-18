package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Dodaj kurs");
		setBounds(100, 100, 387, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSifra = new JLabel("Sifra");
		lblSifra.setBounds(35, 28, 46, 14);
		contentPane.add(lblSifra);
		
		JLabel lblNaziv = new JLabel("Naziv");
		lblNaziv.setBounds(209, 28, 46, 14);
		contentPane.add(lblNaziv);
		
		textField = new JTextField();
		textField.setBounds(35, 53, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 53, 143, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prodajni kurs");
		lblNewLabel.setPreferredSize(new Dimension(100, 14));
		lblNewLabel.setBounds(35, 108, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(209, 108, 86, 14);
		contentPane.add(lblKupovniKurs);
		
		textField_2 = new JTextField();
		textField_2.setBounds(35, 133, 143, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(209, 133, 143, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		lblSrednjiKurs.setBounds(35, 198, 86, 14);
		contentPane.add(lblSrednjiKurs);
		
		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(209, 198, 86, 14);
		contentPane.add(lblSkraceniNaziv);
		
		textField_4 = new JTextField();
		textField_4.setBounds(35, 223, 143, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(209, 223, 143, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setBounds(59, 254, 89, 23);
		contentPane.add(btnDodaj);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.setBounds(236, 254, 89, 23);
		contentPane.add(btnOdustani);
	}
}
