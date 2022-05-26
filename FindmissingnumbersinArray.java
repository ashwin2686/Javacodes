
import java.util.Arrays;
import java.util.BitSet;

public class FindmissingnumbersinArray {
    
     static int count =0;
    public static void main(String args[]) {
      
      int[] numbers= {0,12,14,15,32};
      
      System.out.println("numbers.length"+ numbers.length);
      
Arrays.sort(numbers);
int numbersArrayIndex = 0;
for (int i = 0; i < numbers[numbers.length - 1]; i++) {
    if (i == numbers[numbersArrayIndex]) {
        numbersArrayIndex++;
    }
    else {
        System.out.println(i);
    }
}
    
     
    }
     
}
