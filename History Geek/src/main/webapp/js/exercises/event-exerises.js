/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {
	var x = 0;
	var y = 0;
	
	var maxX = 9;
	var maxY = 9;
	
	$(document).on('keydown', function(event) {
		if(event.key === "ArrowRight"){
			if(x<maxX){
				if(checkForObstacle(NextXPosSelector)){
					moveShip(function(){x++});
				}
			}
		}else if(event.key === "ArrowLeft"){
			if(x>0){
				if(checkForObstacle(NextXNegSelector)){
					moveShip(function(){x--});
				}
			}
		}else if(event.key === "ArrowDown"){
			if(y<maxY){
				if(checkForObstacle(NextYPosSelector)){
					moveShip(function(){y++});
				}
			}
		}else if(event.key === "ArrowUp"){
			if(y>0){
				if(checkForObstacle(NextYNegSelector)){
					moveShip(function(){y--});
				}
			}
		}
		if($('#gameboard').length){
			return false;
		}
	});
	
	function PosSelector(){
		return '#row_'+y+'_column_'+x;
	}
	
	function NextXPosSelector(){
		return '#row_'+y+'_column_'+(x+1);
	}
	
	function NextXNegSelector(){
		return '#row_'+y+'_column_'+(x-1);
	}
	
	function NextYPosSelector(){
		return '#row_'+(y+1)+'_column_'+x;
	}
	
	function NextYNegSelector(){
		return '#row_'+(y-1)+'_column_'+x;
	}
	
	function moveShip(modifier){
		$(PosSelector()).removeClass('ship');
		modifier();
		$(PosSelector()).addClass('ship');
	}
	
	function checkForObstacle(selector){
		if(!$(selector()).hasClass('iceberg') && !$(selector()).hasClass('pirate')){
			return true;
		}
	}
	
	var checkBox = $("#SameShipping");
	checkBox.on("click", function (event) {
	   if((this).checked){
		$('#ShippingAddress1').val($('#BillingAddress1').val());
		$('#ShippingAddress2').val($('#BillingAddress2').val());
		$('#ShippingCity').val($('#BillingCity').val());
		$('#ShippingState').val($('#BillingState').val());
		$('#ShippingPostalCode').val($('#BillingPostalCode').val());
	   }
	});
	
	var shippingPrice = $("#shipping-info input");
	shippingPrice.on("click", function (event) {
	   var price = parseFloat($(this).attr("data-cost"));
	   var subtotal = parseFloat($('#subtotal .price').text().substring(1));
	   var grandTotal = (subtotal + price);
	   $('#shipping .price').text("$"+price);
	   $('#grandtotal .price').text("$"+grandTotal);
	});
	
	
	
	
	
});