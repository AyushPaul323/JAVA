//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.io.*;
class Encryption//begining of class
{
    public static void main()throws IOException//begining of main() method
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Coded text:");String w=in.readLine()+" ",k="";
        if(w.length()>=100)//validating length of code
        {System.out.println("Invalid string length");return;}
        System.out.print("Enter Shift value : ");
        int n=Integer.parseInt(in.readLine())-1,i;
        if(n<=25)
        {
        for(i=0;i<w.length()-1;i++)//loop to decode
        {
            if(((w.charAt(i)+n=='q'||w.charAt(i+1)+n=='q')||(w.charAt(i)+n=='Q'||w.charAt(i+1)+n=='Q'))&&w.charAt(i+1)==w.charAt(i))
            {k+=" ";i++;}
            else if(w.charAt(i)>='A'&&w.charAt(i)<='Z')
            {
                if(w.charAt(i)+n>90)
                k+=(char)(w.charAt(i)+n-26);
                else
                k+=(char)(w.charAt(i)+n);
            }
            else if(w.charAt(i)>='a'&&w.charAt(i)<='z')
            {
                if(w.charAt(i)+n>122)
                k+=(char)(w.charAt(i)+n-26);
                else
                k+=(char)(w.charAt(i)+n);
            }
        }
        System.out.println("Decoded text:"+k);}
        else
        System.out.println("Invalid shift value");
    }//end of main() method
}//end of class