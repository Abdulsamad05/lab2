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
 
     int num1;  
        int num2;   
        int q; 
        int p;
        int num3;
        int num4;
        q = s.nextInt();
         p= s.nextInt();
         System.out.println("pick a number for q : " +q);
         System.out.println("pick a number for p : " +p);
         
        num1 = (int)(Math.random()*2) + 0;
        num2 = (int)(Math.random()*q) + 52;
        num3 = (int)(Math.random()*q) + 1;
        num4 = (int)(Math.random()*q) + p;
        
        System.out.println("The random number btw 1 and 0 " + num1);
        System.out.println("The random number btw 0 and q is : " + num2);
        System.out.println("The random number btw 0 and q is : " + num3);
        System.out.println("The random number btw q and p is : " + num4);
        

	}
}




   
  
      
    