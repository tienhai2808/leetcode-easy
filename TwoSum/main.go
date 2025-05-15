package main

import "fmt"

func twoSum(nums []int, target int) []int {
	m := make(map[int]int)

	for i, v := range nums {
		c := target - v 
		if j, ok := m[c]; ok {
			return []int{j, i}
		}
		
		m[v] = i
	}

	return nil 
}

func case1() ([]int, int) {
	nums := []int{2, 7, 11, 12}
	target := 9
	return nums, target
}

func case2() ([]int, int) {
	nums := []int{3, 2, 4}
	target := 6
	return nums, target
}

func case3() ([]int, int) {
	nums := []int{3, 3}
	target := 6
	return nums,target
}

func main() {
	fmt.Println(twoSum(case1()))
	fmt.Println(twoSum(case2()))
	fmt.Println(twoSum(case3()))
}