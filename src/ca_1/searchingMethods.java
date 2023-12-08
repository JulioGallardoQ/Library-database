/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;


import java.util.Scanner;

/**
 *
 * @author julio
 */
public class searchingMethods {
//In this Java Class we can find all the searching methods that are used for the specific search of a book title
//linearSearch and BinarySearch algorithms are inside the searchingBookTitle ready to been used in the main.
        
    /**
     * linear search method that takes as parameters
     * @param bookTitles
     * @param numberPages and compares if the String in bookTitles is equals ignoring cases
     * to our String in key, searching the index position of this string.
     * @return the position as an integer.
     */
    
    public static String searchingBookTitle(String[] bookTitles, int [] numberPages) {
            String red = "\033[31m";
            String blue = "\033[34m";
            String b = "\u001B[0m";
            String searchAlgo = "";   
            
            //inicialize the variable to get the input from the user
            Scanner myKB = new Scanner(System.in);
            String userInput;
           
            System.out.println("\nPlease enter the name of the book you wish to find: ");
            userInput = myKB.nextLine();
            
            long start = System.nanoTime();
            /* the run statement for the algorithm*/
            int lineSIndex = linearSearch(bookTitles, userInput,numberPages);
            long end = System.nanoTime();
             /*calculate the time difference */     
            long execution = (end - start);
            //condition that is gonna check if the book title that the user input is not there
            //if this is true is gonna print a kind message to the user explain what is happening 
            //else is gonna show the book title name, the index position and the number of pages
            //eather is found or nor always its gonna show the time that takes the searching.
            if (lineSIndex == -1) {
                System.out.println("\n"+red+"Sorry"+b+ " that book title is"+red+" not"+b+" in the data base or please check the name and try again");
                /* print the time difference */   
                System.out.println("");
                System.out.println("The total execution time for Linear search is: "+ execution + " nanoseconds");
            }else{  
                System.out.println("\n"+b+"Book title "+blue+ bookTitles[lineSIndex]+ b+" found!"+"\n");
                System.out.println( "At the position "+red+lineSIndex+b+" and contains "+red+numberPages[lineSIndex]+b+" number of pages.\n");
                /* print the time difference */   
                System.out.println("The total execution time for Linear search is: "+ execution + " nanoseconds");
            }
        
            start = System.nanoTime();
            /* the run statement for the algorithm*/
            binarySearch(bookTitles, userInput, numberPages);
            end = System.nanoTime();
            /*calculate the time difference */     
            long execution2 = (end - start);
            System.out.println("The total execution time for Binary search is: "+ execution2 + " nanoseconds\n");                              

            if (execution < execution2) {
               searchAlgo = "LinearSearch";
            }else if (execution > execution2) {
               searchAlgo = "BinarySearch";
            }
            //Printing the sort method and search algorithm that performed best!
            System.out.println(blue+ searchAlgo +b+ " performed Best" );
            //prompts the user to press enter to go back to the principal menu.
            System.out.println(b+" \npress " +red+ "enter "+b+ "to back to the principal menu...");
            myKB.nextLine();
            return searchAlgo;
    }

    /**
     * linear search method that takes as parameters
     * @param bookTitles 
     * @param key
     * @param numberPages and compares if the String in bookTitles is equals ignoring cases
     * to our String in key, searching the index position of this string.
     * @return the position as an integer.
     */
    
    public static int linearSearch(String[] bookTitles, String key,int [] numberPages) {
        //sorting the data before pass to the searching algorithm 
        selectionSort.bookTitleSort(bookTitles,numberPages);
        //iterating trough each element on the array that contains book titles.   
        for (int i = 0; i < bookTitles.length; i++) {
            
            if (bookTitles[i].equalsIgnoreCase(key)) {
                
                return i;
            }
        }
        return -1;
        }        
   
    /**
     * linear search  print and time measure method that takes as parameters 
     * @param bookTitles
     * @param numberPages and compares if the String in bookTitles is equals ignoring cases
     * to our String in key, searching the index position of this string.
     */
        
