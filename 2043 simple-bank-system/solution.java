class Bank {
    private long amounts[];
    public Bank(long[] balance) {
        amounts=new long[balance.length+1];
        for(int i=0;i<balance.length;i++) amounts[i+1]=balance[i];
    }

    private boolean isValid(int account) {
         return account > 0 && account < amounts.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(!isValid(account1) || !isValid(account2)) return false;
        if(amounts[account1]<money) return false;
        amounts[account1]-=money;
        amounts[account2]+=money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(!isValid(account)) return false;
        amounts[account]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isValid(account)) return false;
        if(amounts[account]<money) return false;
        amounts[account]-=money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
