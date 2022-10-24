//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
//Program to print Smith Numbers between the inserted Upper Limit and Lower Limit
import java.util.*;
class Smith_number
{//start of class
    public static void main(String args[])
    {//start of main()
        Scanner br=new Scanner(System.in);
        int n=0,a,q=0,s=0,p=0,s2=0,x,y;
        System.out.println("enter lower and upper limit");
        x=br.nextInt();
        y=br.nextInt();
        System.out.println("All smith numbers are :-");
        for(int j=x;j<=y;j++)
        {//outer looping statement starts
            a=j;p=a;s=0;s2=0;n=0;
            for(int i=1;i<=a;i++)
            {//looping statement starts
                if(a%i==0)
                    n++;
            }//end of looping statement
            
            if (n>2)
            {//condition checking
                while(a>0)
                {//start of first while loop 
                    q=a%10;
                    s=s+q;
                    a=a/10;
                }//end of first while loop

                while (p>1)
                {//start of second while loop
                    for (int i=2;i<=p;i++)
                    {// start of second looping statement
                        if(p%i==0)
                        {//condition checking
                            if(i<10)
                                s2=s2+i;
                            else
                            {
                                q=i;
                                while(q>0)
                                {
                                    s2=s2+q%10;
                                    q=q/10;
                                }
                            }
                            p=p/i;
                            break;
                        }//end of condition checking
                    }//end of second looping statement
                }//end of second while loop
                if(s==s2)
                    System.out.println(j);
            }//end of condition checking
        }//outer looping statement ends
    }//end of main()
}//end of class