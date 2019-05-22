package com.CoreJavapractice_codingbat;
/**
 * 
 * @author rvc41
 *
 *	URI : https://codingbat.com/prob/p151713
 *	Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 *	Example : 
 *	mixStart("mix snacks") → true
 *	mixStart("pix snacks") → true
 *	mixStart("piz snacks") → false
 *
 */

public class CJAcodingBatMixstart {
	
	public static void main (String args[]) {
		boolean weekday = false;
		boolean vacation = false;
		boolean slpin = sleepIn(weekday,vacation);
		System.out.println(slpin);
		
	}
	
	public static boolean mixStart(String str) {
		  
		  if(str.length()<3){
		    return false;
		  }
		  String subStr = str.substring(1,3);
		  if(subStr.equals("ix")){
		    return true;
		  } else {
		    return false;
		  }
		  //return true;
	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if (!weekday || vacation) {
		    return true;
		  }
		  return false;
		  //or
		  /*if (weekday!=true || vacation == true) {
			    return true;
			  }
			  return false;*/
		  // Solution notes: better to write "vacation" than "vacation == true"
		  // though they mean exactly the same thing.
		  // Likewise "!weekday" is better than "weekday == false".
		  // This all can be shortened to: return (!weekday || vacation);
		  // Here we just put the return-false last, or could use an if/else.
	}
	
	/**
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
	 * monkeyTrouble(true, true) → true
	 * monkeyTrouble(false, false) → true
	 * monkeyTrouble(true, false) → false
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if(aSmile == true && bSmile==true){
		    return true;
		  }else if(aSmile == false && bSmile==false){
		     return true;
		  }
		  return false;
		}
}
