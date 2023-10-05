// //Brute force O(n^2)
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n=nums.length;
//         int ans[]=new int[n];

//         for(int i=0;i<n;i++){
//             int pro=1;
//             for(int j=0;j<n;j++){
//                 if(i==j)continue;
//                 pro *= nums[j];


//             }
//             ans[i]=pro;

//         }
//         return ans;

//     }
// }
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int ans[] = new int[n];
//         int pro = 1;
//         for(int i : nums) {
//             pro *= i;
//         }
        
//         for(int i = 0; i < n; i++) {
//             ans[i] = pro / nums[i];
//         }
//         return ans;
//     }
// }
//finding prefix product and suffix product
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int pre[] = new int[n];
//         int suff[] = new int[n];
//         pre[0] = 1;
//         suff[n - 1] = 1;
        
//         for(int i = 1; i < n; i++) {
//             pre[i] = pre[i - 1] * nums[i - 1];
//         }
//         for(int i = n - 2; i >= 0; i--) {
//             suff[i] = suff[i + 1] * nums[i + 1];
//         }
        
//         int ans[] = new int[n];
//         for(int i = 0; i < n; i++) {
//             ans[i] = pre[i] * suff[i];
//         }
//         return ans;
//     }
// }
//Directly store the product of prefix and suffix into final answer array

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);

        int curr = 1;

        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
