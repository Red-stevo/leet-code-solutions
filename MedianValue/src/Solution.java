public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumLength = (nums1.length + nums2.length)-1, i=0, j=0,pos1=-1,pos2=0,pos3=0;
        boolean check = true;
        if(nums1.length == 0 && nums2.length == 1) return nums2[0];
        else if(nums1.length == 1 && nums2.length == 0) return nums1[0];
        if(sumLength%2 == 0) pos1 = sumLength/2;
        else {
            pos2 = sumLength/2;
            pos3 = pos2+1;

            if(sumLength == 1){
                if(nums1.length == 1) return (double)(nums1[0] + nums2[0])/2;
                else if (nums1.length == 2)  return (double) (nums1[0] + nums1[1])/2;
                else return (double) (nums2[0] + nums2[1])/2;
            }
        }

        for (int k = 0; k < sumLength; k++) {
            if (i >= nums1.length) {
                if (k == pos1) return nums2[j];
                else if (k == pos2 && check){
                    pos2 = nums2[j];
                    check = false;
                }
                else if (k == pos3) return (double) (pos2 + nums2[j])/2;
                j++;
            } else if (j >= nums2.length) {
                if (k == pos1) return (nums1[i]);
                else if (k == pos2 && check){
                    pos2 = nums1[i];
                    check = false;
                }
                else if (k == pos3) return (double) (pos2 + nums2[i])/2;
                i++;
            } else if (nums1[i] < nums2[j]) {
                if (k == pos1) return (nums1[i]);
                else if (k == pos2 && check){
                    pos2 = nums1[i];
                    check = false;
                }
                else if (k == pos3) return (double) (pos2 + nums2[i])/2;
                i++;
            } else {
                if (k == pos1) return (nums2[j]);
                else if (k == pos2 && check){
                    pos2 = nums2[j];
                    check = false;
                }
                else if (k == pos3) return (double) (pos2 + nums2[j])/2;
                j++;
            }
        }
        return 0;
    }
}
