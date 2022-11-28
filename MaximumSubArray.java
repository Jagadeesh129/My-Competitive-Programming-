/*
Find out the maximum sub-array of non negative numbers from an array.

The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:
a = [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]

NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length.
If there is still a tie, then return the segment with minimum starting index.
If no such subarray is present return "-1"

Input:
n = 3
a[] = {1, 2, 3}
Output: 1 2 3
Explanation: In the given array every
element is non-negative.

Input:
n = 2
a[] = {-1, 2}
Output: 2
Explanation: The only subarray [2] is
the answer.
*/

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList();
        int cs=0,ms=0;
        int cSind=0,mSind=0,mEind=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                cs=0;
                cSind=i+1;
            }
            else
                cs+=a[i];
            if(ms<cs){
                ms=cs;
                mSind=cSind;
                mEind=i+1;
            }
            else if(ms==cs){
                int currDist=i+1-cSind;
                int maxDist=mEind-mSind;
                if(currDist>maxDist){
                    mSind=cSind;
                    mEind=i+1;
                }
            }
        }
        for(int i=mSind;i<mEind;i++){
            ans.add(a[i]);
        }
        if(ans.size()>0)
            return ans;
        ans.add(-1);
        return ans;
    }
}
