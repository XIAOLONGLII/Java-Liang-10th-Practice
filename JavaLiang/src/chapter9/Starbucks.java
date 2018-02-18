package chapter9;

import java.util.Scanner;

public class Starbucks
{
	String coffee;
	String salad;
	int price;
	int amount;
	
	Starbucks(String coffee, String salad)
	{
		this.coffee = coffee;
		this.salad = salad;
	}
	String getCoffee()
	{
		return coffee;
	}
	void setCoffee(String coffee)
	{
		this.coffee = coffee;
	}
	
	String getSalad()
	{
		return salad	;
	}
	void setSalad(String salad)
	{
		this.salad = salad;
	}
	int getPrice()
	{
		return price;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
	
	
	
	int getAmount()
	{
		return amount;
	}
	void setAmount(int price)
	{
		this.price = price;
	}
	int getTotal()
	{
		return price * amount;
	}
	


	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input name of the coffee");
		String coffee = input.nextLine();
		System.out.println("Please input name of the salad");
		String salad = input.nextLine();
		
		Starbucks sb = new Starbucks(coffee,salad);
		
		System.out.println("please set the price for coffee");
		sb.setPrice(input.nextInt());
		int	x = sb.getPrice();
		System.out.println("please set the amount cups of  for coffee");
		sb.setAmount(input.nextInt());
		int y = sb.getAmount();
		System.out.println("The coffee total is: " + sb.getTotal()); 
		
		

	}
}

