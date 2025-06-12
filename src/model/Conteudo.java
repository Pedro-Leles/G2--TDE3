package model;

public abstract class Conteudo implements Exibivel{
	private String desc;
	private String titulo;
	private int duracao;
	private int id;
	
	
	public Conteudo(String desc, String titulo, int duracao, int id) {
		this.desc = desc;
		this.duracao = duracao;
		this.id = id;
		this.titulo = titulo;
	}
	
	
	public String get_desc() {return desc;}
	public void set_desc(String desc) {this.desc = desc;}
	public String get_titulo() {return titulo;}
	public void set_titulo(String titulo) {this.titulo = titulo;}
	public int get_duracao() {return duracao;}
	public void set_duracao(int duracao) {this.duracao = duracao;}
	public int get_id() {return id;}
	public void set_id(int id) {this.id = id;}
}
