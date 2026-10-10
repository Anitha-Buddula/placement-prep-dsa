public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int MaxLen=0;
        int Zeroes=0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==0) Zeroes++;
            while (Zeroes>k){
                if(nums[l]==0) Zeroes--;
                l++;
            }
            MaxLen=Math.max(MaxLen,r-l+1);
        }
        return MaxLen;
    }
}
