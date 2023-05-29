/*An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number. It is an OEIS sequence A005188. Let’s understand it through an example.
 * 
Armstrong Number Example
1: 11 = 1
2: 21 = 2
3: 31 = 3
153: 13 + 53 + 33 = 1 + 125+ 27 = 153 */
package Number;
import java.util.*;
public class Armstrong {
static boolean check(int n) {
	int temp=n,id,sum=0;
	while(n!=0) {
		id=n%10;
		sum=sum+(id*id*id);
		n=n/10;
	}
	if(temp==sum) {
		return true;
	}
	else 
		return false;
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the limit: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(check(i)) {
				System.out.println(i+" is a armstrong number");
			}
		}
	}

}
