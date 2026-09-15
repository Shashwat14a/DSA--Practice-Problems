class Solution {
    static int solve(int[] arr ,int target , int s , int e){
        // Base Case
        if( s > e){
            return -1;
        }
        // Processing -> Binary Search Logic
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            e = mid - 1;
        }
        if(arr[mid] < target){
            s = mid + 1;
        }

        // Recursive Call
        return solve(arr , target , s , e);
    }
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1; 
        int ans = solve(nums , target , s , e);
        return ans;
    }
}