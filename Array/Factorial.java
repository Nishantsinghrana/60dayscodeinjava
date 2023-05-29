package Number;
//Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!
public class Factorial {
static int fact(int n) {
	/*int fac=1, i,num=5;
	for(i=1;i<=num;i++) {
		fac=fac*i;
	}
System.out.println(fac);*/
	//Factorial Program using recursion
	if(n==0) {
		return 1;
	}
	else 
		return(n * fact(n-1));
}
	public static void main(String[] args) {
		int fac=1;
		 fac = fact(6);
		 System.out.println(fac);
	}

}