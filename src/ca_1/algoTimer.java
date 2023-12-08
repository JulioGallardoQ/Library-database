/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

import java.util.Random;

/**
 *
 * @author Julio Cesar Gallardo Quintero -2023149
 */
public class algoTimer {
    
    /**
     * Timer Algorithm method that use
     * @param data and 
     * @param numberPages as arrays to asset all the searching algorithms 
     * and sort methods that are used in the program
     * using the random class in java to get a random value every time that 
     * runs to get an approach of the best performance to process the data in the file
     * printing the result of which algorithm and sort method are the best in this situation.
     */
    
    public static void algotimer(String[] data , int [] numberPages) {
    
    //initializing the variables to do a run of each method and algorithm 
    //using the random class in java to get a random value everytime that 
    //algotimer method runs to get an approach of the best performance to process the data in the file.
    String searchAlgo = "";   
    String sortMethod = "";
    Random random = new Random();
    int i = random.nextInt(data.length);
    String randomBookTitle = data[i];
    
    long start = System.nanoTime();
    /*print the run statement for the algorithm*/
    //searching algorithm method linear search
    searchingMethods.linearSearch(data, randomBookTitle, numberPages);
    /*create the end point of the timer for the algorithm */       
    long end = System.nanoTime();
    /*calculate the time difference */     
    long execution1 = (end - start);
    /* print the time difference */    
    System.out.println("execution time for Linear search: "+ execution1 + " nanoseconds");
        
    start = System.nanoTime();
    /* run statement to timer the algorithm*/
    //searching algorithm method binary search
    searchingMethods.binarySearch(data,randomBookTitle ,numberPages);
    /*create the end point of the timer for the algorithm */       
    end = System.nanoTime();
    /*calculate the time difference */     
    long execution2 = (end - start);
    /* print the time difference */    
    System.out.println("execution time for Binary search: "+ execution2 + " nanoseconds");   
    //condition that will compare the execution times between the searching algorithms
    //giving us which want has better performance.
        if (execution1 < execution2) {
           searchAlgo = "LinearSearch";
        }else if (execution1 > execution2) {
           searchAlgo = "BinarySearch";
        }
     
    start = System.nanoTime();
    /*run statement for the algorithm*/
    //Selection Sort  method respectively book titles.
    selectionSort.bookTitleSort(data, numberPages);
    /*create the end point of the timer for the algorithm */       
    end = System.nanoTime();
    /*calculate the time difference */     
    long execution3 = (end - start);
    /* print the time difference */    
    System.out.println("execution time for Selection Sort: "+ execution3 + " nanoseconds");    
        
    start = System.nanoTime();
    /*print the run statement for the algorithm*/
     //Quick Sort  method respectively number of pages.
    QuickSort.QuickSortBTA(data, numberPages,0,data.length-1);
    /*create the end point of the timer for the algorithm */       
    end = System.nanoTime();
    /*calculate the time difference */     
    long execution4 = (end - start);
    /* print the time difference */    
    System.out.println("execution time for Quick Sort: "+ execution4 + " nanoseconds");   
    
    //condition that will compare the execution times between the  Sort methods
    //giving us which want has better performance.
        if (execution3 < execution4) {
            sortMethod = "SelectionSort";
        }else  if (execution3 > execution4) {
            sortMethod = "QuickSort";
        }
        //Printing the sort method and search algorithm that performed best!
        System.out.println("\n"+ sortMethod + " and " + searchAlgo + " performed Best" );
    }
    
    
}
