/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Julio Cesar Gallardo Quintero - 2023149
 */
public class selectionSort {
//In this java class we can find all the necesary method to achive the selectionSort method 
//2 menus, one for the bookTitles sort and another for numberPages sort 

    /**
        * selectSortBookTiltes method that takes as parameters
        * @param bookTitles and 
        * @param numberPages arrays from the file that has been processed 
        * but copying 3 times this in other arrays that we are gonna use to 
        * sort through our 3 different sorting algorithms, this calling that algorithms
        * from their respectively classes and methods,printing the first 50 elements 
        * of the array already sorted with help of the printArray method, also it takes the performance time of 
        * each one and shows to the user the results but at the same time compares 
        * which one is the best to do the task  and 
        * @return a String with the best performance algorithm.
        * All inside a good looking menu using a switch inside a do-while that allow 
        * the user interact and select the way that the data is gonna printed in the screen (Ascending or Descending order).
        * respectively from the book titles.
        */
        
    public static String selectSortBookTitles(String[] bookTitles, int [] numberPages) {
        Scanner myKB = new Scanner(System.in);
        String red = "\033[31m";
        String blue = "\033[34m";
        String b = "\u001B[0m";
        //we need to create a copy of our arrays to process this on each of our methods in orden to not process
        //the same data already sorted.
        String[] bookTitle1 = Arrays.copyOf(bookTitles, bookTitles.length);
        int[] numberPages1 = Arrays.copyOf(numberPages, numberPages.length);
        String[] bookTitle2 = Arrays.copyOf(bookTitles, bookTitles.length);
        int[] numberPages2 = Arrays.copyOf(numberPages, numberPages.length);
        String[] bookTitle3 = Arrays.copyOf(bookTitles, bookTitles.length);
        int[] numberPages3 = Arrays.copyOf(numberPages, numberPages.length);
        long execution;
        long execution2;
        String sortMethod = null;
        int option;
            
            do {// starts a do-while loop, ensuring that the following code is executed at least once and then repeated till meet the condition.

            System.out.println(blue + "\nPleas select what you want to do with the data in the file ");
            System.out.println("1) Ascending order");
            System.out.println("2) Descending orden ");
            System.out.println("3) exit to the previous menu ");
               
               
            // prompt the user to enter the number corresponding to their chosen option. The entered value is assigned to the option variable.
            option = new CA_1_Methods().askUserforInt("Please select an option ");
               
               // now the action depend on the option picked by user
               
               switch (option){
                   
                   case 1: //first case that  will sort the book titles and print the data in ascendend order and takes the time of execute the process.
                       
                       System.out.println("");
                       //run statement before the process starts
                       long start = System.nanoTime();
                       //main method to sort the bookTitles data
                       bookTitleSort(bookTitle1,numberPages1);
                       //getting record of the end time for the sort process
                       long end = System.nanoTime();
                       /*calculate the time difference */     
                       execution = (end - start);
                       //printing the data after sorting respectively book titles.
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       QuickSort.QuickSortBTA(bookTitle2,numberPages2,0,bookTitles.length-1);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       execution2 = (end - start);
                       //printing the data after sorting respectively book titles.
                       /* print the time difference */
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       BubbleSort.bubbleSortBTAscen(bookTitle3,numberPages3);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       long execution3 = (end - start);
                       //printing the data after sorting respectively book titles.                      
                       CA_1_Methods.printArray(bookTitle1,numberPages1);
                       System.out.println("");
                       /* print the time difference */
                       System.out.println("The total execution time for Selection Sort is: "+ execution + " nanoseconds");
                       System.out.println("The total execution time for Quick Sort the data is: "+ execution2 + " nanoseconds");
                       System.out.println("The total execution time for Bubble Sort the data is: "+ execution3 + " nanoseconds");
                       //Printing the sort method and search algorithm that performed best!
                       if (execution < execution2 && execution < execution3) {
                           sortMethod = "Selection Sort";
                       } else if (execution2 < execution && execution2 < execution3) {
                           sortMethod = "Quick Sort";
                       } else if (execution3 < execution && execution3 < execution2) {
                           sortMethod = "Bubble Sort";
                       }
                       System.out.println("\n"+ sortMethod + " performed Best" );
                       //prompts the user to press enter to go back to the menu.
                       System.out.println(b+" \npress " +red+ "enter "+b+ "to back to the principal menu...");
                       myKB.nextLine();
                       
                       break;
                      
                   case 2: //second case that will sort the book titles and print the data in descend order and takes the time of execute the process.  
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       bookTitleSortDesc(bookTitle1,numberPages1);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       execution = (end - start);   
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       QuickSort.QuickSortBTD(bookTitle2,numberPages2,0,bookTitles.length-1);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       execution2 = (end - start);
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       BubbleSort.bubbleSortBTDesc(bookTitle3, numberPages3);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       execution3 = (end - start);
                       //printing the data after sorting respectively book titles.
                       
                       //printing the data after sorting respectively book titles.
                       CA_1_Methods.printArray(bookTitle1,numberPages1);
                        System.out.println("");
                       /* print the time difference */
                       System.out.println("The total execution time for Selection Sort is: "+ execution + " nanoseconds");
                       System.out.println("The total execution time for Quick Sort the data is: "+ execution2 + " nanoseconds");
                       System.out.println("The total execution time for Bubble Sort the data is: "+ execution3 + " nanoseconds");
                       //Printing the sort method and search algorithm that performed best!
                       if (execution < execution2 && execution < execution3) {
                           sortMethod = "Selection Sort";
                       } else if (execution2 < execution && execution2 < execution3) {
                           sortMethod = "Quick Sort";
                       } else if (execution3 < execution && execution3 < execution2) {
                           sortMethod = "Bubble Sort";
                       }
                       //Printing the sort method and search algorithm that performed best!
                       System.out.println("\n"+ sortMethod + " performed Best" );
                       //prompts the user to press enter to go back to the  menu.
                       System.out.println(b+" \npress " +red+ "enter "+b+ "to back to the principal menu...");
                       myKB.nextLine();
                       
                       break;

                   case 3: //third case that will getting us to the previous menu.  
                       
                       System.out.println("\nGetting back to the previous menu\n");
                                         
                       break;   
  
                   default://default case, which is executed when none of the previous cases match the value of the option variable.
                       
                       System.out.println("please select a valid option\n");
               }    
     
           }while ((option !=3) && (option !=2) && (option !=1));//condition for the do-while loop to continue running.
                    
     return sortMethod;
     }
     
