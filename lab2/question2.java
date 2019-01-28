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
   Scanner sc = new Scanner(System.in);
  
      System.out.print("Enter amount: ");
      double principal = sc.nextDouble(); 
 
      
      System.out.print("Enter Yearly Interest Rate: ");
      double rate = sc.nextDouble(); 
 
      
      rate = rate/100/12; 
 
      
      System.out.print("Enter Term (years): ");
      int term = sc.nextInt();
 
      
      term = term * 12; 
 
      double payment = (principal * rate) / (1 - Math.pow(1 + rate, -term));
 
      
      payment = (double)Math.round(payment * 100) / 100;
 
      System.out.println("Payment: " + payment);
 
	}
}




   
  
      
    