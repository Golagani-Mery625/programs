import java.util.Scanner;
class Scnr
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int a=sc.nextInt();
System.out.println("enter a string");
String s=sc.nextLine();
System.out.println(a+" "+s);
}
}