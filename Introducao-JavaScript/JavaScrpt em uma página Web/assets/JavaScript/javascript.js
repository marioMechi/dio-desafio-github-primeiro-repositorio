var currentNumber = 0;

var currentNumberWraper = document.getElementById('currentNumber')

function increment(){
    currentNumber = currentNumber + 1;
    currentNumberWraper.innerHTML = currentNumber
}

function decrement(){
    currentNumber = currentNumber - 1;
    currentNumberWraper.innerHTML = currentNumber
    if( currentNumber >= 0){
        color = red; 
    }
}



 