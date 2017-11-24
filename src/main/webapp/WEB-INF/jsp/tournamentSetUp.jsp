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
<link href="resources/css/tournamentSetUp.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">
		<jsp:include page="fragment/tournamentManagerHeader.jsp" />
		<jsp:include page="fragment/tournamentSetUpMenu.jsp" />
		<div class="row">
			<div class="col-md-2">${tournament.tournamentData.cNameTournament}</div>
			<div class="col-md-2 col-md-offset-8">
				<button type="button" class="btn btn-default">Guardar</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="row">
					<div class="col-md-7">Visible para el público:</div>
					<div class="col-md-5">
						<select class="form-control">
							<option value="visible"
								${tournament.tournamentData.cStatusTournament == 'visible' ? 'selected' : '' }>Sí</option>
							<option value="hidden"
								${tournament.tournamentData.cStatusTournament == 'hidden' ? 'selected' : ''}>No</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-md-3 col-md-offset-6">Organizado por:
				${tournament.managerName}</div>
		</div>
		<div class="row">
			<div class="col-md-2">Presentación (*):</div>
			<div class="col-md-10">
				<textarea class="form-control" rows="3">${tournament.tournamentData.cPresentationtxtTournament}</textarea>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<select class="form-control">
					<c:forEach items="${teamPlayerOptions}" var="teamPlayer">
						<option value="${teamPlayer.teamPlayerId}"
							${tournament.tournamentData.nIdTeamPlayer == teamPlayer.teamPlayerId ? 'selected':''}>${teamPlayer.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="col-md-4">
				<select class="form-control">
					<c:forEach items="${footballCategories}" var="footballCategory">
						<option value="${footballCategory.footballCategoryId}"
							${tournament.tournamentData.nIdFootballCategory == footballCategory.footballCategoryId ? 'selected':''}>${footballCategory.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="col-md-4">
				<select class="form-control">
					<option value="1"
						${tournament.tournamentData.nIdSex == '1' ? 'selected' : '' }>Masculino</option>
					<option value="2"
						${tournament.tournamentData.nIdSex == '2' ? 'selected' : ''}>Femenino</option>
				</select>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				Incio:<input type="text" class="form-control"
					value="${tournament.tournamentData.dDateTournamentStart}">
			</div>
			<div class="col-md-6">
				Fin:<input type="text" class="form-control"
					value="${tournament.tournamentData.dDateTournamentFinish}">
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<input type="text" class="form-control" placeholder="Cancha (*)">
			</div>
			<div class="col-md-6">
				<input type="text" class="form-control" placeholder="Distrito (*)">
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<select class="form-control">
					<c:forEach items="${fieldTypes}" var="fieldType">
						<option value="${fieldType.fieldTypeId}"
							${tournament.tournamentData.nIdFieldType == fieldType.fieldTypeId ? 'selected':''}>${fieldType.fieldTypeName}</option>
					</c:forEach>
				</select>
			</div>
			<div class="col-md-6">
				Cantidad de Cupos:<input type="text" class="form-control"
					value="${tournament.tournamentData.numberofparticipantstournament}">
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">Inscripción</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="row">
					<div class="col-md-3">Cuota:</div>
					<div class="col-md-3">
						<select class="form-control">
							<option>Por Equipo</option>
						</select>
					</div>
					<div class="col-md-3">
						<input type="text" class="form-control" placeholder="S/."
							value="${tournament.tournamentData.cPriceTeam}">
					</div>
					<div class="col-md-3">
						<select class="form-control">
							<option>Sin IGV</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				Correo: <input type="text" class="form-control"
					value="${tournament.tournamentData.cEmailTournament}">
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				Texto Promocional (*):
				<textarea class="form-control" rows="3">${tournament.tournamentData.cInscriptionPaymentAdditionalText}</textarea>
			</div>
			<div class="col-md-6">
				Teléfonos:<input type="text" class="form-control"
					value="${tournament.tournamentData.cPhoneTournament}"><br>
				Página Web (*):<input type="text" class="form-control"
					value="${tournament.tournamentData.cWebpageTournament}">
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				Premios (*):
				<textarea class="form-control" rows="3">${tournament.tournamentData.cPremiostxtTournament}</textarea>
			</div>
			<div class="col-md-6">
				Fechas y horarios (*):
				<textarea class="form-control" rows="3">${tournament.tournamentData.cFechastxtTournament}</textarea>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				Información Adicional(*):
				<textarea class="form-control" rows="5">${tournament.tournamentData.cAdditionaltxtTournament}</textarea>
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
	<script src="resources/js/tournamentSetUp.js" type="text/javascript"></script>
	<script src="resources/js/tournamentSetUpMenu.js"
		type="text/javascript"></script>
</body>
</html>