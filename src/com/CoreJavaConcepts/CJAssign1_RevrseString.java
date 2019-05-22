package com.CoreJavaConcepts;


public class CJAssign1_RevrseString {
	
	public static void main (String args[]) {
		String name = "VENKAT";
		System.out.println("Welcome to Java World");
		String revStg = reversingString(name);
		System.out.println("String convertion by using byte");	
		System.out.println(revStg);
		System.out.println("String convertion by using Char");
		String charRevString = charReverseString(name);
		System.out.println("String convertion by using byte");
		
		System.out.println("String convertion by using byte");
		
	}
private static String charReverseString(String name) {

    // convert String to character array 
    // by using toCharArray 
    char[] try1 = name.toCharArray(); 

    for (int i = try1.length-1; i>=0; i--) 
        System.out.print(try1[i]);
	return null;
	}
//one way of doing this reverse string
	private static String reversingString(String name1) {
		byte [] strAsByteArray = name1.getBytes(); 
		  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        //System.out.println(new String(result));
        //System.out.println(result[1]);
		String revRes = new String(result);
		return revRes;
	}

}
