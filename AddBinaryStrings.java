/*
Given two binary strings A and B consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Example 1:
Input:
A = "1101", B = "111"
Output: 10100
Explanation:
 1101
+ 111
10100

Example 2:
Input: 
A = "10", B = "01"
Output: 11
Explanation: 
  10
+ 01
  11
*/


//   To know about StringBuilder visit 
//   https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/

class Solution {
    String addBinary(String A, String B) {
        int m=A.length()-1;
        int n=B.length()-1;
        int c=0;
        StringBuilder res=new StringBuilder();
        while(m>=0 || n>=0){
            int a= m>=0?A.charAt(m)-'0':0;
            int b= n>=0?B.charAt(n)-'0':0;
            int sum=a+b+c;
            if(sum==0){
                res.append('0');
                c=0;
            }
            else if(sum==1){
                res.append('1');
                c=0;
            }
            else if(sum==2){
                res.append('0');
                c=1;
            }
            else if(sum==3){
                res.append('1');
                c=1;
            }
            m--;
            n--;
        }
        if(c==1){
            res.append('1');
        }
        res=res.reverse();
        while(res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        return res.toString();
    }
}
