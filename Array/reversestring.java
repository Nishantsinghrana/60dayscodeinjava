/*You are given a string s. You need to reverse the string.

Example:

Input:
s = Geeks
Output: skeeG*/
class Reverse
{
    // Complete the function
    // str: input string
    
    public static String reverseWord(String str)
    {
        String rev="";
        int l = str.length();
        for(int i=l-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return rev;
        }
}