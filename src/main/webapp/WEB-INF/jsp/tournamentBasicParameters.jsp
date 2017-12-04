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
				<button type="button" class="btn btn-default btnSave">Guardar</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">Puntaje:</div>
		</div>
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<span id="nIdPolicyMatchScore" style="display: none">${tournamentPolicyScore.nIdPolicyMatchScore}</span>
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
							<td><input type="text" class="form-control"
								id="nWinWithoutSupplementaryTime"
								value="${tournamentPolicyScore.nWinWithoutSupplementaryTime}"></td>
							<td><input type="text" class="form-control"
								id="nLoseWithoutSupplementaryTime"
								value="${tournamentPolicyScore.nLoseWithoutSupplementaryTime}"></td>
						</tr>
						<tr>
							<td>Puntos con tiempo suplementario</td>
							<td><input type="text" class="form-control"
								id="nWinWithSupplementaryTime"
								value="${tournamentPolicyScore.nWinWithSupplementaryTime}"></td>
							<td><input type="text" class="form-control"
								id="nLoseWithSupplementaryTime"
								value="${tournamentPolicyScore.nLoseWithSupplementaryTime}"></td>
						</tr>
						<tr>
							<td>Puntos con penales</td>
							<td><input type="text" class="form-control"
								id="nWinWithPenaltyGoals"
								value="${tournamentPolicyScore.nWinWithPenaltyGoals}"></td>
							<td><input type="text" class="form-control"
								id="nLoseWithPenaltyGoals"
								value="${tournamentPolicyScore.nLoseWithPenaltyGoals}"></td>
						</tr>
						<tr>
							<td>Puntos con sorteo</td>
							<td><input type="text" class="form-control"
								id="nWinWithTossUp"
								value="${tournamentPolicyScore.nWinWithTossUp}"></td>
							<td><input type="text" class="form-control"
								id="nLoseWithTossUp"
								value="${tournamentPolicyScore.nLoseWithTossUp}"></td>
						</tr>
						<tr>
							<td>Puntos en empates</td>
							<td colspan="2"><input type="text" class="form-control"
								id="nGoalsDraw" value="${tournamentPolicyScore.nGoalsDraw}"></td>
						</tr>
						<tr>
							<td>Puntos por W.O</td>
							<td><input type="text" class="form-control"
								id="nWinWithWalkover"
								value="${tournamentPolicyScore.nWinWithWalkover}"></td>
							<td><input type="text" class="form-control"
								id="nLoseWithWalkover"
								value="${tournamentPolicyScore.nLoseWithWalkover}"></td>
						</tr>
						<tr>
							<td>Score en W.O</td>
							<td><input type="text" class="form-control"
								id="nWinWithWalkoverGoalAdded"
								value="${tournamentPolicyScore.nWinWithWalkoverGoalAdded}"></td>
							<td><input type="text" class="form-control"
								id="nLoseWithWalkoverGoalAdded"
								value="${tournamentPolicyScore.nLoseWithWalkoverGoalAdded}"></td>
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
				<span id="nIdMatchFault" style="display: none">${tournamentPolicyFault.nIdMatchFault}</span>
				<div class="row">
					<div class="col-md-10">Cantidad de amarillas para roja
						indirecta:</div>
					<div class="col-md-2">
						<input type="text" class="form-control"
							id="nCardYellowByMatchForCardRedIndirect"
							value="${tournamentPolicyFault.nCardYellowByMatchForCardRedIndirect}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-10">Cantidad de amarillas para suspensión:</div>
					<div class="col-md-2">
						<input type="text" class="form-control"
							id="nCardYellowAccumulatedForMatchSuspension"
							value="${tournamentPolicyFault.nCardYellowAccumulatedForMatchSuspension}">
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
						<input type="text" class="form-control"
							id="nSuspensionForCardRedIndirect"
							value="${tournamentPolicyFault.nSuspensionForCardRedIndirect}">
					</div>
				</div>
				<div class="row">
					<div class="col-md-10">Cantidad de suspensiones por roja
						directa:</div>
					<div class="col-md-2">
						<input type="text" class="form-control"
							id="nSuspensionForCardRedDirect"
							value="${tournamentPolicyFault.nSuspensionForCardRedDirect}">
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
							<td id="tournamentPlaydown3">Mayor diferencia de goles (A
								favor menos en contra, sin considerar los desempates):</td>
							<td><input type="checkbox"
								id="chknIndexPolicyMatchPlaydown3"
								${playdownPolicy.playdownPolicy3 != null ? 'checked' : ''}><span
								id="nIdPolicyMatchPlaydown3" style="display: none">${playdownPolicy.playdownPolicy3.nIdPolicyMatchPlaydown}</span></td>
							<td><input type="text" class="form-control"
								id="nIndexPolicyMatchPlaydown3"
								value="${playdownPolicy.playdownPolicy3.nIndexPolicyMatchPlaydown}"></td>
						</tr>
						<tr>
							<td id="tournamentPlaydown4">Mayor cantidad de goles a favor
								sin cosiderar desempates:</td>
							<td><input type="checkbox"
								id="chknIndexPolicyMatchPlaydown4"
								${playdownPolicy.playdownPolicy4 != null ? 'checked' : ''}><span
								id="nIdPolicyMatchPlaydown4" style="display: none">${playdownPolicy.playdownPolicy4.nIdPolicyMatchPlaydown}</span></td>
							<td><input type="text" class="form-control"
								id="nIndexPolicyMatchPlaydown4"
								value="${playdownPolicy.playdownPolicy4.nIndexPolicyMatchPlaydown}"></td>
						</tr>
						<tr>
							<td id="tournamentPlaydown5">Menor cantidad de goles en
								contra sin considerar desempates:</td>
							<td><input type="checkbox"
								id="chknIndexPolicyMatchPlaydown5"
								${playdownPolicy.playdownPolicy5 != null ? 'checked' : ''}><span
								id="nIdPolicyMatchPlaydown5" style="display: none">${playdownPolicy.playdownPolicy5.nIdPolicyMatchPlaydown}</span></td>
							<td><input type="text" class="form-control"
								id="nIndexPolicyMatchPlaydown5"
								value="${playdownPolicy.playdownPolicy5.nIndexPolicyMatchPlaydown}"></td>
						</tr>
						<tr>
							<td id="tournamentPlaydown14">Mejor resultado entre ambos:</td>
							<td><input type="checkbox"
								id="chknIndexPolicyMatchPlaydown14"
								${playdownPolicy.playdownPolicy14 != null ? 'checked' : ''}><span
								id="nIdPolicyMatchPlaydown14" style="display: none">${playdownPolicy.playdownPolicy14.nIdPolicyMatchPlaydown}</span></td>
							<td><input type="text" class="form-control"
								id="nIndexPolicyMatchPlaydown14"
								value="${playdownPolicy.playdownPolicy14.nIndexPolicyMatchPlaydown}"></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-1 pull-right">
				<button type="button" class="btn btn-default btnSave">Guardar</button>
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