     /**
        * selectSortNumberPages method that takes as parameters
        * @param bookTitles and 
        * @param numberPages arrays from the file that has been processed 
        * but copying 3 times this in other arrays that we are gonna use to 
        * sort through our 3 different sorting algorithms, this calling that algorithms
        * from their respectively classes and methods,printing the first 50 elements 
        * of the array already sorted with help of the printArray method, also it takes the performance time of 
        * each one and shows to the user the results but at the same time compares 
        * which one is the best to do the task  and 
        * gives a  print  with the best performance algorithm.
        * All inside a good looking menu using a switch inside a do-while that allow 
        * the user interact and select the way that the data is gonna printed in the screen (Ascending or Descending order)
        * respectively from the number of pages of the books..
        */
    
    public static void selectionSortNumberPages(String[] bookTitles, int [] numberPages) {
        Scanner myKB = new Scanner(System.in);
        String red = "\033[31m";
        String blue = "\033[34m";
        String b = "\u001B[0m";
        //we need to create a copy of our arrays to process this on each of our methods in orden to not process
        //the same data already sorted.
        String[] bookTitle1 = Arrays.copyOf(bookTitles, bookTitles.length);
        int[] numberPages1 = Arrays.copyOf(numberPages, numberPages.length);
        String[] bookTitle2 = Arrays.copyOf(bookTitles, bookTitles.length);
        int[] numberPages2 = Arrays.copyOf(numberPages, numberPages.length);
        String[] bookTitle3 = Arrays.copyOf(bookTitles, bookTitles.length);
        int[] numberPages3 = Arrays.copyOf(numberPages, numberPages.length);
        String sortMethod = "";
        int option;
            
             do{// starts a do-while loop, ensuring that the following code is executed at least once and then repeated till meet the condition.
               
                             
               System.out.println(blue+"\nPleas select what you want to do with the data in the file ");
               System.out.println("1) Ascending order");
               System.out.println("2) Descending orden ");
               System.out.println("3) exit to the previous menu ");
               
               
            // prompt the user to enter the number corresponding to their chosen option. The entered value is assigned to the option variable.
            option = new CA_1_Methods().askUserforInt("Please select an option ");
               
               // now the action depend on the option picked by user
               
               switch (option){
                   
                   case 1: //first case that will sort the number Pages and print the data in ascendend order taking the time of execute the process.
                       System.out.println("");
                       //run statement before the process starts
                       long start = System.nanoTime();
                       //main method to sort the numberPages data
                       numberPagesSortAscen(bookTitle1,numberPages1);
                       //getting record of the end time for the sort process
                       long end = System.nanoTime();
                       /*calculate the time difference */     
                       long execution = (end - start);
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       QuickSort.QuickSortNPA(bookTitle2,numberPages2,0,numberPages.length-1);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       long execution2 = (end - start);
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       BubbleSort.bubbleSortNPAscen(bookTitle3, numberPages3);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       long execution3 = (end - start);
                       //printing the data after sorting respectively numberPages. 
                       CA_1_Methods.printArray(bookTitle1, numberPages1);
                       /* print the time difference */
                       System.out.println("The total execution time for Selection Sort is: "+ execution + " nanoseconds");
                       System.out.println("The total execution time for Quick Sort the data is: "+ execution2 + " nanoseconds");
                       System.out.println("The total execution time for Bubble Sort the data is: "+ execution3 + " nanoseconds");
                       //Printing the sort method and search algorithm that performed best!
                       if (execution < execution2 && execution < execution3) {
                       sortMethod = "Selection Sort";
                       }else  if (execution2 < execution && execution2 < execution3){
                       sortMethod = "Quick Sort";
                       }else if (execution3 < execution && execution3 < execution2){
                       sortMethod = "Bubble Sort";
                       }
                       //Printing the sort method and search algorithm that performed best!
                       System.out.println("\n"+ sortMethod + " performed Best" );
                       //prompts the user to press enter to go back to the principal menu.
                       System.out.println(b+" \npress " +red+ "enter "+b+ "to back to the principal menu...");
                       myKB.nextLine();
                       break;
                       
                   case 2: //second case that show the sub-menu for the list of all players with a particular name.                       
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the numberPages data
                       numberPagesSortDesc(bookTitle1,numberPages1);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       execution = (end - start); 
                       
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       QuickSort.QuickSortNPD(bookTitle2,numberPages2,0,numberPages.length-1);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       execution2 = (end - start);
                       System.out.println("");
                       //run statement before the process starts
                       start = System.nanoTime();
                       //main method to sort the bookTitles data
                       BubbleSort.bubbleSortNPDesc(bookTitle3, numberPages3);
                       //getting record of the end time for the sort process
                       end = System.nanoTime();
                       /*calculate the time difference */     
                       execution3 = (end - start);
                       //printing the data after sorting respectively from number Pages.
                       CA_1_Methods.printArray(bookTitle1,numberPages1);
                       System.out.println("");
                       /* print the time difference */
                       System.out.println("The total execution time for Selection Sort is: "+ execution + " nanoseconds");
                       System.out.println("The total execution time for Quick Sort the data is: "+ execution2 + " nanoseconds");
                       System.out.println("The total execution time for Bubble Sort the data is: "+ execution3 + " nanoseconds");
                       //Printing the sort method and search algorithm that performed best!
                       if (execution < execution2 && execution < execution3) {
                       sortMethod = "Selection Sort";
                       }else  if (execution2 < execution && execution2 < execution3){
                       sortMethod = "Quick Sort";
                       }else if (execution3 < execution && execution3 < execution2){
                       sortMethod = "Bubble Sort";
                       }
                       //Printing the sort method and search algorithm that performed best!
                       System.out.println("\n"+ sortMethod + " performed Best" );
                       //prompts the user to press enter to go back to the menu.
                       System.out.println(b+" \npress " +red+ "enter "+b+ "to back to the principal menu...");
                       myKB.nextLine();
                       break;

                   case 3: //third case that will getting us to the previous menu.  
                       
                       System.out.println("\nGetting back to the previous menu\n");
                                         
                       break;   
  
                   default://default case, which is executed when none of the previous cases match the value of the option variable.
                       
                       System.out.println("please select a valid option\n");
               }
              
           }while ((option !=3) && (option !=2) && (option !=1));//condition for the do-while loop to continue running.
    
     }    
    
