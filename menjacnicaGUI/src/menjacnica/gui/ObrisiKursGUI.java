package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdKurs;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private MenjacnicaGUI m;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI a) {
		m = a;
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
					dispose();
			}
		});
		setTitle("Obrisi kurs");
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
		
		textFieldSifra = new JTextField();
		textFieldSifra.setBounds(32, 47, 143, 20);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);
		
		textFieldNaziv = new JTextField();
		textFieldNaziv.setBounds(239, 47, 143, 20);
		contentPane.add(textFieldNaziv);
		textFieldNaziv.setColumns(10);
		
		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(39, 105, 100, 14);
		contentPane.add(lblProdajniKurs);
		
		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(239, 105, 100, 14);
		contentPane.add(lblKupovniKurs);
		
		textFieldProdKurs = new JTextField();
		textFieldProdKurs.setBounds(32, 125, 143, 20);
		contentPane.add(textFieldProdKurs);
		textFieldProdKurs.setColumns(10);
		
		textFieldKupovniKurs = new JTextField();
		textFieldKupovniKurs.setBounds(239, 125, 143, 20);
		contentPane.add(textFieldKupovniKurs);
		textFieldKupovniKurs.setColumns(10);
		
		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		lblSrednjiKurs.setBounds(39, 178, 136, 14);
		contentPane.add(lblSrednjiKurs);
		
		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(239, 178, 86, 14);
		contentPane.add(lblSkraceniNaziv);
		
		textFieldSrednjiKurs = new JTextField();
		textFieldSrednjiKurs.setBounds(32, 203, 143, 20);
		contentPane.add(textFieldSrednjiKurs);
		textFieldSrednjiKurs.setColumns(10);
		
		textFieldSkraceniNaziv = new JTextField();
		textFieldSkraceniNaziv.setBounds(239, 203, 143, 20);
		contentPane.add(textFieldSkraceniNaziv);
		textFieldSkraceniNaziv.setColumns(10);
		
		
		
		JButton btnObrisiKurs = new JButton("Obrisi");
		btnObrisiKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dodaj = "Obrisan je ovaj kurs {";
				
				dodaj += "Sifra: " + textFieldSifra.getText() + " ,naziv: " + textFieldNaziv.getText() + " ,prodajni kurs: " + textFieldProdKurs.getText() +
						" ,kupovni kurs: " + textFieldKupovniKurs.getText() + " ,srednji kurs: " + textFieldSrednjiKurs.getText() +
						" ,skraceni naziv: " + textFieldSkraceniNaziv.getText() + "}";
				
				m.textArea.append(dodaj + '\n');
				dispose();
			}
		});
		btnObrisiKurs.setEnabled(false);
		btnObrisiKurs.setBounds(50, 276, 89, 23);
		contentPane.add(btnObrisiKurs);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
			}
		});
		btnOdustani.setBounds(253, 276, 89, 23);
		contentPane.add(btnOdustani);
		
		JCheckBox chckbxZaistaObrisi = new JCheckBox("Zaista obrisi kurs");
		chckbxZaistaObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxZaistaObrisi.isSelected()) btnObrisiKurs.setEnabled(true);
				else btnObrisiKurs.setEnabled(false);
			}
		});
		chckbxZaistaObrisi.setBounds(39, 243, 134, 23);
		contentPane.add(chckbxZaistaObrisi);
		
		
		 
	}
}
