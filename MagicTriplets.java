/*
Given an array of size n, a triplet (a[i], a[j], a[k]) is called a Magic Triplet if a[i] < a[j] < a[k] and i < j < k.  
Count the number of magic triplets in a given array.

Input: arr = [3, 2, 1]
Output: 0
Explanation: There is no magic triplet.

Input: arr = [1, 2, 3, 4]
Output: 4
Explanation: Fours magic triplets are 
(1, 2, 3), (1, 2, 4), (1, 3, 4) and 
(2, 3, 4).

Expected Time Complexity: O(N2) 
Expected Space Complexity: O(1)
*/
class Solution{
    public int countTriplets(int[] nums){
        // code here
        int n=nums.length;
        int ans=0;
        for(int j=1;j<n-1;j++){
            int small=0,large=0;
            for(int i=0;i<j;i++){
                if(nums[i]<nums[j])
                    small++;
            }
            for(int k=j+1;k<n;k++){
                if(nums[j]<nums[k])
                    large++;
            }
            ans+=small*large;
        }
        return ans;
    }
}
