import java.util.*;
public class calculatorfunction
{

public static void main (String args[])
{

System.out.print("Enter the value of a:");
Scanner a1 = new Scanner(System.in);

int a = a1.nextInt();
System.out.print("Enter the value of b:");
Scanner b1 = new Scanner(System.in);

int b = b1.nextInt();

int sum = a+b;

System.out.println("The Sum of the number is"+" "+sum);

System.out.print("Enter the value of c:");
Scanner c1 = new Scanner(System.in);

int c = c1.nextInt();
System.out.print("Enter the value of d:");
Scanner d1 = new Scanner(System.in);

int d = d1.nextInt();

int minus = c-d;

System.out.println("The subtract of the number is"+" "+minus);


System.out.print("Enter the value of e:");
Scanner e1 = new Scanner(System.in);

int e = e1.nextInt();
System.out.print("Enter the value of f:");
Scanner f1 = new Scanner(System.in);

int f = f1.nextInt();

int multiply = e*f;

System.out.println("The multiply number is "+" "+multiply);

System.out.print("Enter the value of e:");
Scanner g1 = new Scanner(System.in);

int g = g1.nextInt();
System.out.print("Enter the value of f:");
Scanner h1 = new Scanner(System.in);

int h = h1.nextInt();

int modulus = g%h;

System.out.println("The multiply number is "+" "+modulus);
}
}

