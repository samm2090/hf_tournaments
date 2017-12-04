/**
 * Tournament basic parameters
 */

var $tabBasicParameters;

var $nIdPolicyMatchScore;
var $nWinWithoutSupplementaryTime;
var $nLoseWithoutSupplementaryTime;
var $nWinWithSupplementaryTime;
var $nLoseWithSupplementaryTime;
var $nWinWithPenaltyGoals;
var $nLoseWithPenaltyGoals;
var $nWinWithTossUp;
var $nLoseWithTossUp;
var $nGoalsDraw;
var $nWinWithWalkover;
var $nLoseWithWalkover;
var $nWinWithWalkoverGoalAdded;
var $nLoseWithWalkoverGoalAdded;

var $nIdMatchFault;
var $nCardYellowByMatchForCardRedIndirect;
var $nCardYellowAccumulatedForMatchSuspension;
var $nSuspensionForCardRedIndirect;
var $nSuspensionForCardRedDirect;

var $chknIndexPolicyMatchPlaydown3;
var $nIdPolicyMatchPlaydown3;
var $nIndexPolicyMatchPlaydown3;
var chknIndexPolicyMatchPlaydown4;
var $nIdPolicyMatchPlaydown4;
var $nIndexPolicyMatchPlaydown4;
var $chknIndexPolicyMatchPlaydown5;
var $nIdPolicyMatchPlaydown5;
var $nIndexPolicyMatchPlaydown5;
var $chknIndexPolicyMatchPlaydown14;
var $nIdPolicyMatchPlaydown14;
var $nIndexPolicyMatchPlaydown14;

$(document).ready(function() {
	initVariables();
	initEvents();
});

function initVariables() {
	$tabBasicParameters = $('#tabBasicParameters')
	$nIdPolicyMatchScore = $('#nIdPolicyMatchScore');
	$nWinWithoutSupplementaryTime = $('#nWinWithoutSupplementaryTime');
	$nLoseWithoutSupplementaryTime = $('#nLoseWithoutSupplementaryTime');
	$nWinWithSupplementaryTime = $('#nWinWithSupplementaryTime');
	$nLoseWithSupplementaryTime = $('#nLoseWithSupplementaryTime');
	$nWinWithPenaltyGoals = $('#nWinWithPenaltyGoals');
	$nLoseWithPenaltyGoals = $('#nLoseWithPenaltyGoals');
	$nWinWithTossUp = $('#nWinWithTossUp');
	$nLoseWithTossUp = $('#nLoseWithTossUp');
	$nGoalsDraw = $('#nGoalsDraw');
	$nWinWithWalkover = $('#nWinWithWalkover');
	$nLoseWithWalkover = $('#nLoseWithWalkover');
	$nWinWithWalkoverGoalAdded = $('#nWinWithWalkoverGoalAdded');
	$nLoseWithWalkoverGoalAdded = $('#nLoseWithWalkoverGoalAdded');
	$nIdMatchFault = $('#nIdMatchFault');
	$nCardYellowByMatchForCardRedIndirect = $('#nCardYellowByMatchForCardRedIndirect');
	$nCardYellowAccumulatedForMatchSuspension = $('#nCardYellowAccumulatedForMatchSuspension');
	$nSuspensionForCardRedIndirect = $('#nSuspensionForCardRedIndirect');
	$nSuspensionForCardRedDirect = $('#nSuspensionForCardRedDirect');
	$chknIndexPolicyMatchPlaydown3 = $('#chknIndexPolicyMatchPlaydown3');
	$nIdPolicyMatchPlaydown3 = $('#nIdPolicyMatchPlaydown3');
	$nIndexPolicyMatchPlaydown3 = $('#nIndexPolicyMatchPlaydown3');
	chknIndexPolicyMatchPlaydown4 = $('#chknIndexPolicyMatchPlaydown4');
	$nIdPolicyMatchPlaydown4 = $('#nIdPolicyMatchPlaydown4');
	$nIndexPolicyMatchPlaydown4 = $('#nIndexPolicyMatchPlaydown4');
	$chknIndexPolicyMatchPlaydown5 = $('#chknIndexPolicyMatchPlaydown5');
	$nIdPolicyMatchPlaydown5 = $('#nIdPolicyMatchPlaydown5');
	$nIndexPolicyMatchPlaydown5 = $('#nIndexPolicyMatchPlaydown5');
	$chknIndexPolicyMatchPlaydown14 = $('#chknIndexPolicyMatchPlaydown14');
	$nIdPolicyMatchPlaydown14 = $('#nIdPolicyMatchPlaydown14');
	$nIndexPolicyMatchPlaydown14 = $('#nIndexPolicyMatchPlaydown14');
};

