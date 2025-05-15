function twoSum(nums: number[], target: number): number[] {
  let m: Map<number, number> = new Map();

  for (let [i, v] of nums.entries()) {
    const c = target - v;
    if (m.has(c)) {
      return [m.get(c)!, i];
    }
    
    m.set(v, i);
  }

  return [];
}

console.log(twoSum([2, 7, 11, 12], 9));
console.log(twoSum([3, 2, 4], 6));
console.log(twoSum([3, 3], 6));
