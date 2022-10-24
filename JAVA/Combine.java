 //Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
//Program which combines two arrays into a single array and sorts the combined array
import java.io.*;
public class Combine
{//start of class
    static BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    int com[]; int size;
    
    Combine(int nn)
    {//start of Combine(int)
        size=nn;com=new int[size];
    }//end of Combine(int)
    
    void input_array()throws IOException
    {//start of input()
        System.out.println("Enter the elements of the array in ascending order");
        for(int i=0;i<size;i++)
        {
            com[i]=Integer.parseInt(x.readLine());
        }
    }//end of input()
    
    void sort()
    {
        for(int i=0;i<size-1;i++)
        {//start of major loop
            for(int j=i+1;j<size;j++)
            {//start of minor loo[
                if(com[j]<com[i])
                {
                    int t=com[j];
                    com[j]=com[i];
                    com[i]=t;
                }
            }
        }
    }
    
    void mix(Combine A,Combine B)
    {//start of MixArray(Combine)
        int i;
        for( i=0;i<A.size;i++)
        {
            com[i]=A.com[i];
        }
        for(int j=0;j<B.size;j++)
        {
            com[i++]=B.com[j];
        }
    }////end of MixArray(Combine)
    
    void display()
    {//start of display()
        for(int i=0;i<size;i++)
        {
            System.out.print(com[i]+" ");
        }
    }//end of display()
    
    public static void main()throws IOException
    {//start of main()
        System.out.println("Enter size of array 1.");
        int l=Integer.parseInt(x.readLine());
        Combine ob1=new Combine(l);
        ob1.input_array();
        System.out.println();
        System.out.println("Enter size of array 2.");
        l=Integer.parseInt(x.readLine());
        Combine ob2=new Combine(l);
        ob2.input_array();
        System.out.println();
        System.out.println("Array 1:");
        ob1.display();
        System.out.println();
        System.out.println("Array 2:");
        ob2.display();
        Combine ob4=new Combine(ob1.size+ob2.size);
        ob4.mix(ob1,ob2);
        ob4.sort();
        System.out.println("Combined Array,after sorting in ascending order:");
        ob4.display(); 
    }//end of start of main()
}//end of class 