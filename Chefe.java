public class Chefe extends Funcionario {

	private String departamento;

	public Chefe(String _nome, String _identidade, Data _nascimento, Data _admissao, double _salario, String _departamento) {
		super(_nome, _identidade, _nascimento, _admissao, _salario);
		this.setDepartamento(_departamento);
	}
	public Chefe(String _nome, String _identidade, String _nascimentoSt, String _admissaoSt, double _salario, String _departamento) throws Exception {
		super(_nome, _identidade, _nascimentoSt, _admissaoSt, _salario);
		this.setDepartamento(_departamento);
	}
	public Chefe(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento, int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario, String _departamento) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _diaAdmissao, _mesAdmissao, _anoAdmissao, _salario);
		this.setDepartamento(_departamento);
	}
	public String getDepartamento() {
		return this.departamento;
	}
	public void setDepartamento(String _departamento) {
		setDepartamento(_departamento);
	}
	public double calculaMaximoEmprestimo() {
		return super.calculaMaximoEmprestimo()*2;
	}
	public String toString() {
		return super.toString()	+ "departamento=" 
				+ this.getDepartamento();
	}
}