    public static void linearSearch1(String[]bookTitles, int [] numberPages) {
            String red = "\033[31m";
            String blue = "\033[34m";
            String b = "\u001B[0m";
            Scanner myKB = new Scanner(System.in);
            String userInput;
           
            System.out.println("\nPlease enter the name of the book you wish to find: ");
            userInput = myKB.nextLine();
            
            long start = System.nanoTime();
            /* the run statement for the algorithm*/
            int lineSIndex = linearSearch(bookTitles, userInput,numberPages);
            long end = System.nanoTime();
             /*calculate the time difference */     
            long execution = (end - start);
                                      
            if (lineSIndex == -1) {
                System.out.println("\n"+red+"Sorry"+b+ " that book title is"+red+" not"+b+" in the data base or please check the name and try again");
                /* print the time difference */   
                System.out.println("The total execution time for Linear search is: "+ execution + " nanoseconds\n");
            }else{  
                System.out.println("\n"+b+"Book title "+blue+ bookTitles[lineSIndex]+ b+" found!"+"\n");
                System.out.println( "At the position "+red+lineSIndex+b+" and contains "+red+numberPages[lineSIndex]+b+" number of pages.");
                /* print the time difference */   
                System.out.println("The total execution time for Linear search is: "+ execution + " nanoseconds\n");
            }
    }

    /**
     * Binary search  method that takes as parameters 
     * @param bookTitles
     * @param target
     * @param numberPages and compares the String in bookTitles ignoring cases
     * to our String in target, searching the index position of this string.
     * @return the index position as integer.
     */
        
    public static int binarySearch(String[] bookTitles, String target,int [] numberPages) {
       //sorting the data before pass to the searching algorithm 
        selectionSort.bookTitleSort(bookTitles,numberPages);
         
        //creating the variables
        //setting the middle as the middle of the bookTitles array.
        int middle = bookTitles.length/2;
        //setting the left pointer at start
        int leftPointer = 0;
        //setting the right pointer at the end of the booktitles array
        int rightPointer = bookTitles.length -1;
          
        //while loop that is gonna continue until the left point is greater than the right point
        while (leftPointer <= rightPointer) {            
            
            //this condition use the java String method compareToIgnoreCase
            //which is gonna compare if the String on the middle of the bookTitles array
            //is less, equal or greater than the target if this is less than the target
            if (bookTitles[middle].compareToIgnoreCase(target) < 0){
               //leftpointer moves one position after the middle
                leftPointer = middle +1;
                
            //this condition use the java String method compareToIgnoreCase
            //which is gonna compare if the String on the middle of the bookTitles array
            //is less, equal or greater than the target if this is greater than the target  
            } else if (bookTitles[middle].compareToIgnoreCase(target) > 0){
                //rightpointer moves one position  before the middle
                rightPointer = middle -1;   
            //if neather of the conditions above are true,it returns middle
            //that means that the target is at the middle position.
            }else {
                return middle;
            }
            //every time that do another iteration its gonna change the middle potition
            //respectively to the news pointer positions.
            middle = (leftPointer + rightPointer)/2;
            
        }//if the target is not found in the data set this is gonna return -1.
        return -1;
    }
        
    /**
     * Binary search print and time measure method that takes as parameters 
     * @param bookTitles
     * @param numberPages and compares the String in bookTitles ignoring cases
     * to our String in target, searching the index position of this string.
     */
        
    public static void binarySearch1(String[]bookTitles, int [] numberPages) {
            String red = "\033[31m";
            String blue = "\033[34m";
            String b = "\u001B[0m";
            Scanner myKB = new Scanner(System.in);
            String userInput;
           
            System.out.println("Please enter the name of the book you wish to find: ");
            userInput = myKB.nextLine();
            
            long start = System.nanoTime();
            /* the run statement for the algorithm*/
            int binaryIndex = binarySearch(bookTitles, userInput,numberPages);
            long end = System.nanoTime();
             /*calculate the time difference */     
            long execution = (end - start);
            
            
            if (binaryIndex == -1) {
                System.out.println("\n"+red+"Sorry"+b+ " that book title is"+red+" not"+b+" in the data base or please check the name and try again");
                System.out.println("The total execution time for Binary search is: "+ execution + " nanoseconds");
            }else{  
                System.out.println("\n"+b+"Book title "+blue+bookTitles[binaryIndex]+ b+" found!"+"\n");
                System.out.println( "At the position "+red+binaryIndex+b+" and contains "+red+numberPages[binaryIndex]+b+" number of pages.");
                System.out.println("The total execution time for Binary search is: "+ execution + " nanoseconds\n");
            }
    }
        
    }
    
