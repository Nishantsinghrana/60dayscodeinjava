/*Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum value.

Example:

Input: 
n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.*/
class Solution {
    int findMaximum(int[] arr, int n) {
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max)
            max=arr[i];
        }
   return max; }
}