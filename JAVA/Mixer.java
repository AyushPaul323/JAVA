//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
class Mixer
{
    int arr[];
    int n;
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        int p;
        for(p=0;p<n;p++)
        arr[p]=sc.nextInt();
    }
    Mixer mix(Mixer A)
    {
        int i,j;
        Mixer ob = new Mixer(A.n+this.n);
        for(i=0;i<A.n;i++)
        ob.arr[i]=A.arr[i];
        
        for(j=A.n;j<A.n+this.n;j++)
        ob.arr[j]=this.arr[j-A.n];
        
        return ob;
    }
    void display()
    {
       int x;
       for(x=0;x<n;x++)
       System.out.print(arr[x] + " ");
       System.out.println();
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n1=sc.nextInt();
        Mixer A=new Mixer(n1);
        System.out.println("Enter elements of first array in ascending order");
        A.accept();
        System.out.println("Enter size of second array");
        int n2=sc.nextInt();
        Mixer B=new Mixer(n2);
        System.out.println("Enter elements of second array in ascending order");
        B.accept();
        System.out.println("First array -");
        A.display();
        System.out.println("Second array -");
        B.display();
        System.out.println("Array after merging");
        Mixer C = new Mixer(n1+n2);
        C=B.mix(A);
        C.display();
    }
}