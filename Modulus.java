import java.util.Scanner;
class Modulus{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1 =sc.nextInt();
int num2=sc.nextInt();
int mod=0;
System.out.println("num1="+num1);
System.out.println("num2="+num2);
mod=num1%num2;
System.out.println("the mod="+mod);
System.out.println(num1+"%"+num2+"="+mod);
}
}