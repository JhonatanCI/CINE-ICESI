package model;

import java.util.ArrayList;

public class FunctionsRegister {
	private static ArrayList<Function> functions = new ArrayList<Function>();
	
	public static void addfunction(Function fun) {
		for ( Function i : functions) {
			if(i.getName().equalsIgnoreCase(fun.getName())) {
				
			}
			
		}
		functions.add(fun);
	}
}
