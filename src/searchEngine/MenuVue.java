package searchEngine;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MenuVue extends JFrame {

	public JMenuBar menuBar = new JMenuBar();
	public JMenu indexer = new JMenu("Indexer");
	public JMenu inverser = new JMenu("Inverser");
	public JMenu afficherIndex = new JMenu("Afficher index");
	public JMenu rechercher = new JMenu("Rechercher");
	public JMenuItem openFile = new JMenuItem("Ouvrir");
	public JTextField texteRecherche = new JTextField();
	public static JTextArea fichierRecherche = new JTextArea(50,50);
	public JButton searchButton = new JButton("Search");
	public JFileChooser fc = new JFileChooser();
	public JScrollPane scrollPane = new JScrollPane(fichierRecherche);
	
	
	
	
	
	
	
	
	MenuVue()
	{
		JPanel searchPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		this.setVisible(true);
		this.setJMenuBar(menuBar);
		texteRecherche.setColumns(50);
		//this.setLayout(new FlowLayout());
		menuBar.add(indexer);
		menuBar.add(inverser);
		menuBar.add(afficherIndex);
		menuBar.add(rechercher);
		indexer.add(openFile);
		searchPanel.add(texteRecherche);
		searchPanel.add(searchButton);
		searchPanel.add(fichierRecherche);
		scrollPane.getViewport().add(fichierRecherche);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(searchPanel);
		searchPanel.add(scrollPane);
	}
	

}
