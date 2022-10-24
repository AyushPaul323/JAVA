//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
class Denomination
{//start of class
    public static void main()
    {//start of main()
        Scanner br=new Scanner(System.in);
        System.out.println("Enter amount:");
        String N=br.nextLine(), w="", m[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        int n, p, a[]={2000,500,200,100,50,20,10,5,2,1}, b, q, t, c=0;
        n=Integer.parseInt(N);
        if(n<=99999)
        {
        p=n; b=n;
        while(p>0)
        {//start of while loop
            w=m[p%10]+" "+w;
            p/=10;
        }//end of while loop
        System.out.println(w);
        System.out.println("DENOMINATIONS:");
        for(int i=0;i<10;i++)
        {//looping statement starts
            if(b/a[i]>0)
            {//condition checking
                q=b/a[i];t=a[i]*q;b=b%a[i];c+=q;
                System.out.println(a[i]+"*"+q+"="+t);
            }//end of condition checking
        }//end of looping statement
        System.out.println("Total="+n);//printing output
        System.out.println("TOTAL NUMBER OF NOTES="+c);//printing output
    }
    else
    System.out.println("INVALID AMOUNT");
    }//end of main()
}//end of class 