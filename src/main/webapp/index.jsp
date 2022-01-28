	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="row">
		<div class="col-12">
			<h1>Calculadora</h1>
			<form action="calculadora" method="post">
				Valor 1: <input type="number" name="val1"></input><p><br>
				Valor 2: <input type="number" name="val2"></input><p>
				<button type="reset" name="limpar"class="btn btn-secondary">Limpar</button>
				<button type="submit" name="somar" class="btn btn-secondary">+</button>
				<button type="submit" name="subtrair" class="btn btn-secondary">-</button>
				<button type="submit" name="multiplicar" class="btn btn-secondary">*</button>
				<button type="submit" name="dividir"class="btn btn-secondary">/</button>
			</form>
		</div>
	</div>
</body>
</html>
