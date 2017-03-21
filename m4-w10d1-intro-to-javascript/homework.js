window.onload = function(){
	console.log("Sum Double");
	console.log(sumDouble(1,2));
	console.log(sumDouble(3,2));
	console.log(sumDouble(2,2));
	
	function sumDouble(x,y){
		if(x === y){
			return (x+y) * 2;
		} else {
			return x+y;
		}
	}
	
	console.log("Has Teen");
	console.log(hasTeen(13, 20, 10));
	console.log(hasTeen(20, 19, 10));
	console.log(hasTeen(20, 10, 13));
	console.log(hasTeen(20, 10, 42));
	
	function hasTeen(a, b, c){
		
		function isTeen(z) {
			return z >=13 && z<=19;
		}
		
		for(var i = 0; i < arguments.length; i++){
			if(isTeen(arguments[i])){
				return true;
			}
		}
		
		// if(isTeen(a)){
// 			return true;
// 		}
// 		if(b>=13 && b<=19){
// 			return true;
// 		}
// 		if(c>=13 && c<=19){
// 			return true;
// 		}
		return false;
	}
	
	console.log("Last Digit");
	console.log(lastDigit(7, 17));
	console.log(lastDigit(6, 17));
	console.log(lastDigit(3, 113));
	
	function lastDigit(a, b){
		if(a.toString().slice(-1) === b.toString().slice(-1)){
			return true;
		}
	}
	
	console.log("See Color");
	console.log(seeColor("redxx"));
	console.log(seeColor("xxred"));
	console.log(seeColor("blueTimes"));
	
	function seeColor(str){
		if(str.slice(0,3) === "red"){
			return "red";
		}
		if(str.slice(0,4)==="blue"){
			return "blue";
		}
		return " ";
		}
	
	
	console.log("MiddleThree");
	console.log(middleThree("Candy"));
	console.log(middleThree("and"));
	console.log(middleThree("Solving"));
	
	function middleThree(str){
		return str.slice(str.length/2-1, str.length/2+2);
	}
	
	console.log("Front Again");
	console.log(frontAgain("edited"));
	console.log(frontAgain("edit"));
	console.log(frontAgain("ed"));
	
	function frontAgain(str){
		if(str.slice(-2)==str.slice(0,2)){
			return true;
		}
		return false;
	}
	
	console.log("Alarm Clock");
	console.log(alarmClock(1, false));
	console.log(alarmClock(5, true));
	console.log(alarmClock(0, false));
	
	function alarmClock(a, x){
		var arr = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
		if(x===true || (a===0 || a===6)){
			return arr[a]+ " 10:00";
		}
		return arr[a] + " 7:00";
	}
	
	console.log("Make Middle");
	console.log(makeMiddle([1,2,3,4]));
	console.log(makeMiddle([7,1,2,3,4,9]));
	console.log(makeMiddle([1,2]));
		
	function makeMiddle(arr){
		if(arr.length>=2 && arr.length%2==0){
			return arr.slice(arr.length/2-1, arr.length/2+1)
		}
		return " ";
		}
		
	console.log("Odd Only");
	console.log(oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]));
	console.log(oddOnly([2, 4, 8, 32, 256]));
		
	function oddOnly(arr){
		var oddArr = new Array;
		for(var i =0; i<arr.length; i++){
			if(arr[i]%2===1){
				oddArr.push(arr[i]);
			}
		}
		return oddArr;
	}
	
	console.log("Weave");
	console.log(weave([1, 3, 5], [2, 4]));
	console.log(weave([1, 3, 5], [2, 4, 6, 8]));
	
	function weave(arr1, arr2){
		var arr = new Array;
		if(arr1.length>arr2.length){
			for(var i = 0; i<arr2.length; i++){
				arr.push(arr1[i]);
				arr.push(arr2[i]);
			}
			arr.push(Number.parseInt(arr1.slice(arr2.length)));
		}
		if(arr1.length<arr2.length){
			for(var i = 0; i<arr1.length; i++){
				arr.push(arr1[i]);
				arr.push(arr2[i]);
			}
			arr.push(Number.parseInt(arr2.slice(arr1.length)));
		}
		return arr;
		
	}
	
	console.log("Cigar Party");
	console.log(cigarParty(30, false));
	console.log(cigarParty(50, false));
	console.log(cigarParty(70, true));
		
	function cigarParty(a, x){
		if(a>40){
			if(x===false && a<60){
				return true;
			}
			return true;
		}
		return false;
	}
	
	console.log("String Splosion");
	console.log(stringSplosion("Code"));
	console.log(stringSplosion("supercalifragilisticexpialidocious"));
	
	function stringSplosion(str){
		var word = "";
		for(var i = 0; i<str.length+1; i++){
			for(var j = 0; j<i; j++){
				word += str.charAt(j);
			}
		}
		return word;
	}
	
	console.log("FizzBuzz");
	console.log(fizzBuzz());
	
	function fizzBuzz(){
		var list = new Array;
		for(var i = 1; i<100; i++){
			if(i%15===0){
				list.push("FizzBuzz");
			}else if(i%3==0){
				list.push("Fizz");
			}else if(i%5==0){
				list.push("Buzz");
			}else{
				list.push(i);
			}
		} return list;
	
	}
	
	console.log("Count Values");
	console.log(countValues([1, 99, 43, 2, 55, 78, 99, 2345, 438, 2, 99, 107]));
	
	function countValues(arr){
		var myMap = new Map();
		for(var i = 0; i<arr.length; i++){
			if(!myMap.has(arr[i])){
				myMap.set(arr[i], 1);
			}else {
				var count = myMap.get(arr[i]);
				++count;
				myMap.set(arr[i], count);

			}
		} return myMap;
		
	}
	
	console.log("Reverse Array");
	console.log(reverseArray([1, 99, 43, 2, 55, 78, 99, 2345, 438, 2, 99, 107]));
	
	function reverseArray(arr){
		var revArr = new Array;
		while(arr.length > 0){
			revArr.push(arr.pop());
		}
		return revArr;
	} 
	
	console.log("Blackjack");
	console.log(blackjack(19, 21));
	console.log(blackjack(21, 19));
	console.log(blackjack(19, 22));
	console.log(blackjack(22, 22));
	
	function blackjack(a,b){
		if(a <=21 && b <=21){
			return Math.max(a,b);
		}else if(a<=21){
			return a;
		}else if(b<=21){
			return b;
		}
		return 0;
	}
	
	
}