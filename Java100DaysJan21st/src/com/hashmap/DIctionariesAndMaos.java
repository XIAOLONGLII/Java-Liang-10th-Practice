package com.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class DIctionariesAndMaos {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(int i = 0; i < num; i++)
		{
			String name = input.next();
			int phone = input.nextInt();
			hm.put(name, phone);
			//System.out.println(hm.get(name).toString());
		}
		while(input.hasNext())
		{
			String name = input.next();
			if(hm.containsKey(name))
			{
				int phone = hm.get(name);
				System.out.println(name + " = " + phone);
			}
			else
			{
				System.out.println("Not Found!");
			}
		}
		input.close();

	}

}
