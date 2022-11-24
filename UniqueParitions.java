
/*
Given a positive integer n, generate all possible unique ways to represent n as sum of positive integers.

Note: The generated output is printed without partitions. Each partition must be in decreasing order. Printing of all the partitions is done in reverse sorted order. 
Input: n = 3
Output: 3 2 1 1 1 1
Explanation: For n=3, 
{3}, {2, 1} and {1, 1, 1}.
*/
class Solution
{
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=i+1;
        int ind=n-1;
        rec(ind,n,arr,ans,curr);
        return ans;
    }
    public static void rec(int ind,int n,int[] arr,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> curr){
        if(n<=0 || ind<0)
            return;
        curr.add(arr[ind]);
        if(n-arr[ind]==0)
            ans.add(new ArrayList<>(curr));
        rec(ind,n-arr[ind],arr,ans,curr);
        curr.remove(curr.size()-1);
        rec(ind-1,n,arr,ans,curr);
    }
}
