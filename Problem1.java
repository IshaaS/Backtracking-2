// https://leetcode.com/problems/subsets/

// Time Complexity : O(2**n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// solved using, choose not choose and also using for loop based recursion
// in both types, i have used backtracking

// class Solution {
//     List<List<Integer>> result;
//     public List<List<Integer>> subsets(int[] nums) {
//         this.result = new ArrayList<>();
//         helper(new ArrayList<>(), nums, 0);
//         return result;
//     }
//     void helper(List<Integer> subset, int []nums, int i){
//         //base
//         if(i==nums.length){
//             result.add(new ArrayList<>(subset));
//             return;
//         }
//         //not choose
//         helper(subset, nums, i+1);
//         //choose
//         //action
//         subset.add(nums[i]);
//         //recursion
//         helper(subset, nums, i+1);
//         //backtrack
//         subset.remove(subset.size()-1);
//     }
// }

//for loop based recursion

import java.util.ArrayList;
import java.util.List;

class Problem1 {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        this.result = new ArrayList<>();
        helper(new ArrayList<>(), nums, 0);
        return result;
    }
    void helper(List<Integer> subset, int []nums, int pivot){
        result.add(new ArrayList<>(subset));
        for(int i=pivot; i<nums.length;i++){
            //action
            subset.add(nums[i]);
            //recurse
            helper(subset, nums, i+1);
            //backtrack
            subset.remove(subset.size()-1);
        }
    }
}