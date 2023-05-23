class bankAccount{
    protected balance:number;

    constructor(balanceInitial:number = 0){
        this.balance = balanceInitial;
    }

    deposit(amount:number):void{
        this.balance += amount;
    }

    withdraw(amount:number):void{
        if(this.balance >= amount){
            this.balance -= amount;
        }else{
            console.log("Saldo insufficiente");
        }
    }

    getBalance():number{
        return this.balance;
    }
}

class sonAccount extends bankAccount{}
class motherAccount extends bankAccount {
    private interestRate: number;

    constructor(balanceInitial:number = 0, interestRate:number = 0){
        super(balanceInitial);
        this.interestRate = interestRate;
    }

    calculateInterest():void{
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