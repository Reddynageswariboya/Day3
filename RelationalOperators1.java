import java.util.Scanner;
public class RelationalOperators1{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter first number:");
int a=scan.nextInt();
System.out.println("Enter second number:");
int b=scan.nextInt();
System.out.println("Enter third number:");
int c=scan.nextInt();
if((a>b)&&(a>c))
System.out.println(a+"is greater than"+b+" and "+c);
else if((b>a)&&(b>c))
System.out.println(b+"is greater than"+a+"and "+c);
else
System.out.println(c+"is greater than"+a+"and "+b);
if((a<b)&&(a<c))
System.out.println(a+"is less than"+b+"and "+c);
else if((b<a)&&(b<c))
System.out.println(a+"is less than"+b+"and "+c);
else
System.out.println(c+"is less than"+a+"and "+b);
}
}


