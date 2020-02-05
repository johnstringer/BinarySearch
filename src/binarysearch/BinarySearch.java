/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author johnstringer
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = {-3, 2, 3, 5, 12, 20, 30, 33, 39, 40, 45, 60, 67, 320};
        int searchValue = 450;
        boolean elementFound = false;
        int foundPosition = -1;
        
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high){
            //find the mid point of the array
            int mid = (low + high) / 2;
            
            //change the mid pivot based on whether the search value is greather or less
            //than the current value in the array.
            
            if (arr[mid] < searchValue){
                low = mid + 1;    
            }
            
            else if (arr[mid] > searchValue){
                high = mid - 1;
            }
            
            else if (arr[mid] == searchValue){
                foundPosition = mid;
                elementFound = true;
                break;
            }
        }
        
        if (elementFound == false){
            System.out.println(searchValue + " was not found");
        }
        
        else{
            System.out.println(searchValue + " was found at position " + foundPosition);
        }
        
    }
    
}
