$(document).ready(function(){
	var images=['/jzimages/001.png',
	            '/jzimages/002.png',
	            '/jzimages/003.png',
	            '/jzimages/004.png',
	            '/jzimages/005.png',];
	
	var randomNumber = Math.floor(Math.random() * images.length);
	var bgImg = 'url(' + images[randomNumber] + ')';
	
	$('body').css({
		'background':bgImg,
		'background-size':'cover'
	});

});
