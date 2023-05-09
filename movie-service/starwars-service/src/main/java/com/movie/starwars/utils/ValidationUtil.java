package com.movie.starwars.utils;

import com.movie.starwars.enums.TypeEnum;

public class ValidationUtil 
{
	
	public static boolean validateType(String type)
	{
		TypeEnum[] typeEnum = TypeEnum.values();
		
	       for (TypeEnum t : typeEnum)
	    	   if (t.type().equalsIgnoreCase(type))
	               return true;
	       return false;
	}

	
	
}
