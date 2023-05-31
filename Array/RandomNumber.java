/*Random numbers are the numbers that use a large set of numbers and selects a number using the mathematical algorithm.
It satisfies the following two conditions:The generated values uniformly distributed over a definite interval.
It is impossible to guess the future value based on current and past values.
 */
package Number;
import java.lang.Math;
import java.util.Random;
public class Generaterandomnum {

	public static void main(String[] args) {
		/*Using the Math.random() Method
The Java Math class has many methods for different mathematical operations. One of them is the random() method.
 It is a static method of the Math class. We can invoke it directly. 
 It generates only double type random number greater than or equal to 0.0 and less than 1.0. Before using the random() method, we must import the java.lang.Math class.
		*/
		System.out.println("Generating the 1st random number "+Math.random());
		System.out.println("Generating the 2nd random number "+Math.random());
		System.out.println("Generating the 3rd random number "+Math.random());
		/*Using the Random Class Another way to generate a random number is to use the Java Random class of the java.util package. It generates a stream of pseudo random numbers. We can generate a random number of any data type, such as integer, float, double, Boolean, long. 
		 */
		Random r = new Random();
		int x= r.nextInt(100000);
		System.out.println("Generating random number 0 to 100000");
		System.out.println(x);
		boolean m=r.nextBoolean();
		System.out.println("Randomly Generated Boolean Values");  
		System.out.println(m);
		long p = r.nextLong();
		System.out.println("Randomly Generated Long Values");  
		System.out.println(p);   
		
	}

}
