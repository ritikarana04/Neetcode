class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while (left<right){
            if (numbers[left]+numbers[right]==target){
                return new int[]{left+1,right+1};
            }
            else if (numbers[left]+numbers[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
        
    }
}
//binary search
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int low = 0 , high = numbers.length-1;

//             while (low < high)
//             {
//                 int complement = numbers[low] + numbers[high];
//                 if (complement == target)
//                 {
//                     return new int[]{low+1 , high+1};
//                 }else if (complement > target){
//                     high--;
//                 }else {
//                     low++;
//                 }
//             }
            
//         return new int[] {-1 , -1};
//     }
// }
