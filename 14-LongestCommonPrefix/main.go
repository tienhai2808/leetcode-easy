package main

import "fmt"

func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}

	if len(strs) == 1 {
		return strs[1]
	}

	prefix := strs[0]
	minLen := len(prefix)
	for _, str := range strs {
		if len(str) < minLen {
			minLen = len(str)
		}
	}

	for i := 0; i < minLen; i++ {
		char := prefix[i]
		for j := 1; j < len(strs); j++ {
			if strs[j][i] != char {
				return prefix[:i]
			}
		}
	}

	return prefix[:minLen]
}

func main() {
	fmt.Println(longestCommonPrefix([]string{"ab", "a", "abc"}))
	fmt.Println(longestCommonPrefix([]string{"flower", "flow", "flight"}))
	fmt.Println(longestCommonPrefix([]string{"dog", "racecar", "car"}))
}
