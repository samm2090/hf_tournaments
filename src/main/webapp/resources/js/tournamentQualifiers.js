/**
 * Tournament qualifiers
 */

var $tabQualifiers;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables(){
	$tabQualifiers = $('#tabQualifiers');
};

function initEvents(){
	tabsEvents();
	$tabQualifiers.addClass("active");
};