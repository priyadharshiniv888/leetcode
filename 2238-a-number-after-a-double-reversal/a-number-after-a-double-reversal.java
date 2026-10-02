class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
int digit=0,count=0;
        while(temp>0){
            int last=temp%10;
             digit=last+digit*10;
            temp=temp/10;
         count++;
        }
        int rev=0;
       while(digit>0){
        digit=digit/10;
        rev++;
       }
       if(count==rev){
        return true;
       }
        return false;
    }
}