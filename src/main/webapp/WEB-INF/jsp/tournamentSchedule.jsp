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
<link href="resources/css/tournamentSchedule.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<div class="modal fade" id="modalCreateTeam" tabindex="-1"
			role="dialog" aria-labelledby="modalTitle">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="tituloModal">Crear Cancha</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-6">
								Nombre: <input type="text" class="form-control">
							</div>
							<div class="col-md-6">
								<button type="button" class="btn btn-default">Agregar</button>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<table class="table table-bordered" cellspacing="0">
									<thead>
										<tr>
											<th>#</th>
											<th>Nombre</th>
											<th>Acción</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Cancha 1</td>
											<td><button type="button" class="btn btn-default">
													<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
												</button></td>
										</tr>
										<tr>
											<td>1</td>
											<td>Cancha 1</td>
											<td><button type="button" class="btn btn-default">
													<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
												</button></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="modal fade" id="modalDownloadSpreadsheet" tabindex="-1"
			role="dialog" aria-labelledby="modalTitle">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="tituloModal">Generar Planillas</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-6">
								Fecha inicial: <input type="text" class="form-control">
							</div>
							<div class="col-md-6">
								Fecha Final: <input type="text" class="form-control">
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<button type="button" class="btn btn-default center-block">
									Descargar</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentManagerBanner.jsp" />
		<jsp:include page="fragment/tournamentFillUpMenu.jsp" />
		<div class="row">
			<div class="col-md-12">Programación</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<ul class="nav nav-pills nav-justified">
					<li id="tabPlanning" onclick="activatePlanning()" class="active"><a>Planeación</a></li>
					<li id="tabProgramming" onclick="activateProgramming()"><a>Programación</a></li>
					<li id="tabTimeTable" onclick="activateTimeTable()"><a>Calendarización</a></li>
				</ul>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<button id="btnGenerateSpreadsheet" type="button" class="btn btn-default pull-right">Generar
					Planillas</button>
			</div>
			<div class="col-md-6">
				<button type="button" class="btn btn-default pull-left">Guardar</button>
			</div>
		</div>
		<div id="divPlanning">
			<div class="row">
				<div class="col-md-12">
					<table class="table table-bordered" cellspacing="0">
						<thead>
							<tr>
								<th>Grupo</th>
								<th colspan="3">Partido</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Grupo A</td>
								<td><select class="form-control">
										<option>A1</option>
								</select></td>
								<td>vs</td>
								<td><select class="form-control">
										<option>A1</option>
								</select></td>
							</tr>
							<tr>
								<td>Grupo A</td>
								<td><select class="form-control">
										<option>A1</option>
								</select></td>
								<td>vs</td>
								<td><select class="form-control">
										<option>A1</option>
								</select></td>
							</tr>
							<tr>
								<td>Grupo A</td>
								<td><select class="form-control">
										<option>A1</option>
								</select></td>
								<td>vs</td>
								<td><select class="form-control">
										<option>A1</option>
								</select></td>
							</tr>
							<tr>
								<td>Grupo A</td>
								<td><select class="form-control">
										<option>A1</option>
								</select></td>
								<td>vs</td>
								<td><select class="form-control">
										<option>A1</option>
								</select></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div id="divProgramming">
			<div class="row">
				<div class="col-md-12">
					<table class="table table-bordered" cellspacing="0">
						<thead>
							<tr>
								<th>Grupo</th>
								<th colspan="3">Partido</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Grupo A</td>
								<td><select class="form-control">
										<option>CSM</option>
								</select></td>
								<td>vs</td>
								<td><select class="form-control">
										<option>PTM</option>
								</select></td>
							</tr>
							<tr>
								<td>Grupo A</td>
								<td><select class="form-control">
										<option>CSM</option>
								</select></td>
								<td>vs</td>
								<td><select class="form-control">
										<option>PTM</option>
								</select></td>
							</tr>
							<tr>
								<td>Grupo A</td>
								<td><select class="form-control">
										<option>CSM</option>
								</select></td>
								<td>vs</td>
								<td><select class="form-control">
										<option>PTM</option>
								</select></td>
							</tr>
							<tr>
								<td>Grupo A</td>
								<td><select class="form-control">
										<option>CSM</option>
								</select></td>
								<td>vs</td>
								<td><select class="form-control">
										<option>PTM</option>
								</select></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div id="divTimeTable">
			<div class="row"></div>
			<div class="row">
				<div class="col-md-12">
					Fase 1 - Grupos<br> Ronda 1
					<table class="table table-bordered table-striped" cellspacing="0">
						<thead>
							<tr>
								<th>Nro</th>
								<th>Grupo</th>
								<th>Fecha</th>
								<th>Hora</th>
								<th>Cancha</th>
								<th colspan="3">Partido</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>#1</td>
								<td>Grupo A</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
								<td><select class="form-control">
										<option>Cancha 1</option>
								</select>
									<button type="button" onclick="createField()"
										class="btn btn-default">+</button></td>
								<td>CSM</td>
								<td>vs</td>
								<td>PTM</td>
								<th><button type="button" onclick=")"
										class="btn btn-default">Generar Planilla</button></th>
							</tr>
							<tr>
								<td>#1</td>
								<td>Grupo A</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
								<td><select class="form-control">
										<option>Cancha 1</option>
								</select>
									<button type="button" onclick="createField()"
										class="btn btn-default">+</button></td>
								<td>CSM</td>
								<td>vs</td>
								<td>PTM</td>
								<th><button type="button" onclick=")"
										class="btn btn-default">Generar Planilla</button></th>
							</tr>
							<tr>
								<td>#1</td>
								<td>Grupo A</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
								<td><select class="form-control">
										<option>Cancha 1</option>
								</select>
									<button type="button" onclick="createField()"
										class="btn btn-default">+</button></td>
								<td>CSM</td>
								<td>vs</td>
								<td>PTM</td>
								<th><button type="button" onclick=")"
										class="btn btn-default">Generar Planilla</button></th>
							</tr>
							<tr>
								<td>#1</td>
								<td>Grupo A</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
								<td><select class="form-control">
										<option>Cancha 1</option>
								</select>
									<button type="button" onclick="createField()"
										class="btn btn-default">+</button></td>
								<td>CSM</td>
								<td>vs</td>
								<td>PTM</td>
								<th><button type="button" onclick=")"
										class="btn btn-default">Generar Planilla</button></th>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<button type="button" id="btnCreateTeam"
					class="btn btn-default pull-right">Agregar Equipo</button>
			</div>
			<div class="col-md-6">
				<button type="button" class="btn btn-default pull-left">Subir
					Plantilla</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12"></div>
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
	<script src="resources/js/tournamentSchedule.js" type="text/javascript"></script>
	<script src="resources/js/tournamentFillUpMenu.js"
		type="text/javascript"></script>
</body>
</html>