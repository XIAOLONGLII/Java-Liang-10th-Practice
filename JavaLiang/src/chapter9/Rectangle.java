package chapter9;

public class Rectangle
{
	public static void main(String[] args)
	{
		SimpleRectangle rec = new SimpleRectangle();
		double one = rec.width;
		double two = rec.height;
		System.out.println(one + " " + two + " " + rec.getArea());
		
		SimpleRectangle rec1 = new SimpleRectangle(15, 10);
		System.out.println(rec1.width+ " " + rec1.height + " " + rec1.getArea() +" " + rec1.getPerimeters());
		
		
		SimpleRectangle rec2 = new SimpleRectangle(3.4, 35.9);
		System.out.println(rec2.width + " " + rec2.height + " \b area is " 
				+ rec2.getArea() + " peremiters " + rec2.getPerimeters());
	}

}

class SimpleRectangle
{
	double width, height;
	
	SimpleRectangle()
	{
		width = 1;
		height = 1;
	}
	SimpleRectangle(double w, double h)
	{
		width = w;
		height = h;
	}
	double getArea()
	{
		return width * height;
	}
	double getPerimeters()
	{
		return 2 * (width + height);
	}
}