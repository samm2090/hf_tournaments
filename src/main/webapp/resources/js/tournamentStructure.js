/**
 * Tournament structure
 */

var $tabStructure;
var $divPhases;
var $btnAddPhase;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables() {
	$tabStructure = $('#tabStructure');
	$divPhases = $('#divPhases');
	$btnAddPhase = $('#btnAddPhase');
};

function initEvents() {
	tabsEvents();
	$tabStructure.addClass("active");

	$btnAddPhase.click(function() {
		lastPhase++;
		$divPhases.append('<div class="col-md-12">' + '<div class="row">'
				+ '<div class="col-md-2 col-md-offset-1">' + 'Fase '
				+ lastPhase
				+ ': <input type="text" class="form-control">'
				+ '</div>'
				+ '<div class="col-md-2">'
				+ 'Modalidad: <select class="form-control">'
				+ '<option value="1">Grupos</option>'
				+ '<option value="2">Playoff</option>'
				+ '</select>'
				+ '</div>'
				+ '<div class="col-md-2">'
				+ '# Equipos: <input type="text" class="form-control">'
				+ '</div>'
				+ '<div class="col-md-2">'
				+ '# Clasificados:<input type="text" class="form-control">'
				+ '</div>'
				+ '<div class="col-md-1">'
				+ 'Arrastra Tarjetas? <select class="form-control">'
				+ '<option value="no">No</option>'
				+ '<option value="yes">Sí</option>'
				+ '</select>'
				+ '</div>'
				+ '<div class="col-md-1">'
				+ 'Arrastra Suspensiones? <select class="form-control">'
				+ '<option value="no">No</option>'
				+ '<option value="yes">Sí</option>'
				+ '</select>'
				+ '</div>'
				+ '</div>'
				+ '<div class="row">'
				+ '<div class="col-md-12">'
				+ 'Comentario (*):'
				+ '<textarea class="form-control" rows="3"></textarea>'
				+ '</div>' + '</div>' + '</c:forEach>' + '</div>');
	});

	$('.btnSave').click(function() {
		saveStructure();
	});
}

function saveStructure() {
	var $divPhase = $('.divPhase');
	var tournamentPhases = [];

	$
			.each($divPhase,
					function(i, div) {
						var $phase = $(div);

						var nIdPhaseTournament = $phase.find(
								'.nIdPhaseTournament').html();
						var nIdStage = $phase.find('.nIdStage').html();
						var cNamePhaseTournament = $phase.find(
								'.cNamePhaseTournament').val();
						var stageType = $phase.find(
								'.stageType option:selected').val();
						var nQuantityTeams = $phase.find('.nQuantityTeams')
								.val();
						var nQuantityWinnersPhase = $phase.find(
								'.nQuantityWinnersPhase').val();
						var dragCards = $phase.find(
								'.dragCards option:selected').val();
						var dragSuspensions = $phase.find(
								'.dragSuspensions option:selected').val();
						var cDescriptionPhase = $phase.find(
								'.cDescriptionPhase').val();

						var phase = {
							'nIdPhaseTournament' : nIdPhaseTournament,
							'nIdStage' : nIdStage,
							'cNamePhaseTournament' : cNamePhaseTournament,
							'nQuantityTeams' : nQuantityTeams,
							'nQuantityWinnersPhase' : nQuantityWinnersPhase,
							'cDescriptionPhase' : cDescriptionPhase
						};

						var extraData = {
							'stageType' : stageType,
							'dragCards' : dragCards,
							'dragSuspensions' : dragSuspensions
						};

						var tournamentPhase = {
							'phase' : phase,
							'extraData' : extraData
						}

						tournamentPhases.push(tournamentPhase);
					});

	var successCallBack = function(json) {
		alert(json.message);
	};

	var errorCallback = function(a, b, c) {
		alert('Hubo en error');
		console.log(a);
		console.log(b);
		console.log(c);
	};

	var data = {
		'tournamentPhases' : tournamentPhases
	}

	ajaxCall('setUpTournament/saveTournamentPhases', 'POST', data,
			successCallBack, errorCallback);
}
