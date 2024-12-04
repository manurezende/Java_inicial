package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;

public class exemploTabela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exemploTabela frame = new exemploTabela();
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
	public exemploTabela() {
		setTitle("tabela de dados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(99, 158, 708, 246);
		contentPane.add(scrollPane);
		
//		criando as colunas da nossa taqbela
		String col[]= {"Codigo","nome Produto", "Quantidade","preço"};
		String dados [][] = {
				{"01","Mouse","45","R$ 54,90"},
				{"02","Teclado","15","R$ 120,40"}
			
			
		
		
		};
		
		
		
		table = new JTable(dados, col);
		table.setBackground(new Color(255, 128, 192));
		scrollPane.setViewportView(table);
	}
}
