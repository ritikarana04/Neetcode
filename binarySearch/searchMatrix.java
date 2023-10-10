class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       //base condition

       if(matrix==null||matrix.length==0||matrix[0].length==0)
       return false;

       int row=matrix.length;// no.of rows
       int col=matrix[0].length;// no.of columns

       //initialize begining indx 
 int beg=0;
 int end=row*col-1;

 while(beg<=end){

     int mid=beg+(end-beg)/2;
     int idx=matrix[mid/col][mid%col];
     if(idx==target)
     return true;
     if(idx>target){
         end=mid-1;

     }
     else{
         beg=mid+1;

     }


 }
 return false;
 


    }
}
