function createCheckDigit(membershipId) {
  let numbersArray = membershipId.toString().split("");
  let sum = 0;
  console.log('this is numbersArray' + numbersArray);
  for (let i = 0; i < numbersArray.length; i++) {
    sum += parseInt(numbersArray[i]);
  }
  console.log("this is the total number" + parseInt(sum));
  let toReturn = sum;
  // recursion
  if (sum.toString().length > 1) {
    createCheckDigit(sum);
  } else {
    console.log('sum is::::::' + sum);
    return toReturn;
  }

}

console.log(createCheckDigit("55555"));