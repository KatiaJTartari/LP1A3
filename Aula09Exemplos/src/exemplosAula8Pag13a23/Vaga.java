package exemplosAula8Pag13a23;

import java.util.ArrayList;
import java.util.List;

public class Vaga {
	private String descricao;
	private List<Curriculo> curriculos;

	public Vaga(String descricao) {
		this.descricao = descricao;
		this.curriculos = new ArrayList<Curriculo>();
	}
	
	public void recebe(Curriculo curriculo) { curriculos.add(curriculo); }
	
	public String getDescricao() { return descricao; }
	
	public List<Curriculo> getCurriculos() { return curriculos; }
}
