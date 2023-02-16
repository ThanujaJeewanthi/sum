import java.util.Scanner;
public class sum {
public static void main(String[] args)
{
int count=0;
int sum=0;
for (count=0;count<10;count++)
{

Scanner r=new Scanner(System.in);
System.out.println("Enter the  number");
int n=r.nextInt();
sum=sum +n;
}
System.out.println("The sum is "+sum);
}
}