    /**
     * This method named bookTitleSort(selectionSortAscending) from book titles  takes  
     * @param bookTitles and 
     * @param numberPages arrays and  iterate through bookTitles array, then compares ignoring cases
     * if the values in bookTitles position(min+1) ahead is less than the bookTitles min position(the previous valor) 
     * and if this is true then is gonna change the value for the min index position from the ahead (giving us the Ascending order)
     * swapping the values from the bookTitles and numberPages arrays.
     */
           
    public static void bookTitleSort (String [] bookTitles, int [] numberPages){
        //We are gonna do a selection sort as the sort method.
        
        //assign the length of the array where the bookTitles are to n
        int n = bookTitles.length;
        
        for (int i = 0; i < n-1; i++) {
            //create a minum index placeholder
            int minIndex = i;
            //create second index j and increment ahead of i
            for (int j = i + 1; j < n; j++) {
             
                
               /**
                * taking the data from the array bookTitles in the index position j
                * which is gonna be ahead of the index i (minIndex)
                * and using compareToIgnoreCase method to compare the data 
                * in the array bookTitles at the index j with the same array but in the minIndex position
                * this method is gonna check the lexicography(dictionary order) between the data in the array 
                * its gonna a return -1 if the data in the position j is less than
                * its gonna a return 0 if the data in the position j is equal to
                * its gonna return 1 if is greater than 
                * this as a condition that if the return is less than 0 (ordering the values from A to Z) 
                * then the minIndex value is gonna be = to J 
                */
                                                        
                if (bookTitles[j].compareToIgnoreCase(bookTitles[minIndex]) < 0) {    
                    //assign the value of the index j as the minimun index value of the array
                    //overwrite the value at index i 
                    minIndex=j;
                    
                    
                    }                 
     
            }
           
            //create a temporary variable and assign the value of the proceeding element
            String temp = bookTitles[minIndex];
            //reassign the value of the minumum index to the value in index i of the array bookTitles to keep moving forward   //B
            bookTitles[minIndex] = bookTitles[i];
            //reasign the value in the position index i for the value in our temp variable.
            bookTitles[i] = temp;
            
            //take a temporary variable and assign the value of the proceeding element but in the numberPages array (Number of pages).
            int tempInt = numberPages[minIndex];
             //reassign the value of the minumum index to the value in index i of the array numberPages to keep moving forward 
            numberPages[minIndex] = numberPages[i];
            //reasign the value in the position index i in numberPages array for the value in our temp variable.
            numberPages[i] = tempInt;
               
        }    
           
}
    
