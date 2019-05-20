public class Pessoa {

	private String nome;
	private String identidade;
	private Data nascimento;

	public Pessoa(String _nome, String _identidade, Data _nascimento) {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setNascimento(_nascimento);
	}
	public Pessoa(String _nome, String _identidade, String _nascimento) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setNascimento(new Data(_nascimento));
	}
	public Pessoa(String _nome, String _identidade, int _dia, int _mes, int _ano) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setNascimento(new Data(_dia, _mes, _ano));
	}
	public String getNome() {
		return this.nome;
	}
	public String getIdentidade() {
		return identidade;
	}
	public Data getNascimento() {
		return nascimento;
	}
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public void setIdentidade(String _identidade) {
		this.identidade = _identidade;
	}
	public void setNascimento(Data _nascimento) {
		this.nascimento = _nascimento;
	}
	public double calculaMaxEmprestimo() {
		return 1000;
	}
	public String toString() {
		return "nome=" + this.getNome() 
		+ "identidade=" + this.getIdentidade()  
		+ "nascimento=" + this.getNascimento();
	}
}

