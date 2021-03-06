package com.techelevator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 * 
	 * Rhino -> Crash Giraffe -> Tower Elephant -> Herd Lion -> Pride Crow ->
	 * Murder Pigeon -> Kit Flamingo -> Pat Deer -> Herd Dog -> Pack Crocodile
	 * -> Float
	 *
	 * animalGroupName("giraffe") → "Tower" animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		return "string";
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage
	 * if the item is on sale. If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20 "GARAGE1070" -> 0.15 "LIVINGROOM" -> 0.10
	 * "KITCHEN6073" -> 0.40 "BEDROOM3434" -> 0.60 "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001",
	 * "Kitchen4001", and "KITCHEN4001" should all return 0.20.
	 * 
	 * isItOnSale("kitchen4001") → 0.20 isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15 isItOnSale("dungeon9999") → 0.00
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
			return 0.0;
	}

	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0
	 * money, transfer half of it to "Paul", but only if Paul has less than
	 * $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ...
	 * $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul":
	 * 1099} robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000,
	 * "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		Map<String, Integer> map = new HashMap<>();
		return map;
	}


	/*
	 * Modify and return the given map as follows: if "Peter" has $50 or more,
	 * AND "Paul" has $100 or more, then create a new "PeterPaulPartnership"
	 * worth a combined contribution of a quarter of each partner's current
	 * worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750,
	 * "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter":
	 * 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		Map<String, Integer> map = new HashMap<>();
		return map;
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> where
	 * for every different string in the array, there is a key of its first
	 * character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g":
	 * "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> map = new HashMap<>();
		return map;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for
	 * each different string, with the value the number of times that string
	 * appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {} wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> map = new HashMap<>();
		return map;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key
	 * for each int, with the value the number of times that int appears in the
	 * array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55:
	 * 1, 63: 3, 77: 1, 99:2} integerCount([107, 33, 107, 33, 33, 33, 106, 107])
	 * → {33: 4, 106: 1, 107: 3} integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> map = new HashMap<>();
		return map;
	}
	

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each
	 * different string is a key and value is true only if that string appears 2
	 * or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a":
	 * true} wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a":
	 * false} wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> map = new HashMap<>();
		return map;
	}
	

	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map,
	 * Map<String, Integer> where keys in Map2, and their Integer values, are
	 * added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 * 
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11,
	 * "SKU4": 5}) → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> map = new HashMap<>();
		return map;
	}

	/*
	 * Just when you thought it was safe to get back in the water ---
	 * last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of
	 * times that a substring length 2 appears in the string and also as the
	 * last 2 chars of the string, so "hixxxhi" yields 1.
	 * 
	 * We don't count the end substring, but the substring may overlap a prior
	 * position by one. For instance, "xxxx" has a count of 2, one pair at
	 * position 0, and the second at position 1. The third pair at position 2 is
	 * the end substring, which we don't count.
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and
	 * its last2 count.
	 * 
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1,
	 * "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		Map<String, Integer> map = new HashMap<>();
		return map;
	}
}
////********************ANSWERS
//
///*
// * Dictionary/Map Exercises
// */
//
///*
// * Given the name of an animal, return the name of a group of that animal
// * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
// * 
// * The animal name should be case insensitive so "elephant", "Elephant", and
// * "ELEPHANT" should all return "herd".
// * 
// * If the name of the animal is not found, null, or empty, return "unknown".
// * 
// * Rhino -> Crash Giraffe -> Tower Elephant -> Herd Lion -> Pride Crow ->
// * Murder Pigeon -> Kit Flamingo -> Pat Deer -> Herd Dog -> Pack Crocodile
// * -> Float
// *
// * animalGroupName("giraffe") → "Tower" animalGroupName("") -> "unknown"
// * animalGroupName("walrus") -> "unknown"
// * 
// */
//public String animalGroupName(String animalName) {
//	Map<String, String> groupNames = new HashMap<String, String>();
//	groupNames.put("rhino", "Crash");
//	groupNames.put("giraffe", "Tower");
//	groupNames.put("elephant", "Herd");
//	groupNames.put("lion", "Pride");
//	groupNames.put("crow", "Murder");
//	groupNames.put("pigeon", "Kit");
//	groupNames.put("flamingo", "Pat");
//	groupNames.put("deer", "Herd");
//	groupNames.put("dog", "Pack");
//	groupNames.put("crocodile", "Float");
//
//	if (animalName == null || animalName.isEmpty()) {
//		return "unknown";
//	} else {
//		String lowerCaseName = animalName.toLowerCase();
//
//		if (groupNames.containsKey(lowerCaseName)) {
//			return groupNames.get(lowerCaseName);
//		} else {
//			return "unknown";
//		}
//	}
//}
//
///*
// * Given an String item number (a.k.a. SKU), return the discount percentage
// * if the item is on sale. If the item is not on sale, return 0.00.
// * 
// * If the item number is empty or null, return 0.00.
// * 
// * "KITCHEN4001" -> 0.20 "GARAGE1070" -> 0.15 "LIVINGROOM" -> 0.10
// * "KITCHEN6073" -> 0.40 "BEDROOM3434" -> 0.60 "BATH0073" -> 0.15
// * 
// * The item number should be case insensitive so "kitchen4001",
// * "Kitchen4001", and "KITCHEN4001" should all return 0.20.
// * 
// * isItOnSale("kitchen4001") → 0.20 isItOnSale("") → 0.00
// * isItOnSale("GARAGE1070") → 0.15 isItOnSale("dungeon9999") → 0.00
// * 
// */
//public Double isItOnSale(String itemNumber) {
//	Map<String, Double> myMap = new HashMap<String, Double>();
//
//	myMap.put("KITCHEN4001", 0.20);
//	myMap.put("GARAGE1070", 0.15);
//	myMap.put("LIVINGROOM", 0.15);
//	myMap.put("KITCHEN6073", 0.40);
//	myMap.put("BEDROOM3434", 0.60);
//	myMap.put("BATH0073", 0.15);
//
//	if (itemNumber == null || itemNumber.isEmpty()) {
//		return 0.00;
//	} else {
//		String upperCaseName = itemNumber.toUpperCase();
//
//		if (myMap.containsKey(upperCaseName)) {
//			return myMap.get(upperCaseName);
//		} else {
//			return 0.00;
//		}
//	}
//}
//
///*
// * Modify and return the given map as follows: if "Peter" has more than 0
// * money, transfer half of it to "Paul", but only if Paul has less than
// * $10s.
// * 
// * Note, monetary amounts are specified in cents: penny=1, nickel=5, ...
// * $1=100, ... $10=1000, ...
// * 
// * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul":
// * 1099} robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000,
// * "Paul": 30000}
// * 
// */
//public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
//	Integer peterMoney = peterPaul.get("Peter"); // get value for key
//													// "Peter" and return
//													// into peterMoney
//	Integer paulMoney = peterPaul.get("Paul"); // get value for key "Paul"
//												// and return into paulMoney
//
//	if (paulMoney < 1000 && peterMoney > 0) {
//		Integer halfPeterMoney = peterMoney / 2;
//		peterMoney -= halfPeterMoney;
//		paulMoney += halfPeterMoney;
//
//		peterPaul.put("Peter", peterMoney);
//		peterPaul.put("Paul", paulMoney);
//
//	}
//	return peterPaul;
//}
//
///*
// * Modify and return the given map as follows: if "Peter" has $50 or more,
// * AND "Paul" has $100 or more, then create a new "PeterPaulPartnership"
// * worth a combined contribution of a quarter of each partner's current
// * worth.
// * 
// * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750,
// * "Paul": 7500, "PeterPaulPartnership": 3750}
// * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter":
// * 3333, "Paul": 1234567890}
// * 
// */
//public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
//	Integer peterMoney = peterPaul.get("Peter"); // get value for key
//													// "Peter" and return
//													// into peterMoney
//	Integer paulMoney = peterPaul.get("Paul"); // get value for key "Paul"
//												// and return into paulMoney
//
//	if (paulMoney >= 10000 && peterMoney >= 5000) {
//		Integer partnership = (peterMoney / 4) + (paulMoney / 4);
//		peterMoney = peterMoney - (peterMoney / 4);
//		paulMoney = paulMoney - (paulMoney / 4);
//
//		peterPaul.put("Peter", peterMoney);
//		peterPaul.put("Paul", paulMoney);
//		peterPaul.put("PeterPaulPartnership", partnership);
//	}
//	return peterPaul;
//}
//
///*
// * Given an array of non-empty strings, return a Map<String, String> where
// * for every different string in the array, there is a key of its first
// * character with the value of its last character.
// *
// * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
// * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
// * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g":
// * "d", "m": "t", "n": "t"}
// */
//public Map<String, String> beginningAndEnding(String[] words) {
//	Map<String, String> myMap = new HashMap<String, String>();
//	for (String word : words) {
//		String firstLetter = String.valueOf(word.charAt(0));
//		String lastLetter = String.valueOf(word.charAt(word.length() - 1));
//		myMap.put(firstLetter, lastLetter);
//	}
//	return myMap;
//}
//
///*
// * Given an array of strings, return a Map<String, Integer> with a key for
// * each different string, with the value the number of times that string
// * appears in the array.
// * 
// * ** A CLASSIC **
// * 
// * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
// * wordCount([]) → {} wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
// * 
// */
//public Map<String, Integer> wordCount(String[] words) {
//	Map<String, Integer> myMap = new HashMap<String, Integer>();
//
//	for(String word : words){
//		if(!myMap.containsKey(word)){
//			myMap.put(word, 1);
//		} else {
//			int num = myMap.get(word);
//			myMap.put(word,++num);
//		}
//	}
//		return myMap;
//}
//	
////	for (int i = 0; i < words.length; i++) {
////		int count = 0;
////		for (int j = 0; j < words.length; j++) {
////			if (words[j].equals(words[i])) {
////				count++;
////				myMap.put(words[j], count);
////			}
////		}
////	}
////
////	return myMap;
//
//
//
///*
// * Given an array of int values, return a Map<Integer, Integer> with a key
// * for each int, with the value the number of times that int appears in the
// * array.
// * 
// * ** The lesser known cousin of the the classic wordCount **
// * 
// * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55:
// * 1, 63: 3, 77: 1, 99:2} integerCount([107, 33, 107, 33, 33, 33, 106, 107])
// * → {33: 4, 106: 1, 107: 3} integerCount([]) → {}
// * 
// */
//public Map<Integer, Integer> integerCount(int[] ints) {
//	Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
//
//	for(Integer myInt : ints){
//		if(!myMap.containsKey(myInt)){
//			myMap.put(myInt, 1);
//		} else {
//			int num = myMap.get(myInt);
//			myMap.put(myInt,++num);
//		}
//	}
//	return myMap;
//}
//	
////	for (int i = 0; i < ints.length; i++) {
////		int count = 0;
////		for (int j = 0; j < ints.length; j++) {
////			if (ints[j] == (ints[i])) {
////				count++;
////				myMap.put(ints[j], count);
////			}
////		}
////	}
//
//
//
///*
// * Given an array of strings, return a Map<String, Boolean> where each
// * different string is a key and value is true only if that string appears 2
// * or more times in the array.
// * 
// * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a":
// * true} wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a":
// * false} wordMultiple(["c", "c", "c", "c"]) → {"c": true}
// * 
// */
//public Map<String, Boolean> wordMultiple(String[] words) {
//	Map<String, Boolean> myMap = new HashMap<String, Boolean>();
//
//	
//	for(String word: words) {
//		if(!myMap.containsKey(word)) {
//			myMap.put(word, false);
//		} else {
//			myMap.put(word, true);
//		}
//		
//	}
//	return myMap;
//}
//	
////	for (int i = 0; i < words.length; i++) {
////		int count = 0;
////		for (int j = 0; j < words.length; j++) {
////			if (words[j].equals(words[i])) {
////				count++;
////				boolean isTwice = false;
////				if (count >= 2) {
////					isTwice = true;
////				}
////				myMap.put(words[j], isTwice);
////			}
////		}
////	}
//
//
///*
// * Given two maps, Map<String, Integer>, merge the two into a new map,
// * Map<String, Integer> where keys in Map2, and their Integer values, are
// * added to the Integer values of matching keys in Map1. Return the new map.
// * 
// * Unmatched keys and their Integer values in Map2 are simply added to Map1.
// * 
// * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11,
// * "SKU4": 5}) → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
// * 
// */
//public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
//		Map<String, Integer> remoteWarehouse) {
//	Map<String, Integer> myMap = new HashMap<String, Integer>();
//	Set<String> remoteNames = remoteWarehouse.keySet();
//	Set<String> mainNames = mainWarehouse.keySet();
//
//	for (String nameRemote : remoteNames) {
//		myMap.put(nameRemote, remoteWarehouse.get(nameRemote));
//		for (String name : mainNames) {
//			if (remoteWarehouse.containsKey(name)) {
//				myMap.put(name, (mainWarehouse.get(name) + remoteWarehouse.get(name)));
//			} else {
//				myMap.put(name, mainWarehouse.get(name));
//			}
//		}
//	}
//	return myMap;
//}
//
///*
// * Just when you thought it was safe to get back in the water ---
// * last2Revisited!!!!
// * 
// * Given an array of strings, for each string, the count of the number of
// * times that a substring length 2 appears in the string and also as the
// * last 2 chars of the string, so "hixxxhi" yields 1.
// * 
// * We don't count the end substring, but the substring may overlap a prior
// * position by one. For instance, "xxxx" has a count of 2, one pair at
// * position 0, and the second at position 1. The third pair at position 2 is
// * the end substring, which we don't count.
// * 
// * Return Map<String, Integer>, where the key is string from the array, and
// * its last2 count.
// * 
// * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1,
// * "xaxxaxaxx": 1, "axxxaaxx": 2}
// * 
// */
//public Map<String, Integer> last2Revisted(String[] words) {
//	Map<String, Integer> myMap = new HashMap<String, Integer>();
//	
//	for(String word : words) {
//
//		int count = 0;
//		String lastTwo = word.substring(word.length()-2);
//		for (int i = 0; i < word.length()-2; i++) {
//			String matchTwo = word.substring(i,i+2);
//			if (matchTwo.equals(lastTwo)) {
//				count++;
//			}
//			myMap.put(word, count);
//		}
//	}
//	return myMap;
//}
//***********************Answers pt two*********************************
/*
 * Dictionary/Map Exercises
 */

