//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.io.*;//package and 
class Stack     //class declaration
{
static int n;
  int stk[];
  int top=-1;
Stack(int w[])//Constructor to initialize que[]
{ 
   stk=w;
}
public static void main(String args[])throws IOException//main() to display menu 
{                                                       //and run the functions
        BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of Stack :");
        n=Integer.parseInt(a.readLine()); 
        int v[]=new int[n];
        Stack ob=new Stack(v);
        System.out.println("Enter 1 to Insert element.");
        System.out.println("Enter 2 to Delete element.");
        System.out.println("Enter 3 to Display queue.");
        System.out.println("Enter 4 to exit.");
        int choice =Integer.parseInt(a.readLine());
        
        while(choice !=4)
        {
           if(choice==1)
           ob.Insert();
        
        if(choice==2)
        ob.Delete();
        if (choice==3)
        ob.Display();
        if(choice>4)
    {   System.out.println("Wrong Choice!!\n\n");}
        System.out.println("Enter 1 to Insert element.");
        System.out.println("Enter 2 to Delete element.");
        System.out.println("Enter 3 to Display Stack.");
        System.out.println("Enter 4 to exit.");
       choice =Integer.parseInt(a.readLine());
    }
}
public void Insert()throws IOException//Insert() function to 
{                                     //push elements
    BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
    if(top<n-1)
    {
        System.out.println("Enter Value:");
        int num=Integer.parseInt(a.readLine());
        stk[++top]=num;
    }
    else
    System.out.println("Stack overflow!");
}
public void Delete()//Delete() function to pop elements
{
    if(top>-1)         
      System.out.println("Element Deleted :"+stk[top--]);       
    else
      System.out.println("Stack Underflow!");
    }
public void Display()//Display() function to display array
    {
    if(top>-1)         
       {
      System.out.println("Elements are :");
      System.out.print(stk[0]);
     for(int i=1;i<top+1;i++)
      System.out.print(" , "+stk[i]);
      System.out.println();    
       }   
    else
     System.out.println("Stack Underflow!");
    }
} 