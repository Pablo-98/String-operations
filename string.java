// import scanner from java libraries
import java.util.Scanner;

public class string {
    public static void main (String[] args) {
        // this program is meant to extract a username from a user input 

        //the user is prompted to enter an email address whereupon the program will 
        // return a username based on the email addresses string before the @ symbol.
        // the program in doing this will check if the email address entered has the @ symbol and will not return a username if that is missing 


        //scanner initialization
        Scanner userInput = new Scanner(System.in);
        
        //var declarations
        String emailText;
        int atSymbolIndex;
        String emailUsername;

        //user prompt
        System.out.println("enter email address");
        // assigning emailText with the userinput 
        emailText= userInput.nextLine();

        // finds what index on the string the @ is
        atSymbolIndex = emailText.indexOf('@');
        // if the @ symbol is nowhere to be found then the string below will print. -1 is another way for saying 'not found'
        if (atSymbolIndex == -1) {
            System.out.println("Address is missing @");

        } else {
            // if the first branch of the if else statement is false then we arrive at this branch 
            // where the username variable will be assigned to the string before the @ symbol or index 0 - atSymbolIndex which is the index of the @ symbol
            // ex: 'theHero@gmail.com'. The @ symbol's index is assigned to atSymbolIndex. the method substring will begin at 0 and end at the @ symbols index.
            emailUsername = emailText.substring(0, atSymbolIndex);
            System.out.println("Username: " + emailUsername);
        }


    }
}