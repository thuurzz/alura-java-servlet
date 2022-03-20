package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Com a atualiza��o de service para doPost o metodo passa a n�o receber mais
		// get pelo forms,
		// Deixando a informa��o mais segura por n�o aparecer na url

		// pega o nome do input do form
		String nomeEmpresa = request.getParameter("nome");
		// cria o obejto empresa
		Empresa empresa = new Empresa();
		// atribui nome para a empresa
		empresa.setNome(nomeEmpresa);

		// cria um banco fake com lista
		Banco banco = new Banco();
		// adiciona empresa a lista de empresas
		banco.adiciona(empresa);

		System.out.println("Cadastrando empresa: " + nomeEmpresa);

		// prepara request para ser despachado com atributo
		request.setAttribute("empresa", nomeEmpresa);
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresa.jsp");
		rd.forward(request, response);

	}

}
