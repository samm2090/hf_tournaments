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
<link href="resources/css/tournamentGroups.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentManagerBanner.jsp" />
		<jsp:include page="fragment/tournamentFillUpMenu.jsp" />

		<div class="row">
			<div class="col-md-12">Grupos</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<ul class="nav nav-pills nav-justified">
					<li id="tabCreateGroups" onclick="activateCreateGroups()"
						class="active"><a>Crear Grupos</a></li>
					<li id="tabAsignTeams" onclick="activateAsignTeams()"><a>Asignar
							Equipos</a></li>
				</ul>
			</div>
		</div>
		<div id="divCreateGroups">
			<div class="row">
				<div class="col-md-4">Fase 1 - Grupos</div>
				<div class="col-md-4">#Equipos: 16</div>
				<div class="col-md-4">
					#Grupos: <input type="text" class="form-control">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<table class="table table-bordered table-striped table-hover"
						id="tbGroups" cellspacing="0">
						<thead>
							<tr>
								<th>Grupo</th>
								<th>Nombre <select class="form-control">
										<option>Alfabéticamente</option>
								</select></th>
								<th>Equipos x Grupo</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
							</tr>
							<tr>
								<td>2</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
							</tr>
							<tr>
								<td>3</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
							</tr>
							<tr>
								<td>4</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div id="div" class="row">
				<div class="col-md-1 pull-right">
					<button type="button" class="btn btn-default">Guardar</button>
				</div>
			</div>
		</div>
		<div id="divAsignTeams">
			<div class="row">
				<div class="col-md-6">
					<div class="row">
						<div class="col-md-12">
							GRUPO A
							<table class="table table-bordered table-striped table-hover"
								id="tbGroupTeams" cellspacing="0">
								<thead>
									<tr>
										<th>Nro</th>
										<th>Equipos</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td><input type="text" class="form-control"></td>
									</tr>
									<tr>
										<td>2</td>
										<td><input type="text" class="form-control"></td>
									</tr>
									<tr>
										<td>3</td>
										<td><input type="text" class="form-control"></td>
									</tr>
									<tr>
										<td>4</td>
										<td><input type="text" class="form-control"></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							GRUPO B
							<table class="table table-bordered table-striped table-hover"
								id="tbGroupTeams" cellspacing="0">
								<thead>
									<tr>
										<th>Nro</th>
										<th>Equipos</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td><input type="text" class="form-control"></td>
									</tr>
									<tr>
										<td>2</td>
										<td><input type="text" class="form-control"></td>
									</tr>
									<tr>
										<td>3</td>
										<td><input type="text" class="form-control"></td>
									</tr>
									<tr>
										<td>4</td>
										<td><input type="text" class="form-control"></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<button type="button" class="btn btn-default">Eliminar
								Todo</button>
							<button type="button" class="btn btn-default">Sorteo
								Automático</button>
							<button type="button" class="btn btn-default">Guardar</button>
						</div>
					</div>
				</div>
				<div class="col-md-6">Equipos</div>
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
	<script src="resources/js/tournamentGroups.js" type="text/javascript"></script>
	<script src="resources/js/tournamentFillUpMenu.js"
		type="text/javascript"></script>
</body>
</html>