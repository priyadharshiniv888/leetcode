class Solution {
    public int reverse(int x) {
        int rev=0;
        int count=0;
        if(x<0){
           x= Math.abs(x);
            count=1;
        }
        while(x>0){
            int digit=x%10;
            if(rev>Integer.MAX_VALUE/10 ){
            return 0;
        }
            rev=rev*10+digit;
            x=x/10;
        }
        
        if(count==1){
            return -rev;
        }
        return rev;
    }
}