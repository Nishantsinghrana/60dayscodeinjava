/*You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.*/

class Solution {
    public String restoreString(String s, int[] indices) {
        char a []  = new char[s.length()];
        for(int i=0;i<s.length();i++){
           a[indices[i]]=s.charAt(i);
        }
        String r = String.valueOf(a);
        return r;
    }
}
 