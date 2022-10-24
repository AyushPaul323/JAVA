//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.*;
class sentence
{ //class starts
    public static void main()
    { //main function starts
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence:");
        String s=sc.nextLine();//Accepting the sentence
        int l=s.length();
        s=s.substring(0,l-1);
        StringTokenizer st=new StringTokenizer(s);
        int nw=st.countTokens();//counting no of words
        int m=0;
        String a[]=new String[nw];
        for(int i=0;i<nw;i++)
        {
            a[i]=st.nextToken();
            if(a[i].length()>m)
            m=a[i].length();
        }
        for(int j=0;j<m;j++)
        {
            for(int i=0;i<nw;i++)
            {
                if(j<a[i].length())
                {
                    char ch=a[i].charAt(j);
                    char c=Character.toUpperCase(ch);
                    System.out.print(c+"\t");
                }
                else
                System.out.print("\t");
            }
            System.out.println();
        }
        int c=0;
        System.out.print("Consecutive words end with same character:");//Finding the consecutive words that end with same character
        for(int i=0;i<nw-1;i++)
        {
            char c1=a[i].charAt(a[i].length()-1);
            char c2=a[i+1].charAt(a[i+1].length()-1);
            if(c1==c2)
            {
                System.out.print(a[i]+" "+a[i+1]+" ");
                c+=2;
            }
        }
        if(c==0)
        System.out.println("None");
        else
        System.out.println("\nTotal: "+c);
    }//main function ends
}//class ends