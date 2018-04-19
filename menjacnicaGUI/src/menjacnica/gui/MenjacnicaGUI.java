package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JList list;
	MenjacnicaGUI m;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
					int opcija = 
						JOptionPane.showConfirmDialog(
							null, "Da li zelite da izadjete?",
							"Izlazak", JOptionPane.YES_NO_CANCEL_OPTION);
					
					if (opcija == JOptionPane.YES_OPTION)
						System.exit(0);
			}
		});
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 689, 468);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ucitaj();
			}
		});
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sacuvaj();
			}
		});
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int opcija = 
						JOptionPane.showConfirmDialog(
							null, "Da li zelite da izadjete?",
							"Izlazak", JOptionPane.YES_NO_CANCEL_OPTION);
					
					if (opcija == JOptionPane.YES_OPTION)
						System.exit(0);
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(m, 
						"Milos Pecikoza","Autor",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(110, 10));
		contentPane.add(panel, BorderLayout.EAST);
		
		JButton btnDodajKurs = new JButton("Dodaj kurs");
		btnDodajKurs.setPreferredSize(new Dimension(99, 23));
		panel.add(btnDodajKurs);
		
		JButton btnObrisiKurs = new JButton("Obrisi kurs");
		btnObrisiKurs.setPreferredSize(new Dimension(99, 23));
		panel.add(btnObrisiKurs);
		
		JButton btnI = new JButton("Izvrsi izmenu");
		panel.add(btnI);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setPreferredSize(new Dimension(2, 100));
		contentPane.add(scrollPane, BorderLayout.SOUTH);
		
		list = new JList();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY, Color.GRAY, Color.GRAY, Color.GRAY));
		scrollPane.setViewportView(list);
		
		JLabel lblStatus = new JLabel("STATUS");
		scrollPane.setColumnHeaderView(lblStatus);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);
		
		JMenuItem mntmDodajKurs = new JMenuItem("Dodaj kurs");
		popupMenu.add(mntmDodajKurs);
		
		JMenuItem mntmObrisiKurs = new JMenuItem("Obrisi kurs");
		popupMenu.add(mntmObrisiKurs);
		
		JMenuItem mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
		popupMenu.add(mntmIzvrsiZamenu);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	private void sacuvaj() {
		JFileChooser fc = new JFileChooser();
		
		int opcija = fc.showSaveDialog(null);
		
		if (opcija == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();
			
			f.getAbsolutePath();
		}
	}
	
	private void ucitaj() {
		JFileChooser fc = new JFileChooser();
		
		int opcija = fc.showOpenDialog(null);

		if (opcija == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();
			
			
			String p = f.getAbsolutePath();
			/*p ="asa";
			PrintWriter out;
			try {
				out = new PrintWriter(p);
				list(out);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			
			
			/*try {
				biblioteka.ucitajKnjige(f.getAbsolutePath());
				prikaziSveKnjige();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(gp, 
						e.getMessage(), "Greska",JOptionPane.ERROR_MESSAGE);
			}*/
		}
	}
	
	/*public void ispisi (String isp) {
		try {
		list.setToolTipText(isp);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}*/
}
