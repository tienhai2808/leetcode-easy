const strStr = (haystack: string, needle: string): number => {
  if (needle.length === 0) return -1;

  const m: number = haystack.length;
  const n: number = needle.length;
  if (m < n) return 0;

  for (let i: number = 0; i <= m - n; i++) {
    if (haystack.substring(i, i + n) === needle) {
      return i;
    }
  }

  return -1;
};

console.log(strStr("sadbutsad", "sad"));
console.log(strStr("leetcode", "leeto"));
