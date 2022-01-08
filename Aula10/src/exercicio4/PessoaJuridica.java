package exercicio4;

/* OBSERVAÇÂO: Estas linhas que estão como comentários é um exemplo de inserção 
 *             de texto dentro da janela Clientes - Pessoa Jurídica se retirar os
 *             // e os /* verá o texto inserido na janela  */

//import java.awt.Container;
//import java.awt.Font;

import javax.swing.JDialog;
//import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PessoaJuridica extends JDialog {
	//private JLabel lbTitulo;
	//private Container cp;

	public PessoaJuridica() {
		//lbTitulo = new JLabel("Clientes - Pessoa Jurídica");

		setTitle("Clientes - Pessoa Jurídica"); // Título da janela.
		setSize(300, 100); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		setModal(true);

	/*  cp = getContentPane(); // Instancia o container da janela.
		cp.setLayout(null); // Configura o layout do container como nulo.
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
		lbTitulo.setBounds(20, 20, 300, 25); // x, y, largura, altura.

		cp.add(lbTitulo);  */
	}
}
