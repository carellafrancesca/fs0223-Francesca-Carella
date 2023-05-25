//combinables

type Combinable = number | string;

let a:Combinable = 0;
a = 'hello';

function test(b:Combinable){
    return a;
}

//assertion type

let code:any = 123;
let x = <number> code;

//intersection type

type Admin = {
    name:string;
    privileges:string[];
}

type Employee = {
    names:number;
    startDate:Date;
}

type superEpmloyee = Admin && Employee;

let superAdmin:SuperEmployess = {
    name: "",
    privileges: [],
    names: 0,
    startDate: new Date()
}
