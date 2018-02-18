package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestCollection13
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(646, "Xiaolong");
		hm.put(894,"Li");
		hm.put(1993, "PhoneNumber");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
