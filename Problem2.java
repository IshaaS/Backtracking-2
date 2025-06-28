// https://leetcode.com/problems/palindrome-partitioning/

// Time Complexity :  O(n*2**n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// we are using for loop based recursion to form splits and using action, recursion, backtracking
import java.util.ArrayList;
import java.util.List;

class Probleme {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
        this.result = new ArrayList<>();
        helper(new ArrayList<>(), s, 0);
        return result;
    }
    private void helper(List<String>path, String s, int pivot){
        //base
        if(pivot==s.length()) {
            result.add(new ArrayList<>(path));
        }
        //logic
        for(int i=pivot; i<s.length();i++){
            String sub =s.substring(pivot, i+1);
            if(checkPalindrome(sub)){
                //action
                path.add(sub);
                //recurse
                helper(path, s, i+1);
                //backtrack
                path.remove(path.size()-1);
            }
        }
    }
    private boolean checkPalindrome(String s){
        int i=0;
        int k=s.length()-1;
        while(i<k){
            if(s.charAt(i)!=s.charAt(k)) return false;
            i++;
            k--;
        }
        return true;
    }
}