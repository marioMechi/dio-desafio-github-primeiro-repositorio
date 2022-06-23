const maca = {
    value: 2,
}
const laranja = {
    value: 3,
}
function mapComThis(arr, thisArg) {
    return arr.map(function(item){
        return item * this.value;
    }, thisArg);
}
const nums = [1, 2];

console.log('quando -> maçã', mapComThis(nums, maca));

console.log('quando -> laranja', mapComThis(nums, laranja));