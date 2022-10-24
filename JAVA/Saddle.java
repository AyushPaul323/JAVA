//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
//Program to find the Saddle Point of a 2D Array and specify the Saddle Point with its co-ordinates
import java.util.*;
class Saddle
{//start of class
    public static void main(String args[])
    {//start of main()
        Scanner br=new Scanner(System.in);
        int i,k,j,c1=0,t=0,c2=0,z=0,rc=0,cc=0;
        System.out.println("Enter the sides of the Matrix (n<20):");
        int n=br.nextInt();//accepting the no of rows and coloumns in a matrix
        if(n<20)
        {
            int a[][]=new int[n][n];
            System.out.println("Enter the elements of the Matrix:");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                    a[i][j]=br.nextInt();//accepting elements in the 2D array
            }
            System.out.println("The Matrix is :");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                    System.out.print(a[i][j]+" ");//printing the elements of the 2D Array
                System.out.println();
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    z=a[i][j];
                    c1=0;
                    c2=0;
                    for(k=0;k<n;k++)
                    {
                        if(z<=a[i][k])//checking if the element is the smallest in the coloumn
                            c1++;
                            cc=j;
                    }
                     for(k=0;k<n;k++)
                    {
                        if(z>=a[k][j])//checking if the element is the largest in the row
                            c2++;
                            rc=i;
                    }
                    if(c1==n && c2==n)
                    {
                        t=1;
                        System.out.println("Saddle Point: "+z+" at ("+rc+", "+cc+")");//printing the Saddle element along with its co-ordinates
                    }
                }
            }
            if(t!=1)
                System.out.println("There is No Saddle point");//printing that there is no Saddle element
        }
        else
        {
            System.out.println("Size exceeds the minimum limit");//printing error message
            System.exit(0);
        }
    }//end of main()
}//end of class