     /**
     * This method named bookTitleSort(selectionSortAscending) from book titles  takes  
     * @param bookTitles and 
     * @param numberPages arrays and  iterate through bookTitles array, then compares ignoring cases
     * if the values in bookTitles position(min+1) ahead is greater than the bookTitles min position(the previous valor) 
     * and if this is true then is gonna change the value for the min index position from the ahead (giving us the Descending order)
     * swapping the values from the bookTitles and numberPages arrays.
     */
    
    public static void bookTitleSortDesc (String [] bookTitles,int [] numberPages){
        //We are gonna do a selection sort as the sort method.
        
        //assign the length of the array where the bookTitles are to n
        int n = bookTitles.length;
        
        for (int i = 0; i < n-1; i++) {
            //create a minum index placeholder
            int minIndex = i;
            //create second index j and increment ahead of i
            for (int j = i + 1; j < n; j++) {
                
                
                /**
                * taking the data from the array book titles in the index position j
                * which is gonna be ahead of the index i (minIndex)
                * and using compareToIgnoreCase method to compare the data 
                * in the array bookTitles at the index j with the same array but in the minIndex position
                * this method is gonna check the lexicography(dictionary order) between the data in the array 
                * its gonna a return -1 if the data in the position j is less than
                * its gonna a return 0 if the data in the position j is equal to
                * its gonna return 1 if is greater than 
                * this as a condition that if the return is greater than 0 
                * then the minIndex value is gonna be = to J (ordering the values from Z to A)
                */
                if (bookTitles[j].compareTo(bookTitles[minIndex]) > 0) {
                    //assign the value of the index j as the minimun index value of the array
                    //overwrite the value at index i 
                    minIndex = j;
                    
                }
            }
            //create a temporary variable and assign the value of the proceeding element
            String temp = bookTitles[minIndex];
            //reassign the value of the minumum index to the value in index i of the array bookTitles to keep moving forward
            bookTitles[minIndex] = bookTitles[i];
            //reasign the value in the position index i for the value in our temp variable.
            bookTitles[i] = temp;
            
            //take a temporary variable and assign the value of the proceeding element but in the numberPages array (number of pages).
            int tempInt = numberPages[minIndex];
            //reassign the value of the minumum index to the value in index i of the array numberPages to keep moving forward 
            numberPages[minIndex] = numberPages[i];
            //reasign the value in the position index i in numberPages array for the value in our temp variable.
            numberPages[i] = tempInt;
           
        }
      
        }     
        
