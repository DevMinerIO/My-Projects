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
}
