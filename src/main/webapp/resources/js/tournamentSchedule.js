/**
 * Tournament schedule
 */

var $tabSchedule;
var $tabPlanning;
var $tabProgramming;
var $tabTimeTable;
var $divPlanning;
var $divProgramming;
var $divTimeTable;
var $modalCreateTeam;
var $modalDownloadSpreadsheet;
var $btnGenerateSpreadsheet;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables() {
	$tabSchedule = $('#tabSchedule');
	$tabPlanning = $('#tabPlanning');
	$tabProgramming = $('#tabProgramming');
	$tabTimeTable = $('#tabTimeTable');
	$divPlanning = $('#divPlanning');
	$divProgramming = $('#divProgramming');
	$divTimeTable = $('#divTimeTable');
	$modalCreateTeam = $('#modalCreateTeam');
	$modalDownloadSpreadsheet = $('#modalDownloadSpreadsheet');
	$btnGenerateSpreadsheet = $('#btnGenerateSpreadsheet');
};

function initEvents() {
	tabsEvents();
	$tabSchedule.addClass("active");

	$btnGenerateSpreadsheet.click(function(){
		$modalDownloadSpreadsheet.modal('show');
	});
}

function createField() {
	$modalCreateTeam.modal('show');
}

function activatePlanning() {
	$tabProgramming.removeClass('active');
	$tabTimeTable.removeClass('active');
	$tabPlanning.addClass('active');
	$divProgramming.fadeOut();
	$divTimeTable.fadeOut();
	$divPlanning.fadeIn();
}

function activateProgramming() {
	$tabPlanning.removeClass('active');
	$tabTimeTable.removeClass('active');
	$tabProgramming.addClass('active');
	$divTimeTable.fadeOut();
	$divPlanning.fadeOut();
	$divProgramming.fadeIn();
}

function activateTimeTable() {
	$tabPlanning.removeClass('active');
	$tabProgramming.removeClass('active');
	$tabTimeTable.addClass('active');
	$divPlanning.fadeOut();
	$divProgramming.fadeOut();
	$divTimeTable.fadeIn();
}