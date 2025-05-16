from typing import Dict, List

class Solution:
  def two_sum(self, nums: List[int], target: int) -> List[int]:
    m: Dict[int, int] = {}
    
    for i, v in enumerate(nums):
      c = target - v 
      if c in m:
        return [m[c], i]
      
      m[v] = i 
      
    return []

s = Solution()
print(s.two_sum([2, 7, 11, 12], 9))
print(s.two_sum([3, 2, 4], 6))
print(s.two_sum([3, 3], 6))