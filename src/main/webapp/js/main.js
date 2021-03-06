/*
  Halcyonic by HTML5 UP
  html5up.net | @ajlkn
  Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
*/

(function($) {

  skel.breakpoints({
      desktop: '(min-width: 737px)',
      tablet: '(min-width: 737px) and (max-width: 1200px)',
      mobile: '(max-width: 736px)'
  }).viewport({
    breakpoints: {
      tablet: {
        width: 1080
      }
    }
  });

  $(function() {

	$("#header").load("/raisin/common/header.html", function(response, status, xhr) {
		// Off-Canvas Navigation.

	    // Title Bar.
	    $(
	      '<div id="titleBar">' +
	        '<a href="#navPanel" class="toggle"></a>' +
	        '<span class="title">' + $('#logo').html() + '</span>' +
	      '</div>'
	    ).appendTo($body);

	    // Navigation Panel.
	    $(
	      '<div id="navPanel">' +
	        '<nav>' +
	         $('#nav').navList() +
	        '</nav>' +
	      '</div>'
	    ).appendTo($body).panel({
	      delay: 500,
	      hideOnClick: true,
	      hideOnSwipe: true,
	      resetScroll: true,
	      resetForms: true,
	      side: 'left',
	      target: $body,
	      visibleClass: 'navPanel-visible'
	    });

	    // Fix: Remove navPanel transitions on WP<10 (poor/buggy performance).
	    if (skel.vars.os == 'wp' && skel.vars.osVersion < 10)
	    $('#titleBar, #navPanel, #page-wrapper').css('transition', 'none');
	});
	$("#copyright").load("/raisin/common/footer.html");

    var $window = $(window),
    $body = $('body');

    // Fix: Placeholder polyfill.
    $('form').placeholder();

    // Prioritize "important" elements on mobile.
    skel.on('+mobile -mobile', function() {
      $.prioritize(
        '.important\\28 mobile\\29',
        skel.breakpoint('mobile').active
      );
    });

  });

})(jQuery);

function click_Company(){
  var companyBtn = $('<form>').attr({
	action: '/raisin/app/Company',
    method : 'post',
  });
  companyBtn.appendTo('body');
  companyBtn.submit();
}

function click_Home(){
  var homeBtn = $('<form>').attr({
	action: '/raisin/app/Home',
    method : 'post',
  });
  homeBtn.appendTo('body');
  homeBtn.submit();
}

function click_Product(){
  var productBtn = $('<form>').attr({
	action: '/raisin/app/Product',
    method : 'post',
  });
  productBtn.appendTo('body');
  productBtn.submit();
}

function click_Recruit(){
  var recruitBtn = $('<form>').attr({
	action: '/raisin/app/Recruit',
    method : 'post',
  });
  recruitBtn.appendTo('body');
  recruitBtn.submit();
}

function click_Map(){
  var mapBtn = $('<form>').attr({
	action: '/raisin/app/Map',
    method : 'post',
  });
  mapBtn.appendTo('body');
  mapBtn.submit();
}

function click_Sec1(){
  var sec1Btn = $('<form>').attr({
	action: '/raisin/app/Sec1',
    method : 'post',
  });
  sec1Btn.appendTo('body');
  sec1Btn.submit();
}

function click_Sec2(){
  var sec2Btn = $('<form>').attr({
	action: '/raisin/app/Sec2',
    method : 'post',
  });
  sec2Btn.appendTo('body');
  sec2Btn.submit();
}