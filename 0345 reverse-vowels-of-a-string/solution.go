func reverseVowels(s string) string {
	chars := []rune(s)
	i := 0
	j := len(s) - 1
	vowel := make([]bool, 126)
	vowel['a'] = true
	vowel['e'] = true
	vowel['i'] = true
	vowel['o'] = true
	vowel['u'] = true
	vowel['A'] = true
	vowel['E'] = true
	vowel['I'] = true
	vowel['O'] = true
	vowel['U'] = true
	for i < j {
		if !vowel[chars[i]] {
			i++
		} else if !vowel[chars[j]] {
			j--
		} else {
			chars[i], chars[j] = chars[j], chars[i]
			i++
			j--
		}

	}
	return string(chars)

}
