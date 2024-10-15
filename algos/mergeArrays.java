class mergeArrays
{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j,newPointer=0;

        for(i=0;i<n;i++)
        {
            int endPoint=m+i;
            for(j=newPointer;j<endPoint;j++)
            {
                if((j+1) == endPoint && nums1[j] < nums2[i])
                {
                    for(int l=endPoint;l<(m+n);l++)
                    {
                        nums1[l]=nums2[i];
                        i++;
                    }
                    return;
                }
                if(nums1[j]>nums2[i])
                {
                    for(int k=endPoint;k>j;k--)
                    {
                        nums1[k]=nums1[k-1];
                    }
                    nums1[j]=nums2[i];
                    newPointer = j+1;
                    break;
                }
            }
            if(j == endPoint)
            {
            nums1[endPoint]=nums2[i];
            }
        }


        for(int b : nums1)
        {
            System.out.println(b);
        }
}

public static void main(String[] args) {

    int num1[] = {1,2,3,0,0,0};
    int num2[]={2,5,6};
    merge(num1,3,num2,3);
}
}