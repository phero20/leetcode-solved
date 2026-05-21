class Solution {
public:
    bool isThree(int n) {
      int root = (int)sqrt(n);
        if (root * root != n) return false; 
        return isPrime(root, 2);            
    }

    bool isPrime(int num, int divisor) {
        if (num < 2) return false;
        if (divisor * divisor > num) return true;
        if (num % divisor == 0) return false;
        return isPrime(num, divisor + 1);
    }
};
