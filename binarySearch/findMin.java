// class Solution {
//     public int findMin(int[] nums){
//         int max=nums[nums.length-1];
//         int min= nums[0];
//         for(int i=0;i<nums.length;i++){
//             int currMin =nums[i];
//             min=Math.min(currMin,min);
//         }
//         return min;
//     }
// }

//using binary search
class Solution {
    public int findMin(int[] nums) {
      int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];

    }
}
