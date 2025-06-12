package model;

public class Aula extends Conteudo{
		
	public Aula(String desc,String titulo, int id, int duracao) {
		super(desc, titulo, duracao, id);
		
	}
	
	@Override
	public void exibir_dados() {
		System.out.println("Aula - Título: "+get_titulo()+ ", Descrição: "+get_desc()+ ", Duração: "+get_duracao()+ ", ID: "+get_id());
	}
}
