/**
 * Fill up tournament menu
 */

function tabsEvents() {
	$('#tabTeams').click(function() {
		location.href = 'fillTournament';
	});
	
	$('#tabGroups').click(function() {
		location.href = 'tournamentGroups';
	});
	
	$('#tabSchedule').click(function() {
		location.href = 'tournamentSchedule';
	});
	
	$('#tabResults').click(function() {
		location.href = 'tournamentResults';
	});
	
	$('#tabQualifiers').click(function() {
		location.href = 'tournamentQualifiers';
	});
}

