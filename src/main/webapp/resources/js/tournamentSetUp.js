/**
 * Set up tournament data
 */

var $tabData;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables(){
	$tabData = $('#tabData');
};

function initEvents(){
	tabsEvents();
	$tabData.addClass("active");
};