package chapter9;

public class Student
{
	int id;
	String name;
	java.util.Date dateCreated;
	
	Student(int ssn, String newName)
	{
		id = ssn;
		name = newName;
		dateCreated = new java.util.Date();
	}
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	java.util.Date getDateCreated()
	{
		return dateCreated;
	}


	public static void main(String[] args)
	{
		Student s = new Student(120437031,"Jose");
		java.util.Date dateCreated = s.getDateCreated();
		dateCreated.setTime(20000);
		System.out.println();
				
	}
}
