/*Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.
Example :
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].s */
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        for(int i =1;i<n;i++){
        leftsum[i] = leftsum[i-1] + nums[i-1];
        }
         int[] rightsum = new int[n];
         for(int j = n-2;j>=0;j--){
              rightsum[j] = rightsum[j+1] + nums[j+1];
         }
         int ans[] = new int[n];
         for(int i =0; i<n;i++){
             ans[i] = Math.abs(leftsum[i]-rightsum[i]);
         }
         return ans;
    }
}

