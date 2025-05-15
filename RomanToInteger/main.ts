const romanToInt = (s: string): number => {
  const roman: Map<string, number> = new Map([
    ["I", 1],
    ["V", 5],
    ["X", 10],
    ["L", 50],
    ["C", 100],
    ["D", 500],
    ["M", 1000],
  ]);

  let total: number = 0;
  const n: number = s.length;

  for (const [i, v] of [...s].entries()) {
    const val: number = roman.get(v)!;
    if (i + 1 < n && val < roman.get(s[i + 1])!) {
      total -= val;
    } else {
      total += val;
    }
  }

  return total;
};

console.log(romanToInt("III"));
console.log(romanToInt("LVIII"));
console.log(romanToInt("MCMXCIV"));
