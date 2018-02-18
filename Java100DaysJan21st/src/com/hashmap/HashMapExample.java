package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args)
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//1. add elements on map
		map.put(101, "Xiaolong ");
		map.put(102, "Li");
		map.put(103, "PhoneNumber");
		System.out.println("Values before remove: " + map);
		
		//2. HashMap array, getKey(), getValue()
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		//3. remove()
		map.remove(101);
		System.out.println("Values after remove: " + map);


	}

}
