/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca_1;

/**
 *
 * @author Julio Cesar Gallardo Quintero-2023149
 */
public class QuickSort {
   //Java class that includes all the necesesary methods to sort the data with the 
   // QuickSort algorithm Method, Ascending and Descending and respectively from Book Titles or number of pages.
    
    
    /**
     * This method named partitionBTA(partitionBookTitlesAscending)  takes  
     * @param bookTitles and 
     * @param numberPages as parameter and defines a range with 
     * @param low and 
     * @param high values, range where we are gonna iterate through, then compares in that iteration
     * the values in bookTitles  and its gonna  
     * @return pointer as the value of the point position to use it in the QuickSortBTA Method. .
     */
    
    public static int partitionBTA(String [] bookTitles,int []numberPages,int low, int high ){
    
    //setting our pivot element as the highest for our range 
    //in the array respectively from the booktitles   
    String pivot = bookTitles[high]; 
    //setting our pointer as low (that will be the start of our range)
    int pointer = low;
        //for loop that iterates trought all the elements in the range that we settled
        for (int i = low ; i < high; i++) {
            
            //our condition that is going to compare ignoring the case 
            //if the Strings inside the Booktitles array are less, equal or greater
            //than the string that is in our pivot position
            //if this is less than the pivot string this is gonna be true (giving us the ascending order).
            if (bookTitles[i].compareToIgnoreCase(pivot) < 0 ) {
                
                //and is gonna swap the book titles respectively for the pointer position
                swapBooks(bookTitles, i, pointer);
                //and is gonna swap the number of pages respectively for the pointer position
                swapPages(numberPages, i, pointer);
                //then the pointer is gonna increment.
                pointer++;
              
            }
            
            
        } 
        //then after we iterated on all the elements we need to put the pivot at its correct sorted position in the array
        //changing the pivot for the pointer element position.
        swapBooks(bookTitles, pointer, high);
        swapPages(numberPages, pointer, high);
        //returning the position that we gonna use in QuickSortBTA method.
        return pointer;
    }
    
    /**
     * this method takes as parameters 
     * @param bookTitles
     * @param pivot
     * @param low 
     * to swap the elements in the book titles array with the help of a temporal variable.
     */
    
    public static void swapBooks(String[] bookTitles, int low, int pivot) {
     //creating our temporal variable that is gonna store the value of the book title
     //in the low index
     String temp = bookTitles[low];
     //then we are gonna change the places of the book title at the low position
     //for the book title in  pivot position
     bookTitles[low] = bookTitles[pivot];
     //then we replace the book title in the pivot position 
     //with the stored in the temporal variable.
     bookTitles[pivot] = temp;
    }
    
    /**
     * this method takes as parameters 
     * @param numberPages
     * @param pivot
     * @param low 
     * to swap the elements in the numberPages array with the help of a temporal variable.
     */
    
    public static void swapPages(int [] numberPages, int low, int pivot) {
     //creating our temporal variable that is gonna store the value of the book title
     //in the low index   
     int temp = numberPages[low];
     //then we are gonna change the places of the numberPAges at the low position
     //for the book title in  pivot position
     numberPages[low] = numberPages[pivot];
     //then we replace the numberPages in the pivot position 
     //with the stored in the temporal variable.
     numberPages[pivot] = temp;
    }
    
    /**
     * This method named QuickSortBTA(QuickSortBookTitlesAscending)  takes  
     * @param bookTitles and 
     * @param numberPages as parameter and defines a range with 
     * @param low and 
     * @param high values, range where we are gonna iterate through
     * then compares if the low value is less than the higher if it is, it will proceed 
     * with the partition method storing the value of the pointer from that method 
     * int the variable p and will recursively do the same but from before the pivot and 
     * after the pivot that we taken from the partition.
     */  
    
    public static void QuickSortBTA(String[] bookTitles,int[]numberPages,int low, int high) {
       
       //condition to check if the low value is less than the higher if it is then
       //its gonna proceed with the partition method.
        if (low < high) {
        int p = partitionBTA(bookTitles,numberPages, low, high);
         //recursive method for the specific section in the array but before the pivot 
         //that we have taken from the partition.
        QuickSortBTA(bookTitles,numberPages, low, p-1);
        //recursive method for the specific section in the array but after the pivot 
         //that we have taken from the partition.
        QuickSortBTA(bookTitles,numberPages, p+1, high);
        
        }
        
        
    }
    
