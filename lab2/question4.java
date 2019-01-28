/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
  Scanner myScanner = new Scanner(System.in);
      System.out.print("\nEnter the total amount of the item: ");
      double totalAmt = myScanner.nextDouble();
      System.out.print("Enter the amount given to the cashier: ");
      double amtGiven = myScanner.nextDouble();
      
      
     
      double penny = 0.01;
      
     
      double changeDue = ( (double)((int) Math.round((amtGiven - totalAmt)*100)) / 100.0 );
    
      double modPence = ( (double)((int) Math.round((changeDue % penny)*100)) / 100.0 );
      
      
      int numPence = (int)((changeDue - modPence) / (penny));
      
      
      System.out.println("\nTotal amount of change to give: " + changeDue);
      
      System.out.println("Number of pence to give: " + numPence);
      
	}
}




   
  
      
    