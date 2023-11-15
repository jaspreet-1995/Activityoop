package oop;
import java.util.Scanner;
public class Q90d {
	public static void main(String[] args) {
		// TODO Auto-generated method s

		 int i, j,k, rows;
		  Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter the number of lines: ");
        rows = scanner.nextInt();

	for (i= 1; i<= rows ; i++)  
{  
for (j=i; j <rows ;j++)              
{  
System.out.print(" ");  
}  
for (k=1; k<=i;k++)   
{  
System.out.print("*");   
}   
System.out.println("");   
}   
for (i=rows; i>=1; i--)  
{  
for(j=i; j<=rows;j++)  
{  
System.out.print(" ");  
}  
for(k=1; k<i ;k++)   
{  
System.out.print("*");  
}  
System.out.println("");  
}  

}  

}