    /**
     * This method named numberPagesSort(selectionSortAscending) from number of pages perspective
     * takes
     * @param bookTitles and
     * @param numberPages arrays and iterate through numberPages array, then
     * compares if the values in numberPages position (min+1) ahead is
     * less than the numberPages min position(the previous valor) and if this is
     * true then is gonna change the value for the min index position from the
     * ahead (giving us the Ascending order) swapping the values from the
     * bookTitles and numberPages arrays.
     */
    
    public static void numberPagesSortAscen (String [] bookTitles, int [] numberPages){
        //We are gonna do a selection sort as the sort method.
        
        //assign the length of the array where the bookTitles are to n
        int n = bookTitles.length;
        
        
        for (int i = 0; i < n-1; i++) {
            //create a minum index placeholder
            int minIndex = i;
            //create second index j and increment ahead of i
            for (int j = i + 1; j < n; j++) {
                
               /**
                * taking the data from the array (numberPages) in the index position j
                * which is gonna be ahead of the index i (minIndex)
                * and using a conditional to compare the data 
                * in the array data[1](numberPages) at the index j(min+1) with the same array but in the minIndex position
                * checking if the minimum index value is bigger than the element after it (ordering the elements in Ascending order)
                */
                
                if (numberPages[j] <  numberPages[minIndex]) {    
                    //assign the value of the index j as the minimun index value of the array
                    //overwrite the value at index i 
                    minIndex=j;
                   
                    }                 
     
            }
            //create a temporary variable and assign the value of the proceeding element
            int tempInt = numberPages[minIndex];
            //reassign the value of the minumum index to the value in index i of the array numberPages to keep moving forward 
            numberPages[minIndex] = numberPages[i];
            //reasign the value in the position index i for the value in our temp variable.
            numberPages[i] = tempInt;
            
                                 
            //create a temporary variable and assign the value of the proceeding element
            String temp = bookTitles[minIndex];
            //reassign the value of the minumum index to the value in index i of the array bookTitles to keep moving forward   
            bookTitles[minIndex] = bookTitles[i];
            //reasign the value in the position index i for the value in our temp variable.
            bookTitles[i] = temp;
               
         
        }
       
     
}
    
    /**
     * This method named numberPagesSort(selectionSortAscending) from number of pages perspective
     * takes
     * @param bookTitles and
     * @param numberPages arrays and iterate through numberPages array, then
     * compares if the values in numberPages position(min+1) ahead is
     * greater than the numberPages min position(the previous valor) and if this is
     * true then is gonna change the value for the min index position from the
     * ahead (giving us the Descending order) swapping the values from the
     * bookTitles and numberPages arrays.
     */
    
    public static void numberPagesSortDesc (String [] bookTitles, int [] numberPages){
        //We are gonna do a selection sort as the sort method.
        
        //assign the length of the array where the bookTitles are to n
        int n = bookTitles.length;

        for (int i = 0; i < n-1; i++) {
            //create a minum index placeholder
            int minIndex = i;
            //create second index j and increment ahead of i
            for (int j = i + 1; j < n; j++) {
                
                /**
                * taking the data from the array numberPages in the index position j
                * which is gonna be ahead of the index i (minIndex)
                * and using a conditional to compare the data 
                * in the array numberPages at the index j(min+1) with the same array but in the minIndex position
                * checking if the minimum index value is less than the element after it(ordering the elements in descending order)
                */
                
                if (numberPages[j] > numberPages[minIndex]) {    
                    //assign the value of the index j as the minimun index value of the array
                    //overwrite the value at index i 
                    minIndex=j;
                    
                    }                 
     
            }
            //create a temporary variable and assign the value of the proceeding element
            int tempInt = numberPages[minIndex];
            //reassign the value of the minumum index to the value in index i of the array numberPages to keep moving forward 
            numberPages[minIndex] = numberPages[i];
            //reasign the value in the position index i for the value in our temp variable.
            numberPages[i] = tempInt;
            
                                 
            //create a temporary variable and assign the value of the proceeding element
            String temp = bookTitles[minIndex];
            //reassign the value of the minumum index to the value in index i of the array bookTitles to keep moving forward   
            bookTitles[minIndex] = bookTitles[i];
            //reasign the value in the position index i for the value in our temp variable.
            bookTitles[i] = temp;
            
            
  
        }
       
    }
          
}
