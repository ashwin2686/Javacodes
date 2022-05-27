import java.util.*;
public class QuickSortExample 
{
  public static void main(String[] args) 
  {
    // This is unsorted array
    Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
 
    // Let's sort using quick sort
    quickSort( array, 0, array.length - 1 );
 
    // Verify sorted array
    System.out.println(Arrays.toString(array));
  }
 
  public static void quickSort(Integer[] arr, int low, int high) 
  {
    //check for empty or null array
    if (arr == null || arr.length == 0){
      return;
    }
     
    if (low >= high){
      return;
    }
 
    //Get the pivot element from the middle of the list
    int middle = low + (high - low) / 2;
    int pivot = arr[middle];
    System.out.println("pivot"+pivot);
 
    // make left < pivot and right > pivot
    int i = low, j = high;
    while (i <= j) 
    {
      //Check until all values on left side array are lower than pivot
      while (arr[i] < pivot) 
      {
        System.out.println("i in  "+i);
        i++;
        
      }
      //Check until all values on left side array are greater than pivot
      while (arr[j] > pivot) 
      {
        System.out.println("j in "+j);
        j--;
        
      }
      //Now compare values from both side of lists to see if they need swapping 
      //After swapping move the iterator on both lists
      
      System.out.println("i after  "+i);
      System.out.println("j after  "+j);
      if (i <= j) 
      {
        swap (arr, i, j);
        i++;
        j--;
        
        System.out.println("first swap "+ Arrays.toString(arr));
        System.out.println("i after swap  "+i);
      System.out.println("j after swap "+j);
        
      }
    }
    //Do same operation as above recursively to sort two sub arrays
    if (low < j){
        System.out.println("low rec  "+low);
      System.out.println("j rec "+j);
        
      quickSort(arr, low, j);
    }
    if (high > i){
        
        
        System.out.println("high rec   "+high);
      System.out.println("i  rec "+i);
      quickSort(arr, i, high);
    }
  }
   
  public static void swap (Integer array[], int x, int y)
    {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
    }
}
 
//Output: [3, 6, 10, 12, 13, 24, 70, 90]
