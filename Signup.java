import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Signup
{
    public static void main(String[] args) 
    {
        boolean gpass;
        boolean guser;
        Scanner scram = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String user = scram.nextLine();
        System.out.println("Enter Password: ");
        String pass = scram.nextLine();

        int pas = pass.length() - 2;

        String substring = pass.substring(pas);

        if (user.equals("person"))
        {
            System.out.println("Username is not available");
            guser = false;
        }
        else if (user.equals("admin"))
        {
            System.out.println("Username is not available");
            guser = false;
        }
        else if (user.equals("jimbob234"))
        {
            System.out.println("Username is not available");
            guser = false;
        }
        else if (user.equals("skater_gurl17"))
        {
            System.out.println("Username is not available");
            guser = false;
        }
         else if (user.equals("gary"))
        {
            System.out.println("Username is not available");
            guser = false;
        }
        else 
        {
            guser = true;
        }
        if (pass.startsWith("a") || pass.startsWith("e") || pass.startsWith("i") || pass.startsWith("o") || pass.startsWith("u") || pass.startsWith("A") || pass.startsWith("E") || pass.startsWith("I") || pass.startsWith("O") || pass.startsWith("U"))
        {
            gpass = true;
        }
        else 
        {
            gpass = false;
            System.out.println("That password does not start with a vowel");
        }
        if (pass.contains("#") || pass.contains("!") || pass.contains("$") || pass.contains("&") || pass.contains("*"))
        {
            gpass = true;
        }
        else
        {
            gpass = false;
            System.out.println("That password does not contain a special character");
        }
        if (pass.contains(user))
        {
            gpass = false;
            System.out.println("That password contains the username");
        }
        if (pass.contains("1") || pass.contains("2") || pass.contains("3") || pass.contains("4") || pass.contains("5") || pass.contains("6") || pass.contains("7") || pass.contains("8") || pass.contains("9") || pass.contains("0"))
        {
            gpass = false;
        }
        if (substring.contains("1") || substring.contains("2") || substring.contains("3") || substring.contains("4") || substring.contains("5") || substring.contains("6") || substring.contains("7") || substring.contains("8") || substring.contains("9") || substring.contains("0"))
        {
            gpass = true;
        }

        if (gpass && guser)
        {
            System.out.println("Welcome to furry.net");
        }

    }
}