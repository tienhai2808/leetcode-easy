const removeDuplicates = (nums: number[]): number => {
  if (nums.length === 0) return 0;

  let i: number = 0;
  for (let j: number = 1; j < nums.length; j++) {
    if (nums[i] !== nums[j]) {
      i++;
      nums[i] = nums[j];
    }
  }

  return i + 1;
}

console.log(removeDuplicates([1, 1, 2]));
console.log(removeDuplicates([0, 0, 1, 1, 2, 2, 3, 3, 4]));