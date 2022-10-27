class Solution {
     static void  minmax(int[] arr) {
         if(arr == null || arr.length==0)return;
         int min=arr[0];
         int max=arr[0]
         for(int i=1 ; i <arr.length ; i++){
             min=Math.min(min,arr[i]);
             max=Math.max(max,arr[1]);
         }
         return min;
         return max;
        
    }
}
