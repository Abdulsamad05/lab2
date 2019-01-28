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
   Scanner s = new Scanner(System.in);
  int x;
      System.out.print("Enter a three digit  number : ");
      x = s.nextInt();
int  y, z;

z = x % 1000;
y = z /100;
System.out.println("\n The digit in the Hundred's place = "+y);

z = z % 100;
y = z / 10;
System.out.println("\n The digit in the Ten's place = "+y);

y = z % 10;
System.out.println("\n The digit in the Unit's place = "+y);

      
     
	}
}




   
  
      
    