/*
 * Given the name of an animal, return the name of a group of that animal
 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
 * 
 * The animal name should be case insensitive so "elephant", "Elephant", and
 * "ELEPHANT" should all return "herd".
 * 
 * If the name of the animal is not found, null, or empty, return "unknown".
 * 
 * Rhino -> Crash Giraffe -> Tower Elephant -> Herd Lion -> Pride Crow ->
 * Murder Pigeon -> Kit Flamingo -> Pat Deer -> Herd Dog -> Pack Crocodile
 * -> Float
 *
 * animalGroupName("giraffe") → "Tower" animalGroupName("") -> "unknown"
 * animalGroupName("walrus") -> "unknown"
 * 
 */
//public String animalGroupName(String animalName) {
//	Map<String, String> map = new HashMap<>();
//		map.put("rhino", "Crash");
//		map.put("giraffe", "Tower");
//		map.put("lion", "Herd");
//		map.put("crow", "Murder");
//		map.put("pigeon", "Kit");
//		map.put("flamingo", "Pat");
//		map.put("deer", "Herd");
//		map.put("dog", "Pack");
//		map.put("crocodile", "Float");
//	if(map.containsKey(animalName.toLowerCase())){
//		return map.get(animalName.toLowerCase());
//	}else{
//		return "unknown";
//	}
//}
//
///*
// * Given an String item number (a.k.a. SKU), return the discount percentage
// * if the item is on sale. If the item is not on sale, return 0.00.
// * 
// * If the item number is empty or null, return 0.00.
// * 
// * "KITCHEN4001" -> 0.20 "GARAGE1070" -> 0.15 "LIVINGROOM" -> 0.10
// * "KITCHEN6073" -> 0.40 "BEDROOM3434" -> 0.60 "BATH0073" -> 0.15
// * 
// * The item number should be case insensitive so "kitchen4001",
// * "Kitchen4001", and "KITCHEN4001" should all return 0.20.
// * 
// * isItOnSale("kitchen4001") → 0.20 isItOnSale("") → 0.00
// * isItOnSale("GARAGE1070") → 0.15 isItOnSale("dungeon9999") → 0.00
// * 
// */
//public Double isItOnSale(String itemNumber) {
//	Map<String, Double> map = new HashMap<>();
//		map.put("KITCHEN4001", 0.20);
//		map.put("GARAGE1070", 0.15);
//		map.put("LIVINGROOM", 0.10);
//		map.put("KITCHEN6073", 0.40);
//		map.put("BEDROOM3434", 0.60);
//		map.put("BATH0073", 0.15);
//	if(map.containsKey(itemNumber.toUpperCase())){
//		return map.get(itemNumber.toUpperCase());
//	}else{
//		return 0.00;
//	}
//		
//}
//
///*
// * Modify and return the given map as follows: if "Peter" has more than 0
// * money, transfer half of it to "Paul", but only if Paul has less than
// * $10s.
// * 
// * Note, monetary amounts are specified in cents: penny=1, nickel=5, ...
// * $1=100, ... $10=1000, ...
// * 
// * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul":
// * 1099} robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000,
// * "Paul": 30000}
// * 
// */
//public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
//	Integer peter = peterPaul.get("Peter");
//	Integer paul = peterPaul.get("Paul");
//	
//	if( peter > 0 && paul < 1000){
//		Integer half = (peter/2);
//		paul = (paul + half);
//		peter = peter - half;
//		peterPaul.put("Peter", peter);
//		peterPaul.put("Paul", paul);
//	}
//	return peterPaul;
//}
//
//
///*
// * Modify and return the given map as follows: if "Peter" has $50 or more,
// * AND "Paul" has $100 or more, then create a new "PeterPaulPartnership"
// * worth a combined contribution of a quarter of each partner's current
// * worth.
// * 
// * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750,
// * "Paul": 7500, "PeterPaulPartnership": 3750}
// * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter":
// * 3333, "Paul": 1234567890}
// * 
// */
//public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
//	Integer peter = peterPaul.get("Peter");
//	Integer paul = peterPaul.get("Paul");
//	
//	if( peter >= 5000 && paul >= 10000){
//		Integer peter4th = (peter/4);
//		Integer paul4th = (paul/4);
//		paul = paul - paul4th;
//		peter = peter - peter4th;
//		Integer partner = paul4th + peter4th;
//		peterPaul.put("Peter", peter);
//		peterPaul.put("Paul", paul);
//		peterPaul.put("PeterPaulPartnership", partner);
//	}
//	return peterPaul;
//}
//
///*
// * Given an array of non-empty strings, return a Map<String, String> where
// * for every different string in the array, there is a key of its first
// * character with the value of its last character.
// *
// * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
// * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
// * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g":
// * "d", "m": "t", "n": "t"}
// */
//public Map<String, String> beginningAndEnding(String[] words) {
//	Map<String, String> map = new HashMap<>();
//		for(String word: words){
//			map.put(word.substring(0, 1), word.substring(word.length()-1));
//		}
//	return map;
//}
//
///*
// * Given an array of strings, return a Map<String, Integer> with a key for
// * each different string, with the value the number of times that string
// * appears in the array.
// * 
// * ** A CLASSIC **
// * 
// * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
// * wordCount([]) → {} wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
// * 
// */
//public Map<String, Integer> wordCount(String[] words) {
//	Map<String, Integer> map = new HashMap<>();
//		for(String word:words){
//			if(!map.containsKey(word)){
//				map.put(word, 1);
//			} else {
//				int count = map.get(word);
//				map.put(word, ++count);
//			}
//		} 
//	return map;
//}
//
///*
// * Given an array of int values, return a Map<Integer, Integer> with a key
// * for each int, with the value the number of times that int appears in the
// * array.
// * 
// * ** The lesser known cousin of the the classic wordCount **
// * 
// * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55:
// * 1, 63: 3, 77: 1, 99:2} integerCount([107, 33, 107, 33, 33, 33, 106, 107])
// * → {33: 4, 106: 1, 107: 3} integerCount([]) → {}
// * 
// */
//public Map<Integer, Integer> integerCount(int[] ints) {
//	Map<Integer, Integer> map = new HashMap<>();
//		for(int i : ints){
//			if(!map.containsKey(i)){
//				map.put(i,1);
//			} else{
//				int count = map.get(i);
//				map.put(i, ++count);
//			}
//		}
//	return map;
//}
//
//
///*
// * Given an array of strings, return a Map<String, Boolean> where each
// * different string is a key and value is true only if that string appears 2
// * or more times in the array.
// * 
// * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a":
// * true} wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a":
// * false} wordMultiple(["c", "c", "c", "c"]) → {"c": true}
// * 
// */
//public Map<String, Boolean> wordMultiple(String[] words) {
//	Map<String, Boolean> myMap = new HashMap<>();
//		for(String word: words) {
//			if(!myMap.containsKey(word)) {
//				myMap.put(word, false);
//			} else {
//				myMap.put(word, true);
//			}
//		}
//	return myMap;
//}
//	
//
//
///*
// * Given two maps, Map<String, Integer>, merge the two into a new map,
// * Map<String, Integer> where keys in Map2, and their Integer values, are
// * added to the Integer values of matching keys in Map1. Return the new map.
// * 
// * Unmatched keys and their Integer values in Map2 are simply added to Map1.
// * 
// * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11,
// * "SKU4": 5}) → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
// * 
// */
//public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
//	Map<String, Integer> map = new HashMap<>();
//		map.putAll(remoteWarehouse);
//		for (Entry<String, Integer> mainEntry : mainWarehouse.entrySet()){
//			String mainKey = mainEntry.getKey();
//			Integer mainValue = mainEntry.getValue();
//			if(!map.containsKey(mainKey)){
//				map.put(mainKey, mainValue);
//			} else {
//				Integer inv = map.get(mainKey);
//				inv = inv + mainValue;
//				map.put(mainKey, inv);
//			}
//		}
//	return map;
//}
//
///*
// * Just when you thought it was safe to get back in the water ---
// * last2Revisited!!!!
// * 
// * Given an array of strings, for each string, the count of the number of
// * times that a substring length 2 appears in the string and also as the
// * last 2 chars of the string, so "hixxxhi" yields 1.
// * 
// * We don't count the end substring, but the substring may overlap a prior
// * position by one. For instance, "xxxx" has a count of 2, one pair at
// * position 0, and the second at position 1. The third pair at position 2 is
// * the end substring, which we don't count.
// * 
// * Return Map<String, Integer>, where the key is string from the array, and
// * its last2 count.
// * 
// * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1,
// * "xaxxaxaxx": 1, "axxxaaxx": 2}
// * 
// */
//public Map<String, Integer> last2Revisted(String[] words) {
//	Map<String, Integer> map = new HashMap<String, Integer>();
//	for(String word : words) {
//		int count = 0;
//		String key = word.substring(word.length()-2);
//		
//		for (int i = 0; i < word.length()-2; i++) {
//			String match = word.substring(i,i+2);
//			if (match.equals(key)) {
//				count++;
//			}
//			map.put(word, count);
//		}
//	}
//	return map;
//}
//}