package exercicios1A3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Exercicio2_ComBotaoParaDispararOperacao extends JFrame {
	private JLabel lbTemperatura, lbOperacoes;
	private JTextField tfTemperatura;
	// Valores dos JRadioButtons.
	private static final String valOPer[] = { "Celsius para Fahrenheit", "Fahrenheit para Celsius",
			"Celsius para Kelvin", "Kelvin para Celsius", "Fahrenheit para Kelvin", "Kelvin para Fahrenheit" };

	private JRadioButton rbTempo[];
	private ButtonGroup bgTempo; // Grupo de botões para agrupar os JRadioButtons.
	private JButton btConverter;
	private Container cp; // Container para organizar os componentes na janela.

	public Exercicio2_ComBotaoParaDispararOperacao() { // Construtor.
		lbTemperatura = new JLabel("Temperatura");
		lbOperacoes = new JLabel("Operações");
		tfTemperatura = new JTextField();
		rbTempo = new JRadioButton[6];
		bgTempo = new ButtonGroup();
		btConverter = new JButton("Converter");

		setTitle("Exercício 2"); // Título da janela.
		setSize(280, 370); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		// Ao fechar a janela, libera todos os recursos usados por ela.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < rbTempo.length; i++) {
			// Adiciona os valores aos JRadioButtons.
			rbTempo[i] = new JRadioButton(valOPer[i]);
			rbTempo[i].setBackground(new Color(50, 205, 205)); // Cor de fundo dos JRadioButtons.
			bgTempo.add(rbTempo[i]); // Adiciona os JRadioButtons ao ButtonGroup.
		}
		rbTempo[0].setSelected(true); // Faz com que o JRadioButton "Celsius para Fahrenheit" fique marcado.

		cp = getContentPane(); // Instancia o container da janela.
		cp.setLayout(null); // Configura o layout do container como nulo.
		cp.setBackground(new Color(50, 205, 205)); // Configura a cor de fundo do container.

		// Posicionamento dos componentes de interface na janela.
		lbTemperatura.setBounds(35, 20, 100, 25); // x, y, largura, altura.
		tfTemperatura.setBounds(120, 20, 110, 25);
		lbOperacoes.setBounds(55, 55, 100, 25);
		rbTempo[0].setBounds(55, 85, 200, 25);
		rbTempo[1].setBounds(55, 115, 200, 25);
		rbTempo[2].setBounds(55, 145, 200, 25);
		rbTempo[3].setBounds(55, 175, 200, 25);
		rbTempo[4].setBounds(55, 205, 200, 25);
		rbTempo[5].setBounds(55, 235, 200, 25);
		btConverter.setBounds(80, 280, 100, 25);

		// Adição dos componentes de interface ao container.
		cp.add(lbTemperatura);
		cp.add(tfTemperatura);
		cp.add(lbOperacoes);
		cp.add(rbTempo[0]);
		cp.add(rbTempo[1]);
		cp.add(rbTempo[2]);
		cp.add(rbTempo[3]);
		cp.add(rbTempo[4]);
		cp.add(rbTempo[5]);
		cp.add(btConverter);

		// Declaração do processador de evento referente ao clique no botão Calcular.
		btConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btConverterAction();
			}
		});
	} // Final do construtor.

	private void btConverterAction() { // Exibe uma caixa de diálogo contendo o resultado.
		double resultado = 0;

		if (rbTempo[0].isSelected())
			resultado = Double.parseDouble(tfTemperatura.getText()) * 1.8 + 32;
		else if (rbTempo[1].isSelected())
			resultado = (Double.parseDouble(tfTemperatura.getText()) - 32) / 1.8;
		else if (rbTempo[2].isSelected())
			resultado = Double.parseDouble(tfTemperatura.getText()) + 273.15;
		else if (rbTempo[3].isSelected())
			resultado = Double.parseDouble(tfTemperatura.getText()) - 273.15;
		else if (rbTempo[4].isSelected())
			resultado = (Double.parseDouble(tfTemperatura.getText()) + 459.67) / 1.8;
		else if (rbTempo[5].isSelected())
			resultado = Double.parseDouble(tfTemperatura.getText()) * 1.8 - 459.67;

		JOptionPane.showConfirmDialog(this, "O resultado é: " + resultado, "Informação", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) { // Início da aplicação.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Exercicio2_ComBotaoParaDispararOperacao().setVisible(true);
			}
		});
	}

}
