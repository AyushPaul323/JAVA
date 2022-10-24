//Name: Ayush Paul Class: XII Sec: A Roll: 13 UID: 6843094
import java.util.Scanner;
public class RomanNumeral {//class begins
    public static void main(String[] args){//main begins
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 1000: ");
        int number = scan.nextInt();  
        String roman=""; 
        while(number<=0 || number>1000){//checking for invalid input
            System.out.println("Invalid input.  You must enter a number between 1 and 3999");
            System.out.print("Please enter another number now: ");
            number = scan.nextInt();
            }
        while(number>=1000){
            roman += "M";
            number-=1000;
        } 
        while(number>=900){
            roman += "CM";
            number-=900;
        } 
        while(number>=500){
            roman += "D";
            number-=500;
        }
        while(number>=400){
            roman += "CD";
            number-=400;
        }
        while(number>=100){
            roman += "C";
            number-=100;
        }
        while(number>=90){
            roman += "XC";
            number-=90;
        }
        while(number>=50){
            roman += "L";
            number-=50;
        }
        while(number>=40){
            roman += "XL";
            number-=40;
        }
        while(number>=10){
            roman += "X";
            number-=10;
        }
        while(number>=9){
            roman += "IX";
            number-=9;
        } 
        while(number>=5){
            roman += "V";
            number-=5;
        } 
        while(number>=4){
            roman += "IV";
            number-=4;
        } 
        while(number>=1){
            roman += "I";
            number-=1;
        } 
        System.out.println(roman);//displaying roman number
    }//end of main
}//end of class