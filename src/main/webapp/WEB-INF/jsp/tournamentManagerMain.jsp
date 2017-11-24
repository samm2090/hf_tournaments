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
<link href="resources/css/commonStyle.css" rel="stylesheet">
<link href="resources/css/tournamentManagerMain.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<div class="modal fade" id="modalSelectOption" tabindex="-1"
			role="dialog" aria-labelledby="modalTitle">
			<div class="modal-dialog modal-sm" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="tituloModal">Elegir Opción</h4>
					</div>
					<div class="modal-body">
						<button type="button" id="btnSetUp" class="btn btn-default">Configurar
							Torneo</button>
						<button type="button" id="btnRegister" class="btn btn-default">Registrar
							Datos</button>
					</div>
				</div>
			</div>
		</div>

		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<div class="row">
			<div class="col-md-3">
				<h3>MIS TORNEOS</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-bordered table-striped table-hover"
					id="tbMytournaments" cellspacing="0">
					<thead>
						<tr>
							<th>#</th>
							<th>Nombre</th>
							<th>Organizador</th>
							<th>Tip .Fút.</th>
							<th>Fec. Ini.</th>
							<th># Equipos</th>
							<th>Público?</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${tournaments}" var="tournament"
							varStatus="status">
							<tr>
								<td>${status.index + 1}</td>
								<td>${tournament.tournamentData.cNameTournament}<span class="hidden">${tournament.tournamentData.nIdTournament}</span></td>
								<td>${tournament.managerName}</td>
								<td>${tournament.soccerType}</td>
								<td>${tournament.tournamentData.dDateTournamentStart}</td>
								<td>${tournament.tournamentData.numberofparticipantstournament}</td>
								<td><c:choose>
										<c:when
											test="${tournament.tournamentData.cStatusTournament == 'visible'}">
											<button type="button" class="btn btn-default btn-active">
												<span class="glyphicon glyphicon-eye-open"
													aria-hidden="true"></span>
											</button>
										</c:when>
										<c:otherwise>
											<button type="button" class="btn btn-default btn-inactive">
												<span class="glyphicon glyphicon-eye-close"
													aria-hidden="true"></span>
											</button>
										</c:otherwise>
									</c:choose></td>
							</tr>
						</c:forEach>
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
	<script src="resources/js/tournamentManagerMain.js"
		type="text/javascript"></script>
</body>
</html>