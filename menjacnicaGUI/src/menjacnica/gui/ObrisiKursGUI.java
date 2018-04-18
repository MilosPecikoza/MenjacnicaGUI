package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

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
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sifra");
		lblNewLabel.setBounds(39, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNaziv = new JLabel("Naziv");
		lblNaziv.setBounds(239, 29, 46, 14);
		contentPane.add(lblNaziv);
		
		textField = new JTextField();
		textField.setBounds(32, 47, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(239, 47, 143, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(39, 105, 100, 14);
		contentPane.add(lblProdajniKurs);
		
		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(239, 105, 100, 14);
		contentPane.add(lblKupovniKurs);
		
		textField_2 = new JTextField();
		textField_2.setBounds(32, 125, 143, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(239, 125, 143, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		lblSrednjiKurs.setBounds(39, 178, 46, 14);
		contentPane.add(lblSrednjiKurs);
		
		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(239, 178, 86, 14);
		contentPane.add(lblSkraceniNaziv);
		
		textField_4 = new JTextField();
		textField_4.setBounds(32, 203, 143, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(239, 203, 143, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxZaistaObrisi = new JCheckBox("Zaista obrisi kurs");
		chckbxZaistaObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chckbxZaistaObrisi.setBounds(39, 243, 134, 23);
		contentPane.add(chckbxZaistaObrisi);
		
		JButton btnObrisiKurs = new JButton("Obrisi");
		btnObrisiKurs.setEnabled(false);
		btnObrisiKurs.setBounds(50, 276, 89, 23);
		contentPane.add(btnObrisiKurs);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.setBounds(253, 276, 89, 23);
		contentPane.add(btnOdustani);
	}
}
