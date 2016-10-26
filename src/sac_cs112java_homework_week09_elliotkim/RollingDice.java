/*
 * SAC_CS112-Java_Homework_Week09_ElliotKim
 * Objective:   	Design and Implement a Dice game
 *		User to decide number of dices to roll
 *			One dice:  1- 6
 *			Two dices: 2-12
 *			Three dices: 3-18
 *		System rolls dice(s)
 *		User guess points
 *		Requirements
 *			Dice class
 *			Member variable
 *			Constructor
 *			Method
 *			Main program
 https://github.com/SacCs112KimElliot/SAC_CS112-Java_Homework_Week09_ElliotKim/invitations
 */
package sac_cs112java_homework_week09_elliotkim;

/*
            RandomNumber randomNumberFromOtherClass = new RandomNumber();
            int randomNumber;
            int lowNumber = 1;
            int highNumber = 10;
            randomNumber = randomNumberFromOtherClass.GetANumber(lowNumber,highNumber);
*/

import java.util.Random;

public class RollingDice 
{
    // public is access modifier making this class available to main class
    // int means that this class (method in other class) will return a value in int data type
    // GetANUmber..... is the name of the class given
    // () means no input is required to excute this method
    public int GetANumber(int HowManyDice)
    {
        /*
        // an equation to create a random number is being implemented
        int randomNumber = HowManyDice + (int) ( Math.random() * HowManyDice);
        // displaying the random number
        System.out.println("The random number is " + randomNumber);
        // After method is executed, randomNumber in int data type will be returned.
        return randomNumber;
        */
        int randomNumber = 1;
        
        // if user chose to throw 1 dice
        if(HowManyDice == 1)
        {
            randomNumber = 1 + (int) ( Math.random() * 6);
        }
        else
        {
            // if user chose to throw 2 dices
            if(HowManyDice == 2)
            {
                randomNumber = 2 + (int) ( Math.random() * 12);
            }
            else
            {
                // if user chose to throw 3 dices
                if(HowManyDice == 3)
                {
                    randomNumber = 3 + (int) ( Math.random() * 18);
                }
                // if user chose number any other than between 1-3
                else 
                {                    
                    randomNumber = 0;
                }
            }
        }
        System.out.println("The random number is " + randomNumber);
        return randomNumber;
    }
    
}
