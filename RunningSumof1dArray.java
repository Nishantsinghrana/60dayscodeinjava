/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/
class Solution {
    public int[] runningSum(int[] nums) {
           int sum=0;
           int res[] = new int[nums.length];
            for(int i =0;i<nums.length;i++){
               sum=0;
            for(int j =0;j<=i;j++){
                sum +=nums[j];
            }
            res[i]=sum;
            }
return res;
}
}





/*class Solution {
    public int[] runningSum(int[] nums) {
        for(int i =1;i<nums.length;i++){
           
                nums[i] = nums[i] + nums[i-1];
            }
        
        return nums;
    }
}*/