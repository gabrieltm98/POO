public class Funcionario extends Pessoa {

	private Data admissao;
	private double salario;

	public Funcionario(String _nome, String _identidade, Data _nascimento, Data _admissao, double _salario) {
		super(_nome, _identidade, _nascimento);
		this.setAdmissao(_admissao);
		this.setSalario(_salario);
	}
	public Funcionario(String _nome, String _identidade, String _nascimentoSt, String _admissaoSt, double _salario) throws Exception {
		super(_nome, _identidade, _nascimentoSt);
		this.setAdmissao(new Data(_admissaoSt));
		this.setSalario(_salario);
	}
	public Funcionario(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento, int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento);
		this.setAdmissao(new Data(_diaAdmissao, _mesAdmissao, _anoAdmissao));
		this.setSalario(_salario);
	}
	public Data getAdmissao() {
		return this.admissao;
	}
	public void setAdmissao(Data _admissao) {
		this.admissao = _admissao;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double _salario) {
		this.salario = _salario;
	}
	public void reajusta(double taxa) {
		this.salario += this.salario * taxa;
	}
	public double calculaMaximoEmprestimo() {
		return this.getSalario();
	}
	public String toString() {
		return super.toString()
				+ "admissao=" + this.getAdmissao() 
				+ "salario=" + this.getSalario();
	}	
}
