$(function(){
	$(".toggle-button").on("click", function(){
		$(this).next(".toggle-box").toggle(100);
	});
	$(".toggle-box > div").on("click", function(){
		$(".toggle-box > .selected").removeClass("selected");
		$(this).addClass("selected");
	});
	$(document).pjax("[data-pjax] a, a[data-pjax]", "#main-content");
	if (selectItem){
		$(".toggle-button").click();
		$("#"+selectItem).click();
		$("#"+selectItem+" > a").click();
	}
});

