/**
 * Tournament results
 */

var $tabResults;
var $modalMatchDetail;
var $btnSuspensions;
var $modalSuspensions;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables(){
	$tabResults = $('#tabResults');
	$modalMatchDetail = $('#modalMatchDetail');
	$btnSuspensions = $('#btnSuspensions');
	$modalSuspensions = $('#modalSuspensions');
};

function initEvents(){
	tabsEvents();
	$tabResults.addClass("active");
	
	$btnSuspensions.click(function(){
		$modalSuspensions.modal('show');
	});
};

function matchDetail(){
	$modalMatchDetail.modal('show');
}