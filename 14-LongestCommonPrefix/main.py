from typing import List

class Solution:
  def longest_common_prefix(self, strs: List[str]) -> str: 
    if len(strs) == 0:
      return ""
    
    prefix = strs[0]
    if len(strs) == 1:
      return prefix 
    
    min_len = len(prefix)
    for str in strs:
      if len(str) < min_len:
        min_len = len(str)
    
    for i in range(min_len):
      char = prefix[i]
      for j in range(1, len(strs)):
        if char != strs[j][i]:
          return prefix[:i]
      
    return prefix[:min_len]

s = Solution()
print(s.longest_common_prefix(["flow", "flower", "flight"]))
print(s.longest_common_prefix(["a", "ab", "abc"]))
print(s.longest_common_prefix(["dog", "racecar", "car"]))