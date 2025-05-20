from typing import List

class Solution: 
  def remove_duplicates(self, nums: List[int]) -> int:
    if len(nums) == 0:
      return 0 
    
    i = 0 
    for j in range(1, len(nums)):
      if nums[j] != nums[i]:
        i += 1
        nums[i] = nums[j]
    
    return i + 1
  
s = Solution()
print(s.remove_duplicates([1, 1, 2]))
print(s.remove_duplicates([0, 0, 1, 1, 2, 2, 3, 3, 4]))