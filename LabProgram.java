import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed
      int i;
      int arrElements;

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
      /* Type your code here. */
      for (i = 0; i < numElements; i++) {
    	  arrElements = scnr.nextInt();
    	  userList[i] = arrElements;
      }
      for (i = numElements -1; i >= 0; i--) {
    	  //if (i >= 0) {
		  System.out.print(userList[i] + " ");
    	  //}
      }
	  System.out.println();
      scnr.close();
   }
}
