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
	var nIdPhaseTournament = $('.nIdPhaseTournament').val();
	var cNamePhaseTournament = $('.cNamePhaseTournament');
	$('.stageType').val();
	$('.nQuantityTeams').val();
	$('.nQuantityWinnersPhase').val();
	$('.dragCards').val();
	$('.dragSuspensions').val();
	$('.cDescriptionPhase').val();

	console.log(cNamePhaseTournament);
}
