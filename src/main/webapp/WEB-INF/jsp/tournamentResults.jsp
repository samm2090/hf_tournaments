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
<link href="resources/css/tournamentResults.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">

		<div class="modal fade" id="modalMatchDetail" tabindex="-1"
			role="dialog" aria-labelledby="modalTitle">
			<div class="modal-dialog modal-lg" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="tituloModal">Detalle del Partido</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-12">
								<table class="table table-bordered" cellspacing="0">
									<thead>
										<tr>
											<th>Equipo</th>
											<th>W.O?</th>
											<th>Goles</th>
											<th>Goles en sup.</th>
											<th>Goles en pen.</th>
											<th>Sorteo</th>
											<th>Score Final</th>
											<th>Resultado</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>Las Viñas</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
											<td>0</td>
											<td>Empate</td>
										</tr>
										<tr>
											<td>VGM</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
											<td>0</td>
											<td>Empate</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<button type="button" class="btn btn-default">Agregar
									Jugador</button>
								<table class="table table-bordered" cellspacing="0">
									<thead>
										<tr>
											<th>Nº</th>
											<th>Jugador</th>
											<th>Jugo?<input type="checkbox"></th>
											<th>Goles</th>
											<th>Goles Supl.</th>
											<th>Amarilla</th>
											<th>Roja Directa</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><input type="text" class="form-control"></td>
											<td>James Rodriguez</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
										</tr>
										<tr>
											<td><input type="text" class="form-control"></td>
											<td>James Rodriguez</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
										</tr>
										<tr>
											<td><input type="text" class="form-control"></td>
											<td>James Rodriguez</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
										</tr>
										<tr>
											<td><input type="text" class="form-control"></td>
											<td>James Rodriguez</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
										</tr>
									</tbody>
								</table>
							</div>
							<div class="col-md-6">
								<button type="button" class="btn btn-default pull-right">Agregar
									Jugador</button>
								<table class="table table-bordered" cellspacing="0">
									<thead>
										<tr>
											<th>Nº</th>
											<th>Jugador</th>
											<th>Jugo?<input type="checkbox"></th>
											<th>Goles</th>
											<th>Goles Supl.</th>
											<th>Amarilla</th>
											<th>Roja Directa</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><input type="text" class="form-control"></td>
											<td>James Rodriguez</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
										</tr>
										<tr>
											<td><input type="text" class="form-control"></td>
											<td>James Rodriguez</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
										</tr>
										<tr>
											<td><input type="text" class="form-control"></td>
											<td>James Rodriguez</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
										</tr>
										<tr>
											<td><input type="text" class="form-control"></td>
											<td>James Rodriguez</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="checkbox"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="row">
							<div class="col-md-4">
								<div class="row">
									<div class="col-md-12">
										Árbitro (*): <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12	">
										Planillero (*): <input type="text" class="form-control">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<button type="button" id="btnSuspensions"
									class="btn btn-default">Suspensiones</button>
							</div>
							<div class="col-md-4">
								<button type="button" class="btn btn-default">Guardar</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="modal fade" id="modalSuspensions" tabindex="-1"
			role="dialog" aria-labelledby="modalTitle">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="tituloModal">Suspensiones</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-12">
								<table class="table table-bordered" cellspacing="0">
									<thead>
										<tr>
											<th>Jugador</th>
											<th>Equipo</th>
											<th>Suspender</th>
											<th>Fechas</th>
											<th>Observación</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>Charles Manson</td>
											<td>Las Viñas</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
										</tr>
										<tr>
											<td>Charles Manson</td>
											<td>Las Viñas</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
										</tr>
										<tr>
											<td>Charles Manson</td>
											<td>Las Viñas</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
										</tr>
										<tr>
											<td>Charles Manson</td>
											<td>Las Viñas</td>
											<td><input type="checkbox"></td>
											<td><input type="text" class="form-control"></td>
											<td><input type="text" class="form-control"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default">Guardar</button>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentManagerBanner.jsp" />
		<jsp:include page="fragment/tournamentFillUpMenu.jsp" />
		<div class="row">
			<div class="col-md-12">Resultados</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				Fase 1- Grupos <br>Ronda 1
				<table class="table table-bordered table-striped" cellspacing="0">
					<thead>
						<tr>
							<th>Nro</th>
							<th>Grupo</th>
							<th>Fecha</th>
							<th>Hora</th>
							<th>Cancha</th>
							<th colspan="5">Partido</th>
							<th>Acción</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>#1</td>
							<td>Grupo A</td>
							<td>21/11/2017</td>
							<td>02:00p.m</td>
							<td>Cancha 1</td>
							<td>CSM</td>
							<td><input type="text" class="form-control"></td>
							<td>vs</td>
							<td><input type="text" class="form-control"></td>
							<td>PTM</td>
							<th><button type="button" onclick="matchDetail()"
									class="btn btn-default">Detalle</button>
								<button type="button" onclick="" class="btn btn-default">Guardar</button></th>
						</tr>
						<tr>
							<td>#1</td>
							<td>Grupo A</td>
							<td>21/11/2017</td>
							<td>02:00p.m</td>
							<td>Cancha 1</td>
							<td>CSM</td>
							<td><input type="text" class="form-control"></td>
							<td>vs</td>
							<td><input type="text" class="form-control"></td>
							<td>PTM</td>
							<th><button type="button" onclick="matchDetail()"
									class="btn btn-default">Detalle</button>
								<button type="button" onclick="" class="btn btn-default">Guardar</button></th>
						</tr>
						<tr>
							<td>#1</td>
							<td>Grupo A</td>
							<td>21/11/2017</td>
							<td>02:00p.m</td>
							<td>Cancha 1</td>
							<td>CSM</td>
							<td><input type="text" class="form-control"></td>
							<td>vs</td>
							<td><input type="text" class="form-control"></td>
							<td>PTM</td>
							<th><button type="button" onclick="matchDetail()"
									class="btn btn-default">Detalle</button>
								<button type="button" onclick="" class="btn btn-default">Guardar</button></th>
						</tr>
						<tr>
							<td>#1</td>
							<td>Grupo A</td>
							<td>21/11/2017</td>
							<td>02:00p.m</td>
							<td>Cancha 1</td>
							<td>CSM</td>
							<td><input type="text" class="form-control"></td>
							<td>vs</td>
							<td><input type="text" class="form-control"></td>
							<td>PTM</td>
							<th><button type="button" onclick="matchDetail()"
									class="btn btn-default">Detalle</button>
								<button type="button" onclick="" class="btn btn-default">Guardar</button></th>
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
	<script src="resources/js/tournamentResults.js" type="text/javascript"></script>
	<script src="resources/js/tournamentFillUpMenu.js"
		type="text/javascript"></script>
</body>
</html>