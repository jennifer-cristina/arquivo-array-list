package br.senai.sp.jandira.arquivo.arrayList;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCidade;
	
	/***** Atributos Referentes a criação/gravação de contatos *****/
	Contato objContato = null;
	DadosContato objDadosContato = null;
	Arquivo objArquivo = null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastro frame = new FrameCadastro();
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
	public FrameCadastro() {
		
		objContato = new Contato();
		objDadosContato = new DadosContato();
		objArquivo = new Arquivo();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 333);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("CADASTRO DE CONTATOS");
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCadastro.setBounds(114, 0, 279, 40);
		contentPane.add(lblCadastro);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(30, 59, 53, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(30, 95, 53, 14);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefone.setBounds(10, 132, 73, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCidade.setBounds(30, 173, 53, 14);
		contentPane.add(lblCidade);
		
		txtNome = new JTextField();
		txtNome.setBounds(93, 59, 300, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(93, 95, 300, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(95, 132, 300, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(93, 173, 300, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(SystemColor.inactiveCaptionBorder);
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCadastrar.setBounds(30, 224, 100, 50);
		contentPane.add(btnCadastrar);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/**** Ação do botão Cadastrar ****/
				
				/*** Captura dos dados para o objeto de contato ****/
				objContato.setNome(txtNome.getText());
				objContato.setEmail(txtEmail.getText());
				objContato.setTelefone(txtTelefone.getText());
				objContato.setCidade(txtCidade.getText());
								
				/**** Preparação dos dados para na gravação no arquivo txt ****/
				String texto = objContato.getNome() + ";" +
							   objContato.getEmail() + ";" +
							   objContato.getTelefone() + ";" +
							   objContato.getCidade() + "\n";
				
				/**** Gravação dos dados no arquivo txt ****/
				String caminho = "C:\\Users\\21276662\\Desktop\\Contato\\contatos.txt";
				objArquivo.escrever(caminho, texto);

			}
		});
		
		
	}
}
