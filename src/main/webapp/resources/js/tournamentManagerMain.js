/**
 * Tournament Manager Main
 */

var $tbMytournaments;
var $modalSelectOption;
var $btnRegister;
var $btnSetUp;
var nIdTournament;

$(document).ready(function() {
	initVariables();
	initEvents();
	listTournaments();
});

function initVariables() {
	$tbMytournaments = $('#tbMytournaments');
	$modalSelectOption = $('#modalSelectOption');
	$btnRegister = $('#btnRegister');
	$btnSetUp = $('#btnSetUp');
}

function listTournaments() {
	$tbMytournaments.DataTable({
		'language' : {
			'url' : 'resources/libs/DataTables/language/spanish.json'
		}
	});

	$('.btn-active').hover(function() {
		hoverButtonActive(this);
	}, function() {
		hoverButtonInactive(this);
	});

	$('.btn-inactive').hover(function() {
		hoverButtonInactive(this);
	}, function() {
		hoverButtonActive(this);
	});
}

function initEvents() {
	$tbMytournaments.find('tbody tr').click(function() {
		$modalSelectOption.modal('show');
		nIdTournament = $(this).find('span').text();
	});

	$btnSetUp.click(function() {
		var parameter = {
			'nIdTournament' : nIdTournament
		};
		postRedirect('setUpTournament', parameter);
	});

	$btnRegister.click(function() {
		var parameter = {
			'nIdTournament' : nIdTournament
		};
		postRedirect('fillTournament', parameter);
	});
}
function hoverButtonActive(button) {
	$(button).find('span').removeClass('glyphicon-eye-open');
	$(button).find('span').addClass('glyphicon-eye-close');
}

function hoverButtonInactive(button) {
	$(button).find('span').removeClass('glyphicon-eye-close');
	$(button).find('span').addClass('glyphicon-eye-open');
}