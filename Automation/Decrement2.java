class Decrement2
{
public static void main(String[] args)
{
int a=1;
int b=1;
a=--a - b--;
b=a-- - b--;
System.out.println("a="+a);
System.out.println("b="+b);

}
}