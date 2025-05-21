class Solution:
  def str_str(self, haystack: str, needle: str) -> int:
    if len(needle) == 0:
      return -1

    m, n = len(haystack), len(needle)
    if m < n:
      return 0

    for i in range(m-n+1):
      if haystack[i:i+n] == needle:
        return i 

    return -1 

s = Solution()
print(s.str_str("sadbutsad", "sad"))
print(s.str_str("leetcode", "leeto"))