/*
Given a positive number n. You need to write a program to find the maximum sum of distinct numbers such that the LCM of all these numbers is equal to n.
Input: n = 2
Output: 3 
Explanation: The distinct numbers you can have are 
just 1 and 2 and their sum is equal to 3.

Input: n = 5
Output: 6
Explanation: The distinct numbers you can have 
are just 1 and 5 and their sum is equal to 6.
*/

class Solution {
    static long maxSumLCM(int n) {
        // code here
        long ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)ans+=i;
        }
        return ans;
    }
}

//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1)
  
class Solution {
    static long maxSumLCM(int n) {
        // code here
        long ans=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i!=i)
                    ans+=n/i;
                ans+=i;
            }
        }
        return ans;
    }
}
  
//Expected Time Complexity: O(sqrt(n))
//Expected Auxiliary Space: O(1)
  
  
