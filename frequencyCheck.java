/***********************************************************
 * File            -   FrequencyCheck.java
 * Author          -   Taniya Thomas
 * Description     -   To check  the frequency of a character in a string
 * Version         -   1.0
 * Date            -   03/12/2021
 ************************************************************/
import java.util.Scanner;
class Frequency{
    String input;
    char letter;
    int count;
    public int check(){
        int length;
        length=input.length();
        for(int i=0;i<length;i++){
        if(input.charAt(i)==letter){
            count++;
        }
        }
        return count;
    }
}
public class frequencyCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Frequency check=new Frequency();
        System.out.println("Enter the string");
        check.input=sc.nextLine();
        System.out.println("Enter the character you want to the check the frequency");
        check.letter=sc.next().charAt(0);
        int count=check.check();
        System.out.println("The frequency of the letter "+check.letter+ " is "+count);
    }
    
}
