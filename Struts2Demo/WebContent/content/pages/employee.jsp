<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello world from Struct 2</h2>
	 <s:form action="validate">
	 	<table>
	 		<tr>
	 			<td><label for="name">Please enter your name </label></td>
	 			<td><s:textfield name="name" label="Name" size="20"/></td>
	 		</tr>
	 		<tr>
	 			<td><label for="age">Please enter your age </label></td>
	 			<td><s:textfield name="age" label="Age" size="20"/></td>
	 		</tr>
	 		<tr>
	 			<td colspan="2" style="text-align: center;"><input type="submit" value="Submit"></td>
	 		</tr>
	 	</table>
	 </s:form>
</body>
</html>
</html>