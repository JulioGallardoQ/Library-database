/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Julio Cesar Gallardo Quintero - 2023149
 */


public class CA_1_Methods {
 //In this java class we can find the general methods that are used for specific tasks sush as 
 //promts for the user, read the files, get the size of the file, get the arrays and print.   
    
    /**
     * Ask the user to enter an integer value by issuing a prompt
     * The input must be an integer - if not, display an error and re-prompt
     * The method will not enforce any restriction on the integer
     * @param prompt - a question or prompt to display
     * @return an integer entered by the user
     */

    public int askUserforInt(String prompt){
       //creating a scanner to take input from the user
       Scanner myKB = new Scanner(System.in);
       //our int variable where we are gonna store the value.
       int userInt;
       
        //keep going while input is NOT an integer
        while (!myKB.hasNextInt()){
        System.out.println(prompt); //issue prompt
        System.out.println("Enter numbers only");
        myKB.next(); //read input from user 
       }
        //when the user enter a integer then we stored the value in this variable
        userInt = myKB.nextInt();
           //then we are gonna check if this value is les than 1 or greater than 4
           //if its true we are gonna promt again becasue that is not a valid option 
           //from the menu
           if (userInt < 1 || userInt > 4) {
               System.out.println("");
               System.out.println("Invalid option!");
           }
       
       //this return the user number to use it in the menu.
       return userInt;
   }

    /**
     * Read a file and  let the user introduce the name of the file
     * @param args and will 
     * @return 2 arrays one with the data of the book titles and other 
     * with the data with the number of pages of that books.
     * @throws java.io.FileNotFoundException if there are any error or don't find the file.
     */
   
        
    public static  String[][] readFile(String args) throws FileNotFoundException {
        
        
    // Create a scanner to read from the command line
    Scanner input = new Scanner (System.in);
    // Get the name of the file to read from
    System.out.println("Enter the name of your file (including file extension): ");
    String filename = input.next();
    
    try {

     /*
     * Create a new Scanner object which will read the data from the file passed in. 
     * While there are Strings left in the file (i.e. while scanner.hasNextLine() is true), 
     * keep reading them.
     */
     Scanner in = new Scanner(new File(filename));
     //creating the variables that we are gonna use in this method 
     String value;
     //in this variable we are using the same filename to read the file just to get the size of the data.
     int size = sizeData(filename);
     int divition;
     String[] bookTitle= new String[size];
     String[] numPages = new  String[size];
     int i = 0;
     
     // while strings values remain in the file
     while (in.hasNextLine()) {  
         // take in the next string value from the file
         value = in.nextLine();
         //dividing the data into 2 before and after the last comma and numbers 
         divition = value.lastIndexOf(",");
         //creating 2 Strings arrays to store the information that we have divided
         //using substring to take all the strings that before the divition 
         //using trim to remove all the rest that is not taken
         bookTitle[i] = value.substring(0, divition).trim();
         //using substring to take all the strings that after the divition 
         //using trim to remove all the rest that is not taken
         numPages[i] = value.substring(divition + 1).trim();

         //cleaning the data, if the information contains " quotes they are gonna be removed.
         if (bookTitle[i].contains("\"")) {
             bookTitle[i] = bookTitle[i].replace("\"", "");
         }
         //incrementing the index value.
         i++;
         
     }
     //if the user introduce the correct file name and this is read successfully
     //then will be print a message of success and return 2 String Arrays with 
     //the booktitles and number of pages.
     System.out.println("\nFile read Successfully\n");
     return new String [][] {bookTitle,numPages};
     
    } catch (FileNotFoundException exception) {
     //if the user file is not found then we will deploy a message informed that
     System.out.println("That file was not found. Program terminating...\n");
     //and we terminate the program in a status (0) that means normal termination
     //just to end the program in a good looking without show errors.
     System.exit(0);
    } 
      return null;
    }

    /**
     * Read a file and  will takes the name of the file when the user introduce the name of the file 
     * @param fileName and will 
     * @return just the size of the data as an integer.
     * @throws java.io.FileNotFoundException 
     */
    
