class Solution:
  def is_valid(self, s: str) -> bool:
    stack = []
    pairs = {
      ']': '[',
      ')': '(',
      '}': '{'
    }
    
    for _, char in enumerate(s):
      if char in pairs:
        if not stack or stack[-1] != pairs[char]:
          return False
        stack.pop()
      else:
        stack.append(char)
    
    return not stack

s = Solution()
print(s.is_valid("()"))
print(s.is_valid("()[]{}"))
print(s.is_valid("(]"))
print(s.is_valid("([])"))