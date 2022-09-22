import java.util.Scanner;
/* Given four values representing counts of quarters, dimes, 
 * nickels and pennies, output the total amount as dollars and cents.
 * 
 * Output each floating-point value with two digits after the decimal point, 
 * which can be achieved as follows:
 * 
 * System.out.printf("Amount: $%.2f\n", dollars);
 * 
 * Ex: If the input is:
 * 4 3 2 1
 * 
 * where 4 is the number of quarters, 
 * 3 is the number of dimes, 
 * 2 is the number of nickels, 
 * and 1 is the number of pennies, the output is:
 * Amount: $1.41
 */
public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      int quartersCount;
      int dimesCount;
      int nickelsCount;
      int penniesCount;
      
      quartersCount = scnr.nextInt();
      dimesCount  = scnr.nextInt();
      nickelsCount = scnr.nextInt();
      penniesCount = scnr.nextInt();
      
      /*
       * Note that this is not complete. You can complete this
       * at home.
       */
      double  dollars = (quartersCount * .25) + (dimesCount *.10);
   
      System.out.printf("Amount: $%.2f\n", dollars);
   }
}