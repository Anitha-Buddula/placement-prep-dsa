class Solution {
    public int maxArea(int[] height) {
        int result=0;
        int l=0, r=height.length-1;
        while(l<=r){
            int result1=(r-l)*Math.min(height[l], height[r]);
            result=Math.max(result,result1);
            if(height[l]<height[r]){
                l++;
            } else {
                r--;
            }
        }
        return result;
    }
