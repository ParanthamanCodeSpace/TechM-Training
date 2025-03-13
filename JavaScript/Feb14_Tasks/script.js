// 1. Get user input and calculate cube
let num = prompt("Enter a number: ");
number = Number(number);

if (!isNaN(number)) {
    let cube = number ** 3;
    alert(`The cube of ${number} is ${cube}`);
    console.log(`The cube of ${number} is ${cube}`);
} else {
    alert("Enter a valid number");
    console.log("Enter a valid number");
}

// 2. Check number is positive or negative
var number = prompt("Enter a number:");
number = Number(number);

if (!isNaN(number)) {
    if (number >= 0) {
        alert(`${number} is positive`);
        console.log(`${number} is positive`);
    } else {
        alert(`${number} is negative`);
        console.log(`${number} is negative`);
    }
} else {
    alert("Please enter a valid number.");
    console.log("Invalid number input.");
}

// 3. Check prime number
const primeNumber = Number(prompt("Enter a number to check for prime:"));
let isPrime = true;

if (isNaN(primeNumber) || !Number.isInteger(primeNumber)) {
    alert("Please enter a valid integer.");
} else {
    if (primeNumber < 2) {
        isPrime = false;
    } else {
        for (let i = 2; i <= Math.sqrt(primeNumber); i++) {
            if (primeNumber % i === 0) {
                isPrime = false;
                break;
            }
        }
    }
    alert(`${primeNumber} is ${isPrime ? "a prime number" : "not a prime number"}`);
    console.log(`${primeNumber} is ${isPrime ? "a prime number" : "not a prime number"}`);
}

// 4. Display user address
let address = prompt("Enter your address:");
alert(`Your address is: ${address}`);
console.log(`Your address is: ${address}`);

// 5. Confirmation box for movie plan
let willGoToFilm = confirm("Will you go to the film today?");
console.log(willGoToFilm ? "User will go to the film today." : "User will not go to the film today.");

// 6. Get user age
let age = prompt("Enter your age:");
age = Number(age);

if (!isNaN(age) && age > 0) {
    console.log(`Your age is ${age}`);
} else {
    console.log("Invalid age entered.");
}

// 7. Check if number is divisible by 12
let checkNum = prompt("Enter a number:");
checkNum = Number(checkNum);

if (!isNaN(checkNum)) {
    if (checkNum % 12 === 0) {
        alert(`${checkNum} is divisible by 12`);
        console.log(`${checkNum} is divisible by 12`);
    } else {
        alert(`${checkNum} is not divisible by 12`);
        console.log(`${checkNum} is not divisible by 12`);
    }
} else {
    alert("Enter a valid number.");
    console.log("Invalid number input.");
}

// 8. Tomato price calculationlet 
prices = [];
let days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];

for (let i = 0; i < 7; i++) {
    let price = parseFloat(prompt(`enter amount on ${days[i]} `));
 if (isNaN(price) || price <= 0){
    alert("enter valid amount...");
    i--;
    continue;
    } prices.push(price);
}   

let total = prices.reduce((sum, price) => sum + price, 0);
let average = total/7;

if (average > 50) {
    alert("Tomato is profitable...")
} else {
    alert("Tomato is not profitable...")
}

// 9. Leap year check
function isLeapYear(year) {
    return (year % 4 === 0) && (year % 100 !== 0 || year % 400 === 0);
}

// Get user input for year and month
let year = parseInt(prompt("Enter a year:"));
let month = parseInt(prompt("Enter a month (1-12):"));

// Validate input
if (isNaN(year) || isNaN(month) || month < 1 || month > 12) {
    alert("Please enter a valid year and month (1-12).");
} else {
    if (isLeapYear(year)) {
        if (month === 2) {
            alert(`The year ${year} is a leap year and the month is February with 29 days.`);
        } else {
            alert(`The year ${year} is a leap year and the month is not February.`);
        }
    } else {
        alert(`The given year ${year} is not a leap year.`);
    }
}

// 10. Get the Maths score from the user
let mathScore = prompt("Enter your Maths score:");
mathScore = Number(mathScore);

