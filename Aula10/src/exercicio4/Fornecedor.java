package exercicio4;

/* OBSERVA��O: Estas linhas que est�o como coment�rios � um exemplo de inser��o 
 *             de texto dentro da janela Fornecedor se retirar os // e os /* 
 *             ver� o texto inserido na janela  */

//import java.awt.Container;
//import java.awt.Font; 

import javax.swing.JDialog;
//import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Fornecedor extends JDialog {
	//private JLabel lbTitulo;
	//private Container cp;

	public Fornecedor() {
		//lbTitulo = new JLabel("Fornecedores");

		setTitle("Fornecedores"); // T�tulo da janela.
		setSize(300, 100); // Tamanho da janela em pixels.
		setLocationRelativeTo(null); // Centraliza a janela na tela.
		setModal(true);

	/*	cp = getContentPane(); // Instancia o container da janela.
		cp.setLayout(null); // Configura o layout do container como nulo.
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 19));
		lbTitulo.setBounds(20, 20, 300, 25); // x, y, largura, altura.

		cp.add(lbTitulo);   */
	}
}
