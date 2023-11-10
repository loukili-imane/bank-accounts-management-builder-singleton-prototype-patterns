package ma.imane.entity;

public class BankAccount {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus state;

    public BankAccount(Long accountId, double balance, String currency, AccountType type, AccountStatus state) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.state = state;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getState() {
        return state;
    }

    public void setState(AccountStatus state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", state=" + state +
                '}';
    }

    public BankAccount() {
    }
    // classe interne pour constrire uniquement es comptes
    public static class AccountBuilder{
        private BankAccount bankAccount = new BankAccount();
        public AccountBuilder accountId(Long id){
            bankAccount.accountId= id;
            return this;
        }

        public static AccountBuilder builder(){
            return new AccountBuilder();
        }
        public AccountBuilder currency(String currency){
            bankAccount.currency = currency;
            return this;
        }
        public AccountBuilder balance(double balance){
            bankAccount.balance=balance;
            return this;
        }
        public AccountBuilder type(AccountType type){
            bankAccount.type=type;
            return this;
        }

        public BankAccount build(){
            return this.bankAccount;
        }


    }

}
