class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int var = target - nums[i];
            if (map.containsKey(var)){
                return new int[] {map.get(var), i};
            }
            map.put(nums[i],i);        
        }
        return new int[] {};
    }
}