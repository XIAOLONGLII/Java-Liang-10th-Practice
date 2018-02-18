package com.hashmap;

import java.util.HashMap;
import java.util.Map;

class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id,String name,String author,String publisher, int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class MapExample
{
	public static void main(String[] args)
	{
		Map<Integer,Book> map = new HashMap<Integer,Book>();
		Book b1 = new Book(101,"Let us"," get together","BPB",8);
		Book b2 = new Book(102, "It is","so crazy","GBG",4);
		Book b3 = new Book(103, "Data Structure","Murry","lol",5);
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		//System.out.println("Values : " + map);
		for(Map.Entry<Integer, Book> entry:map.entrySet())
		{
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + "Details: ");
			System.out.println("id is " + b.id + " " + b.name + " " + b.author + " "
					+ b.publisher + " " + b.quantity);
		}

	}

}
