//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    static boolean isBalanced(String s) {
if(s.length()==1) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            Character c = s.charAt(i);
            if(c.equals('(') || c.equals('{') || c.equals('[')){
                st.push(c);
            }
            else if(st.isEmpty()){
                return false;
            }
            else{
                if(s.charAt(i)==')'){
                    if(st.peek()!='('){
                        return false;
                    }
                }
                if(s.charAt(i)=='}'){
                    if(st.peek()!='{'){
                        return false;
                    }
                }
                if(s.charAt(i)==']'){
                    if(st.peek()!='['){
                        return false;
                    }
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
