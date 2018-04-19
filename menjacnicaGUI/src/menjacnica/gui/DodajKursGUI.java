package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdKurs;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private MenjacnicaGUI m = new MenjacnicaGUI();
	//private static MenjacnicaGUI s = new MenjacnicaGUI();
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI(s);
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
	
	public DodajKursGUI(MenjacnicaGUI a) {
		super();
		m = a;
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});
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
		
		textFieldSifra = new JTextField();
		textFieldSifra.setBounds(35, 53, 143, 20);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);
		
		textFieldNaziv = new JTextField();
		textFieldNaziv.setBounds(209, 53, 143, 20);
		contentPane.add(textFieldNaziv);
		textFieldNaziv.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prodajni kurs");
		lblNewLabel.setPreferredSize(new Dimension(100, 14));
		lblNewLabel.setBounds(35, 108, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(209, 108, 86, 14);
		contentPane.add(lblKupovniKurs);
		
		textFieldProdKurs = new JTextField();
		textFieldProdKurs.setBounds(35, 133, 143, 20);
		contentPane.add(textFieldProdKurs);
		textFieldProdKurs.setColumns(10);
		
		textFieldKupovniKurs = new JTextField();
		textFieldKupovniKurs.setBounds(209, 133, 143, 20);
		contentPane.add(textFieldKupovniKurs);
		textFieldKupovniKurs.setColumns(10);
		
		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		lblSrednjiKurs.setBounds(35, 198, 86, 14);
		contentPane.add(lblSrednjiKurs);
		
		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(209, 198, 86, 14);
		contentPane.add(lblSkraceniNaziv);
		
		textFieldSrednjiKurs = new JTextField();
		textFieldSrednjiKurs.setBounds(35, 223, 143, 20);
		contentPane.add(textFieldSrednjiKurs);
		textFieldSrednjiKurs.setColumns(10);
		
		textFieldSkraceniNaziv = new JTextField();
		textFieldSkraceniNaziv.setBounds(209, 223, 143, 20);
		contentPane.add(textFieldSkraceniNaziv);
		textFieldSkraceniNaziv.setColumns(10);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dodaj = "";
				
				dodaj += "Sifra: " + textFieldSifra.getText() + " ,naziv: " + textFieldNaziv.getText() + " ,prodajni kurs: " + textFieldProdKurs.getText() +
						" ,kupovni kurs: " + textFieldKupovniKurs.getText() + " ,srednji kurs: " + textFieldSrednjiKurs.getText() +
						" ,skraceni naziv: " + textFieldSkraceniNaziv.getText();
				
				m.textArea.append("Dodat je ovaj kurs {" + dodaj + "}" + '\n');
				
				dispose();
			}
		});
		btnDodaj.setBounds(59, 254, 89, 23);
		contentPane.add(btnDodaj);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
			}
		});
		btnOdustani.setBounds(236, 254, 89, 23);
		contentPane.add(btnOdustani);
	}
}
