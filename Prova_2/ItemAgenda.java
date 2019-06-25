package Package1;

public abstract class ItemAgenda extends Periodo {

	private String titulo;
	private String descricao;
	private Periodo periodo;
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public Periodo getPeriodo() {
		return this.periodo;
	}
	public ItemAgenda(String titulo, String _descricao, Periodo _periodo) {
		super(_periodo);
		this.setItemAgenda(_titulo, _descricao);
	}
	public void setItemAgenda(String _titulo, String _descricao) throws Exception {
		this.titulo= _titulo;
		this.descricao= _descricao;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.titulo());
		dados.append("/");
		dados.append(this.descricao());
		dados.append("/");
		super.toString();
		return dados.toString();
	}
}
