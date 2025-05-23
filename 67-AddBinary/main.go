package main

import "fmt"

func addBinary(a, b string) string {
	i, j := len(a)-1, len(b)-1
	carry := 0
	result := ""

	for i >= 0 || j >= 0 || carry > 0 {
		sum := carry

		if i >= 0 {
			sum += int(a[i] - '0')
			i--
		}

		if j >= 0 {
			sum += int(b[j] - '0')
			j--
		}

		result = string(sum%2+'0') + result
		carry = sum / 2
	}

	return result
}

func main() {
	fmt.Println(addBinary("11", "1"))
	fmt.Println(addBinary("1010", "1011"))
}
