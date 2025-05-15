const isPalindrome = (x: number): boolean => {
  if (x < 0 || (x % 10 == 0 && x != 0)) {
    return false
  }

  let rev: number = 0;
  while (x > rev) {
    rev = rev * 10 + x % 10;
    x = x / 10;
  }

  return x === rev || x === rev / 10;
}

console.log(isPalindrome(121));
console.log(isPalindrome(-121));
console.log(isPalindrome(10));