class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> mp = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            int val = nums[i];
            mp.put(val , mp.getOrDefault(val , 0) + 1);
        }

        for(int val : mp.keySet()){
            if(mp.get(val) > n/2){
                return val;
            }
        }
        return -1;
    }
}