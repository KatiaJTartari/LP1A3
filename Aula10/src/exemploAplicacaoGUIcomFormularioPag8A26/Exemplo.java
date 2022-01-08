package exemploAplicacaoGUIcomFormularioPag8A26;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Passo 2 - Criando uma subclasse da classe JFrame:
import javax.swing.*;

@SuppressWarnings("serial")
public class Exemplo extends JFrame{
// Fim Passo 2.
	
	// Passo 3 - Declarando os componentes da janela na classe:
	private JLabel lbTitulo, lbNome, lbEndereco, lbTelefone, lbDeficiente, lbDependentes;
	private JTextField tfNome, tfEndereco, tfTelefone;
	private static final String valDef[] = {"Não", "Sim"}; // Valores dos JRadioButtons.
	private JRadioButton rbDeficiente[];
	private ButtonGroup bgDeficiente; // Grupo de botões para agrupar os JRadioButtons.
	private JComboBox<Integer> cbDependentes;
	private static final Integer valDep[] = {0, 1, 2, 3, 4}; // Valores do JComboBox.
	private JCheckBox ckPlanoSaude;
	private JButton btCadastrar;
	private Container cp; // Container para organizar os componentes na janela.
	// Fim Passo 3.
	
    // Passo 4 - Implementando o construtor da classe - Instanciando componentes:
	public Exemplo() { // Construtor. 
	    // Instanciação dos componentes de interface.
		lbTitulo = new JLabel("Cadastro de Funcionários");
		lbNome = new JLabel("Nome");
		lbEndereco = new JLabel("Endereço");
		lbTelefone = new JLabel("Telefone");
		lbDeficiente = new JLabel("Deficiente");
		lbDependentes = new JLabel("Dependentes");
		tfNome = new JTextField();
		tfEndereco = new JTextField();
		tfTelefone = new JTextField();
		rbDeficiente = new JRadioButton[2];
		bgDeficiente = new ButtonGroup();
		cbDependentes = new JComboBox<>(valDep);
		ckPlanoSaude = new JCheckBox("Possui Plano de Saúde"); 
		btCadastrar = new JButton("Cadastrar"); 
		
	// Passo 4 - Implementando o construtor da classe - Configurando componentes:
	// Configuração dos componentes de interface.
	setTitle("Exemplo"); // Título da janela.
	setSize(500, 300); // Tamanho da janela em pixels.
	setLocationRelativeTo(null); // Centraliza a janela na tela.
	// Ao fechar a janela, libera todos os recursos usados por ela.
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	lbTitulo.setFont(new Font("Arial", Font.BOLD, 19)); // Ajusta a fonte do JLabel.
	for(int i = 0; i < rbDeficiente.length; i++) {
		// Adiciona os valores "Não" e "Sim" aos JRadioButtons.
		rbDeficiente[i] = new JRadioButton(valDef[i]);
		rbDeficiente[i].setBackground(new Color(180, 205, 205)); // Cor de fundo dos JRadioButtons.
		bgDeficiente.add(rbDeficiente[i]); // Adiciona os JRadioButtons ao ButtonGroup.
	}
	rbDeficiente[0].setSelected(true); // Faz com que o JRadioButton "Não" fique marcado.
	ckPlanoSaude.setBackground(new Color(180, 205, 205)); // Cor de fundo do JCheckBox.
	btCadastrar.setToolTipText("Cadastra o funcionário."); // inclui uma dica no JButton.
	cp = getContentPane(); // Instancia o container da janela.
	cp.setLayout(null); // Configura o layout do container como nulo.
	cp.setBackground(new Color(180, 205, 205)); // Configura a cor de fundo do container.
	
	// Passo 4 - Implementando o construtor da classe - Posicionando componentes:
	// Posicionamento dos componentes de interface na janela.
	lbTitulo.setBounds(135, 10, 300, 25); // x, y, largura, altura.
	lbNome.setBounds(20, 40, 100, 25);
	tfNome.setBounds(100, 40, 360, 25);
	lbEndereco.setBounds(20, 70, 100, 25);
	tfEndereco.setBounds(100, 70, 360, 25);
	lbTelefone.setBounds(20, 100, 100, 25);
	tfTelefone.setBounds(100, 100, 120, 25);
	lbDeficiente.setBounds(20, 130, 100, 25);
	rbDeficiente[0].setBounds(100, 130, 50, 25);
	rbDeficiente[1].setBounds(150, 130, 50, 25);
	lbDependentes.setBounds(20, 160, 100, 25);
	cbDependentes.setBounds(100, 160, 50, 25);
	ckPlanoSaude.setBounds(16, 190, 250, 25);
	btCadastrar.setBounds(200, 220, 100, 25);
	
	// Passo 4 - Implementando o construtor da classe - Adicionando componentes:
	// Adição dos componentes de interface ao container.
	cp.add(lbTitulo);
	cp.add(lbNome);
	cp.add(tfNome);
	cp.add(lbEndereco);
	cp.add(tfEndereco);
	cp.add(lbTelefone);
	cp.add(tfTelefone);
	cp.add(lbDeficiente);
	cp.add(rbDeficiente[0]);
	cp.add(rbDeficiente[1]);
	cp.add(lbDependentes);
	cp.add(cbDependentes);
	cp.add(ckPlanoSaude);
	cp.add(btCadastrar);
	
	// Passo 4 - Implementando o construtor da classe - Declarando eventos:
	
	// Declaração do processador de evento referente à seleção do radiobutton Não.
	rbDeficiente[0].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { rbNaoAction(); }
	});
	
	// Declaração do processador de evento referente à seleção do radiobutton Sim.
	rbDeficiente[1].addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { rbSimAction(); }
	});
		
	// Declaração do processador de evento referente à alteração do comboBox Dependentes.
	cbDependentes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { cbDependentesAction(); }
	});
	
	// Declaração do processador de evento referente à alteração do checkboxck Plano de Saúde.
	ckPlanoSaude.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { ckPlanoSaudeAction(); }
	});
	
	// Declaração do processador de evento referente ao clique no botão Cadastrar.
	btCadastrar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { btCadastrarAction(); }
	});
	
	} // Final do construtor.
	
	
	// Passo 5 - Implementando os métodos chamados pelos eventos declarados:
	
	private void rbNaoAction() { // Exibe uma caixa de diálogo.
		JOptionPane.showMessageDialog(this, // 1º) JFrame responsável pela caixa de diálogo.
				                      "Opção 'Não' selecionada.", // 2º) Mensagem a ser exibida.
				                      "Informação", // 3º) Título da caixa de diálogo.
				                      JOptionPane.INFORMATION_MESSAGE); // 4º) Ícone da caixa de diálogo.
	}
	
	private void rbSimAction() { // Exibe uma caixa de diálogo.
		JOptionPane.showMessageDialog(this, "Opção 'Sim' selecionada.",
                                      "Informação", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void cbDependentesAction() { // Exibe uma caixa de diálogo.
		JOptionPane.showMessageDialog(this, "Item " + cbDependentes.getSelectedItem() + " selecionado.",
                                      "Informação", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void ckPlanoSaudeAction() { // Exibe uma caixa de diálogo.
		if (ckPlanoSaude.isSelected())
		    JOptionPane.showMessageDialog(this, "Checkbox marcado.",
                                          "Informação", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(this, "Checkbox desmarcado.",
                                          "Informação", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void btCadastrarAction() { // Exibe uma caixa de diálogo contendo os dados informados.
		String ps = "", df = "";
		if (ckPlanoSaude.isSelected()) // Verifica se o JCheckBox está marcado ou não.
			ps = "Sim";
		else
			ps = "Não";
		
		for (JRadioButton rb : rbDeficiente) // Recupera o texto do JRadioButton selecionado.
			if (rb.isSelected())
				df = rb.getText();
		
		int resposta = JOptionPane.showConfirmDialog(this, // 1º) JFrame responsável pela caixa de diálogo.
				                                     // 2º) Mensagem a ser exibida na caixa de diálogo.
				                                     "DADOS INFORMADOS: \n" +
				                                     "Nome: " + tfNome.getText() + "\n" +
				                                     "Endereco: " + tfEndereco.getText() + "\n" +
				                                     "Telefone: " + tfTelefone.getText() + "\n" +
				                                     "Deficiente: " + df + "\n" +
				                                     "Dependentes: " + cbDependentes.getSelectedItem() + "\n" +
				                                     "PlanoSaude: " + ps + "\n\n" +
				                                     "Deseja informar outro funcionário?",
				                                     "Informação", // 3º) Título da caixa de diálogo.
				                                     JOptionPane.YES_NO_OPTION, // 4º) Botões da caixa de diálogo.
				                                     JOptionPane.QUESTION_MESSAGE); // 5º) Ícone da caixa de diálogo.
		if (resposta == 0) // Se resposta for igual a 0 (Sim).
			JOptionPane.showMessageDialog(this, "Você informou Sim.", "Resposta", JOptionPane.INFORMATION_MESSAGE);
		else if (resposta == 1) // Se resposta for igual a 1 (Não).
			JOptionPane.showMessageDialog(this, "Você informou Não.", "Resposta", JOptionPane.INFORMATION_MESSAGE);
	}
	
	// Passo 6 - Incluir o método main:
	public static void main(String[] args) { //Início da aplicação.
		// O método invokeLater da classe SwingUtilities é usado para que a instanciação
		// e exibição da janela sejam feitas de forma assíncrona (em momentos diferentes).
		// Assim, a JVM pode processar os eventos da janela de forma adequada.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() { // Implementa o método run da interface Runnable.
				// "new Exemplo()" instancia a janela e "setVisible(true)" exibe a janela.
				new Exemplo().setVisible(true);
			}});
	}
	
}
	

	