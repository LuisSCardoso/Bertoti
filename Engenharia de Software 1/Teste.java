package models;

public class Teste {

	public static void main(String[] args){
		
		Data teste = new Data(8,2022);
		Aluno luis = new Aluno(112122,"Luís Antônio","M", "00011122233", teste);
		
		System.out.println(luis.toString());
	}
	
}