function initEvents() {
	tabsEvents();
	$tabBasicParameters.addClass("active");

	$('.btnSave').click(function() {
		savePolicies();
	});
};

function savePolicies() {
	var tournamentPolicyScore = {
		'nIdPolicyMatchScore' : $nIdPolicyMatchScore.html(),
		'nWinWithoutSupplementaryTime' : $nWinWithoutSupplementaryTime.val(),
		'nLoseWithoutSupplementaryTime' : $nLoseWithoutSupplementaryTime.val(),
		'nWinWithSupplementaryTime' : $nWinWithSupplementaryTime.val(),
		'nLoseWithSupplementaryTime' : $nLoseWithSupplementaryTime.val(),
		'nWinWithPenaltyGoals' : $nWinWithPenaltyGoals.val(),
		'nLoseWithPenaltyGoals' : $nLoseWithPenaltyGoals.val(),
		'nWinWithTossUp' : $nWinWithTossUp.val(),
		'nLoseWithTossUp' : $nLoseWithTossUp.val(),
		'nGoalsDraw' : $nGoalsDraw.val(),
		'nWinWithWalkover' : $nWinWithWalkover.val(),
		'nLoseWithWalkover' : $nLoseWithWalkover.val(),
		'nWinWithWalkoverGoalAdded' : $nWinWithWalkoverGoalAdded.val(),
		'nLoseWithWalkoverGoalAdded' : $nLoseWithWalkoverGoalAdded.val()
	};

	var tournamentPolicyFault = {
		'nIdMatchFault' : $nIdMatchFault.html(),
		'nCardYellowByMatchForCardRedIndirect' : $nCardYellowByMatchForCardRedIndirect
				.val(),
		'nCardYellowAccumulatedForMatchSuspension' : $nCardYellowAccumulatedForMatchSuspension
				.val(),
		'nSuspensionForCardRedIndirect' : $nSuspensionForCardRedIndirect.val(),
		'nSuspensionForCardRedDirect' : $nSuspensionForCardRedDirect.val()
	};

	var playdownPolicy = {
		'policyMatchPlaydown3' : {
			'chknIndexPolicyMatchPlaydown' : $chknIndexPolicyMatchPlaydown3
					.is(':checked'),
			'nIdPolicyMatchPlaydown' : $nIdPolicyMatchPlaydown3.html(),
			'nIndexPolicyMatchPlaydown' : $nIndexPolicyMatchPlaydown3.val()
		},
		'policyMatchPlaydown4' : {
			'chknIndexPolicyMatchPlaydown' : chknIndexPolicyMatchPlaydown4
					.is(':checked'),
			'nIdPolicyMatchPlaydown' : $nIdPolicyMatchPlaydown4.html(),
			'nIndexPolicyMatchPlaydown' : $nIndexPolicyMatchPlaydown4.val()
		},
		'policyMatchPlaydown5' : {
			'chknIndexPolicyMatchPlaydown' : $chknIndexPolicyMatchPlaydown5
					.is(':checked'),
			'nIdPolicyMatchPlaydown' : $nIdPolicyMatchPlaydown5.html(),
			'nIndexPolicyMatchPlaydown' : $nIndexPolicyMatchPlaydown5.val()
		},
		'policyMatchPlaydown14' : {
			'chknIndexPolicyMatchPlaydown' : $chknIndexPolicyMatchPlaydown14
					.is(':checked'),
			'nIdPolicyMatchPlaydown' : $nIdPolicyMatchPlaydown14.html(),
			'nIndexPolicyMatchPlaydown' : $nIndexPolicyMatchPlaydown14.val()
		}
	};

	var parameters = {
		'tournamentPolicyScore' : tournamentPolicyScore,
		'tournamentPolicyFault' : tournamentPolicyFault,
		'playdownPolicy' : playdownPolicy
	};

	var successCallBack = function(json) {
		alert(json.message);
	};

	var errorCallback = function() {
		alert('Hubo en error');
	};
	console.log(parameters);
	ajaxCall('setUpTournament/saveTournamentPolicies', 'POST', parameters,
			successCallBack, errorCallback);
}