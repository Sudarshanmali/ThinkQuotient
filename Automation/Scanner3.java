class Scanner3
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter The Name");
String name=scn.next();
System.out.println("Enter The Age");
int age=scn.nextInt();
System.out.println("Enter The Gender");
char gender=scn.next().charAt(0);
System.out.println("Name="+name+",Age="+age+",Gender="+gender);
}
}
