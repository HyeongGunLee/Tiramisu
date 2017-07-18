$('input[type="submit"]').mousedown(function(){
  $(this).css('background', '#FDBB2C');
});
$('input[type="submit"]').mouseup(function(){
  $(this).css('background', '#FDBB2C');
});

$('#loginform').click(function(){
  $('.login').fadeToggle('slow');
  $(this).toggleClass('green');
});

$('#signUpForm').click(function(){
	  $('.signUp').fadeToggle('slow');
	  $(this).toggleClass('green');
	});



$(document).mouseup(function (e)
{
    var container = $(".login");

    if (!container.is(e.target) // if the target of the click isn't the container...
        && container.has(e.target).length === 0) // ... nor a descendant of the container
    {
        container.hide();
        $('#loginform').removeClass('green');
    }
});




	$(document).mouseup(function (e)
	{
	    var container = $(".signUp");

	    if (!container.is(e.target) // if the target of the click isn't the container...
	        && container.has(e.target).length === 0) // ... nor a descendant of the container
	    {
	        container.hide();
	        $('#signUpForm').removeClass('green');
	    }
	});