function dividi(a, b) {
    if (b === 0) {
        throw new Error('Non puoi dividere per zero');
    }
    return a / b; //infinity
}
console.log(dividi(2, 2));
console.log(dividi(2, 0));
