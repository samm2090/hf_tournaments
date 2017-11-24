<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Organizador - Torneos</title>
<link href="resources/css/fragments.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/libs/DataTables/datatables.min.css"
	rel="stylesheet">
<link href="resources/css/tournamentStructure.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentSetUpMenu.jsp" />
		<div class="row">
			<div class="col-md-2">Estructura</div>
			<div class="col-md-2 col-md-offset-8">
				<button type="button" class="btn btn-default">Guardar</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 col-md-offset-1">
				Fase 1: <input type="text" class="form-control">
			</div>
			<div class="col-md-2">
				Modalidad: <select class="form-control">
					<option>Grupos</option></select>
			</div>
			<div class="col-md-2">
				# Equipos: <input type="text" class="form-control">
			</div>
			<div class="col-md-2">
				# Clasificados:<input type="text" class="form-control">
			</div>
			<div class="col-md-2">
				Arrastra Tarjetas? <select class="form-control">
					<option>Sí</option>
				</select>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2 col-md-offset-1">
				Fase 2: <input type="text" class="form-control">
			</div>
			<div class="col-md-2">
				Modalidad: <select class="form-control">
					<option>Grupos</option></select>
			</div>
			<div class="col-md-2">
				# Equipos: <input type="text" class="form-control">
			</div>
			<div class="col-md-2">
				# Clasificados:<input type="text" class="form-control">
			</div>
			<div class="col-md-2">
				Arrastra Tarjetas? <select class="form-control">
					<option>Sí</option>
				</select>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 ">
				<button type="button" class="btn btn-default center-block">Agregar
					Fase</button>
			</div>

		</div>
		<div class="row">
			<div class="col-md-12">
				Comentario (*):
				<textarea class="form-control" rows="3"></textarea>
			</div>
		</div>
		<div class="row">
			<div class="col-md-1 pull-right">
				<button type="button" class="btn btn-default">Guardar</button>
			</div>
		</div>
		<div class="row">
			<jsp:include page="fragment/footer.jsp" />
		</div>
	</div>
	<script src="resources/js/jquery-3.1.1.js" type="text/javascript"></script>
	<script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="resources/libs/DataTables/datatables.min.js"
		type="text/javascript"></script>
	<script src="resources/js/util.js" type="text/javascript"></script>
	<script src="resources/js/tournamentStructure.js"
		type="text/javascript"></script>
	<script src="resources/js/tournamentSetUpMenu.js"
		type="text/javascript"></script>
</body>
</html>