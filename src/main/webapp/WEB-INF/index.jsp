<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="index" method="post">
		first number : <input type="text" name="firstNumber"> <br />
		second number : <input type="text" name="secondNumber"> <br />
		<input type="submit"  value="valider"> 
	</form>

	<h2>${firstNumber}</h2>
	<h2>${secondNumber}</h2>
	<h1>${result}</h1>
	 
</body>
</html>