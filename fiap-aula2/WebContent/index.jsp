<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fatorial</title>


</head>
<body>
<h1>Fatorial de 1 a 10</h1>


<%	
    int fat = 1;
	for(int n = 1; n <= 10; n++){
	fat *= n;
%>
<p> 
	<table width='100px' border="1"> 
		<tr> 
			<td><%=n%></td>
			<td><%=fat%></td>
		</tr>
	</table>	
</p>
<%
}
%>
</body>
</html>	