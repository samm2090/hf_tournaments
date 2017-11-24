/**
 * Tournament fill up (Temas and Players)
 */

var $tabTeams;
var $tbTournamentTeams;
var $modalCreateTeam;
var $btnCreateTeam;
var $modalPlayersList;
var $btnCreatePlayer;
var $tbTeamPlayers;
var $modalCreatePlayer;

function initVariables() {
	$tabTeams = $('#tabTeams');
	$tbTournamentTeams = $('#tbTournamentTeams');
	$modalCreateTeam = $('#modalCreateTeam');
	$btnCreateTeam = $('#btnCreateTeam');
	$modalPlayersList = $('#modalPlayersList');
	$btnCreatePlayer = $('#btnCreatePlayer');
	$tbTeamPlayers = $('#tbTeamPlayers');
	$modalCreatePlayer = $('#modalCreatePlayer');
}

$(document).ready(function() {
	initVariables();
	initEvents();
	listTournaments();
})

function initEvents() {
	tabsEvents();
	$tabTeams.addClass('active');
	
	$btnCreateTeam.click(function() {
		$modalCreateTeam.modal('show');
	});
	
	$btnCreatePlayer.click(function(){
		$modalCreatePlayer.modal('show');
	});
}

function listTournaments() {
	$tbTournamentTeams.DataTable({
		'language' : {
			'url' : 'resources/libs/DataTables/language/spanish.json'
		}
	});
}

function playersList() {
	$modalPlayersList.modal('show');
}