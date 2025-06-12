package model;
import java.util.ArrayList;
import java.util.List;

public class Curso  extends Conteudo{
	private Professor prof;
	private ArrayList<Aula> aulas = new ArrayList<>();
	
	public Curso (String desc, String titulo, int duracao, int id) {
		super(desc, titulo, duracao, id);
		this.prof = prof;
		this.aulas = new ArrayList<>();
	}
	
	public void adicionar_aula(Aula aula) {
		aulas.add(aula);
	}
	
	public Professor get_professor() {
		return prof;
	}
	
	public ArrayList<Aula> get_aulas(){
		return aulas;
	}
	
	@Override
	public void exibir_dados() {
		 System.out.println("Curso: " + get_titulo());
		 System.out.println("Instrutor: " + prof.get_nome());
		 System.out.println("Aulas:");
	        for (Aula aula : aulas) {
	            System.out.println(" - " + aula.get_titulo());}
	}
}
