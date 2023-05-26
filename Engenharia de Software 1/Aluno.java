package models;

public class Aluno {

	private int ra;
	private String nome;
	private String sexo;
	private String cpf;
	private String anodematricula;
	
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getanodematricula() {
		return anodematricula;
	}
	public void setanodematricula(Data anodematricula) {
		this.anodematricula = anodematricula.getData();
	}
	
	public Aluno(int ra, String nome, String sexo, String cpf, Data anodematricula) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.anodematricula = anodematricula.getData();
	}
	@Override
	public String toString() {
		return "Aluno [ra=" + ra 
				+ ", nome=" + nome 
				+ ", sexo=" + sexo 
				+ ", cpf=" + cpf 
				+ ", anodematricula=" + anodematricula
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



