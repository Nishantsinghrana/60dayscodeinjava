package Number;
/*Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers 
 * can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */
public class Primenumber {

	public static void main(String[] args) {
		int n=9,m=0,flag=0;
		m=n/2; 
		if(n==0|| n==1) {
			System.out.println("n is not a prime number");
		}else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
			}
        if(flag==0) {
        	System.out.println(n+"number is prime");
        }
	}

}
	}
