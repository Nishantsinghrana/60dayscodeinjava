/*Java Object class is the super class of all the Java classes. All Java classes 
implements the Object class by default. The Java Object class provides the two 
important methods to compare two objects in Java, i.e. equals() and hashCode() method. 
In this section, we will learn how equals() and hashCode() method works. Along with this, 
we will also learn how to compare two objects in Java with proper examples.
The equals() method of the Object class compare the equality of two objects. The two objects will be 
equal if they share the same memory address.
Difference Between == Operator and equals() Method
In Java, the == operator compares that two references are identical or not. Whereas the equals() method compares two objects.
Objects are equal when they have the same state (usually comparing variables). Objects are identical when they share the class identity.
For example, the expression obj1==obj2 tests the identity, not equality. While the expression obj1.equals(obj2) compares equality.
Java hashCode() Method
In Java, hash code is a 32-bit signed integer value. It is a unique id provided by JVM to Java object. Each Java object is associated with the hash code. 
The hash code is managed by a hash-based data structure, such as HashTable, HashSet, etc.
*/
package Number;
class Employee{
	private int regno;  
	private String name;  
	//constructor of Employee class  
	public Employee(int regno, String name)   
	{  
	this.name = name;  
	this.regno = regno;  
	}  
	public int getRegno()   
	{  
	return regno;  
	}  
	public void setRegno(int Regno)   
	{  
	this.regno = regno;  
	}  
	public String getName()   
	{  
	return name;  
	}  
	public void setName(String name)   
	{  
	this.name = name;  
	}  
	}  

public class Compareobject {

	public static void main(String[] args)   
	{  
	//creating two instances of the Employee class  
	Employee emp1 = new Employee(918, "Maria");  
	Employee emp2 = new Employee(918, "Maria");  
	//invoking hashCode() method  
	int a=emp1.hashCode();  
	int b=emp2.hashCode();  
	System.out.println("hashcode of emp1 = " + a);  
	System.out.println("hashcode of emp2 = " + b);  
	System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  
	}  
	} 
