/*
Construct a binary tree from a string consisting of parenthesis and integers. The whole input represents a binary tree. 
It contains an integer followed by zero, one or two pairs of parenthesis. 
The integer represents the roots value and a pair of parenthesis contains a child binary tree with the same structure. 
Always start to construct the left child node of the parent first if it exists.

Example 1:
Input: "1(2)(3)" 
Output: 2 1 3
Explanation:
           1
          / \
         2   3
Explanation: first pair of parenthesis contains 
left subtree and second one contains the right 
subtree. Inorder of above tree is "2 1 3".

Example 2:
Input: "4(2(3)(1))(6(5))"
Output: 3 2 1 4 5 6
Explanation:
           4
         /   \
        2     6
       / \   / 
      3   1 5   

*/

class Solution {
    static Node fun(int ind[],String s,int n){
        if(s.charAt(ind[0])==')' || ind[0]>=n)
            return null;
        int data=0;
        while(ind[0]<n && Character.isDigit(s.charAt(ind[0]))){
            data=data*10+(s.charAt(ind[0])-'0');
            ind[0]++;
        }
        Node head=new Node(data);
        if(ind[0]<n && s.charAt(ind[0])=='('){
            ind[0]++;
            head.left=fun(ind,s,n);
        }
        if(ind[0]<n && s.charAt(ind[0])=='('){
            ind[0]++;
            head.right=fun(ind,s,n);
        }
        ind[0]++;
        return head;
    }
    public static Node treeFromString(String s) {
        int ind[]={0};
        return fun(ind,s,s.length());
    }
}
