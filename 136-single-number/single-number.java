class Solution {
    public int singleNumber(int[] nums) {
        
        int start = 0;
        for(int i = 0; i < nums.length; i++){
            start = start^nums[i];
        }
        return start;
    }
}