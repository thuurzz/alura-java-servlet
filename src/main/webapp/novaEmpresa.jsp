<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>

<%
String nomeEmpresa = (String) request.getAttribute("empresa");
System.out.println(nomeEmpresa);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nova Empresa Criada</title>
</head>
<body>

	Empresa
	<%=nomeEmpresa%>
	cadastrada com sucesso!

</body>
</html>