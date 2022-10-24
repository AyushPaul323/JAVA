//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
//A Program to accept an array, sort it and perform binary search using Recursion
import java.util.*;
class BinSearch
{//start of class
    public static void main(String args[])
    {//start of main()
        Scanner br=new Scanner(System.in);
        int i,j,val,n,t,pos;
        System.out.println("Enter the no. of elements in the array");
        n=br.nextInt();//accepting the size of array
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter :");
            a[i]=br.nextInt();
        }
        for(i=0;i<n-1;i++)
        {//start of major loop
            for(j=i+1;j<n;j++)
            {//start of minor loop
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }//end of minor loop
        }//end of major loop
        System.out.println("Enter the element to be searched in the sorted array");
        val=br.nextInt();//accepting the element to be searched
        BinSearch ob=new BinSearch();//object creation
        pos=ob.binary(a,0,n-1,val);//calling binary(int,int,int,int)
        if(pos==-1)
            System.out.println("Value not found");
        else
        {
            System.out.print("\nValue is at "+pos+" position of sorted array \n\n"+a[0]);
            for(i=1;i<n;i++)
                System.out.print(","+a[i]);
            System.out.println();
        }
    }//end of main()
    
    int binary(int b[],int ul,int ll,int value)
    {//start of binary(int,int,int,int)
        int mid=(ll+ul)/2;//updating mid position
        if(value==b[mid])
            return mid;
        else if(ll<ul)
            return -1;
        else if(value>b[mid])
            return binary(b,mid+1,ll,value);
        else if(value<b[mid])
            return binary(b,ul,mid-1,value);
        else
            return -2;
    }//end of binary(int,int,int,int)
}//end of class