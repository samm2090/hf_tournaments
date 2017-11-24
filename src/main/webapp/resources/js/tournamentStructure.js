/**
 * Tournament structure
 */

var $tabStructure;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables(){
	$tabStructure = $('#tabStructure')
};

function initEvents(){
	tabsEvents();
	$tabStructure.addClass("active");
};