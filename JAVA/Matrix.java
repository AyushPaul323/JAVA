//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
class Matrix
{
    int arr[][];
    int m,n;
    Matrix(int mm, int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        int i,j;
        for(i=0;i<m;i++)
        {
           for(j=0;j<n;j++)
           {
               arr[i][j]=sc.nextInt();
            }
        }
    }
    Matrix Add(Matrix A)
    {
        int a,b;
        Matrix ob=new Matrix(A.m,A.n);
        for(a=0;a<A.m;a++)
        {
            for(b=0;b<A.n;b++)
            {
                ob.arr[a][b]=A.arr[a][b]+this.arr[a][b];
            }
        }
        return ob;
    }
    void display()
    {
        int x,y;
        for(x=0;x<m;x++)
        {
            for(y=0;y<n;y++)
            {
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        if(m1>25 || n1>25)
        {
            System.out.println("Out of range");
            System.exit(0);
        }
        Matrix A=new Matrix(m1,n1);
        Matrix B=new Matrix(m1,n1);
        Matrix C=new Matrix(m1,n1);
        System.out.println("Enter elements of first matrix");
        A.fillarray();
        System.out.println("Enter elements of second matrix");
        B.fillarray();
        System.out.println("First matrix -");
        A.display();
        System.out.println("Second matrix -");
        B.display();
        System.out.println("Final matrix after Addition");
        C=B.Add(A);
        C.display();
    }
}
