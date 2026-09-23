class Solution {
    public void rotate(int[] nums, int k) {
        int kk=k%nums.length;
        int[] arr=new int[nums.length];
        int reuse=kk;
       int count=0;
       for(int i=nums.length-1;i>=0;i--){
         arr[count++]=nums[i];
       }
       int l=0;
       int r=arr.length-1;
       while(l<kk){
        int temp=arr[l];
        arr[l]=arr[kk-1];
        arr[kk-1]=temp;
        l++;
        kk--;
       }

       while(reuse<r){
        int temp=arr[reuse];
        arr[reuse]=arr[r];
        arr[r]=temp;
        reuse++;
        r--;
       }

    for(int i = 0; i < nums.length; i++) {
    nums[i] = arr[i];
  }

    } 
   
    
}