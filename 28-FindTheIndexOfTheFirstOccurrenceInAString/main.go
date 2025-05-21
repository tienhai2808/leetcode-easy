package main

import "fmt"

func strStr(haystack, needle string) int {
	if len(needle) == 0 {
		return 0
	}

	m, n := len(haystack), len(needle)
	if m < n {
		return -1
	}

	for i := 0; i <= m-n; i++ {
		if haystack[i:i+n] == needle {
			return i
		}
	}

	return -1
}

func main() {
	fmt.Println(strStr("sadbutsad", "sad"))
	fmt.Println(strStr("leetcode", "leeto"))
}
