package br.com.alura.gerenciador.servlet;

public class Empresa {
	
	private Integer id;
	private String nome;
	
	public Empresa() {
		super();
	}
	public Empresa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
