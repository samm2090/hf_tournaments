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
<link href="resources/css/tournamentBasicParameters.css"
	rel="stylesheet">
</head>
<body>
	<div class="container-fluid">

		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentSetUpMenu.jsp" />
		<div class="row">
			<div class="col-md-8">Parámetros Básicos (Solo modificar en
				casos especiales)</div>
			<div class="col-md-2 col-md-offset-2">
				<button type="button" class="btn btn-default">Guardar</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">Puntaje:</div>
		</div>
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<table class="table">
					<thead>
						<tr>
							<th>Condición</th>
							<th>Ganador</th>
							<th>Perdedor</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Puntos sin tiempo suplementario</td>
							<td><input type="text" class="form-control"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Puntos con tiempo suplementario</td>
							<td><input type="text" class="form-control"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Puntos con penales</td>
							<td><input type="text" class="form-control"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Puntos con sorteo</td>
							<td><input type="text" class="form-control"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Puntos en empates</td>
							<td colspan="2"><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Puntos por W.O</td>
							<td><input type="text" class="form-control"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Score en W.O</td>
							<td><input type="text" class="form-control"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="row">
					<div class="col-md-12">Tarjetas</div>
				</div>
				<div class="row">
					<div class="col-md-10">Cantidad de amarillas para roja
						indirecta:</div>
					<div class="col-md-2">
						<input type="text" class="form-control">
					</div>
				</div>
				<div class="row">
					<div class="col-md-10">Cantidad de amarillas para suspensión:</div>
					<div class="col-md-2">
						<input type="text" class="form-control">
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="row">
					<div class="col-md-12">Suspensiones</div>
				</div>
				<div class="row">
					<div class="col-md-10">Cantidad de suspensiones por roja
						indirecta:</div>
					<div class="col-md-2">
						<input type="text" class="form-control">
					</div>
				</div>
				<div class="row">
					<div class="col-md-10">Cantidad de suspensiones por roja
						directa:</div>
					<div class="col-md-2">
						<input type="text" class="form-control">
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">Desempates:</div>
		</div>
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<table class="table">
					<thead>
						<tr>
							<th>Condición</th>
							<th>Incluir</th>
							<th>Orden</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Mayor diferencia de goles (A favor menos en contra, sin
								considerar los desempates):</td>
							<td><input type="checkbox"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Mayor cantidad de goles a favor sin cosiderar
								desempates:</td>
							<td><input type="checkbox"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Menor cantidad de goles en contra sin considerar
								desempates:</td>
							<td><input type="checkbox"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
						<tr>
							<td>Mejor resultado entre ambos:</td>
							<td><input type="checkbox"></td>
							<td><input type="text" class="form-control"></td>
						</tr>
					</tbody>
				</table>
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
	<script src="resources/js/tournamentBasicParameters.js"
		type="text/javascript"></script>
	<script src="resources/js/tournamentSetUpMenu.js"
		type="text/javascript"></script>
</body>
</html>