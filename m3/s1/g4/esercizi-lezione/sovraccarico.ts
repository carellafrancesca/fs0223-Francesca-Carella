function add(a:number, b:number):number;
function add(a:string, b:string):string;

function add(a:any, b:any):any{
    return a + b;
}

console.log(add('Hello','World'));
console.log(add(10,20));

//esempi
function add<T>(a:T, b:T):T{
    return (a as any) + (b as any);
}

let res = somma<number>(10,20);
let res2 = somma<string>('10','20');