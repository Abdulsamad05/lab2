/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
        int r, h;
        double l, area, volume, pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the height of cone:");
        h = s.nextInt();
        System.out.print("Enter the radius of cone:");
        r = s.nextInt();
        l = Math.sqrt((r * r) + (h * h));
        area = (pi * r * l) + (pi * r * r);
        System.out.println("Surface Area of cone:"+area);
        volume = 0.333 * pi * r * r * h;
        System.out.println("Volume of cone:"+volume);
    

	}
}
