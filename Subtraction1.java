import java.io.*;
import java.util.Scanner;
class Subtraction1{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1 =sc.nextInt();
int num2=sc.nextInt();
int sub=0;
if(num1>num2)
sub=num1-num2;
else
sub=num2-num1;
System.out.println(sub);
}
}