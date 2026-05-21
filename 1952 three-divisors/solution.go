func isThree(n int) bool {
    root := int(math.Sqrt(float64(n)))
    if root*root != n {
        return false
    }
    return isPrime(root, 2)
}

func isPrime(num, d int) bool {
    if num < 2 {
        return false
    }
    if d*d > num {
        return true
    }
    if num%d == 0 {
        return false
    }
    return isPrime(num, d+1)
}
