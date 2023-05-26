package models;

public class Data {

	private int mes;
	private int ano;
	private String data = String.format("%d", mes) + "/"
			+ String.format("%d", ano);
	
	
	
	
	

	public Data(int mes, int ano) {
		super();

		this.mes = mes;
		this.ano = ano;
		data =String.format("%d", mes) + "/"
			   + String.format("%d", ano);
	}
	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getData() {
		return data;
	}

	
	
	
}
