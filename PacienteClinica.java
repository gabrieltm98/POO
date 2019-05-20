public class PacienteClinica extends Pessoa {

	private String planoSaude;

	public PacienteClinica(String _nome, String _identidade, Data _nascimento, String _planoSaude) {
		super(_nome, _identidade, _nascimento);
		this.setPlanoSaude(_planoSaude);
	}
	public PacienteClinica(String _nome, String _identidade, String _nascimentoSt, String _planoSaude) throws Exception {
		super(_nome, _identidade, _nascimentoSt);
		this.setPlanoSaude(_planoSaude);
	}
	public PacienteClinica(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento, String _planoSaude) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento);
		this.setPlanoSaude(_planoSaude);
	}
	public String getPlanoSaude() {
		return this.planoSaude;
	}
	public void setPlanoSaude(String _planoSaude) {
		this.planoSaude = _planoSaude;
	}
	public String toString() {
		return super.toString() + ", planoSaude=" + this.getPlanoSaude();
	}	
}
