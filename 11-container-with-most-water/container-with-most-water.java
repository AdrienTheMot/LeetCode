class Solution {
    public int maxArea(int[] height) {
        int n = height.length-1;
        int i = 0;
        int max = 0;
        while (i < n){

            int temp = Math.min(height[i],height[n]) * (n - i);

            if(max < temp){
                max = temp;
            }

            if(height[i] < height[n]){
                i++;
            } else {
                n--;
            }


        }
        
    return max;

    }
}