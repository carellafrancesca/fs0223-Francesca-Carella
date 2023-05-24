class bankAccount {
    constructor(balanceInitial = 0) {
        this.balance = balanceInitial;
    }
    deposit(amount) {
        this.balance += amount;
    }
    withdraw(amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        else {
            console.log("Saldo insufficiente");
        }
    }
    getBalance() {
        return this.balance;
    }
}
class sonAccount extends bankAccount {
}
class motherAccount extends bankAccount {
    constructor(balanceInitial = 0, interestRate = 0) {
        super(balanceInitial);
        this.interestRate = interestRate;
    }
    calculateInterest() {
        const interest = this.balance * this.interestRate;
        this.deposit(interest);
    }
}
const SonAccount = new sonAccount(100);
const MotherAccount = new motherAccount(500, 0.10);
SonAccount.deposit(50);
MotherAccount.withdraw(20);
MotherAccount.deposit(100);
MotherAccount.calculateInterest();
console.log('Saldo conto del figlio', SonAccount.getBalance());
console.log('Saldo conto della madre', MotherAccount.getBalance());
