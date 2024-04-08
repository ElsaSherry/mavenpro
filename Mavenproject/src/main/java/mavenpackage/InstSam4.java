package mavenpackage;

public class InstSam4
{
	static String company="Obsqura";
	String name;
	String place;
	int a;
public InstSam4(String name1, int a1, String place1)
{
	
name=name1;
place=place1;
a=a1;

}
public void display()
{
System.out.println("name" +name+" " +company);
System.out.println("ID" +a);
System.out.println("Place  " +place);
}


public static void main(String args[])
{
InstSam4 a=new InstSam4("Elsa ",2,"tvm");
InstSam4 b= new InstSam4(" Veda",5,"pkd");
InstSam4 c=new InstSam4("Krishna",8,"Klm");
InstSam4 d= new InstSam4("Sherin",9,"TRV");
InstSam4 e= new InstSam4("Priya",7,"Ekm");
a.display();
b.display();
c.display();
d.display();
e.display();
}
}
