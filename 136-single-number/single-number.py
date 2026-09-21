class Solution:
    def singleNumber(self, nums: list[int]) -> int:
        d={}
        for num in nums:
            if  num not in d:
                d[num]=1
            else:
                d[num]+=1
        for num in nums:
            if d[num]==1:
                return num