/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

/**
 *
 * @author julio
 */
public class BubbleSort {
//Java class BubbleSort where are all the necesesary method to sort the data using
//the Bubble Sort Algorithm.   
    
    /**
     * This method named bubbleSortNPAscen  from number of pages perspective takes  
     * @param bookTitles and 
     * @param numberPages arrays and  iterate through numberPages array, then compares 
     * if the values in numberPages in the position i -1 is greater than the position i (position ahead) 
     * and if this is true then is gonna swapping the values from the bookTitles and numberPages arrays. (giving us the Ascending order)
     */
    
    public static void bubbleSortNPAscen(String[] bookTitles, int [] numberPages) {
        
        //Create a variable to store the size of the array respectively numberPages.
        int  n = numberPages.length;
          
 
        /*Switch On*/
        boolean swapped;
        
        /*Do Block*/
        do {
            /*Do something*/
            swapped = false;
            /*loop the main array*/
            for (int i = 1; i < n; i++) {
                /**
                 * Assess the index items if the item before the index i is
                 * bigger than the element in the index of i or the proceeding
                 * element that is after i index 0 or arr(i-1)
                 */
                if (numberPages[i - 1] > numberPages[i]) {
                    
                    //storing the value in numberPages[i-1] position in our temporary variable
                    int temp = numberPages[i - 1];
                    //then we change the value in the previous index for the value in the position ahead 
                    numberPages[i - 1] = numberPages[i];
                    //then we change the value in the ahead position for the temporal variable that is the value
                    //that was in the previous position.
                    numberPages[i] = temp;
                    
                    //storing the value in bookTitles[i-1] position in our temporary variable
                    String tempStr = bookTitles[i - 1];
                    //then we change the value in the previous index for the value in the position ahead 
                    bookTitles[i - 1] = bookTitles[i];
                    //then we change the value in the ahead position for the temporal variable that is the value
                    //that was in the previous position.
                    bookTitles[i] = tempStr;

                    //change the switch to true because we swapped a element the while continues.
                    swapped = true;
                }

            }
            
          /*while 'swapped' is true*/  
        } while (swapped);{
        
    }
      
    }
        
    /**
     * This method named bubbleSortNPDesc  from number of pages perspective takes  
     * @param bookTitles and 
     * @param numberPages arrays and  iterate through numberPages array, then compares 
     * if the values in numberPages in the position i -1 is less than the position i (position ahead) 
     * and if this is true then is gonna swapping the values from the bookTitles and numberPages arrays. (giving us the Descending order)
     */
    
    public static void bubbleSortNPDesc(String[] bookTitles, int [] numberPages) {
        
        
        //Create a variable to store the size of the array respectively numberPages.    
        int  n = numberPages.length;
        
 
         
            
        /*Switch On*/
        boolean swapped;
        
        /*Do Block*/
       
        do {            
            /*Do something*/
            swapped = false;
            /*loop the main array*/
            for (int i = 1; i < n; i++) {
            /**Assess the index items
             * if the item before the index i is bigger
             * than the element in the index of i 
             * or the proceeding element that is after i
             * index 0 or arr(i-1)
             * 
            **/
             
            if (numberPages[i-1] < numberPages[i]){
               
                //storing the value in numberPages[i-1] position in our temporary variable
                int temp = numberPages[i-1];
                //then we change the value in the previous index for the value in the position ahead 
                numberPages[i-1] = numberPages[i];
                //then we change the value in the ahead position for the temporal variable that is the value
                //that was in the previous position. 
                numberPages[i] = temp;
                
                //storing the value in bookTitles[i-1] position in our temporary variable
                String tempStr = bookTitles[i-1];
                //then we change the value in the previous index for the value in the position ahead 
                bookTitles[i-1] = bookTitles[i];
                //then we change the value in the ahead position for the temporal variable that is the value
                //that was in the previous position.
                bookTitles[i] = tempStr;
                 
                       
                 //change the switch to true because we swapped a element the while continues.
                 swapped = true;
            }
            
            }
            
          /*while 'swapped' is true*/  
        } while (swapped);{
        
    }
       
    }
   
    /**
     * This method named bubbleSortBTAscen  from book titles perspective takes  
     * @param bookTitles and 
     * @param numberPages arrays and  iterate through numberPages array, then compares ignoring cases
     * if the values in bookTitles position(i-1) is greater than the bookTitles i position(the ahead valor) 
     * and if this is true then is gonna swapping the values from the bookTitles and numberPages arrays. (giving us the Ascending order)
     * 
     */
    
