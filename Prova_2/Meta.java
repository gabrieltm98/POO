package Package1;

public class Meta extends ItemAgenda {

	private int prioridade;

	public int getPrioridade() {
		return this.prioridade;
	}
	public Meta setPrioridade(String _titulo, String descricao, Periodo _periodo, int _prioridade) {
		this.setPrioridade(_prioridade);
		super(_titulo, _descricao);
	}
	public void setprioridade(int _prioridade) throws Exception{
		this.prioridade = _prioridade;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getPrioridade());
		dados.append("/");
		super.toString();
		return dados.toString();
	}
}
	
