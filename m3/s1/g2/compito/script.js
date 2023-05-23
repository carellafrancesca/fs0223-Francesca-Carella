var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var bankAccount = /** @class */ (function () {
    function bankAccount(balanceInitial) {
        if (balanceInitial === void 0) { balanceInitial = 0; }
        this.balance = balanceInitial;
    }
    bankAccount.prototype.deposit = function (amount) {
        this.balance += amount;
    };
    bankAccount.prototype.withdraw = function (amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
        else {
            console.log("Saldo insufficiente");
        }
    };
    bankAccount.prototype.getBalance = function () {
        return this.balance;
    };
    return bankAccount;
}());
var sonAccount = /** @class */ (function (_super) {
    __extends(sonAccount, _super);
    function sonAccount() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return sonAccount;
}(bankAccount));
var motherAccount = /** @class */ (function (_super) {
    __extends(motherAccount, _super);
    function motherAccount(balanceInitial, interestRate) {
        if (balanceInitial === void 0) { balanceInitial = 0; }
        if (interestRate === void 0) { interestRate = 0; }
        var _this = _super.call(this, balanceInitial) || this;
        _this.interestRate = interestRate;
        return _this;
    }
    motherAccount.prototype.calculateInterest = function () {
        var interest = this.balance * this.interestRate;
        this.deposit(interest);
    };
    return motherAccount;
}(bankAccount));
var SonAccount = new sonAccount(100);
var MotherAccount = new motherAccount(500, 0.10);
SonAccount.deposit(50);
MotherAccount.withdraw(20);
MotherAccount.deposit(100);
MotherAccount.calculateInterest();
console.log('Saldo conto del figlio', SonAccount.getBalance());
console.log('Saldo conto della madre', MotherAccount.getBalance());
