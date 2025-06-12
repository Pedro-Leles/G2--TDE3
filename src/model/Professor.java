package model;

public class Professor {
	private String nome;
	private int cpf;
	private int idade;
	
	public Professor(String nome, int cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String get_nome() {return nome;}
	public void set_nome(String nome) {this.nome = nome;}
	public int get_cpf() {return cpf;}
	public void set_cpf(int cpf) {this.cpf = cpf;}
	public int get_idade() {return idade;}
	public void set_idade(int idade) {this.idade = idade;}
}
