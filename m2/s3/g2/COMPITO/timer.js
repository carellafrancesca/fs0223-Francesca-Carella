var start = new Date().getTime();

for (i = 0; i < 50000; ++i) {
}

var end = new Date().getTime();
var time = end - start;
alert('Execution time: ' + time);