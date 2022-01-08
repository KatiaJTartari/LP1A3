package exercicios1A3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Exercicio3 extends JFrame {
	private JLabel lbValorProduto, lbEstado, lbTipoPostagem, lbResultadoValorProduto, lbResultadoValorFrete,
			lbResultadoValorTotal;
	private JTextField tfValorProduto;
	private JCheckBox ckClienteFidelidade;
	private JComboBox<String> cbEstado;
	private static final String valEstado[] = {"SP", "RJ", "MG", "ES"};
	private JRadioButton rbSedex[];
	private static final String valSedex[] = {"Sedex", "Sedex 10"};
	private ButtonGroup bgSedex; // Grupo de botões para agrupar os JRadioButtons.
	private JButton btCalcular;
	private Container cp; // Container para organizar os componentes na janela.
	private DecimalFormat df = new DecimalFormat("###,##0.00");

	public Exercicio3() { // Construtor.
		lbValorProduto = new JLabel("Valor do Produto R$");
		lbEstado = new JLabel("Estado");
		lbTipoPostagem = new JLabel("Tipo de Postagem");
		tfValorProduto = new JTextField();
		ckClienteFidelidade = new JCheckBox("Cliente com Fidelidade");
		cbEstado = new JComboBox<>(valEstado);
		rbSedex = new JRadioButton[2];
		bgSedex = new ButtonGroup();
		btCalcular = new JButton("Calcular");
		lbResultadoValorProduto = new JLabel();
		lbResultadoValorFrete = new JLabel();
		lbResultadoValorTotal = new JLabel();

		setTitle("Exercício 3"); // Título da janela.
		setSize(500, 335); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		// Ao fechar a janela, libera todos os recursos usados por ela.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < rbSedex.length; i++) {
			// Adiciona os valores aos JRadioButtons.
			rbSedex[i] = new JRadioButton(valSedex[i]);
			bgSedex.add(rbSedex[i]); // Adiciona os JRadioButtons ao ButtonGroup.
		}
		rbSedex[0].setSelected(true); // Faz com que o JRadioButton "Sedex" fique marcado.
		lbResultadoValorProduto.setForeground(new Color(123, 104, 238));
		lbResultadoValorFrete.setForeground(new Color(123, 104, 238));
		lbResultadoValorTotal.setForeground(new Color(123, 104, 238));

		cp = getContentPane(); // Instancia o container da janela.
		cp.setLayout(null); // Configura o layout do container como nulo.

		// Posicionamento dos componentes de interface na janela.
		lbValorProduto.setBounds(30, 25, 140, 25); // x, y, largura, altura.
		tfValorProduto.setBounds(150, 25, 100, 25);
		ckClienteFidelidade.setBounds(30, 65, 200, 25);
		lbEstado.setBounds(30, 105, 100, 25);
		cbEstado.setBounds(80, 105, 70, 25);
		lbTipoPostagem.setBounds(50, 145, 120, 25);
		rbSedex[0].setBounds(50, 170, 80, 25);
		rbSedex[1].setBounds(50, 195, 80, 25);
		btCalcular.setBounds(90, 250, 100, 25);
		lbResultadoValorProduto.setBounds(280, 20, 300, 25);
		lbResultadoValorFrete.setBounds(280, 50, 300, 25);
		lbResultadoValorTotal.setBounds(280, 80, 300, 25);

		// Adição dos componentes de interface ao container.
		cp.add(lbValorProduto);
		cp.add(tfValorProduto);
		cp.add(ckClienteFidelidade);
		cp.add(lbEstado);
		cp.add(cbEstado);
		cp.add(lbTipoPostagem);
		cp.add(rbSedex[0]);
		cp.add(rbSedex[1]);
		cp.add(btCalcular);
		cp.add(lbResultadoValorProduto);
		cp.add(lbResultadoValorFrete);
		cp.add(lbResultadoValorTotal);

		// Declaração do processador de evento referente ao clique no botão Calcular.
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btCalcularAction();
			}
		});
	} // Final do construtor.
	
	private void btCalcularAction() {
		double valorProduto = Double.parseDouble(tfValorProduto.getText());
		double frete = 0;
		
		if (ckClienteFidelidade.isSelected())
			valorProduto = valorProduto - (valorProduto * 0.1);
		
		switch (cbEstado.getSelectedItem().toString()) {
		case "SP":
			frete = valorProduto * 0.1;
			break;
		case "RJ":
		case "MG":
			frete = valorProduto * 0.15;
			break;
		case "ES":
			frete = valorProduto * 0.2;
			break;
		}
		
		if (rbSedex[1].isSelected())
			frete = frete + (frete * 0.2);
		
		lbResultadoValorProduto.setText("Valor do Produto: R$ " + df.format(valorProduto));
		lbResultadoValorFrete.setText("Valor do Frete: R$ " + df.format(frete));
		lbResultadoValorTotal.setText("Valor Total: R$ " + df.format(frete + valorProduto));
	}

	public static void main(String[] args) { // Início da aplicação.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Exercicio3().setVisible(true);
			}
		});
	}

}
