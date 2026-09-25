class Solution {
    static void solve(int[] nums , int index , List<Integer> output , List<List<Integer>> ans){
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return ;
        }

        int currValue = nums[index];
        // Include Case 
        output.add(currValue);
        solve(nums , index+1 , output , ans);
        // Exclude Case
        output.remove(output.size() - 1);
        // Main Case :- Dont Take Or Include Duplicates 

        while(index+1 < nums.length && nums[index] == nums[index+1]){
            index++;
        }
        solve(nums , index+1 , output , ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums , index , output , ans);
        return ans;
    }
}