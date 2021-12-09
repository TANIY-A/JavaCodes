/***********************************************************
 * File            -   Palindrome.java
 * Author          -   Taniya Thomas
 * Description     -   To check whether the input is palindrome or not
 * Version         -   1.0
 * Date            -   03/12/2021
 ************************************************************/
import java.util.Scanner;
class PalindromeCheck{
    String input;
    boolean output=true;
    public boolean check(){
        int length=input.length();
        for(int i=0;i<length/2;i++){
            if(input.charAt(i)!=input.charAt(length-i-1)){
                output=false;
                break;
            }
        }
       return output;
    }
}
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PalindromeCheck work=new PalindromeCheck();
        boolean result;
        System.out.println("Enter the string");
        work.input=sc.nextLine();
        result=work.check();
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
