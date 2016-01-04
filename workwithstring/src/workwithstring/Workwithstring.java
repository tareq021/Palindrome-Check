// This programme checks if a sentence has the property of palindrome

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workwithstring;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Tareq
 */
public class Workwithstring
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please type a sentence: ");
        String choice = input.nextLine();
        
        choice = choice.toUpperCase();
        StringTokenizer st = new StringTokenizer(choice);
        
        int count = 0;
        
        while (st.hasMoreTokens())
        {
            System.out.print(st.nextToken());
            count++;
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("You entered " + count + " words");
        
        choice =choice.replaceAll("\\s+", ""); // Removes all white spaces
        System.out.println("Without Spaces:  "+ choice);
        
        
        char[] palindrome = choice.toCharArray();
        int round;
        int round1 = palindrome.length;
        int tag = 0;
        
        System.out.print("After Reversing: ");
        for(round = 0; round<palindrome.length; round++)
        {
            if (palindrome[round] != palindrome[round1-1])
            {
                tag = 1;
            }
            
            round1--;
            System.out.print(palindrome[round1]);
        }
        System.out.println("");
        if (tag == 0)
            System.out.println("Palindrome");
        else if (tag == 1)
            System.out.println("Not Palindrome");
      
      
      
      
        
    }
    
}
