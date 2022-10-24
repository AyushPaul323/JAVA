//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
//Program to check if the inserted number is Bouncy or not
import java.util.*;
public class Bouncy_number
{//start of class
    boolean isIncreasing(int n)
    {//start of isIncreasing(int)
        String s=Integer.toString(n);
        char ch;
        int f=0;
        for(int i=0;i<s.length()-1;i++)
        {//looping statement starts
            ch=s.charAt(i);
            if(ch>s.charAt(i+1))//if any digit is more than one digit we have to stop checking
            {
                f=1; 
                break;
            }
        }//end of looping statement
        if(f==1)
            return false;
        else
            return true;
    }//end of isIncreasing(int)
    boolean isDecreasing(int n)
    {//start of isDecreasing(int)
        String s=Integer.toString(n);
        char ch;
        int f=0;
        for(int i=0;i<s.length()-1;i++)
        {
            ch=s.charAt(i);
            if(ch<s.charAt(i+1))//If any digit is less than next digit then we have to stop checking
            {
                f=1;
                break;
            }
        }
        if(f==1)
            return false;
        else
            return true;
    }//end of isDecreasing(int)
    void isBouncy(int n)
    {//start of isBouncy(int)
        if(isIncreasing(n)==true)
            System.out.println("The number "+n+" is Increasing and Not Bouncy");//printing result
        else if(isDecreasing(n)==true)
            System.out.println("The number "+n+" is Decreasing and Not Bouncy");//printing result
        else
            System.out.println("The number "+n+ " is Bouncy");//printing result
    }//end of isBouncy(int)
    public static void main(String args[])
    {//start of main()
        Scanner sc=new Scanner(System.in);
        Bouncy_number ob=new Bouncy_number();
        System.out.println("Enter a number");
        int n=sc.nextInt();//accepting the number
        ob.isBouncy(n);
    }//end of main()
}//end of class