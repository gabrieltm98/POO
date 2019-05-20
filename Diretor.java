public class Diretor extends Chefe {

	private Data promocao;

	public Diretor(String _nome, String _identidade, Data _nascimento, Data _admissao, double _salario, String _departamento, Data _promocao) {
		super(_nome, _identidade, _nascimento, _admissao, _salario, _departamento);
		this.setPromocao(_promocao);
	}
	public Diretor(String _nome, String _identidade, String _nascimento, String _admissaoSt, double _salario, String _departamento, String _promocaoSt) throws Exception {
		super(_nome, _identidade, _nascimento, _admissaoSt, _salario, _departamento);
		this.setPromocao(new Data(_promocaoSt));
	}
	public Diretor(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento, int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario, String _departamento, int _diaPromocao, int _mesPromocao, int _anoPromocao) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _diaAdmissao, _mesAdmissao, _anoAdmissao, _salario, _departamento);
		this.promocao = new Data(_diaPromocao, _mesPromocao, _anoPromocao);
	}
	public Data getPromocao() {
		return this.promocao;
	}
	public void setPromocao(Data _promocao) {
		this.promocao = _promocao;
	}
	public double calculaMaximoEmprestimo() {
		return super.calculaMaximoEmprestimo()*1.5;
	}
	public String toString() {
		return super.toString() + "promocao="
				+ this.getPromocao();
	}
}
