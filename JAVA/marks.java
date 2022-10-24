import java.util.*;
class marks extends student//child class begins
    {
        double tot,per;
        char gd;
        Scanner sc=new Scanner (System.in);
        void readData()
    {
        getData();
        System.out.println("Enter total marks out of 500.");
        tot=sc.nextInt();
    }
    void compute()//caculating grade
    {
        per=tot/5;
        if(per>=85)
        gd='A';
        if(per>=60 && per<85)
        gd='B';
        if(per>=40 && per<60)
        gd='C';
        if(per<40)
        gd='D';
    }
    void showData()
    {
        display();
        System.out.println("Total marks : "+tot);
        System.out.println("Percentage : "+per);
        System.out.println("Grade : "+gd);
    }
    public static void main(String args[])//main begins
    {
        marks ob=new marks();
        ob.readData();
        ob.compute();
        ob.showData();
    }//end of main
}//end of child class