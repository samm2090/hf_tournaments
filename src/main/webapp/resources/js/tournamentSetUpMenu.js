/**
 * Set up tournament menu
 */

function tabsEvents(){
	$('#tabData').click(function(){
		location.href= 'tournamentData';
	});
	
	$('#tabMultimedia').click(function(){
		location.href= 'tournamentMultimedia';
	});
	
	$('#tabStructure').click(function(){
		location.href= 'tournamentStructure';
	});
	
	$('#tabBasicParameters').click(function(){
		location.href= 'tournamentBasicParameters';
	});
}

