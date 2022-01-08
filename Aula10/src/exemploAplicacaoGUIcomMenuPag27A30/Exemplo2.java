package exemploAplicacaoGUIcomMenuPag27A30;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Exemplo2 extends JFrame {
	private JMenuBar mbBarra; // Barra do menu.
	private JMenu mnCadastro; // Menu de Cadastro.
	
	// Itens e Submenus do menu Cadastro.
	private JMenuItem miCadCurso; // Item Cursos do menu Cadastro.
	private JMenuItem miCadDisciplina; // Item Disciplinas do menu Cadastro.
	private JMenu mnCadPessoa; // Submenu Pessoas do menu Cadastro.
	private JMenuItem miCadPessoa[]; // Itens submenu Pessoas.
	// Valores dos itens do submenu Pessoas.
	private static final String cadPesItens[] = {"Professores", "Alunos"}; 
	private JMenuItem miCadSair; // Item Sair do menu Cadastro.
	
	public Exemplo2() { // Construtor. 
	    // Instanciação dos componentes de interface.
		mbBarra = new JMenuBar();
		mnCadastro = new JMenu("Cadastro");
		miCadCurso = new JMenuItem("Cursos"); 
		miCadDisciplina = new JMenuItem("Disciplinas"); 
		mnCadPessoa = new JMenu("Pessoas");
		miCadPessoa = new JMenuItem[2];
		miCadSair = new JMenuItem("Sair");
		
		// Configuração dos componentes de interface.
		setTitle("Exemplo"); // Título da janela.
		setSize(500, 300); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		// Ao fechar a janela, libera todos os recursos usados pela aplicação.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(180, 205, 205)); // Configura a cor de fundo do container.
		miCadCurso.setMnemonic('C'); // Associa uma tecla de atalho ao item Cursos.
		miCadDisciplina.setMnemonic('D'); // Associa uma tecla de atalho ao item Disciplinas.
		mnCadPessoa.setMnemonic('P'); // Associa uma tecla de atalho ao menu Pessoas.
		miCadSair.setMnemonic('S'); // Associa uma tecla de atalho ao item Sair.
		for(int i = 0; i < miCadPessoa.length; i++) {
			miCadPessoa[i] = new JMenuItem(cadPesItens[i]); // Configura os valores dos itens do menu Pessoas.
			mnCadPessoa.add(miCadPessoa[i]); // Adiciona os itens ao menu Pessoas.
		}
		mnCadastro.add(miCadCurso); // Adiciona o item Cursos ao menu Cadastro.
		mnCadastro.add(miCadDisciplina); // Adiciona o item Disciplinas ao menu Cadastro.
		mnCadastro.add(mnCadPessoa); // Adiciona o menu Pessoas ao menu Cadastro.
		mnCadastro.addSeparator(); // Adiciona uma linha separadora ao menu.
		mnCadastro.add(miCadSair); // Adiciona o item Sair ao menu Cadastro.
		mbBarra.add(mnCadastro); // Adiciona o menu Cadastro à barra de menus.
		setJMenuBar(mbBarra); // Adiciona a barra de menus à janela.
		
		// Declaração do processador de evento referente ao clique no item Cursos.
		miCadCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { miCadCursoAction(); }
		});
	} // Final do construtor.

	private void miCadCursoAction() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() { new Curso().setVisible(true); }});
	}

	public static void main(String[] args) { // Início da aplicação.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() { new Exemplo2().setVisible(true); }});
	}

}
