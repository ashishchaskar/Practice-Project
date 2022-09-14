package com.facebook;

import java.util.*;

//hello  - remove duplicates using collection

public class HashSetDemo {
	
	public static void main(String[] args) {
		
	String s="hello";
	char[] c = s.toCharArray();
	
	Set<Character> set=new LinkedHashSet<Character>();
	
	for(Character ch : c) {
		
		set.add(ch);
	 	
		}
	
	for(char a : set) {
		
		System.out.println(a);
		
	}
	
  }

}
