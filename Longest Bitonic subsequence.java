/*
Given an array of positive integers. Find the maximum length of Bitonic subsequence. 
A subsequence of array is called Bitonic if it is first strictly increasing, then strictly decreasing.

Input: nums = [1, 2, 5, 3, 2]
Output: 5
Explanation: The sequence {1, 2, 5} is
increasing and the sequence {3, 2} is 
decreasing so merging both we will get 
length 5.


Input: nums = [1, 11, 2, 10, 4, 5, 2, 1]
Output: 6
Explanation: The bitonic sequence 
{1, 2, 10, 4, 2, 1} has length 6.
*/

class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
       
        int n=nums.length;
        int inc[]=new int[n];
        int dec[]=new int[n];
        int ans=0;
      // Incrementing count
        for(int i=0;i<n;i++){
            inc[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i] && inc[j]+1>inc[i]){
                    inc[i]=inc[j]+1;
                }
            }
        }
        // Decrementing count
        for(int i=n-1;i>=0;i--){
            dec[i]=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i] && dec[j]+1>dec[i]){
                    dec[i]=dec[j]+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            ans=Math.max(ans,inc[i]+dec[i]-1);
        }
        return ans;
    }
}
