//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
class No_sort
{ //class starts
    int num[];
    String Num_name(int a)
    {//storing the word form of the digits
        String s[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        return s[a];
    }

    void Sort(int x)
    { //function to sort 
        for(int i=0;i<x;i++)
        {
            for(int j=1;j<(x-i);j++)
            {
                if(num[j-1]<num[j])
                {
                    int t=num[j-1];
                    num[j-1]=num[j];
                    num[j]=t;
                }
            }
        }
    }
  public static void main()
    { //main function starts
        No_sort obj=new No_sort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n>1000)
            System.out.println("Out of range");
        else
        {
            int f=0;
            if(n<0)
            {
                System.out.println("Number is negetive");
                n=Math.abs(n);
                f=1;
            }
            int copy=n,c=0;
            while(copy>0)
            {
                copy/=10;
                c++;
            }
            obj.num=new int[c];
            if (f==1)
                System.out.print("Absolute value is ");//finding the absolute value
            for(int i=0;i<c;i++)
            {
                obj.num[i]=n/(int)(Math.pow(10,(c-i-1)));
                n%=Math.pow(10,(c-i-1));
                System.out.print(obj.Num_name(obj.num[i])+" ");
            }
            System.out.println();
            //finding the maximun number possible
            if(f==0)
            {
                obj.Sort(c);
                System.out.println("Highest form:");
                for(int i=0;i<c;i++)
                {    System.out.print(obj.num[i]+"");
                }
               
                System.out.println(" in word form:");
                for(int i=0;i<c;i++)
                {    
                    System.out.print(obj.Num_name(obj.num[i])+" ");
                   
                }
            }
        }
    }//main function ends
}//class ends