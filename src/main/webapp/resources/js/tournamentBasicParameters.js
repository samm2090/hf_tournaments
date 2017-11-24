/**
 * Tournament basic parameters
 */

var $tabBasicParameters;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables(){
	$tabBasicParameters = $('#tabBasicParameters')
};

function initEvents(){
	tabsEvents();
	$tabBasicParameters.addClass("active");
};