const isValid = (s: string): boolean => {
  const pairs: Map<string, string> = new Map([
    [")", "("],
    ["]", "["],
    ["}", "{"],
  ]);

  const stack: string[] = [];

  for (const char of s) {
    if (pairs.get(char)) {
      if (stack.length === 0 || stack[stack.length - 1] != pairs.get(char)) {
        return false;
      }

      stack.pop();
    } else {
      stack.push(char);
    }
  }

  return stack.length === 0;
};

console.log(isValid("()"));
console.log(isValid("()[]{}"));
console.log(isValid("(]"));
console.log(isValid("([])"));
