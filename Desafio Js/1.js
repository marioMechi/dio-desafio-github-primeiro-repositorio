let lines = gets().split('\n');
var N = parseInt(lines.shift());


//TODO: Complete os espaços em branco com uma possível solução para o desafio

    for (let i = 0; i <= N; i++) {
	if (i % 2 ===  0 && i!== 0 ) {
        print(`${i}^2 = ${i * i}`);
	    }
    }