    public static int sizeData (String fileName) throws FileNotFoundException{
     //scanner that is gonna check the file that the user introduce from the readFile method
     Scanner in = new Scanner(new File(fileName));
     String value;
     int size = 0;
     
     while (in.hasNextLine()) {  // while strings values remain in the file
     value = in.nextLine();  // take in the next String value from the file
     //increment the size.
     size++;
     }
     //return the size of the file.
     return size;
   }
    
     
    /**
     * This method will print our information with a good looking format using
     * @param bookTitles and  
     * @param numberPages to iterate through the arrays and giving us a print of each 
     * element but with a limit of 50 elements only.
     */
    
    public static void printArray(String[] bookTitles, int [] numberPages) {
        boolean alreadyPrint =false;
 
         for (int i = 0; i < 50 && i < bookTitles.length; i++) {
         if (!alreadyPrint) { //checks if the header and lines have already been printed.
                             
                         for (int j = 0; j < 95 ; j++) { //starts a loop to print a line.
                         System.out.print("-");
                         } //This line prints a formatted header row with column names.   
                         System.out.printf("\n|%-75s | %-15s | \n","Book Title: ", "Number Pages: ");
                         for (int j = 0; j < 95; j++) {//starts a loop to print a line.
                         System.out.print("-");
                         alreadyPrint = true;
                        } System.out.println("");    
         
        }//This will prints a formatted data in columns respectibly iterairing trought the arrays and printing the booktitles and number of pages of the books.
         System.out.printf("|%-75s | %-15s |\n", bookTitles[i],numberPages[i]);
            //starts a loop to print a line.  
            for (int j = 0; j < 95; j++) {                
            System.out.print("-");   
            }System.out.println(""); 
   
               
         }     
    }
    
    /**
     * This method will take as 
     * @param arr an array of strings and will
     * @return numberPages as an array of integers.
     */
    
    public static int [] intTrans (String[] arr) {
            //creating a variable to store the size of the array
            int  n = arr.length;
            
            //inizializing the array of int which its gonna be our new array with the int values.
            int [] numberPages = new int [n];
            
            for (int i = 0; i < arr.length; i++) {
                //changing the number of pages to integer and stored in the numberPages array.
                numberPages[i] = Integer.parseInt(arr[i]);
                
            }
             //returning the array of integers.
             return numberPages;
    }
    
    /**
     * This method will take as 
     * @param searchAlgo and 
     * @param sortMethod Strings variables that we took their values from the result
     * of the performance from the sort and searching methods 
     * to evaluate which message print depending on the values in the variables.
     */
    
    public static void performanceResult (String searchAlgo, String sortMethod) {
        //first condition that is gonna check if our variables are null
        //if it, its not gonna print any information related to the performance
        //its only gonna show a good bye message.
        if (searchAlgo == null && sortMethod == null) {
            System.out.println("\nThank you! see you later");
        }
        //in this next condition we are gonna check if the result only in the variable sortMethod
        //is null or has a result, if this is true then the variable in searchAlgo has to contain 
        //a result and we are gonna print the performance information respectively searchAlgo variable
        //without sortMethod.
        else if (sortMethod == null) {
            System.out.println("");
            System.out.println("getting general performance information...");
            System.out.println("\n"+searchAlgo + " performed Best" );
            System.out.println("\nThank you! see you later");            
        }
        //in this next condition we are gonna check if the result only in the variable searchAlgo
        //is null or has a result, if this is true then the variable in sortMethod has to contain 
        //a result and we are gonna print the performance information respectively sortMethod variable
        //without searchAlgo.
        else if (searchAlgo == null) {
            System.out.println("");
            System.out.println("getting general performance information...");
            System.out.println("\n"+sortMethod + " performed Best" );
            System.out.println("\nThank you! see you later");
        }
        //if none of the conditions avobe are true, then that means that both variables has their result
        //therefore will be printed  both perfomances.
        else  {
            System.out.println("");
            System.out.println("Getting general performance information...");
            System.out.println("\n"+ sortMethod + " and " + searchAlgo + " performed Best" );
            System.out.println("\nThank you! see you later");
        }                
    
    }
        
       
}
