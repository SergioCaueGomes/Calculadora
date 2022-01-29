	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="#FFEB4D">
	<div class="container" style="display:flex; align-items:center; justify-content:center;">
	<div class="row">
		<div class="col-12">
			
			<form action="Calculadora" method="post" style="padding-top: 20px; margin-top: 60px; background-color:#BEC7C7; color:#06111C; width: 600px;  display:flex; align-items:center; justify-content:center; flex-direction: column; border:1px solid #06111C; border-radius: 5px;">
				<h1>Calculadora</h1>
				<h6>Valor 1:</h6> <input type="number" name="val1"></input><p><br>
				<h6>Valor 2:</h6> <input type="number" name="val2"></input><p><br>
				<div>
					<button type="submit" name="somar" class="btn btn-success">+</button>
					<button type="submit" name="subtrair" class="btn btn-secondary">-</button>
					<button type="submit" name="multiplicar" class="btn btn-danger">*</button>
					<button type="submit" name="dividir"class="btn btn-warning">/</button>
				</div>
				<button type="reset" name="limpar"class="btn btn-secondary" style="margin: 20px 0px 10px 0px">Limpar</button>
				<h6>Resultado:</h6> <p style="background-color:white;"> ${requestScope.resultado}</p><br>
					
				
			</form>
		</div>
	</div>
	</div>
</body>
</html>
