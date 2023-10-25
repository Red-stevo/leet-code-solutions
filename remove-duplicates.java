class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j;
        int max = nums.length;
        
        for(i=0;i<max;i++)
        {
            for(j=i+1;j<max;j++)
            {
                if(nums[i]==nums[j])
                {
                    for(int k=j;k<max-1;k++){
                        nums[k]=nums[k+1];
                    }
                    max--;
                    j--;
                }
            }
        }
        return max;
        
    }
}
