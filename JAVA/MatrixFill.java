//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
 class MatrixFill
{ //class starts
    public static void main(String args[])
    { //main function starts
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the matrix:");
        int n=sc.nextInt();
        if(n<2 || n>10)
        System.out.println("Size out of range");
        else
        {   //Entering the characters
            char A[][]=new char[n][n];
            System.out.print("Enter the 1st character:");
            char c1=sc.next().charAt(0);
            System.out.print("Enter the 2nd character:");
            char c2=sc.next().charAt(0);
            System.out.print("Enter the 3rd character:");
            char c3=sc.next().charAt(0);
            for(int i=0;i<n;i++)//Matrix designing
            {
                for(int j=0;j<n;j++)
                {
                    if(i==j || (i+j)==(n-1))
                    A[i][j]=c3;
                    else
                    A[i][j]=c2;
                }
            }
            for(int i=0;i<n/2;i++)
            {
                for(int j=i+1;j<n-1-i;j++)
                {
                    A[i][j]=c1;
                    A[n-1-i][j]=c1;
                }
            }
            System.out.println("\nOutput :\n");
            for(int i=0;i<n;i++)
            { //printing the matrix
                for(int j=0;j<n;j++)
                {
                    System.out.print(A[i][j]+"");
                }
                System.out.println();
            }
        }
    }//main function ends
}//class ends