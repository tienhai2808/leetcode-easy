from typing import List

class Solution:
	def remove_elenment(self, nums: List[int], val: int) -> int:
		if len(nums) == 0:
			return 0

		i = 0
		for j in range(len(nums)):
			if nums[j] != val:
				nums[i] = nums[j]
				i += 1

		return i

s = Solution()
print(s.remove_elenment([3, 2, 2, 3], 3))
print(s.remove_elenment([0, 1, 2, 2, 3, 0, 4, 2], 2))
