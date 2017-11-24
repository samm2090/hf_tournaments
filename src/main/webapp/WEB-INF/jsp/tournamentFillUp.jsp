<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link href="resources/css/tournamentFillUp.css" rel="stylesheet">
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
						<h4 class="modal-title" id="tituloModal">Crear Equipo</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-6 col-md-offset-3">
								Nombre: <input type="text" class="form-control" value="">
							</div>
						</div>
						<div class="row">
							<div class="col-md-4">
								<div class="row">
									<div class="col-md-12">
										Foto: <img alt="foto" class="img-responsive center-block"
											src="resources/images/team_members_placeholder.png">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Escudo: <img alt="escudo" class="img-responsive center-block"
											src="resources/images/team_emblem_placeholder.png">
									</div>
								</div>
							</div>
							<div class="col-md-8">
								<div class="row">
									<div class="col-md-12">Datos del Contacto</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Contacto: <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										DNI (*): <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Teléfono (*): <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Correo (*): <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Referencia (*):
										<textarea class="form-control" rows="3"></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default">Agregar</button>
					</div>
				</div>
			</div>
		</div>

		<div class="modal fade" id="modalPlayersList" tabindex="-1"
			role="dialog" aria-labelledby="modalTitle">
			<div class="modal-dialog modal-lg" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="tituloModal">Jugadores</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-10">Equipo: Las Viñas FC</div>
							<div class="col-md-2">
								<button type="button" id="btnCreatePlayer"
									class="btn btn-default">Agregar Jugador</button>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<table class="table table-bordered table-striped table-hover"
									id="tbTeamPlayers" cellspacing="0">
									<thead>
										<tr>
											<th>#</th>
											<th>Nombre</th>
											<th>Foto</th>
											<th>DNI</th>
											<th>Teléfono</th>
											<th>Email</th>
											<th>Edad</th>
											<th>Acción</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Alfonso Pasco</td>
											<td><img alt="foto" height="45px" width="45px"
												class="img-responsive center-block"
												src="resources/images/player_placeholder.jpg"></td>
											<td>4630629</td>
											<td>35478965</td>
											<td>alfonsopasco@gmail.com</td>
											<td>27</td>
											<td><button type="button" class="btn btn-default">
													<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
												</button>
												<button type="button" class="btn btn-default">
													<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
												</button></td>
										</tr>
										<tr>
											<td>1</td>
											<td>Kevin Scott</td>
											<td><img alt="foto" height="45px" width="45px"
												class="img-responsive center-block"
												src="resources/images/player_placeholder.jpg"></td>
											<td>45554852</td>
											<td>987562159</td>
											<td>kevinscott@gmail.com</td>
											<td>33</td>
											<td><button type="button" class="btn btn-default">
													<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
												</button>
												<button type="button" class="btn btn-default">
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

		<div class="modal fade" id="modalCreatePlayer" tabindex="-1"
			role="dialog" aria-labelledby="modalTitle">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="tituloModal">Crear Jugador</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-8">
								<div class="row">
									<div class="col-md-12">
										Nombre: <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Apellidos: <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										DNI (*): <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										teléfonos (*): <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Correo (*): <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Fecha Nacimiento (*): <input type="text" class="form-control">
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										Distrito (*): <input type="text" class="form-control">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="row">
									<div class="col-md-12">
										Foto: <img alt="foto" class="img-responsive center-block"
											src="resources/images/player_placeholder.jpg">
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default">Agregar</button>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentManagerBanner.jsp" />
		<jsp:include page="fragment/tournamentFillUpMenu.jsp" />
		<div class="row">
			<div class="col-md-12">Equipos</div>
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
			<div class="col-md-12">
				<table class="table table-bordered table-striped table-hover"
					id="tbTournamentTeams" cellspacing="0">
					<thead>
						<tr>
							<th>#</th>
							<th>Equipo</th>
							<th>Representante</th>
							<th>Teléfono</th>
							<th># Jugadores</th>
							<th>Acción</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Los Pinos</td>
							<td>Alfonso Pasco</td>
							<td>35478965</td>
							<td>2
								<button type="button" onclick="playersList()"
									class="btn btn-default">+</button>
							</td>
							<td><button type="button" class="btn btn-default">
									<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
								</button>
								<button type="button" class="btn btn-default">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
								</button></td>
						</tr>
						<tr>
							<td>2</td>
							<td>VGM</td>
							<td>WILLI REY</td>
							<td>323232232</td>
							<td>0
								<button type="button" onclick="playersList()"
									class="btn btn-default">+</button>
							</td>
							<td><button type="button" class="btn btn-default">
									<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
								</button>
								<button type="button" class="btn btn-default">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
								</button></td>
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
	<script src="resources/js/tournamentFillUpMenu.js" type="text/javascript"></script>
	<script src="resources/js/tournamentFillUp.js" type="text/javascript"></script>
</body>
</html>