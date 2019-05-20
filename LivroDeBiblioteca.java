public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

	private boolean statusEmprestimo;
	private String localizacao;
	private String descricao;

	public LivroDeBiblioteca (String _titulo, String _autor, int _numeroPaginas, int _anoEdicao, boolean _statusEmprestimo, String _localizacao, String _descricao) {
		super(_titulo, _autor, _numeroPaginas, _anoEdicao);
		this.setStatusEmprestimo(_statusEmprestimo);
		this.setLocalizacao(_localizacao);
		this.setDescricao(_descricao);
	}
	public boolean getStatusEmprestimo() {
		return this.statusEmprestimo;
	}
	public void setStatusEmprestimo(boolean _statusEmprestimo) {
		this.statusEmprestimo = _statusEmprestimo;
	}
	public String getLocalizacao() {
		return this.localizacao;
	}
	public void setLocalizacao(String _localizacao) {
		this.localizacao = _localizacao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	public String toString() {
		return "LivroDeBiblioteca [statusEmprestimo=" + this.getStatusEmprestimo () + ", localizacao=" + this.getLocalizacao ()
		+ ", descricao=" + this.getDescricao() + ", toString()=" + super.toString() + "]";
	}
	public boolean isEmprestado (){
		return this.getStatusEmprestimo();		
	}
	public void empresta () {
		this.setStatusEmprestimo(true);		
	}
	public void devolve () {
		this.setStatusEmprestimo(false);
	}
	public String localiza () {
		return(this.getLocalizacao());	
	}
	public String apresentaDescricao () {
		return(this.getDescricao());
	}
}
