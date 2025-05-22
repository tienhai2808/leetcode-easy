class Solution:
  def length_of_last_word(self, s: str) -> int:
    length = 0
    i = len(s) - 1

    while i >= 0 and s[i] == " ":
      i -= 1

    while i >= 0 and s[i] != " ":
      length += 1
      i -= 1

    return length

s = Solution()
print(s.length_of_last_word("Hello World"))
print(s.length_of_last_word("   fly me   to   the moon  "))
print(s.length_of_last_word("luffy is still joyboy"))