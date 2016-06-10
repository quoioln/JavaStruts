<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload File</title>
</head>
<body>
	<form action="upload" enctype="mutipart/form-data">
		<table>
			<tr>
				<th colspan="2"><h2>Upload file</h2></th>
			</tr>
			<tr>
				<td><label for="myFile">Upload your file: </label></td>
				<td><input type="file" name="myFile"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;"><input type="submit" value="Upload"></td>
			</tr>
		</table>
	</form>
</body>
</html>