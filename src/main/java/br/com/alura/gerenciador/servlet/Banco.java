package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> ListaDeEmpresas = new ArrayList<Empresa>();

	public void adiciona(Empresa empresa) {
		ListaDeEmpresas.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.ListaDeEmpresas;
	}
	
}
