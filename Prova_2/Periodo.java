package Package1;

public class Periodo extends Data implements Horario {

	private Data dataInicio;
	private Horario horarioInicio;
	private Data dataFim;
	private Horario horarioFim;

	public Data getDataInicio() {
		return this.dataInicio;
	}
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}
	public Data getDataFim() {
		return this.dataFim;
	}
	public Horario getHorarioFim() {
		return this.horarioFim;
	}
	public Periodo(Data _dataInicio, Horario _horarioInicio, Data _dataFim, Horario _horarioFim) throws Exception {
		this.setPeriodo(_dataInicio, _horarioInicio, _dataFim, _horarioFim);
	}
	public void setPeriodo(Data _dataInicio, Horario _horarioInicio, Data _dataFim, Horario _horarioFim) {	
		this.dataInicio= _dataInicio;
		this.horarioInicio= _horarioInicio;
		this.dataFim= _dataFim;
		this.horarioFim= _horarioFim;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.dataInicio());
		dados.append("/");
		dados.append(this.HorarioInicio());
		dados.append("/");
		dados.append(this.dataFim());
		dados.append("/");
		dados.append(this.HorarioFim());
		dados.append("/");
		super.toString();
		return dados.toString();
	}
}
