package com.company;

//Java Program to demonstrate the use of continue statement
//inside the Java do-while loop.
public class ContinueDoWhileExample {
    public static void main(String[] args) {
        //declaring variable
        int i=1;
        //do-while loop
        do{
            if(i==5){
                //using continue statement
                i++;
                continue;//it will skip the rest statement
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
