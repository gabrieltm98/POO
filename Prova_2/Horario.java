package Package1;

public class Horario {

	private int horas;
	private int minutos;
	
	public int getHoras() {
		return this.horas;
	}
	public int getMinutos() {
		return this.minutos;
	}
	public Horario(int _horas, int _minutos) throws Exception {
		this.setHorario (_horas, _minutos);
	}
	public Horario() throws Exception{
		this.setHorario (0,0);
	}
	public static boolean isHorarioValido(int _horas, int _minutos) {
		if(_horas<0 || _horas>23) {
			return false;
		}
		else {
			if(_minutos<0 || _minutos>59) {
				return false;
			}
			else {
				return true;
			}
		}
	}
	public void setHorario(int _horas, int _minutos) throws Exception{
		if(isHorarioValido(_horas, _minutos)) {
			this.horas= _horas;
			this.minutos= _minutos;
		}
		else {
			throw new Exception("Horario invalido.");
		}
	}
	public boolean equals(Object objeto) {
		Horario aux = (Horario)objeto;
		if(this.getHoras() == (aux.getHoras()) && this.getMinutos() == (aux.getMinutos())) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getHoras());
		dados.append("/");
		dados.append(this.getMinutos());
		dados.append("/");
		return dados.toString();
	}
}
	
	
