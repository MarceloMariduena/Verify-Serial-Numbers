// Author: https://github.com/MarceloMariduena

import java.util.Scanner;

public class VerifySerialMarceloMariduena {
 public static void main (String[] args) {
  // Scanner object
  Scanner input = new Scanner(System.in);
  
  // Prompt user for serial number
  System.out.println("Enter Serial Number: ");
  // Store serial number in variable serialNum
  String serialNum = input.nextLine();
  
  // Display the serial number's validity 
  System.out.println("Serial number " + serialNum + " verification: ");
  // Call the serial number validation method on the serial number
  System.out.println(validation(serialNum));
  
  // Run replace method if the serial number was valid
  if (validation(serialNum).equals("VALID")) {
   // Prompt user for a wildcard character
   System.out.println("Enter wild card character: ");
   // Assign the the first character of to input to the wildcard variable
   // I used a string since the replaceAll method only takes string parameters
   String wildcard = input.next().substring(0,1);
   
   // Call replace method to replace all non-dashes with the wildcard character
   replace(serialNum, wildcard);
  }
  input.close();
  
 }
 public static String validation(String s) {
  // The "\\w" regex matches all digits and letters. 
  // The plus sign in the regex matches one of more instances 
  if (s.matches("\\w+" + "-" + "\\w+" + "-" + "\\w+")) {
   return "VALID";
  } else {
   return "NOT VALID";
  }
 }
 public static void replace(String s, String w) {
  // replace all non-dashes of the string with the character
  System.out.println(s.replaceAll("\\w", w));
 }
}
