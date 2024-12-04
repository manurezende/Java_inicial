package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cadastroProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroProdutos frame = new cadastroProdutos();
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
	public cadastroProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 524);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 169, 201));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(156, 228, 146));
		panel.setBounds(10, 11, 1015, 234);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("cadastro de produtos");
		lblNewLabel.setForeground(new Color(251, 85, 89));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblNewLabel.setBounds(0, 0, 293, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("nome do produto:");
		lblNewLabel_1.setBounds(10, 40, 109, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(112, 37, 152, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("codigo do produto:");
		lblNewLabel_2.setBounds(10, 79, 109, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 76, 142, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Valor da compra:");
		lblNewLabel_3.setBounds(10, 119, 109, 14);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 116, 152, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("marca:");
		lblNewLabel_4.setBounds(10, 157, 70, 14);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(58, 154, 206, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("novo");
		btnNewButton.setBackground(new Color(113, 188, 99));
		btnNewButton.setBounds(23, 200, 75, 23);
		panel.add(btnNewButton);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.setBackground(new Color(113, 188, 99));
		btnCadastrar.setBounds(121, 200, 109, 23);
		panel.add(btnCadastrar);
		
		JButton btnLimparCampos = new JButton("limpar campos");
		btnLimparCampos.setBackground(new Color(113, 188, 99));
		btnLimparCampos.setBounds(247, 200, 123, 23);
		panel.add(btnLimparCampos);
		
		JButton btnLimparTabela = new JButton("limpar tabela");
		btnLimparTabela.setBackground(new Color(113, 188, 99));
		btnLimparTabela.setBounds(391, 200, 123, 23);
		panel.add(btnLimparTabela);
		
		JButton btnLimparLinha = new JButton("limpar linha");
		btnLimparLinha.setBackground(new Color(113, 188, 99));
		btnLimparLinha.setBounds(536, 200, 135, 23);
		panel.add(btnLimparLinha);
		
		JButton btnSalvarAlteraes = new JButton("salvar alterações");
		btnSalvarAlteraes.setBackground(new Color(113, 188, 99));
		btnSalvarAlteraes.setBounds(699, 200, 152, 23);
		panel.add(btnSalvarAlteraes);
		
		JButton btnEditar = new JButton("editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setBackground(new Color(113, 188, 99));
		btnEditar.setBounds(877, 200, 75, 23);
		panel.add(btnEditar);
		
		JLabel lblNewLabel_5 = new JLabel("data da compra:");
		lblNewLabel_5.setBounds(391, 40, 109, 14);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(485, 37, 123, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("fornecedor:");
		lblNewLabel_6.setBounds(391, 79, 92, 14);
		panel.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(461, 76, 147, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("valor da venda:");
		lblNewLabel_7.setBounds(391, 119, 109, 14);
		panel.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(482, 116, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("prateleira:");
		lblNewLabel_8.setBounds(391, 157, 92, 14);
		panel.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(453, 154, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(113, 188, 99));
		panel_1.setBounds(10, 257, 1015, 217);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 995, 212);
		panel_1.add(scrollPane);
		
//		criando as colunas da nossa taqbela
		String col[]= {"Codigo","nome Produto", "Quantidade","preço"};
		String dados [][] = {
				{"01","Mouse","45","R$ 54,90"},
				{"02","Teclado","15","R$ 120,40"}
			
			
		
		
		};
		
		
		
		table = new JTable(dados, col);
		table.setBackground(new Color(254, 169, 201));
		scrollPane.setViewportView(table);
	}
}
