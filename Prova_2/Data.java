package Package1;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int _dia, int _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}
	public Data(int _dia, String _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}
	public Data(String _mes) throws Exception {
		this.setData(_mes);
	}
	public Data() throws Exception {
		this(1,1,1900);
	}
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}
	public void setData(int _dia, int _mes, int _ano) throws Exception {
		if(Data.isDataValida(_dia,_mes,_ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		}
		else {
			throw new Exception("Data invalida.");
		}
	}
	public void setData(int _dia, String _mesSt, int _ano) throws Exception {
		int mesInt = 0;

		if(_mesSt.equals("janeiro")) _mesSt = "1";
		else {
			if(_mesSt.equals("fevereiro")) _mesSt = "2" ;
			else {
				if(_mesSt.equals("março")) _mesSt = "3";
				else {
					if(_mesSt.equals("abril")) _mesSt = "4";
					else {
						if(_mesSt.equals("maio")) _mesSt = "5";
						else {
							if(_mesSt.equals("junho")) _mesSt = "6";
							else {
								if(_mesSt.equals("julho")) _mesSt = "7";
								else {
									if(_mesSt.equals("agosto")) _mesSt = "8";
									else {
										if(_mesSt.equals("setembro")) _mesSt = "9";
										else {
											if(_mesSt.equals("outubro")) _mesSt = "10";
											else {
												if(_mesSt.equals("novembro")) _mesSt = "11";
												else {
													if(_mesSt.equals("dezembro")) _mesSt = "12";
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		mesInt = Integer.parseInt(_mesSt);
		this.setData(_dia, mesInt, _ano);
	}

	public void setData(int _mes, int _ano) throws Exception {
		this.setData(1, _mes, _ano);
	}
	public void setData(String dtStr) throws Exception {
		int _dia;
		int _mes;
		int _ano;
		int cont = dtStr.indexOf("/");

		// Formato: "dd	"
		if(cont == 2) {
			_dia = Integer.parseInt(dtStr.substring(0,2));
			cont = dtStr.indexOf("/",3);	

			// Formato: "dd/m/aaaa"
			if(cont == 4) {
				_mes = Integer.parseInt(dtStr.substring(3,4));
				_ano = Integer.parseInt(dtStr.substring(5,9));
			}
			else {		
				// Formato: "dd/mm/aaaa"
				_mes = Integer.parseInt(dtStr.substring(3,5));
				_ano = Integer.parseInt(dtStr.substring(6,10));
			}
		}

		// Formato: "d"
		else {
			_dia = Integer.parseInt(dtStr.substring(0,1));
			cont = dtStr.indexOf("/",2);

			// Formato: "d/m/aaaa"
			if(cont == 3) {
				_mes = Integer.parseInt(dtStr.substring(2,3));
				_ano = Integer.parseInt(dtStr.substring(4,8));
			}
			else {		
				// Formato: "d/mm/aaaa"
				_mes = Integer.parseInt(dtStr.substring(2,4));
				_ano = Integer.parseInt(dtStr.substring(5,9));
			}
		}	
		this.setData(_dia,_mes,_ano);
	}

	public boolean equals(Object objeto) {
		Data aux = (Data)objeto;
		if(this.getDia() == (aux.getDia()) && this.getMes() == (aux.getMes()) && this.getAno() == (aux.getAno())) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isDataValida(int _dia, int _mes, int _ano) {
		if(_dia<1 || _dia>31) {
			return false;
		}
		if(_mes<1 || _mes>12) {
			return false;
		}
		if(_ano<1582) {
			return false;
		}
		if((_mes==4 || _mes==6 || _mes==9 || _mes==11) && (_dia>30)) {
			return false;
		}
		if(_mes==2 && _dia>=29) {
			if(_dia>29) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return true;
		}
	}
	public static boolean isBissexto(int _ano) {
		if(_ano%4==0) {
			if(_ano%100!=0) {
				return true;
			}
			else {
				if(_ano%400==0) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}
	public boolean isBissexto() {
		if(this.getAno()%4==0) {
			if(this.getAno()%100!=0) {
				return true;
			}
			else {
				if(this.getAno()%400==0) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}
	public static Data verificaECriaData(int _dia, int _mes, int _ano) throws Exception {
		Data data;
		try{
			data = new Data(_dia, _mes, _ano);
		}
		catch(Exception e){
			return null;
		}
		return data;
	}
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}	
}