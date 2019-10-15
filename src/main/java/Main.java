
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 0788763
 */
public class Main 
{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number");
        try 
        {
            int test = keyboard.nextInt();
            System.out.println(test + " is a good number");
        } 
        catch (InputMismatchException x) 
        {
            System.out.println("That's not a number");
        }
        catch (Exception z)
        {
            System.out.println("An unknown error occured");
            System.out.println(z.getMessage());
        }
        finally
        {
            System.out.println("This is the end of the program");
        }
    }
}