    public static void bubbleSortBTAscen(String[] bookTitles, int [] numberPages) {
        //Create a variable to store the size of the array respectively bookTitltes.    
        int n = bookTitles.length;

        /*Switch On*/
        boolean swapped;

        /*Do Block*/
        do {          
            /*Do something*/
            swapped = false;
            /*loop the main array*/
            for (int i = 1; i < n; i++) {    
            
            /**
            * taking the data from the array book titles in the previous index position(i-1)
            * and using compareToIgnoreCase method to compare the data 
            * in the array bookTitles at that position with the same array but in the i position
            * this method is gonna check the lexicography(dictionary order) between the data in the array 
            * its gonna a return -1 if the data in the previous position  is less than
            * its gonna a return 0 if the data in the previous position is equal to and 
            * its gonna return 1 if is greater than 
            * this as a condition that if the return is greater than 0 
            * then we swap the elements (ordering the values from A to Z)
            */
            if (bookTitles[i-1].compareToIgnoreCase(bookTitles[i]) > 0){
               
                //storing the value in numberPages[i-1] position in our temporary variable
                int temp = numberPages[i-1];
                //then we change the value in the previous index for the value in the position ahead 
                numberPages[i-1] = numberPages[i];
                //then we change the value in the ahead position for the temporal variable that is the value
                //that was in the previous position. 
                numberPages[i] = temp;
                
                //storing the value in bookTitles[i-1] position in our temporary variable
                String tempStr = bookTitles[i-1];
                //then we change the value in the previous index for the value in the position ahead  
                bookTitles[i-1] = bookTitles[i];
                //then we change the value in the ahead position for the temporal variable that is the value
                //that was in the previous position. 
                bookTitles[i] = tempStr;
                
                       
                 //change the switch to true because we swapped a element the while continues.
                 swapped = true;
            }
            
            }
            
          /*while 'swapped' is true*/  
        } while (swapped);{
        
    }
      
    }
    
     /**
     * This method named bubbleSortBTAscen  from book titles perspective takes  
     * @param bookTitles and 
     * @param numberPages arrays and  iterate through numberPages array, then compares ignoring cases
     * if the values in bookTitles position(i-1) is less than the bookTitles i position(the ahead valor) 
     * and if this is true then is gonna swapping the values from the bookTitles and numberPages arrays. (giving us the Descending order)
     * 
     */
    
    public static void bubbleSortBTDesc(String[] bookTitles, int [] numberPages) {
        
        //Create a variable to store the size of the array respectively bookTitltes.   
        int  n = bookTitles.length;
            
        /*Switch On*/
        boolean swapped;
        
        /*Do Block*/
       
        do {            
            /*Do something*/
            swapped = false;
            /*loop the main array*/
            for (int i = 1; i < n; i++) {
                
            /**
            * taking the data from the array book titles in the previous index position(i-1)
            * and using compareToIgnoreCase method to compare the data 
            * in the array bookTitles at that position with the same array but in the i position
            * this method is gonna check the lexicography(dictionary order) between the data in the array 
            * its gonna a return -1 if the data in the previous position  is less than
            * its gonna a return 0 if the data in the previous position is equal to and 
            * its gonna return 1 if is greater than 
            * this as a condition that if the return is less than 0 
            * then we swap the elements (ordering the values from Z to A)
            */
            if (bookTitles[i-1].compareToIgnoreCase(bookTitles[i]) < 0){
               
                //storing the value in numberPages[i-1] position in our temporary variable
                int temp = numberPages[i-1];
                //then we change the value in the previous index for the value in the position ahead 
                numberPages[i-1] = numberPages[i];
                //then we change the value in the ahead position for the temporal variable that is the value
                //that was in the previous position. 
                numberPages[i] = temp;
                
                //storing the value in bookTitles[i-1] position in our temporary variable
                String tempStr = bookTitles[i-1];
                //then we change the value in the previous index for the value in the position ahead 
                bookTitles[i-1] = bookTitles[i];
                //then we change the value in the ahead position for the temporal variable that is the value
                //that was in the previous position.  
                bookTitles[i] = tempStr;
               
                
                       
                 //change the switch to true because we swapped a element the while continues.
                 swapped = true;
            }
             
            }
            
          /*while 'swapped' is true*/  
        } while (swapped);{
        
    }
      
    } 
         
}
