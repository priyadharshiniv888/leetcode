class Solution {
    public int maxArea(int[] height) {
        int l=0;

        int r=height.length-1;
        int maxarea=0;
        while(l<r){
            int width=r-l;
            int min=Math.min(height[l],height[r]);
            if(height[l]<height[r]){
                l++;
            }
            else {
                    r--;
            }
            int area=width*min;

            if(area>maxarea){
                maxarea=area;
                
            }
           



        }
        return maxarea;
    }
}