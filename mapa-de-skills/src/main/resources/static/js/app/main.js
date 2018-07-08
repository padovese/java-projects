$(document).ready(function() {
    setLinkGithub();
    setClassMenu();
});

function setLinkGithub(){
	$('.link-github').attr('href', 'http://www.github.com/padovese');
}

function setClassMenu(){
	if($('#menu').text() === 'DASHBOARD'){
		$("#menu1").addClass("active");
	    $("#menu2").removeClass("active");
	} else if ($('#menu').text() === 'MAPA DE SKILLS'){
		$("#menu1").removeClass("active");
	    $("#menu2").addClass("active");
	}
}