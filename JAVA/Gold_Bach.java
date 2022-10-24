//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
public class Gold_Bach//class begins
{
public static void main(String args[])//main begins
{
Scanner sc=new Scanner(System.in);
int i;int j;
System.out.println("Enter a number");
int N=sc.nextInt();
if(N<=9||N>50)
System.out.println("Invalid input,number is out of range.");
else if(N%2!=0)
System.out.println("Invalid Input, number is odd.");
else
{System.out.println("Odd prime pairs are:");
for(i=3;i<=N/2;i++)//odd primes start from 3 
{
int c=0;
for(j=1;j<=i;j++)//counts the number of digits in i
{
if(i%j==0)
c++;
}
int d=0;
for(j=1;j<=N-i;j++)//counts the number of digis in the difference of N and i
{
if((N-i)%j==0)
d++;
}
if(c==2&&d==2&&i%2!=0&&(N-i)%2!=0)//if both the numbers in the pair are odd primes
System.out.println(i+","+(N-i));}}
}//end of main
}//end of class