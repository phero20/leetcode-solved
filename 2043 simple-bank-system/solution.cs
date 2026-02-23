public class Bank {
    private long[] bal;

    public Bank(long[] balance) {
        bal = new long[balance.Length + 1]; // 1-indexed
        for (int i = 0; i < balance.Length; i++) {
            bal[i + 1] = balance[i];
        }
    }

    private bool IsValid(int account) {
        return account > 0 && account < bal.Length;
    }

    public bool Transfer(int account1, int account2, long money) {
        if (!IsValid(account1) || !IsValid(account2)) return false;
        if (bal[account1] < money) return false;
        bal[account1] -= money;
        bal[account2] += money;
        return true;
    }

    public bool Deposit(int account, long money) {
        if (!IsValid(account)) return false;
        bal[account] += money;
        return true;
    }

    public bool Withdraw(int account, long money) {
        if (!IsValid(account)) return false;
        if (bal[account] < money) return false;
        bal[account] -= money;
        return true;
    }
}
