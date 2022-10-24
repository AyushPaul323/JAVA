//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
//Program to check if the inserted number is Keith Number or not
import java.util.*;
class Keith
{//start of class
    public static void main(String args[])
    {//start of main()
        int i,c=0,p,n,sum=0,x;
        Scanner br=new Scanner(System.in);
        c=0;sum=0;
        System.out.println("Enter the no.");
        n=br.nextInt();p=n;
        while(p>0)
        {
            p=p/10;
            c++;//counting digits
        }
        int A[]=new int[c];
        p=n;i=c-1;//array making
        while(p>0)
        {//checking for Keith logic
            A[i--]=p%10;
            p=p/10;
        }
        x=0;
        while(A[c-1]<=n)
        {
            sum=0;
            for(i=0;i<c;i++)
                sum=sum+A[i];
            if(sum==n)//checking for validity
            {
                System.out.println("Is a Keith Number");//printing the result
                x=1;
                break;
            }
            for(i=1;i<c;i++)
                A[i-1]=A[i];
            A[c-1]=sum;
        }
        if(x==0)
            System.out.println("Is not a Keith Number");//printing the result
    }//end of main()
}//end of class