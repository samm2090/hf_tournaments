/**
 * Set up tournament data
 */

var $tabData;
var $cStatusTournament;
var $cPresentationtxtTournament;
var $nIdTeamPlayer;
var $nIdFootballCategory;
var $nIdSex;
var $dDateTournamentStart;
var $dDateTournamentFinish
var $complexId;
var $nIdCityFieldTournament;
var $nIdFieldType;
var $numberofparticipantstournament;
var $nIdInscriptionType;
var $cPriceTeam;
var $cIsIncludeTax;
var $cEmailTournament;
var $cInscriptionPaymentAdditionalText;
var $cPhoneTournament;
var $cPremiostxtTournament;
var $cDayScheduleTournament;
var $cAdditionaltxtTournament;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables() {
	$tabData = $('#tabData');
	$cStatusTournament = $('#cStatusTournament');
	$cPresentationtxtTournament = $('#cPresentationtxtTournament');
	$nIdTeamPlayer = $('#nIdTeamPlayer');
	$nIdFootballCategory = $('#nIdFootballCategory');
	$nIdSex = $('#nIdSex');
	$dDateTournamentStart = $('#dDateTournamentStart');
	$dDateTournamentFinish = $('#dDateTournamentFinish');
	$complexId = $('#complexId');
	$nIdCityFieldTournament = $('#nIdCityFieldTournament');
	$nIdFieldType = $('#nIdFieldType');
	$numberofparticipantstournament = $('#numberofparticipantstournament');
	$nIdInscriptionType = $('#nIdInscriptionType');
	$cPriceTeam = $('#cPriceTeam');
	$cIsIncludeTax = $('#cIsIncludeTax');
	$cEmailTournament = $('#cEmailTournament');
	$cInscriptionPaymentAdditionalText = $('#cInscriptionPaymentAdditionalText');
	$cPhoneTournament = $('#cPhoneTournament');
	$cPremiostxtTournament = $('#cPremiostxtTournament');
	$cDayScheduleTournament = $('#cDayScheduleTournament');
	$cAdditionaltxtTournament = $('#cAdditionaltxtTournament');
};

function initEvents() {
	tabsEvents();
	$tabData.addClass("active");

	$('.btnSave').click(function() {
		saveData();
	});
};

function saveData() {

	var parameters = {

		cStatusTournament : $cStatusTournament.val(),
		cPresentationtxtTournament : $cPresentationtxtTournament.val(),
		nIdTeamPlayer : $nIdTeamPlayer.val(),
		nIdFootballCategory : $nIdFootballCategory.val(),
		nIdSex : $nIdSex.val(),
		dDateTournamentStart : $dDateTournamentStart.val(),
		dDateTournamentFinish : $dDateTournamentFinish.val(),
		complexId : $complexId.val(),
		nIdCityFieldTournament : $nIdCityFieldTournament.val(),
		nIdFieldType : $nIdFieldType.val(),
		numberofparticipantstournament : $numberofparticipantstournament.val(),
		nIdInscriptionType : $nIdInscriptionType.val(),
		cPriceTeam : $cPriceTeam.val(),
		cIsIncludeTax : $cIsIncludeTax.val(),
		cEmailTournament : $cEmailTournament.val(),
		cInscriptionPaymentAdditionalText : $cInscriptionPaymentAdditionalText
				.val(),
		cPhoneTournament : $cPhoneTournament.val(),
		cPremiostxtTournament : $cPremiostxtTournament.val(),
		cDayScheduleTournament : $cDayScheduleTournament.val(),
		cAdditionaltxtTournament : $cAdditionaltxtTournament.val()
	};

	var successCallBack = function(json) {
		alert(json.message);
	};

	var errorCallback = function() {
		alert('Hubo en error');
	};
	
	ajaxCall('setUpTournament/saveTournamentData', 'POST', parameters,
			successCallBack, errorCallback);
}