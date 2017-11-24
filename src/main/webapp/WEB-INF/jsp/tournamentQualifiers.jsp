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
<link href="resources/css/tournamentQualifiers.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentManagerBanner.jsp" />
		<jsp:include page="fragment/tournamentFillUpMenu.jsp" />
		<div class="row">
			<div class="col-md-6">Clasificación</div>
			<div class="col-md-6">
				<button type="button" class="btn btn-default pull-right">Guardar</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<table class="table table-bordered table-striped table-hover"
					id="tbTournamentTeams" cellspacing="0">
					<thead>
						<tr>
							<th>#</th>
							<th colspan="3">Partido</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Los Pinos</td>
							<td>vs</td>
							<td>VGM</td>
						</tr>
						<tr>
							<td>1</td>
							<td>Los Pinos</td>
							<td>vs</td>
							<td>VGM</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-6">
				Grupo A
				<table class="table table-bordered table-striped table-hover"
					id="tbTournamentTeams" cellspacing="0">
					<thead>
						<tr>
							<th>Puesto</th>
							<th>Nombre</th>
							<th>GF</th>
							<th>GC</th>
							<th>DIF</th>
							<th>Puntos</th>
							<th>Clasifica?</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Azumi</td>
							<td>12</td>
							<td>12</td>
							<td>12</td>
							<td>12</td>
							<td><input type="checkbox"></td>
						</tr>
						<tr>
							<td>2</td>
							<td>VGM</td>
							<td>12</td>
							<td>12</td>
							<td>12</td>
							<td>12</td>
							<td><input type="checkbox"></td>
						</tr>
						<tr>
							<td>3</td>
							<td>Tres Pa La Sed</td>
							<td>12</td>
							<td>12</td>
							<td>12</td>
							<td>12</td>
							<td><input type="checkbox"></td>
						</tr>
						<tr>
							<td>4</td>
							<td>Los Pinos</td>
							<td>12</td>
							<td>12</td>
							<td>12</td>
							<td>12</td>
							<td><input type="checkbox"></td>
						</tr>
					</tbody>
				</table>
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
	<script src="resources/js/tournamentQualifiers.js"
		type="text/javascript"></script>
	<script src="resources/js/tournamentFillUpMenu.js"
		type="text/javascript"></script>
</body>
</html>