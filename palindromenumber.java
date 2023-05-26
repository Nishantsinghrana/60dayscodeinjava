/*A palindrome number is a number that is same after reverse.
 * * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.
 */
public class Palindrome {
	
static void ispalindrome(int num) {
	int sum=0;
	int temp=num;
	while(num>0) {
		int rem = num%10;
		 sum = (sum*10)+rem;
		 num=num/10;
	} 
	if(temp==sum) {
		System.out.println(temp+ " is a palindrome number ");
	}
	else
		System.out.println(temp+ " is not a palindrome number ");
}
	public static void main(String[] args) {
		ispalindrome(151);

	}

}
