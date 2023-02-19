//write a program that reads in five whole numbers from the user. The program will calculate and output the following statistics about the five numbers: The sum of all of the positive numbers (greater than zero), The sum of all of the non-positive numbers (less than or equal to zero), The sum of all five numbers, The average of all of the positive numbers (greater than zero), The average of all of the non-positive numbers (less than or equal to zero), and the average of all five numbers.

    import java.util.Scanner;

public class PA2b {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter five whole numbers: ");
       String[] nums = input.nextLine().split(" ");
       int[] numbers = new int[5];
       int positiveCount = 0;
       int countNegative = 0;
       int sumPositive = 0;
       int sumNegative = 0;
       int overallSum = 0;

       for (int i = 0; i < 5; i++) {

           int number = Integer.parseInt(nums[i]);
           numbers[i] = number;
           if (number > 0) {
               positiveCount++;
               sumPositive += number;
           } else {
               countNegative++;
               sumNegative += number; 
           }
       }

       if (positiveCount == 1) {
           System.out.println("The sum of the " + positiveCount + " non-positive numbers: " + sumPositive);
       } else {
           System.out.println("The sum of the " + positiveCount + " positive numbers: " + sumPositive);
       }
       if (countNegative == 1) {
           System.out.println("The sum of the " + countNegative + " negative number: " + sumNegative);
       } else {
           System.out.println("The sum of the " + countNegative + " negative numbers: " + sumNegative);
       }
       if (overallSum == 1) {
           System.out.println("The sum of the " + positiveCount + " non-positive numbers: " + sumPositive);
       }
       double averagePositive = 0.00;
       double averageNegative = 0.00;
       double averageAll = 0.00;
       
       if (positiveCount > 0) {
           averagePositive = (double) sumPositive / positiveCount;
       }
       if (positiveCount > 0) {
           averageNegative = (double) sumNegative / countNegative;
       }
       averageAll = (double) (sumNegative + sumPositive) / 5;

       if (positiveCount == 1) {
           System.out.println("The average of the " + positiveCount + " positive number: " + averagePositive);
       } else {
           System.out.println("The average of the " + positiveCount + " positive numbers: " + averagePositive);
       }
       if (positiveCount == 1) {
           System.out.println("The average of the " + countNegative + " negative number: " + averageNegative);
       } else {
           System.out.println("The average of the " + countNegative + " negative numbers: " + averageNegative);
       }

       System.out.println("The average of the 5 numbers: " + averageAll);

   }

}
