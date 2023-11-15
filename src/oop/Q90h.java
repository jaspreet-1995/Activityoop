package oop;
import java.util.Scanner;
public class Q90h {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i, j,k,space, row = 6;    
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of lines: ");
row = scanner.nextInt();  
  
space = row - 1;  
for (j = 1; j<= row; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space--;  
for (i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
space = 1;  
for (j = 1; j<= row - 1; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space++;  
for (i = 1; i<= 2 * (row - j) - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}  

}
