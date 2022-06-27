var currentNumber = 0;
var soma = document.getElementById("currentNumber");
var subtracao = document.getElementById("currentNumber");

function increment(){
    currentNumber = currentNumber + 1;
    soma.innerHTML = currentNumber
    if(currentNumber >= 10){
        currentNumber = currentNumber - 1;
    }
}

function decrement(){
    currentNumber = currentNumber - 1;
    subtracao.innerHTML = currentNumber
    if(currentNumber <= -10){
        currentNumber = currentNumber + 1;
    }
    if(currentNumber <=0){
        subtracao.style.color = "red";
    }
}

soma.addEventListener('click', increment);
subtracao.addEventListener('click', decrement);


 