$('.js-button-campaign').click(function() { 
	$('.card').css('filter','blur(5px)');
	$('.bgvideo').css('filter','blur(5px)');

	$('.js-overlay-campaign').fadeIn();
	$('.js-overlay-campaign').addClass('disabled');
});

// закрыть на крестик
$('.js-close-campaign').click(function() { 
	$('.js-overlay-campaign').fadeOut();
	$('.card').css('filter','none');
	$('.bgvideo').css('filter','none');
});

// закрыть по клику вне окна
$(document).mouseup(function (e) { 
	var popup = $('.js-popup-campaign');
	if (e.target!=popup[0]&&popup.has(e.target).length === 0){
		$('.js-overlay-campaign').fadeOut();
		$('.card').css('filter','none');
		$('.bgvideo').css('filter','none');		
	}
});