import java.util.*;
class wages extends worker//child class 
  {
  int hrs,rate;  double wage;
  wages(String s,double n,int h,int r)
  {
      super(s,n);
      hrs=h;
      rate=r;
  }
  double overtime()//calculating overtime amount
  {
      return(hrs*rate);}
  void display()
  {
      super.display();
      wage=overtime()+ basic;
      System.out.println("No of hours worked : "+hrs);
      System.out.println("Total salary of the employee : "+wage);
}
public static void main(String args[])//main begins
{
        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name of worker, basic pay,rate per hour, and hours worked overtime. ");
         String u=sc.nextLine();
         double v=sc.nextDouble();
         int y=sc.nextInt();
         int z=sc.nextInt();
         wages ob=new wages(u,v,z,y);
         ob.display();
       }//end of main        
}//end of class