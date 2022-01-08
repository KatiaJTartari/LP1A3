package exemploAplicacaoGUIcomMenuPag27A30;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Curso extends JDialog{
	private JLabel lbDescricao, lbDepartamento;
	private JTextField tfDescricao, tfDepartamento;
	private JButton btCadastrar;
	
	public Curso() {
		setModal(true);
	}
		
}
