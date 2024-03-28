package mavenpackage;

public class Student1
{	
	     String name;
	     int rollNumber;
	     Address address;

	    public Student1(String name, int rollNumber, Address address)
	    {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.address = address;
	    }
	   
	    public void display()
	    {
	    	System.out.println("Name of the Student- "+name);
	    	System.out.println("Roll Number- "+rollNumber);
	    	System.out.println(" Address - "+address.address);
	    }
	
	    public static void main(String[] args) 
	    {
	        Address studentAddress = new Address("tvm 08, kerala, India");
	        Student1 student = new Student1("Elsa", 44, studentAddress);
	        student.display();
	       
	    }
	
	}


