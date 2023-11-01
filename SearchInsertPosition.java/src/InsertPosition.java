public class InsertPosition {
    public int searchInsert(int[] nums, int target) {

        int start = 0, mid = 0;
        int end = nums.length-1;

        while(start < end)
        {
            mid = (start + end)/2;
            if(target < nums[mid])
            {
                end = mid-1;
            }
            if(end == -1)
            {
                break;
            }
            if(target > nums[mid])
            {
                start = mid +1;
            }
            if(target > nums[end])
            {
                return end+1;
            }
            if(target == nums[mid])
            {
                return mid;
            }
        }

        if(start == 0)
        {
            if(target > nums[start])
            {
                return start+1;
            }
            else
            {
                return start;
            }
        }
        if(start == nums.length-1 && target > nums[start])
        {
            return start+1;
        }
        else
        {
            return start;
        }
    }
}