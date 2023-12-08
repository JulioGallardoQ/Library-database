/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca_1;

import java.io.FileNotFoundException;


/**
 *
 * @author Julio Cesar Gallardo Quintero - 2023149
 */
public class CA_1 {

    /**
     * Principal Or main method in our principal class called CA_1 takes
     * @param args the command line arguments and
     * @throws java.io.FileNotFoundException
     * this use the methods  that we create in other classes inside a switch and a while 
     * that allows the user interact with a good looking  Menu where it can select what they want to do
     * with the data in their data file, search a book, or see their data sorted in ascend or descend order from book titles or number pages perspective.
     */
    
    public static void main(String[] args) throws FileNotFoundException  {
        //main where our principal task are set up.
        //general variables inizialaized 
       String red = "\033[31m";
       String blue = "\033[34m";
       String searchAlgo = null;
       String sortMethod = null;
       int option = 0;
       //getting the data from our method readfile in 2 arrays from our file data[0](book Titles0 and data[1] number of pages.
       String [][] data = CA_1_Methods.readFile("Introduce the name of your file include the file extencion");
       //using our method intTrans to swap our data[1] that is an array of strings in numberPages an array of integers.
       int [] numberPages =  CA_1_Methods.intTrans(data[1]);
       
           
           while (option != 4){//condition for the while loop to continue running.
               System.out.println(red+"--------------------------------------------------------------");
               System.out.println(blue+"|                        LIBRARYTECH                         |");
               System.out.println(blue+"|                   E-LIBRARY DATABASE MENU                  |");
               System.out.println(red+"--------------------------------------------------------------");
               System.out.println(blue+"\nPlease select what you want to do with the data in the file ");
               System.out.println("1) Sort the data by Book Title");
               System.out.println("2) Sort by Number of pages ");
               System.out.println("3) Search a Book Title ");
               System.out.println(red+"4) Exit");

            // prompt the user to enter the number corresponding to their chosen option. The entered value is assigned to the option variable.
            option = new CA_1_Methods().askUserforInt("Please select an option ");
               
         
       
               // now the action depend on the option picked by user
              
               switch (option){
                   
                
                   case 1: //first case that show the sub-menu for the book titles,where we can select see our data in a particular order respecting from book titles.
                       
                      sortMethod = selectionSort.selectSortBookTitles(data[0],numberPages);
                                                       
                      break;
                      
                   case 2: //second case that show the sub-menu for the number of pages,where we can select see our data in a particular order respecting from book titles.                       
                       
                      selectionSort.selectionSortNumberPages(data[0],numberPages);
                      break;
                      
                   case 3: //third case that show the sub-menu  to search an specific book.  
                       
                       searchAlgo = searchingMethods.searchingBookTitle(data[0],numberPages);
                       
                       break;
                    
                   case 4: //last case that will show a exit message and a print of the result of the general performance 
                       //and let us know which ones are the best.
                          
                       
                       System.out.println("\nExiting the program...");
                       
                       CA_1_Methods.performanceResult(searchAlgo, sortMethod);
                       
                       
                       break;   
  
                   default://default case, which is executed when none of the previous cases match the value of the option variable.
                       
                       System.out.println("please try again!\n");
               }
                       
            }
     }
    
}
    
   
