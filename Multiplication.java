/***********************************************************
 * File            -   Multiplication.java
 * Author          -   Taniya Thomas
 * Description     -   To find the product of two matrix
 * Version         -   1.0
 * Date            -   03/12/2021
 ************************************************************/
import java.util.Scanner;
import java.io.*;
public class Multiplication {
public void readElements(int[][] matrix,int row,int column){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            System.out.println("Element ["+i+"]["+j+"]");
            matrix[i][j]=sc.nextInt();
        }
    }
  
}
public void printElements(int[][] matrix,int row,int column){
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            System.out.print(matrix[i][j]+"\t");
        }
        System.out.println("");
    }
}
public void multiplication(int[][] matrix1,int[][] matrix2,int[][] pdt,int row,int column){       
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                pdt[i][j]=0;
                for(int k=0;k<row;k++){
                    pdt[i][j]=pdt[i][j]+matrix1[i][k]*matrix2[k][j];
                }
            }
           
        }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Multiplication work=new Multiplication();
        int row;
        int column;
        System.out.println("Enter the row and column 1st matrix");
        row=sc.nextInt();
        column=sc.nextInt();
        int[][] matrix =new int[row][column];
        System.out.println("Enter the matrix");
        work.readElements(matrix,row,column);
        work.printElements(matrix, row, column);
       System.out.println("Enter the row and column 2st matrix");
        int row1=sc.nextInt();
       int column1=sc.nextInt();
        int[][] matrix1 =new int[row1][column1];
        System.out.println("Enter the matrix");
        work.readElements(matrix1,row1,column1);
        work.printElements(matrix1, row1, column1);
    //multiplication
    if(row1==column){
       int pdt[][]=new int[row][column];
       work.multiplication(matrix,matrix1,pdt,row,column1);
       System.out.println("The product of matrix is");
       work.printElements(pdt,row, column);
    }
    else{
        System.out.println("Multipllication is not possible");
    }
        sc.close();


    }
}
