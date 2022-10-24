/**
 * HERE ARE MY EXAMPLE EXERCISES AND PROBLEMS I HAVE SOLVED
 */

public class Exercises {
   public static void main(String[] args) {
      // simple console logs to ensure my new vs code setup is working for Java
      System.out.println("Hello i am working");
      System.out.println("test 2");

      // Operator challenge: create 2 variables, add together, and muliply. Then use
      // remainder operator to see if = to zero. lastly use and if statement to print
      // out the answer
      double a = 20d;
      double b = 80d;
      double answer = (a + b) * 100d;
      double result = answer % 40.00d;
      boolean equalsZero = false;
      if (result == 0) {
         equalsZero = true;
      }
      System.out.println("is the remainder equal to zero?: " + equalsZero);

      // Sum of numbers between 1-1000, divisible by both 3 and 5. Print the numbers,
      // and break the loop when 5 numbers have been found
      int counter = 0;
      int sum = 0;
      for (int i = 1; i <= 1000; i++) {
         if ((i % 3 == 0) & (i % 5 == 0)) {
            System.out.println("found number" + i);
            sum += i;
            counter++;
         }
         if (counter == 5) {
            break;
         }
      }
      System.out.println("sum is: " + sum);
      System.out.println("sum digits method for 125 is: " + sumDigits(125));
      // string concatination
      // System.out.println(numberToWords(123));

      numberToWords(611230);
      numberToWords(1010);
      getDigitCount(1010);
   }

   // create 2 methods for kilo/miles conversion
   public static long toMilesPerHour(double kilometersPerHour) {
      if (kilometersPerHour < 0) {
         System.out.println("invalid number");
         return -1;
      }
      return Math.round(kilometersPerHour / 1.609);
   }

   public static void printConversion(double kilometersPerHour) {
      if (kilometersPerHour < 0) {
         System.out.println("Invalid Value");
      } else {
         System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
      }
   }

   // 2 different methods for day of the week.
   public static void printDayOfTheWeek(int day) {
      switch (day) {
         case 0:
            System.out.println("Sunday");
            break;
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesday");
         case 3:
            System.out.println("Wednesday");
            break;
         case 4:
            System.out.println("Thursday");
            break;
         case 5:
            System.out.println("Friday");
            break;
         case 6:
            System.out.println("Saturday");
            break;
         default:
            System.out.println("Invalid day");
      }
   }

   public static void otherPrintDayOfTheWeek(int day) {
      if (day < 0 || day > 6) {
         System.out.println("invalid day");
      }
      if (day == 0) {
         System.out.println("Sunday");
      }
      if (day == 1) {
         System.out.println("Monday");
      }
      if (day == 2) {
         System.out.println("Tuesday");
      }
      if (day == 3) {
         System.out.println("Wednesday");
      }
      if (day == 4) {
         System.out.println("Thursday");
      }
      if (day == 5) {
         System.out.println("Friday");
      }
      if (day == 6) {
         System.out.println("Saturday");
      }
   }

   // if a number is greater than 10, return the sum of each digit. EX 125 = 1+2+5
   public static int sumDigits(int number) {
      // invalid value
      if (number < 10) {
         System.out.println("invalid value");
         return -1;
      }
      int sum = 0;
      while (number > 0) {
         System.out.println("remaining digits are:" + number);
         // extract the last digit.
         int toAdd = number % 10;
         sum += toAdd;
         // drop the last digit
         number /= 10;
      }
      return sum;

   }

   // numbers to words Section 5 Exercise 23
   // Take in a number, write out each number as a word.
   public static void numberToWords(int number) {
      if (number < 0) {
         System.out.println("Invalid Value");
      }
      String wordToReturn = "";
      int reverseNumber = reverse(number);
      System.out.println("reverse of " + number + " returns: " + reverseNumber);
      int digitLength = getDigitCount(number);
      System.out.println("digit length is:" + digitLength);
      for (int i = 0; i < digitLength; i++) {
         switch (reverseNumber % 10) {
            case 0:
               wordToReturn += "zero ";
               break;
            case 1:
               wordToReturn += "one ";
               break;
            case 2:
               wordToReturn += "two ";
               break;
            case 3:
               wordToReturn += "three ";
               break;
            case 4:
               wordToReturn += "four ";
               break;
            case 5:
               wordToReturn += "five ";
               break;
            case 6:
               wordToReturn += "six ";
               break;
            case 7:
               wordToReturn += "seven ";
               break;
            case 8:
               wordToReturn += "eight ";
               break;
            case 9:
               wordToReturn += "nine ";
               break;
            default:
               wordToReturn += "Zero";

         }
         reverseNumber /= 10;
      }
      System.out.println(wordToReturn);
   }

   public static int reverse(int number) {
      int reversed = 0;
      while (number != 0) {
         // add last digit to the reversed number
         reversed = (reversed * 10) + number % 10;
         // remove the last digit
         number /= 10;
      }
      return reversed;
   }

   public static int getDigitCount(int number) {
      if (number < 0) {
         return -1;
      }
      int toReturn = String.valueOf(number).length();
      System.out.println("getDigitCount is:" + toReturn);
      return toReturn;
   }

   // Write a method that finds the first and last digit of the parameter number.
   // Use a loop, and return the sum of those 2 numbers
   public static int sumFirstAndLastDigit(int number) {
      if (number < 0) {
         return -1;
      }
      int lastNumber = number % 10;
      int firstNumber = 0;
      while (number != 0) {
         firstNumber = number % 10;
         number = number / 10;
      }
      return firstNumber + lastNumber;
   }

}
