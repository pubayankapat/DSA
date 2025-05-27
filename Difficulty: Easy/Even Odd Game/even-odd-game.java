// User function Template for Java
class Solution {
    public static String utility(int n) {
        String res = "You";
        if(n == 1){
            return res;
        }else if(n % 2 == 0){
            res = "Friend";
        }
        return res;
    }
}