package main

import "fmt"

func isPalindrome(x int) bool {
	if x < 0 || (x % 10 == 0 && x != 0) {
		return false 
	}

	rev := 0
	for x > rev {
		rev = rev * 10 + x % 10 
		x = x / 10
	}

	return x == rev || x == rev / 10
}

func main() {
	fmt.Println(isPalindrome(121))
	fmt.Println(isPalindrome(-121))
	fmt.Println(isPalindrome(10))
}