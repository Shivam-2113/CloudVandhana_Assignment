function SortDescending(arr) {
    const n = arr.length;

    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                const temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
const prompt = require("prompt-sync")();
const input = prompt("Enter the size of the array");
const arr = new Array(input);

for(let i = 0 ; i < input; i++){
    arr[i] = prompt();
}
SortDescending(arr);
const res = arr.map(item => item.trim());
console.log(res);