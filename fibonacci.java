/*In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
   The first two numbers of fibonacci series are 0 and 1.
 */
public class Fibonacciser {
	/*Fibonacci Series using recursion in java*/
	static int a=0,b=1,c=0;
	static void printseries(int count) {
		if(count>0) {
		c=a+b; 
		a=b;
		b=c;
		System.out.println(c);
		count--;}
	}
	public static void main(String[] args) {
		/*int a=0,b=1,c,i,count=20;
        System.out.println(a+" "+b);
        for(i=2;i<=count;i++) {
        	c=a+b;
        	System.out.println(c);
        	a=b;
        	b=c;
        }*/
		int count =10;
		System.out.println(a+" "+b);
		printseries(count-2); 
		
	}

}

