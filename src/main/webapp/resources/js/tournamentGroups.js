/**
 * Tournament groups
 */

var $tabGroups;
var $tabCreateGroups;
var $tabAsignTeams;
var $divCreateGroups;
var $divAsignTeams;
var $tbGroups;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables() {
	$tabGroups = $('#tabGroups');
	$tabCreateGroups = $('#tabCreateGroups');
	$tabAsignTeams = $('#tabAsignTeams');
	$divCreateGroups = $('#divCreateGroups');
	$divAsignTeams = $('#divAsignTeams');
	$tbGroups = $('#tbGroups');
}

function activateCreateGroups() {
	$tabAsignTeams.removeClass('active');
	$tabCreateGroups.addClass('active');
	$divAsignTeams.fadeOut();
	$divCreateGroups.fadeIn();
}

function activateAsignTeams() {
	$tabCreateGroups.removeClass('active');
	$tabAsignTeams.addClass('active');
	$divAsignTeams.fadeIn();
	$divCreateGroups.fadeOut();
}

function initEvents() {
	tabsEvents();
	$tabGroups.addClass('active');
	
	$tabCreateGroups.click(function() {
		$tabAsignTeams.removeClass('active');
		$tabCreateGroups.addClass('active');
		$divAsignTeams.fadeOut();
		$divCreateGroups.fadeIn();
	});

	$tabAsignTeams.click(function() {
		$tabCreateGroups.removeClass('active');
		$tabAsignTeams.addClass('active');
		$divAsignTeams.fadeIn();
		$divCreateGroups.fadeOut();
	});
}