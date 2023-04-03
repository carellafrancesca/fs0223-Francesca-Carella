//Alert
alert('Benvenuti in Javascript')
document.getElementById("benvenuti").innerHTML = 'Benvenuti in Javascript';

//Variabili
var n = 20;
var t = 5;
console.log(n - t);//15

var x = 12;
var y = 7;
console.log(x * y);//84

var miaEtà = "23"
var mioNome = "Francesca"
console.log(mioNome + ' ha ' + miaEtà + ' anni ')

//Funzioni
function social(){
    console.log('Instagram')
    console.log('Facebook')
    console.log('Youtube')
    console.log('Tumblr')
    console.log('TikTok')
}

social()

//Document
document.write('Benvenuti in Javascript');

//If
var risposta = true;
if(risposta){
    console.log('true');
}else{
    console.log('false');
}
