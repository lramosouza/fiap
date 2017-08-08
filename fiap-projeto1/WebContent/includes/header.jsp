<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="usuario" class="br.com.fiap.bean.UsuarioSessaoBean" scope="session">
	<jsp:setProperty name="usuario" property="ultimoAcesso" param="ultimoAcesso"/>
	<jsp:setProperty name="usuario" property="primeiroAcesso" param="primeiroAcesso"/>
	<jsp:setProperty name="usuario" property="login" param="login"/>
</jsp:useBean>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
Seu último acesso foi às <jsp:getProperty property="ultimoAcesso" name="usuario"/>, seu primeiro acesso foi às:<jsp:getProperty property="primeiroAcesso" name="usuario"/> 
</body>
</html>