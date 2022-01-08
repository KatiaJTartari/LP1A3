package exercicios1A3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


@SuppressWarnings("serial")
public class Exercicio1 extends JFrame {

	private JLabel lbValor1, lbValor2, lbOperacao;
	private JTextField tfValor1, tfValor2;
	private JComboBox<String> cbOperacao;
	private static final String valOper[] = { "+", "-", "*", "/", "%" }; // Valores do JComboBox.
	private JButton btCalcular;
	private Container cp; // Container para organizar os componentes na janela.

	public Exercicio1() { // Construtor.
		lbValor1 = new JLabel("Valor 1");
		lbValor2 = new JLabel("Valor 2");
		lbOperacao = new JLabel("Operação");
		tfValor1 = new JTextField();
		tfValor2 = new JTextField();
		cbOperacao = new JComboBox<>(valOper);
		btCalcular = new JButton("Calcular");

		setTitle("Exercício 1"); // Título da janela.
		setSize(400, 200); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		// Ao fechar a janela, libera todos os recursos usados por ela.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cp = getContentPane(); // Instancia o container da janela.
		cp.setLayout(null); // Configura o layout do container como nulo.

		lbValor1.setBounds(30, 20, 100, 25); // x, y, largura, altura.
		tfValor1.setBounds(100, 20, 100, 25);
		lbValor2.setBounds(30, 65, 100, 25);
		tfValor2.setBounds(100, 65, 100, 25);
		lbOperacao.setBounds(30, 110, 100, 25);
		cbOperacao.setBounds(100, 110, 75, 25);
		btCalcular.setBounds(240, 110, 100, 25);

		cp.add(lbValor1);
		cp.add(tfValor1);
		cp.add(lbValor2);
		cp.add(tfValor2);
		cp.add(lbOperacao);
		cp.add(cbOperacao);
		cp.add(btCalcular);

		// Declaração do processador de evento referente ao clique no botão Calcular.
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btCalcularAction();
			}
		});
	} // Final do construtor.

	private void btCalcularAction() { // Exibe uma caixa de diálogo contendo o resultado.
		double resultado = 0;

		switch (cbOperacao.getSelectedItem().toString()) {
		case "+":
			resultado = Double.parseDouble(tfValor1.getText()) + Double.parseDouble(tfValor2.getText());
			break;
		case "-":
			resultado = Double.parseDouble(tfValor1.getText()) - Double.parseDouble(tfValor2.getText());
			break;
		case "*":
			resultado = Double.parseDouble(tfValor1.getText()) * Double.parseDouble(tfValor2.getText());
			break;
		case "/":
			resultado = Double.parseDouble(tfValor1.getText()) / Double.parseDouble(tfValor2.getText());
			break;
		case "%":
			resultado = Double.parseDouble(tfValor1.getText()) % Double.parseDouble(tfValor2.getText());
			break;
		}
		JOptionPane.showConfirmDialog(this, "O resultado é: " + resultado, "Informação", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) { // Início da aplicação.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Exercicio1().setVisible(true);
			}
		});
	}

}
