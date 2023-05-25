"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.User = void 0;
var User = /** @class */ (function () {
    function User(name, lastname, id) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }
    return User;
}());
exports.User = User;
//nel file js dove l'elemento viene importato: import { User } from './modules/user.js (dopo './' inserire la cartella)
