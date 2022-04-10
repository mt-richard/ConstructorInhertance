//Reg-No: 20RP01184
//Names: MBANZA TUYISHIME Richard


import java.util.*;

public class Palindrome{

    public static void main(String[] args){
        int a;
        Scanner e=new Scanner(System.in);
        System.out.print("Enter Number to check if its Palindrome:");
        a=e.nextInt();
       
        binaryconvetor bconv=new binaryconvetor();
        String bina;
        bina=bconv.binmethod(a);
        String reversed=bconv.reversemethod(bina);
        System.out.print("Number is "+a + "\nIts binary value is  " +bina);
        System.out.println("\nReversed binary is  " +reversed);

        // to compare reveresed and binary value

        if(bina.equals(reversed)){
            //if equal means its Palindrome
             System.out.print("\n  >- Number is Palindiorme !!!");
        }else{
            //if its mismatch means its Palindrome
            System.out.print("\n  >- Number is not Palindiorme !!!");
        }
    }
    
}

class binaryconvetor{
    public String binmethod(int bin){
        return Integer.toBinaryString(bin);
    }
    public String reversemethod(String rev){
        StringBuilder string=new StringBuilder(rev);
        string.reverse();
        return string.toString();
    }
}