    /**
     * This method named partitionBTD(partitionBookTitlesDescending)  takes  
     * @param bookTitles and 
     * @param numberPages as parameter and defines a range with 
     * @param low and 
     * @param high values, range where we are gonna iterate through, then compares in that iteration
     * the values in bookTitles  and its gonna  
     * @return pointer as the value of the point position to use it in the QuickSortBTD Method. .
     */
    
    public static int partitionBTD(String [] bookTitles,int []numberPages,int low, int high ){
    
    //setting our pivot element as the highest for our range 
    //in the array respectively from the booktitles   
    String pivot = bookTitles[high]; 
    //setting our pointer as low (that will be the start our range)
    int pointer = low;
    
        //for loop that iterates trought all the elements in the range that we settled
        for (int i = low ; i < high; i++) {
            //our condition that is going to compare ignoring the case 
            //if the Strings inside the Booktitles array are less, equal or greater
            //than the string that is in our pivot position
            //if this is greater than the pivot string this is gonna be true (giving us the descending order).
            if (bookTitles[i].compareToIgnoreCase(pivot) > 0 ) {
                
                //and is gonna swap the book titles respectively for the pointer position
                swapBooks(bookTitles, i, pointer);
                //and is gonna swap the number of pages respectively for the pointer position
                swapPages(numberPages, i, pointer);
                //then the pointer is gonna increment.
                pointer++;
            }
            
            
        } 
        //then after we iterated on all the elements we need to put the pivot at its correct sorted position in the array
        //changing the pivot for the pointer element position.
        swapBooks(bookTitles, pointer, high);
        swapPages(numberPages, pointer, high);
        //returning the position that we gonna use in QuickSortBTD method.
        return pointer;
    }
    
    /**
     * This method named QuickSortBTD(QuickSortBookTitlesDescending)  takes  
     * @param bookTitles and 
     * @param numberPages as parameter and defines a range with 
     * @param low and 
     * @param high values, range where we are gonna use 
     * to compares if the low value is less than the higher if it is, it will proceed 
     * with the partition method storing the value of the pointer from that method 
     * int the variable p and will recursively do the same but from before the pivot and 
     * after the pivot that we taken from the partition.
     */  
    
    public static void QuickSortBTD(String[] bookTitles,int[]numberPages,int low, int high) {
        //condition to check if the low value is less than the higher if it is then
        //its gonna proceed with the partition method.
        if (low < high) {           
        int p = partitionBTD(bookTitles,numberPages, low, high);
        //recursive method for the specific section in the array but before the pivot 
        //that we have taken from the partition.
        QuickSortBTD(bookTitles,numberPages, low, p-1);
        //recursive method for the specific section in the array but before the pivot 
        //that we have taken from the partition.
        QuickSortBTD(bookTitles,numberPages, p+1, high);
        }
    }
    
    /**
     * This method named partitionNPA(partitionNumberPagesAscending)  takes  
     * @param bookTitles and 
     * @param numberPages as parameter and defines a range with 
     * @param low and 
     * @param high values, range where we are gonna iterate through, then compares in that iteration
     * the values in numberPages and its gonna  
     * @return pointer as the value of the point position to use it in the QuickSortNPA Method. .
     */
    
    public static int partitionNPA(String [] bookTitles,int []numberPages,int low, int high) {
        //setting our pivot element as the highest for our range 
        //in the array respectively from the booktitles   
        int pivot = numberPages[high];      
        //setting our pointer as low (that will be the start of our range)
        int pointer = low;
        
        //for loop that iterates trought all the elements in the range that we settled
        for (int i = low ; i < high; i++) {
            
            //our condition that is going to compare  
            //if the ints values inside the numberPages array are less 
            //than the int values that is in our pivot position
            //if this is less than the pivot  this is gonna be true (giving us the Ascending order).
            if (numberPages[i] < pivot) {
                //and is gonna swap the book titles respectively for the pointer position
                swapBooks(bookTitles, i, pointer);
                //and is gonna swap the number of pages respectively for the pointer position
                swapPages(numberPages, i, pointer);
                //then the pointer is gonna increment.
                pointer++;
            }
            
            
        }
        //then after we iterated on all the elements we need to put the pivot at its correct sorted position in the array
        //changing the pivot for the pointer element position.
        swapBooks(bookTitles, pointer, high);
        swapPages(numberPages, pointer, high);
        //returning the position that we gonna use in QuickSortNPA method.
        return pointer;
    }
    
