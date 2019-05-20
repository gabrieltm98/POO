public class ContaBancaria {

	private String nome;
	private float saldo;
	private float taxaJuros;

	public ContaBancaria(String _nome, float _saldo, float _taxaJuros) throws Exception {
		this.setNome(_nome);
		this.setSaldo(_saldo);
		this.setTaxaJuros(_taxaJuros);
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float _saldo) throws Exception {
		if(_saldo < 0){
			throw new Exception ("Invalido");
		}
		else {
			this.saldo = _saldo;
		}
	}
	public float getTaxaJuros() {
		return this.taxaJuros;
	}
	public void setTaxaJuros(float _taxaJuros) {
		this.taxaJuros = _taxaJuros;
	}
	public boolean equals(Object objeto) {
		ContaBancaria aux = (ContaBancaria)objeto;
		if(this.getNome() == (aux.getNome()) && this.getSaldo() == (aux.getSaldo())) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "ContaBancaria [nome=" + nome + ", saldo=" + saldo + ", taxaJuros=" + taxaJuros + ", getNome()="
				+ this.getNome() + ", getSaldo()=" + this.getSaldo() + ", getTaxaJuros()=" + this.getTaxaJuros() + "]";
	}
}

