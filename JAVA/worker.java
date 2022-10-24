//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
class worker//class begins
{   
   String name;
  double basic; 
  worker(String s,double n)//parameterised constructor to initialise name and basic
  {
      name=s;
      basic=n;}
  void display()//display the worker details
  {
      System.out.println("Name of the employee : "+name);
      System.out.println("Basic salary of the employee : "+basic);}
}
 