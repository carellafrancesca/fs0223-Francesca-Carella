function dividi(a:number, b:number):number{

    try {
        if (b === 0){
            throw new Error('Non puoi dividere per zero');
        }
        return a / b; //infinity        
    }catch(err){
        console.error(err);
        return 0;
    }finally{
        console.log('divisione effettuata')
    }

}

console.log(dividi(2,2));
console.log(dividi(2,0));