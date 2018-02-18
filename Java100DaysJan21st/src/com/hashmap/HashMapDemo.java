package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
import java.util.Set;

public class HashMapDemo
{
	public static void main(String args[])
	{
		//create a hash map
		HashMap hm = new HashMap();
		
		//put elements to the map
		hm.put("Zara", new Double(3434.34));
		hm.put("Gap", new Double(123.22));
		hm.put("BananaRepublican", new Double(1378.00));
		hm.put("Macy's", new Double(99.22));
		hm.put("Uniqlo",new Double(-19.88));
		
		//get a set of the entries
		Set set = hm.entrySet();
		//Get an iterator
		Iterator i = set.iterator();
		//display elements
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		//depostie 1000 into zara account
		double balance = ((Double)hm.get("Zara")).doubleValue();
		hm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + hm.get("Zara"));
	}
	
}
