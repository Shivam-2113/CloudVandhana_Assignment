function reverseWords(sentence) {
    // Split the sentence into words using space as the delimiter
    const words = sentence.split(' ');

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        // Reverse the characters in each word
        const reversedWord = word.split('').reverse().join('');
        return reversedWord;
    });

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const prompt = require("prompt-sync")();
const inputSentence = prompt("Enter the string");
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);