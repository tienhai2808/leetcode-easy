class Solution:
  def roman_to_int(self, s: str) -> int:
    roman: dict = {
      'I': 1,
      'V': 5,
      'X': 10,
      'L': 50,
      'C': 100,
      'D': 500,
      'M': 1000,
    }
    
    total = 0
    n = len(s)
    for i in range(n):
      val = roman[s[i]]
      if i + 1 < n and val < roman[s[i + 1]]:
        total -= val 
      else:
        total += val 
    return total
  
s = Solution()
print(s.roman_to_int("III"))
print(s.roman_to_int("LVIII"))
print(s.roman_to_int("MCMXCIV"))