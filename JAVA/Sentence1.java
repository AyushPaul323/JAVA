

























































































































































































































//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
class Sentence1
{ 
    //class starts
    public static int size(String s)
    { 
        //size function starts
        int c=0;
        for(int i=0;i<s.length();i++)
        { 
            //forloop starts
            char a=s.charAt(i);
            if(a==' ')
            c++;
            //forloop ends
        }
        return c;
        //size function ends
    }
    public static String[] extract(String s)
    {  //extract function starts
        s+=" ";
        String x="",y="";
        int count=0;
        String ar[]=new String[size(s)];
        for(int i=0;i<s.length();i++)
        {  
            //forloop starts
            char a=s.charAt(i);
            if(a==' ')
            {
                ar[count++]=x;
                x="";
            }
            else
            {
                x+=a;
            }
            //forloop ends
        }
        return ar;
        //extract function ends
    }
    public static String arrange(String s)
    { 
        //arrange function starts
        String ar[]=extract(s);
        for(int i=0;i<ar.length-1;i++)
        { 
            //forloop starts
            for(int j=0;j<ar.length-1-i;j++)
            {
                //forloop starts
                if(ar[j].compareTo(ar[j+1])>0)
                {
                    String t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
                //forloop ends
            }
            //forloop ends
        }
        String st=disp(ar);
        return st;
    }
    public static String disp(String ar[])
    {   
        //disp function starts
        String s="";
        for(int i=0;i<ar.length;i++)
        {
            s+=ar[i];
            if(i<ar.length-1)
            s+=" ";
        }
        return s;
        //disp function ends
    }
    public static boolean search(String s,String st)
    { 
        //search function starts
        String ar[]=extract(s);
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i].equalsIgnoreCase(st))
            return true;
        }
        return false;
        //search function ends
    }
    public static String vowel(String s)
    {   
        //vowel function starts
        String x="",y="";
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='.' || a=='!' || a==',' || a=='?' || a==' ')
            {
                String v="AEIOUaeiou";
                int flag=0;
                if(x!="")
                {
                for(int im=0;im<v.length();im++)
                {
                    if(x.charAt(0)==v.charAt(im))
                    {
                        flag=1;
                        break;
                    }
                }
                }
                if(search(y,x)==false && flag==1)
                    y+=x+" ";
                x="";
            }
            else
            {
                x+=a;
            }
        }
        return y;
        //vowel function ends
    }
    public static void main(String args[])
    { 
        //main function starts
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s=sc.nextLine();
        String x="",y="";
        for(int i=0;i<s.length();i++)
        { //forloop starts
            char a=s.charAt(i);
            if(a=='.' || a=='!' || a==',' || a=='?')
            {
                x=arrange(x);
                y+=x+a;
                x="";
            }
            else
            {
                x+=a;
            }
            //forloop ends
        }
        System.out.println("ARRANGED WORD:");
        System.out.println(y);
        System.out.println("VOWELS: "+vowel(s));
        //main function ends
    }
    //class ends
}