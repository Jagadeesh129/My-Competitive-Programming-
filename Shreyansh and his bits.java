/*Shreyansh has an integer N. He is really curious about the binary representation of integers. He sees that any given integer has a number of set bits. Now he wants to find out that how many positive integers, strictly less than N, have the same number of set bits as N.
He is a little weak in maths. Help him find the number of integers.
Note : Since N takes large values, brute force won't work. 

Input:
N = 8
Output: 3
Explanation:
Binary representation of 8 : 1000
So the integers less than 8 with 
same number of set bits are : 4, 2, 1
Hence, the result is 3. 

Input:
N = 4
Output: 2
Explanation:
Binary representation of 4 : 100
So the integers less than 4 with 
same number of set bits are : 2, 1
So, The result is 2.
*/

class Solution{
    long dp[][];
    long count(long n)
    {
        // Code Here
        dp=new long[64][64];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=0;
        int ones=0;
        int pos=0;
        while(n>0){
            if((n&1)==1){
                ones++;
                ans+=nCr(pos,ones);
            }
            pos++;
            n>>=1;
        }
        return ans;
        
    }
    long nCr(int n,int r){
        if(r>n) 
            return 0;
        if(r==n || r==0)
            return 1;
        if(dp[n][r]!=-1)
            return dp[n][r];
        return dp[n][r]=nCr(n-1,r-1)+nCr(n-1,r);
    } 
}
