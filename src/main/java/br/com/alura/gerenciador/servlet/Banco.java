package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> ListaDeEmpresas = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Porto Seguro");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		
		ListaDeEmpresas.add(empresa);
		ListaDeEmpresas.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		ListaDeEmpresas.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.ListaDeEmpresas;
	}
	
}