    /**
     * This method named QuickSortNPA(QuickSortNumberPagesAscending)  takes  
     * @param bookTitles and 
     * @param numberPages as parameter and defines a range with 
     * @param low and 
     * @param high values, range where we are gonna use to 
     * compares if the low value is less than the higher if it is, it will proceed 
     * with the partition method storing the value of the pointer from that method 
     * int the variable p and will recursively do the same but from before the pivot and 
     * after the pivot that we taken from the partition.
     */ 
    
    public static void QuickSortNPA(String[] bookTitles,int[]numberPages,int low, int high) {
        //condition to check if the low value is less than the higher if it is then
        //its gonna proceed with the partition method.
        if (low < high) {
        int p = partitionNPA(bookTitles,numberPages, low, high);
        //recursive method for the specific section in the array but before the pivot 
        //that we have taken from the partition.
        QuickSortNPA(bookTitles,numberPages, low, p-1);
        //recursive method for the specific section in the array but before the pivot 
        //that we have taken from the partition.
        QuickSortNPA(bookTitles,numberPages, p+1, high);
        }
    }
    
    /**
     * This method named partitionNPD(partitionNumberPagesDescending)  takes  
     * @param bookTitles and 
     * @param numberPages as parameter and defines a range with 
     * @param low and 
     * @param high values, range where we are gonna iterate through, then compares in that iteration
     * the values in numberPages and its gonna  
     * @return pointer as the value of the point position to use it in the QuickSortNPA Method. .
     */
    
    public static int partitionNPD(String [] bookTitles,int []numberPages,int low, int high) {
        //setting our pivot element as the highest for our range 
        //in the array respectively from the booktitles  
        int pivot = numberPages[high]; 
        
        //setting our pointer as low (that will be the start of our range)
        int pointer = low;
    
        //for loop that iterates trought all the elements in the range that we settled
        for (int i = low ; i < high; i++) {
            
            //our condition that is going to compare  
            //if the ints values inside the numberPages array are greater 
            //than the int values that is in our pivot position
            //if this is greater than the pivot  this is gonna be true (giving us the Descending order).
            if (numberPages[i] > pivot) {
                //and is gonna swap the book titles respectively for the pointer position
                swapBooks(bookTitles, i, pointer);
                //and is gonna swap the number of pages respectively for the pointer position
                swapPages(numberPages, i, pointer);
                //then the pointer is gonna increment.
                pointer++;
            }
            
            
        } 
         //then after we iterated on all the elements we need to put the pivot at its correct sorted position in the array
        //changing the pivot for the pointer element position.
        swapBooks(bookTitles, pointer, high);
        swapPages(numberPages, pointer, high);
        //returning the position that we gonna use in QuickSortNPD method.
        return pointer;
    }
   
    /**
     * This method named QuickSortNPD(QuickSortNumberPagesDescending)  takes  
     * @param bookTitles and 
     * @param numberPages as parameter and defines a range with 
     * @param low and 
     * @param high values, range where we are gonna use to 
     * compares if the low value is less than the higher if it is, it will proceed 
     * with the partition method storing the value of the pointer from that method 
     * int the variable p and will recursively do the same but from before the pivot and 
     * after the pivot that we taken from the partition.
     */ 
    
    public static void QuickSortNPD(String[] bookTitles,int[]numberPages,int low, int high) {
        //condition to check if the low value is less than the higher if it is then
        //its gonna proceed with the partition method.
        if (low < high) {
        int p = partitionNPD(bookTitles,numberPages, low, high);
        //recursive method for the specific section in the array but before the pivot 
        //that we have taken from the partition.
        QuickSortNPD(bookTitles,numberPages, low, p-1);
        //recursive method for the specific section in the array but before the pivot 
        //that we have taken from the partition.
        QuickSortNPD(bookTitles,numberPages, p+1, high);
        }
    }
    }

