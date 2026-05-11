import "strings"

func areSentencesSimilar(sentence1 string, sentence2 string) bool {
    a := strings.Split(sentence1, " ")
    b := strings.Split(sentence2, " ")

    i := 0
    for i < len(a) && i < len(b) && a[i] == b[i] {
        i++
    }

    j1, j2 := len(a)-1, len(b)-1
    for j1 >= i && j2 >= i && a[j1] == b[j2] {
        j1--
        j2--
    }
    return j1 < i || j2 < i
}

