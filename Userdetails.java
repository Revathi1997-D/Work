package com;

import java.util.Scanner;

public class Userdetails    
{
		static int num1 = 1;
	static int num2 = 2;
       
	static void showmenu()
       {
		System.out.println("Menu:");
    	 System.out.println("Existing user press\n" +num1);  
    	 System.out.println("New user press\n" +num2);  
    	 
    	 System.out.print("Press the number: ");
         int number;
         Scanner in = new Scanner(System.in);
         number = in.nextInt();
         switch (number) 
         {
         case 1:
               System.out.println("Existing User");
               break;
         case 2:
               System.out.println("New User");
               break;

         default:
             System.out.println("Choose Option Again");
             break;
       }
    }
          
        public static void main(String args[])
        {
        	Scanner in = new Scanner(System.in);
            showmenu();
     	
       }

        }
    


