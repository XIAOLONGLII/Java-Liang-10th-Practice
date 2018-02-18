package chapter9;

import java.util.Scanner;

public class SimpleCircle
{
	//getArea() //radius
	
	public static void main(String[] args)
	{
	
		input = new Scanner(System.in);
		
		SimpleCircle ct = new SimpleCircle();
		System.out.print("The radius is " + ct.getRadius() + "\n The area is " + ct.getArea());
		
		System.out.println("Enter the radius");
		Double radius = input.nextDouble();
		SimpleCircle ct1 = new SimpleCircle(radius);

		System.out.print(" \n The radius is " + ct1.getRadius() + " \n The area is " + ct1.getArea());
		
		
	}
	
	

	 double radius;
	private static Scanner input;
	
	 SimpleCircle()
	 {
		 radius = 1;
	 }
	
	//constructor 
	SimpleCircle(double radius)
	{
		this.radius = radius;
		
	}
	//getter
	double getRadius()
	{
		return radius;
	}
	//setter
	void setRadius(double r)
	{
		r = radius;
	}
	//get area
	
	double getArea()
	{
		return radius * radius * Math.PI;
	}
	

}
