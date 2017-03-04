$(function(){
	//solving the active link problem
	switch(menu)
	{
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Products':
		$('#products').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
	}
});