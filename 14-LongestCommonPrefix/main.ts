const longestCommonPrefix = (strs: string[]): string => {
  if (strs.length === 0 || strs.length === null) {
    return "";
  }

  const prefix: string = strs[0];
  if (strs.length === 1) {
    return prefix;
  }

  let minLen: number = prefix.length;

  for (const str of strs) {
    if (str.length < minLen) {
      minLen = str.length;
    }
  }

  for (let i: number = 0; i < minLen; i++) {
    const char: string = prefix[i];
    for (let j: number = 1; j < strs.length; j++) {
      if (char !== strs[j][i]) {
        return prefix.substring(0, i);
      }
    }
  }

  return prefix.substring(0, minLen);
};

console.log(longestCommonPrefix(["flow", "flower", "flight"]));
console.log(longestCommonPrefix(["a", "ab", "abc"]));
console.log(longestCommonPrefix(["dog", "racecar", "car"]));