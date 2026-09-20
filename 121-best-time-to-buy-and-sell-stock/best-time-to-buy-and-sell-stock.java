class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] < minPrice){
                minPrice = nums[i];
            }
            else if(nums[i] > minPrice){
                int todaysPrice = nums[i] - minPrice ;
                if(todaysPrice > maxProfit){
                    maxProfit = todaysPrice;
                }
            }
        }

        return maxProfit;
    }
}