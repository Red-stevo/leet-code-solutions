class Solution {
    public int removeElement(int[] nums, int val) {
        

        int start =0,end = nums.length-1;
        if(nums.length !=0)
        {
        while(start < end)
        {
            while(nums[end] == val && end > start)
            {
                end--;
            }
            while(nums[start] != val && start < end)
            {
                start++;
            }
            while(nums[start] == val && start < end && end > start)
            {
                while(nums[end] == val && end > start)
                {
                    end--;
                }
                nums[start] = nums[end];
                nums[end] = val;
                end--;
                start++;
            }
        }
        if(nums[end] == val)
        {
            return --end;
        }
        else
        {
            return end;
        }
        }
        else
        {
            return 0;
        }
    }
}

class RemoveVal
{
    public static void main(String[] args) {
        Solution done = new Solution();

        int arr[] = {4,2,0,2,2,1,4,4,1,4,3,2};
        int value = 4;

        int num = done.removeElement(arr, value);
        System.out.println("The values is "+num);
    }
}