if (isNaN(mathScore) || mathScore < 0 || mathScore > 100) {
    alert("Please enter a valid score between 0 and 100.");
    console.log("Invalid input. Score must be between 0 and 100.");
} else {
    if (mathScore === 100) {
        alert("Phenomenal!");
        console.log("Phenomenal!");
    } else if (mathScore > 85) {
        alert("Excellent!");
        console.log("Excellent!");
    } else if (mathScore >= 71) {
        alert("Good work!");
        console.log("Good work!");
    } else if (mathScore >= 51) {
        alert("Practice well!");
        console.log("Practice well!");
    } else {
        alert("Hard work is needed.");
        console.log("Hard work is needed.");
    }
}

// 11. Day of the week
let day = prompt("Enter the day of the week: ").trim().toLowerCase();

switch(day){
    case "monday":
        alert("Start of the week");
        console.log("Start of the week");
        break;

    case "tuesday":
    case "wednesday":
    case "thursday":
        alert("Mid of the week");
        console.log("Mid of the week");
        break;

    case "friday":
        alert("Last working day of the week");
        console.log("Last working day of the week");
        break;

    case "saturday":
        alert("Weekend Saturday");
        console.log("Weekend Saturday");
        break;

    case "sunday":
        alert("Weekend Sunday");
        console.log("Weekend Sunday");
        break;
    
    default:
        alert("Invalid input");
        console.log("Invalid input");
}

// 12. Multiplication Table

let number = parseInt(prompt("Enter the number to generate the multiplication table:"));
let limit = parseInt(prompt("Enter the limit for multiplication:"));

// Validate input
if (isNaN(number) || isNaN(limit) || number <= 0 || limit <= 0) {
    alert("Please enter valid positive numbers.");
} else {
    let result = (`Multiplication Table of ${number} up to ${limit}:\n`);
    
    // Generate the multiplication table
    for (let i = 1; i <= limit; i++) {
        result += (`${number} * ${i} = ${number * i}\n`);
    }
    
    // Display the result
    alert(result);
    console.log(result); // Also log to the console for better visibility
}

//13. Get two numbers, the third number is the sum of second number and 40. 

let num1 = parseInt(prompt("Enter num1: "));
let num2 = parseInt(prompt("Enter num2: "));
let num3 = num2 + 40;
let output = "";

let i = num2;  // Declare i before the loop
while (i <= num3) {
  if (i % 7 === 0) {
    output += i + " ";
  }
  i++;  // Increment i inside the loop
}

console.log(output);

//14. Skip multiples of 7


let start = parseInt(prompt("Enter the starting number:"));
let end = parseInt(prompt("Enter the ending number:"));

// Validate input
if (isNaN(start) || isNaN(end) || end < start) {
    alert("Please enter valid numbers where the end is greater than the start.");
} else {
    let output = `Numbers from ${start} to ${end}, stopping at multiples of 7:\n`;

    // Loop through numbers and check for multiples of 7
    for (let i = start; i <= end; i++) {
        if (i % 7 === 0) {
            output += `\nStopped at ${i} (Multiple of 7)`;
            break; // Stop the loop when a multiple of 7 is found
        }
        output += i + " ";
    }

    // Display result
    alert(output);
    console.log(output);
}
 
//15. Skip multiples of 5

let start_num = parseInt(prompt("Enter the starting number:"));
let end_num = parseInt(prompt("Enter the ending number:"));

// Validate input
if (isNaN(start_num) || isNaN(end_num) || end_num < start_num) {
    alert("Please enter valid numbers where the end is greater than the start.");
} else {
    let output = `Numbers from ${start_num} to ${end_num}, stopping at multiples of 7:\n`;

    // Loop through numbers and check for multiples of 7
    for (let i = start_num; i <= end_num; i++) {
        if (i % 5 === 0) {
            output += `\nStopped at ${i} (Multiple of 7)`;
            break; // Stop the loop when a multiple of 7 is found
        }
        output += i + " ";
    }

    // Display result
    alert(output);
    console.log(output);
}
