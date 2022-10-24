//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
class quene
{
    int a[]=new int[10];
    int f,r;
    public quene()
    {
        f=0;
        r=0;
    }
    public void accept()
    { Scanner sc=new Scanner (System.in);
        System.out.println("Enter the array elements");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public void insert(int n)
    {
        if(f<10)
        {
            System.out.println("Inserted: "+n);
            a[f++]=n;
        }
        else
        System.out.println("Quene Overflowed");
    }
    public void delete()
    {
        if(r<=f)
        System.out.println("Deleted elements: "+a[r++]);
        else
        System.out.println("Quene Underflowed");
    }
    public void display()
    {
        for(int x=r;x<f;x++)
        {
            System.out.print(a[x]+" ");
        }
    }
    public void main()
    {
        int ch=1,p,m;
        Scanner sc=new Scanner(System.in);
        while(ch==1)
        {
            System.out.println();
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choise");
            p=sc.nextInt();
            switch(p)
            {
                case 1:
                System.out.println("Enter the value");
                m=sc.nextInt();
                insert(m);
                break;
                case 2:
                delete();
                break;
                case 3:
                display();
                break;
                case 4:
                ch=0;
                break;
                default :
                System.out.println("Wrong choise");
            }
        }
    }
}