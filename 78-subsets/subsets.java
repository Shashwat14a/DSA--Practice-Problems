class Solution {
    static void solve(int[] nums , int index , List<Integer> output , List<List<Integer>> ans){
        // Base Case
        if(index >= nums.length){

            ans.add(new ArrayList<>(output));
            return ;
        }

        // Processing

        int currValue = nums[index];
        // Include Case 
        output.add(currValue);
        solve(nums , index + 1 , output , ans);
        // Exclude Case
        output.remove(output.size() - 1);
        solve(nums , index + 1, output , ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums , index , output , ans);
        return ans;
    }
}