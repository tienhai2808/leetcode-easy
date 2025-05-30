package main

import "fmt"

func mySqrt(x int) int {
	if x < 2 {
		return x
	}

	left, right := 1, x/2
	var result int

	for left <= right {
		mid := left + (right-left)/2
		if mid*mid == x {
			return mid
		} else if mid*mid < x {
			result = mid
			left = mid + 1
		} else {
			right = mid - 1
		}
	}

	return result
}

func main() {
	fmt.Println(mySqrt(4))
	fmt.Println(mySqrt(8))
}
