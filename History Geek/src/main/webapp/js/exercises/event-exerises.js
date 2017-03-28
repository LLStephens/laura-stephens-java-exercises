/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {
	var x = 0;
	var y = 0;
	
	
	var max = window.location.pathname.split('/');
	var maxX = max[4]-1;
	var maxY = max[4]-1;
	
	$("#btnRestart").on( "click", function() {
		$("#game h2").html("Pirate Explorer");
		moveShip(function(){x=0, y=0});
	});
			
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
		if ($(selector()).hasClass('treasure')){
			$("#game h2").html("You win");
			return true;
		}else if($(selector()).hasClass('pirate')){
			$("#game h2").html("You lose. Click the restart button to try again.");
			moveShip(function(){x=0, y=0});
		} else if(!$(selector()).hasClass('iceberg')){
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
	   var tax = parseFloat($('#tax .price').text().substring(1));
	   var grandTotal = (subtotal + price + tax).toFixed(2);
	   $('#shipping .price').text("$"+price);
	   $('#grandtotal .price').text("$"+grandTotal);
	});
	
	
	
	
	
});