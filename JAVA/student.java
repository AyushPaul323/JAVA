//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
 class student//class begins
 {
    String name,DOB;
    int roll;
    Scanner sc=new Scanner (System.in);
    void getData()
    {
        System.out.println("Enter name,date of birth,and roll number of student..");
        name=sc.nextLine();
        DOB=sc.nextLine();
        roll=sc.nextInt();
    }
    void display()
    {
    System.out.println("The name of the student : "+name);
    System.out.println("The date of birth of the student : "+DOB);
    System.out.println("The roll no. of the student : "+roll);
    }
}//end of base class
   