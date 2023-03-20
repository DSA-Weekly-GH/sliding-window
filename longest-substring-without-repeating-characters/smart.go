func lengthOfLongestSubstring(s string) int {
	maxLength := 0
	l := 0
	dict := make(map[rune]struct{})

	for r, c := range s {
		for _, ok := dict[c]; ok; _, ok = dict[c] {
			delete(dict, rune(s[l]))
			l++
		}
		dict[c] = struct{}{}
		if r-l+1 > maxLength {
			maxLength = r - l + 1
		}
	}

	return maxLength
}
