$(function(){
	$('.wrapper').hover(function(){
		$(this).children().stop().animate({marginTop: '100%',opacity: 0},600);
	},function(){
		$(this).children().stop().animate({marginTop: '0%',opacity: 1},600);
	})

	$('#nav li').hover(function(){
		$(this).children('ul').stop(false,true).fadeIn(300);
		$(this).children('a').addClass('selected');
	},function(){
		$(this).children('ul').stop(false,true).fadeOut(300);
		$(this).children('a').removeClass('selected');
	})

})
