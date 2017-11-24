/**
 * Tournament Multimedia
 */

var $tabMultimedia;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables(){
	$tabMultimedia = $('#tabMultimedia')
};

function initEvents(){
	tabsEvents();
	$tabMultimedia.addClass("active");
};