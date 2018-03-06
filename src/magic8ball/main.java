/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic8ball;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zack
 */
public class main 
{

	public static void main( String[] args )
        {
            
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter your lucky number and ask Magic 8 Ball a question: ");
            
            
            
            int n; // Scans the next token of the input as an int.
                    n = reader.nextInt();
            
       
            
            Random r = new Random();

		int choice = 1 + r.nextInt(15);
		String response = " ";

		if ( choice == 1 )
			response = "It is certain";
		else if ( choice == 2 )
			response = "Probably";
		else if ( choice == 3 )
			response = "Without a doubt";
		else if ( choice == 4 )
			response = "Yes - definitely";
		else if ( choice == 5 )
			response = "You may rely on it";
		else if ( choice == 6 )
			response = "Don't bet on it";
		else if ( choice == 7 )
			response = "Most likely";
		else if ( choice == 8 )
			response = "Outlook good";
		else if ( choice == 9 )
			response = "Signs point to yes";
		else if ( choice == 10 )
			response = "Yeah boy!";
		else if ( choice == 11 )
			response = "Ask Question again";
		else if ( choice == 12 )
			response = "Try again later";
		else if ( choice == 13 )
			response = "Better not tell you now";
		else if ( choice == 14 )
			response = "Cannot predict now";
		else if ( choice == 15 )
			response = "Who is to say...?";
		else 
			response = "8-BALL ERROR!";

		System.out.println( "MAGIC 8-BALL SAYS: " + response );
        }
        

        
}