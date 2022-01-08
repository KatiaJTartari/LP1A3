package exercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Exercicio4 extends JFrame {
	private JMenuBar mbBarra; // Barra do menu.
	private JMenu mnCadastro; // Menu de Cadastro.

	// Itens e Submenus do menu Cadastro.
	private JMenu mnCadCliente; // Submenu Clientes do menu Cadastro.
	private JMenuItem miCadCliente[]; // Itens do submenu Clientes.
	// Valores dos itens do submenu Clientes.
	private static final String cadClienteItens[] = {"Pessoa Física", "Pessoa Jurídica"};
	private JMenuItem miCadFornecedor; // Item Fornecedores do menu Cadastro.
	private JMenuItem miCadSair; // Item Sair do menu Cadastro.

	public Exercicio4() {// Construtor.
		// Instanciação dos componentes de interface.
		mbBarra = new JMenuBar();
		mnCadastro = new JMenu("Cadastro");
		mnCadCliente = new JMenu("Clientes");
		miCadCliente = new JMenuItem[2];
		miCadFornecedor = new JMenuItem("Fornecedores");
		miCadSair = new JMenuItem("Sair");

		// Configuração dos componentes de interface.
		setTitle("Exercício 4"); // Título da janela.
		setSize(300, 250); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		// Ao fechar a janela, libera todos os recursos usados pela aplicação.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < miCadCliente.length; i++) {
			miCadCliente[i] = new JMenuItem(cadClienteItens[i]); // Configura os valores dos itens do menu Clientes.
			mnCadCliente.add(miCadCliente[i]); // Adiciona os itens ao menu Clientes.
		}
		mnCadastro.add(mnCadCliente); // Adiciona o menu Clientes ao menu Cadastro.
		mnCadastro.add(miCadFornecedor); // Adiciona o item Fornecedores ao menu Cadastro.
		mnCadastro.addSeparator(); // Adiciona uma linha separadora ao menu.
		mnCadastro.add(miCadSair); // Adiciona o item Sair ao menu Cadastro.
		mbBarra.add(mnCadastro); // Adiciona o menu Cadastro à barra de menus.
		setJMenuBar(mbBarra); // Adiciona a barra de menus à janela.

		// Declaração do processador de evento referente ao clique no item Pessoa Física.
		miCadCliente[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCadPessoaFisicaAction();
			}
		});

		// Declaração do processador de evento referente ao clique no item Pessoa Jurídica.
		miCadCliente[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCadPessoaJuridicaAction();
			}
		});

		// Declaração do processador de evento referente ao clique no item Fornecedor
		miCadFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCadPessoaFornecedorAction();
			}
		});

		// Declaração do processador de evento referente ao clique no item Sair
		miCadSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miCadPessoaSairAction();
			}
		});
	} // Final do construtor.

	private void miCadPessoaFisicaAction() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() { new PessoaFisica().setVisible(true); }});
	}
	
	private void miCadPessoaJuridicaAction() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() { new PessoaJuridica().setVisible(true); }});
	}

	private void miCadPessoaFornecedorAction() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() { new Fornecedor().setVisible(true); }});
	}
	
	protected void miCadPessoaSairAction() {
		System.exit(0);
	}
		
	public static void main(String[] args) {  // Início da aplicação.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() { new Exercicio4().setVisible(true); }});
	}

}
