<%@ page language="java" contentType="text/html;
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<sx:head />
</head>
	<s:form action="/cadastrar" namespace="/pessoa" method="post"
		enctype="multipart/form-data">
		<s:textfield name="pessoa.nome" label="Nome" />
		<sx:datetimepicker name="pessoa.dataNasc" label="Format (dd-MM-yyyy)" displayFormat="dd-MMM-yyyy" value="%{'2010-01-01'}"/>
		<s:textfield name="pessoa.RG" label="RG" />
		<s:textfield name="pessoa.email" label="Email" />
		<s:submit />
	</s:form>
	<table>
<s:iterator value="listaPessoas">
  <tr>
    <td> <s:property value="pessoa" /></td>
  </tr>
</s:iterator>
</table>
</body>
</html>